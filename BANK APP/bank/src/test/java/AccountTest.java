package org.example;

//activity 2 - testing

public class AccountTest {

    //creating testing fucntions
    public void DepositSuccessTest(){
        Account a1 = new Account("2215", "Rahul", 19, 5000.0, "CURRENT" , "ACTIVE");
        if(a1.Deposit(2000.0)){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }
    }
    //negative deposite fucntion
    public void DepositeNegativeDeposite(){
        Account a1 = new Account("2215", "Rahul", 19, 5000.0, "CURRENT" , "ACTIVE");
        if(!a1.Deposit(-500)){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }
    }

    //valid withdrawal fucntion
    public void TestingWithdrawalExceedingBalance(){
        Account a1 = new Account("2215", "Rahul", 19, 5000.0, "CURRENT" , "ACTIVE");
        if(!a1.withdraw(100000)){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }
    }

    public void TestingWithdrawalNegative(){
        Account a1 = new Account("2215", "Rahul", 19, 5000.0, "CURRENT" , "ACTIVE");
        if(!a1.withdraw(-10000)){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }
    }


    public void finalTesting(){
        Account acc = new Account("ACC1001", "Rajesh Sharma", 28, 5000.0, "SAVINGS", "ACTIVE");
        acc.displayAccountInfo();
        boolean depositeOkay = acc.Deposit(2000);
        System.out.println("Deposit 2000: " + (depositeOkay ? "SUCCESS" : "FAILED") + " | Balance: Rs " + acc.getBalance());
        boolean withdrawOkay = acc.withdraw(3000.0);
        System.out.println("Withdraw 3000: " + (withdrawOkay ? "SUCCESS" : "FAILED") + " | Balance: Rs " + acc.getBalance());
        boolean failWithdrawal = acc.withdraw(10000.0);
        System.out.println("Withdraw 10000 (exceeds balance): " + (failWithdrawal ? "SUCCESS" : "FAILED") + " | Balance: Rs " + acc.getBalance());

    }



    public static void main(String args[]){
//        AccountTest test1 = new AccountTest();
//        test1.DepositSuccessTest();
//        test1.DepositeNegativeDeposite();
//        test1.TestingWithdrawalExceedingBalance();
//        test1.TestingWithdrawalNegative();

        AccountTest test2 = new AccountTest();
        test2.finalTesting();


    }

}
