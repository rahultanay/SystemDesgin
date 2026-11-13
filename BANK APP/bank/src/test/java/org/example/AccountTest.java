package org.example;

//activity 2 - testing for ac1

public class AccountTest {

    //creating testing fucntions
    public void DepositSuccessTest(){
        Account a1 = new Account("2215", "Rahul", 19, 5000.0, "CURRENT" , "ACTIVE","2215");
        if(a1.Deposit(2000.0)){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }
    }
    //negative deposite fucntion
    public void DepositeNegativeDeposite(){
        Account a1 = new Account("2215", "Rahul", 19, 5000.0, "CURRENT" , "ACTIVE", "2213");
        if(!a1.Deposit(-500)){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }
    }

    //valid withdrawal fucntion
    public void TestingWithdrawalExceedingBalance(){
        Account a1 = new Account("2215", "Rahul", 19, 5000.0, "CURRENT" , "ACTIVE","2212");
        if(!a1.withdraw(100000, "0000")){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }
    }

    public void TestingWithdrawalNegative(){
        Account a1 = new Account("2215", "Rahul", 19, 5000.0, "CURRENT" , "ACTIVE", "2123");
        if(!a1.withdraw(-10000, "0000")){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }
    }


    public void finalTesting(){
        Account acc = new Account("ACC1001", "Rajesh Sharma", 28, 5000.0, "SAVINGS", "ACTIVE", "2122");
        acc.displayAccountInfo();
        boolean depositeOkay = acc.Deposit(2000);
        System.out.println("Deposit 2000: " + (depositeOkay ? "SUCCESS" : "FAILED") + " | Balance: Rs " + acc.getBalance());
        boolean withdrawOkay = acc.withdraw(3000.0, "0000");
        System.out.println("Withdraw 3000: " + (withdrawOkay ? "SUCCESS" : "FAILED") + " | Balance: Rs " + acc.getBalance());
        boolean failWithdrawal = acc.withdraw(10000.0, "0000");
        System.out.println("Withdraw 10000 (exceeds balance): " + (failWithdrawal ? "SUCCESS" : "FAILED") + " | Balance: Rs " + acc.getBalance());

    }


    //ac4 - testing for ac4 (after setting pin)


    public void testingAgeInvalid(){
        try{
            Account ac4 = new Account("12123212" , "Rahul", 16, 1223, "SAVINGS", "ACTIVE", "0000");
            System.out.println("Account created Success");
        }
        catch (IllegalArgumentException e){
            System.out.println("True, error caught");
        }
    }

    public void pinChange(){
        Account ac4 = new Account("12123212" , "Rahul", 19, 12000, "SAVINGS", "ACTIVE", "0000");
        System.out.println("Pin change" + ac4.pinChange("0000", "1234"));
        System.out.println("withdrawl1 "+ ac4.withdraw( 122, "0000"));
        System.out.println("withdrawl2 "+ ac4.withdraw( 122, "1234"));
    }

    public void suspendAccTest(){
        Account ac4 = new Account("12123212" , "Rahul", 19, 12000, "SAVINGS", "ACTIVE", "0000");
        ac4.suspend();
        System.out.println("withdrawl1 "+ ac4.withdraw( 122, "0000"));
        ac4.activate();
        System.out.println("withdrawl1 "+ ac4.withdraw( 122, "0000"));
    }
    public static void main(String[] args){
//        AccountTest test1 = new AccountTest();
//        test1.DepositSuccessTest();
//        test1.DepositeNegativeDeposite();
//        test1.TestingWithdrawalExceedingBalance();
//        test1.TestingWithdrawalNegative();

          AccountTest AcT4 = new AccountTest();
          AcT4.suspendAccTest();



    }

}
