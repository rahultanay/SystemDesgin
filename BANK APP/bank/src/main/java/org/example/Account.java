package org.example;

//Acitivty 1
// account class lo 6 private fields created,
//then constrcutors for each private field is made,
//then deposite and withdrawal class as per readme
//Acitivty 2 Testing - in testing class
//acitivty 3 - pin field
    class Account {
        private String accountNumber;
        private String name;
        private int age;
        private double balance;
        private String accountType;
        private String status;

        private String pin;  //acvitivy3

        //contrcutor
        public Account(String accountNumber, String name, int age, double balance, String accountType, String status,String pin) {
            this.accountNumber = accountNumber;
            this.name = name;

            if(age >=18){
                this.age = age;
            }
            else{
                throw new IllegalArgumentException("age is not sufficient");
            }

            if(balance >= 0){
                this.balance = balance;
            }
            else{
                throw new IllegalArgumentException("balance can't be -ve");
            }


            if(accountType.equals("Current")){
                this.accountType ="Current";
            }else{
                this.accountType="Savings";
            }

            this.status = status;

            if(pin.matches("^\\d{4}$")){
                this.pin = pin;
            }
            else{
                throw new IllegalArgumentException("Only 4 digit pin allowed");
            }

        }



        //deposite - ac1
        public boolean Deposit(double amount) {
            if (amount > 0) {
                balance = balance + amount;
                return true;
            }

            return false;


        }

        //withdrawal - ac1
        public boolean withdraw(double amount, String Inputpin) {
            boolean checker = true;
            if(!validatePin(Inputpin)){
                checker = false;
            }
            if(!status.equals("ACTIVE")){
                checker = false;
            }
            if (!(amount > 0) || amount >= balance){
                checker = false;
            }

            if (checker){
                balance = balance - amount;
                return true;
            } else {
                System.out.println("Transaction failed in withdrwal fucntion");
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

        //checking pin is correct - ac3
        public boolean validatePin(String inputPin){
            if((inputPin != null) && (inputPin.equals(pin)) ){
                return true;
            }
            return false;
        }
        //pin change
        public boolean pinChange(String oldPin, String newPin){
            if(newPin.matches("^\\d{4}$") && validatePin(oldPin)){
                pin = newPin;
                return true;
            }
            return false;
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

        //Account status changer
        public void suspend(){
            setStatus("SUSPENDED");
        }
        public void activate(){
            setStatus("ACTIVE");
        }
        public void close(){
            setStatus("CLOSED");
        }




    }

