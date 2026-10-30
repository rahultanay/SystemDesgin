package org.example;

// account class lo 6 private fields created,
//then constrcutors for each private field is made,
//then deposite and withdrawal class as per readme
//then
    class Account {
        private String accountNumber;
        private String name;
        private int age;
        private double balance;
        private String accountType;
        private String status;

        //contrcutor
        public Account(String accountNumber, String name, int age, double balance, String accountType, String status) {
            this.accountNumber = accountNumber;
            this.name = name;
            this.age = age;
            this.balance = balance;
            if(accountType.equals("Current")){
                this.accountType ="Current";
            }else{
                this.accountType="Savings";
            }
            this.status = status;
        }

        //deposite
        public boolean Deposit(double amount) {
            if (amount > 0) {
                balance = balance + amount;
                return true;
            } else {
                return false;
            }
        }


        //withdrawal
        public boolean withdraw(double amount) {
            if ((amount > 0) && amount <= balance) {
                balance = balance - amount;
                return true;
            } else {
                return false;
            }
        }

        public void displayAccountInfo() {
            System.out.println("Account Number - " + accountNumber);
            System.out.println("Customer Name - " + name);
            System.out.println("Customer Age - " + age);
            System.out.println("Account Balance - " + balance);
            System.out.println("Account Type - " + accountType);
            System.out.println("Account Status - " + status);
        }


        //getters and setters
        public String getAccountNumber() {

            return accountNumber;
        }

        public void setAccountNumber(String accountNumber) {

            this.accountNumber = accountNumber;
        }

        public String getName() {

            return name;
        }

        public void setName(String name) {
            this.name = name;

        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;

        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;

        }

        public String getAccountType() {
            return accountType;
        }

        public void setAccountType(String accountType) {
            this.accountType = accountType;

        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;

        }


    }

