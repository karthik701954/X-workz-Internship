class ATMExecutor {

    public static void main(String args[]) {

        ATM accounts[] = new ATM[15];

        ATM atm1 = new ATM();
        atm1.accountNumber = 1001;
        atm1.accountHolderName = "Karthik";
        atm1.balance = 50000;
        atm1.transactionType = "Withdraw";
        atm1.transactionAmount = 2000;
        accounts[0] = atm1;

        ATM atm2 = new ATM();
        atm2.accountNumber = 1002;
        atm2.accountHolderName = "Rahul";
        atm2.balance = 60000;
        atm2.transactionType = "Deposit";
        atm2.transactionAmount = 5000;
        accounts[1] = atm2;

        ATM atm3 = new ATM();
        atm3.accountNumber = 1003;
        atm3.accountHolderName = "Anjali";
        atm3.balance = 45000;
        atm3.transactionType = "Withdraw";
        atm3.transactionAmount = 3000;
        accounts[2] = atm3;

        ATM atm4 = new ATM();
        atm4.accountNumber = 1004;
        atm4.accountHolderName = "Priya";
        atm4.balance = 70000;
        atm4.transactionType = "Deposit";
        atm4.transactionAmount = 8000;
        accounts[3] = atm4;

        ATM atm5 = new ATM();
        atm5.accountNumber = 1005;
        atm5.accountHolderName = "Arjun";
        atm5.balance = 55000;
        atm5.transactionType = "Withdraw";
        atm5.transactionAmount = 4000;
        accounts[4] = atm5;

        ATM atm6 = new ATM();
        atm6.accountNumber = 1006;
        atm6.accountHolderName = "Sneha";
        atm6.balance = 48000;
        atm6.transactionType = "Deposit";
        atm6.transactionAmount = 2000;
        accounts[5] = atm6;

        ATM atm7 = new ATM();
        atm7.accountNumber = 1007;
        atm7.accountHolderName = "Vikram";
        atm7.balance = 62000;
        atm7.transactionType = "Withdraw";
        atm7.transactionAmount = 5000;
        accounts[6] = atm7;

        ATM atm8 = new ATM();
        atm8.accountNumber = 1008;
        atm8.accountHolderName = "Meena";
        atm8.balance = 53000;
        atm8.transactionType = "Deposit";
        atm8.transactionAmount = 3000;
        accounts[7] = atm8;

        ATM atm9 = new ATM();
        atm9.accountNumber = 1009;
        atm9.accountHolderName = "Ramesh";
        atm9.balance = 47000;
        atm9.transactionType = "Withdraw";
        atm9.transactionAmount = 2500;
        accounts[8] = atm9;

        ATM atm10 = new ATM();
        atm10.accountNumber = 1010;
        atm10.accountHolderName = "Suresh";
        atm10.balance = 80000;
        atm10.transactionType = "Deposit";
        atm10.transactionAmount = 10000;
        accounts[9] = atm10;

        ATM atm11 = new ATM();
        atm11.accountNumber = 1011;
        atm11.accountHolderName = "Divya";
        atm11.balance = 39000;
        atm11.transactionType = "Withdraw";
        atm11.transactionAmount = 1500;
        accounts[10] = atm11;

        ATM atm12 = new ATM();
        atm12.accountNumber = 1012;
        atm12.accountHolderName = "Amit";
        atm12.balance = 66000;
        atm12.transactionType = "Deposit";
        atm12.transactionAmount = 7000;
        accounts[11] = atm12;

        ATM atm13 = new ATM();
        atm13.accountNumber = 1013;
        atm13.accountHolderName = "Neha";
        atm13.balance = 72000;
        atm13.transactionType = "Withdraw";
        atm13.transactionAmount = 6000;
        accounts[12] = atm13;

        ATM atm14 = new ATM();
        atm14.accountNumber = 1014;
        atm14.accountHolderName = "Kiran";
        atm14.balance = 58000;
        atm14.transactionType = "Deposit";
        atm14.transactionAmount = 4000;
        accounts[13] = atm14;

        ATM atm15 = new ATM();
        atm15.accountNumber = 1015;
        atm15.accountHolderName = "Pooja";
        atm15.balance = 61000;
        atm15.transactionType = "Withdraw";
        atm15.transactionAmount = 3500;
        accounts[14] = atm15;


        for (ATM ref : accounts) {

            System.out.println("Account Number is :" + ref.accountNumber);
            System.out.println("Account Holder Name is :" + ref.accountHolderName);
            System.out.println("Balance is :" + ref.balance);
            System.out.println("Transaction Type is :" + ref.transactionType);
            System.out.println("Transaction Amount is :" + ref.transactionAmount);
            System.out.println("----------------------------------");
        }
    }
}