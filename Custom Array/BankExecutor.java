class BankExecutor {

    public static void main(String args[]) {

        Bank accounts[] = new Bank[15];

        Bank bank1 = new Bank();
        bank1.accountId = 1;
        bank1.accountHolderName = "Karthik";
        bank1.accountType = "Savings";
        bank1.balance = 50000;
        bank1.branchName = "Bangalore";
        accounts[0] = bank1;

        Bank bank2 = new Bank();
        bank2.accountId = 2;
        bank2.accountHolderName = "Rahul";
        bank2.accountType = "Current";
        bank2.balance = 75000;
        bank2.branchName = "Mumbai";
        accounts[1] = bank2;

        Bank bank3 = new Bank();
        bank3.accountId = 3;
        bank3.accountHolderName = "Anjali";
        bank3.accountType = "Savings";
        bank3.balance = 62000;
        bank3.branchName = "Delhi";
        accounts[2] = bank3;

        Bank bank4 = new Bank();
        bank4.accountId = 4;
        bank4.accountHolderName = "Priya";
        bank4.accountType = "Savings";
        bank4.balance = 48000;
        bank4.branchName = "Chennai";
        accounts[3] = bank4;

        Bank bank5 = new Bank();
        bank5.accountId = 5;
        bank5.accountHolderName = "Arjun";
        bank5.accountType = "Current";
        bank5.balance = 90000;
        bank5.branchName = "Hyderabad";
        accounts[4] = bank5;

        Bank bank6 = new Bank();
        bank6.accountId = 6;
        bank6.accountHolderName = "Sneha";
        bank6.accountType = "Savings";
        bank6.balance = 55000;
        bank6.branchName = "Pune";
        accounts[5] = bank6;

        Bank bank7 = new Bank();
        bank7.accountId = 7;
        bank7.accountHolderName = "Vikram";
        bank7.accountType = "Current";
        bank7.balance = 88000;
        bank7.branchName = "Kolkata";
        accounts[6] = bank7;

        Bank bank8 = new Bank();
        bank8.accountId = 8;
        bank8.accountHolderName = "Meena";
        bank8.accountType = "Savings";
        bank8.balance = 43000;
        bank8.branchName = "Jaipur";
        accounts[7] = bank8;

        Bank bank9 = new Bank();
        bank9.accountId = 9;
        bank9.accountHolderName = "Ramesh";
        bank9.accountType = "Savings";
        bank9.balance = 67000;
        bank9.branchName = "Ahmedabad";
        accounts[8] = bank9;

        Bank bank10 = new Bank();
        bank10.accountId = 10;
        bank10.accountHolderName = "Suresh";
        bank10.accountType = "Current";
        bank10.balance = 99000;
        bank10.branchName = "Lucknow";
        accounts[9] = bank10;

        Bank bank11 = new Bank();
        bank11.accountId = 11;
        bank11.accountHolderName = "Divya";
        bank11.accountType = "Savings";
        bank11.balance = 52000;
        bank11.branchName = "Mysore";
        accounts[10] = bank11;

        Bank bank12 = new Bank();
        bank12.accountId = 12;
        bank12.accountHolderName = "Amit";
        bank12.accountType = "Current";
        bank12.balance = 87000;
        bank12.branchName = "Nagpur";
        accounts[11] = bank12;

        Bank bank13 = new Bank();
        bank13.accountId = 13;
        bank13.accountHolderName = "Neha";
        bank13.accountType = "Savings";
        bank13.balance = 61000;
        bank13.branchName = "Indore";
        accounts[12] = bank13;

        Bank bank14 = new Bank();
        bank14.accountId = 14;
        bank14.accountHolderName = "Kiran";
        bank14.accountType = "Savings";
        bank14.balance = 47000;
        bank14.branchName = "Bhopal";
        accounts[13] = bank14;

        Bank bank15 = new Bank();
        bank15.accountId = 15;
        bank15.accountHolderName = "Pooja";
        bank15.accountType = "Current";
        bank15.balance = 82000;
        bank15.branchName = "Goa";
        accounts[14] = bank15;


        for (Bank ref : accounts) {

            System.out.println("Account Id is :" + ref.accountId);
            System.out.println("Account Holder Name is :" + ref.accountHolderName);
            System.out.println("Account Type is :" + ref.accountType);
            System.out.println("Balance is :" + ref.balance);
            System.out.println("Branch Name is :" + ref.branchName);
            System.out.println("----------------------------------");
        }
    }
}