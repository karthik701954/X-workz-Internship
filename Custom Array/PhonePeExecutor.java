class PhonePeExecutor {

    public static void main(String args[]) {

        PhonePe transactions[] = new PhonePe[15];

        PhonePe phonepe1 = new PhonePe();
        phonepe1.transactionId = 1;
        phonepe1.userName = "Karthik";
        phonepe1.transactionType = "Mobile Recharge";
        phonepe1.amount = 299;
        phonepe1.status = "Success";
        transactions[0] = phonepe1;

        PhonePe phonepe2 = new PhonePe();
        phonepe2.transactionId = 2;
        phonepe2.userName = "Rahul";
        phonepe2.transactionType = "Electricity Bill";
        phonepe2.amount = 1200;
        phonepe2.status = "Success";
        transactions[1] = phonepe2;

        PhonePe phonepe3 = new PhonePe();
        phonepe3.transactionId = 3;
        phonepe3.userName = "Anjali";
        phonepe3.transactionType = "Money Transfer";
        phonepe3.amount = 5000;
        phonepe3.status = "Success";
        transactions[2] = phonepe3;

        PhonePe phonepe4 = new PhonePe();
        phonepe4.transactionId = 4;
        phonepe4.userName = "Priya";
        phonepe4.transactionType = "DTH Recharge";
        phonepe4.amount = 450;
        phonepe4.status = "Failed";
        transactions[3] = phonepe4;

        PhonePe phonepe5 = new PhonePe();
        phonepe5.transactionId = 5;
        phonepe5.userName = "Arjun";
        phonepe5.transactionType = "Gas Bill";
        phonepe5.amount = 900;
        phonepe5.status = "Success";
        transactions[4] = phonepe5;

        PhonePe phonepe6 = new PhonePe();
        phonepe6.transactionId = 6;
        phonepe6.userName = "Sneha";
        phonepe6.transactionType = "Water Bill";
        phonepe6.amount = 300;
        phonepe6.status = "Success";
        transactions[5] = phonepe6;

        PhonePe phonepe7 = new PhonePe();
        phonepe7.transactionId = 7;
        phonepe7.userName = "Vikram";
        phonepe7.transactionType = "Money Transfer";
        phonepe7.amount = 7000;
        phonepe7.status = "Pending";
        transactions[6] = phonepe7;

        PhonePe phonepe8 = new PhonePe();
        phonepe8.transactionId = 8;
        phonepe8.userName = "Meena";
        phonepe8.transactionType = "Mobile Recharge";
        phonepe8.amount = 199;
        phonepe8.status = "Success";
        transactions[7] = phonepe8;

        PhonePe phonepe9 = new PhonePe();
        phonepe9.transactionId = 9;
        phonepe9.userName = "Ramesh";
        phonepe9.transactionType = "Insurance Payment";
        phonepe9.amount = 2500;
        phonepe9.status = "Success";
        transactions[8] = phonepe9;

        PhonePe phonepe10 = new PhonePe();
        phonepe10.transactionId = 10;
        phonepe10.userName = "Suresh";
        phonepe10.transactionType = "Loan Payment";
        phonepe10.amount = 8000;
        phonepe10.status = "Success";
        transactions[9] = phonepe10;

        PhonePe phonepe11 = new PhonePe();
        phonepe11.transactionId = 11;
        phonepe11.userName = "Divya";
        phonepe11.transactionType = "Shopping Payment";
        phonepe11.amount = 1500;
        phonepe11.status = "Success";
        transactions[10] = phonepe11;

        PhonePe phonepe12 = new PhonePe();
        phonepe12.transactionId = 12;
        phonepe12.userName = "Amit";
        phonepe12.transactionType = "Ticket Booking";
        phonepe12.amount = 1200;
        phonepe12.status = "Failed";
        transactions[11] = phonepe12;

        PhonePe phonepe13 = new PhonePe();
        phonepe13.transactionId = 13;
        phonepe13.userName = "Neha";
        phonepe13.transactionType = "Money Transfer";
        phonepe13.amount = 3500;
        phonepe13.status = "Success";
        transactions[12] = phonepe13;

        PhonePe phonepe14 = new PhonePe();
        phonepe14.transactionId = 14;
        phonepe14.userName = "Kiran";
        phonepe14.transactionType = "Mobile Recharge";
        phonepe14.amount = 249;
        phonepe14.status = "Success";
        transactions[13] = phonepe14;

        PhonePe phonepe15 = new PhonePe();
        phonepe15.transactionId = 15;
        phonepe15.userName = "Pooja";
        phonepe15.transactionType = "Electricity Bill";
        phonepe15.amount = 1800;
        phonepe15.status = "Pending";
        transactions[14] = phonepe15;


        for (PhonePe ref : transactions) {

            System.out.println("Transaction Id is :" + ref.transactionId);
            System.out.println("User Name is :" + ref.userName);
            System.out.println("Transaction Type is :" + ref.transactionType);
            System.out.println("Amount is :" + ref.amount);
            System.out.println("Status is :" + ref.status);
            System.out.println("----------------------------------");
        }
    }
}