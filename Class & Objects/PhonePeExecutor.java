class PhonePeExecutor {

    public static void main(String args[]) {

        PhonePe ref1 = new PhonePe();
        ref1.phonePeId = 1;
        ref1.mobileNumber = "9000000001";
        ref1.upiId = "user1@upi";
        ref1.accountType = "Savings";
        ref1.status = "Active";

        History h1 = new History();
        h1.historyId = 101;
        h1.transactionType = "Credit";
        h1.amount = 1000;
        h1.date = "01-01-2026";
        h1.status = "Success";

        ref1.history = h1;
        ref1.getPhonePeDetails();


        PhonePe ref2 = new PhonePe();
        ref2.phonePeId = 2;
        ref2.mobileNumber = "9000000002";
        ref2.upiId = "user2@upi";
        ref2.accountType = "Current";
        ref2.status = "Active";

        History h2 = new History();
        h2.historyId = 102;
        h2.transactionType = "Debit";
        h2.amount = 2000;
        h2.date = "02-01-2026";
        h2.status = "Success";

        ref2.history = h2;
        ref2.getPhonePeDetails();


        PhonePe ref3 = new PhonePe();
        ref3.phonePeId = 3;
        ref3.mobileNumber = "9000000003";
        ref3.upiId = "user3@upi";
        ref3.accountType = "Savings";
        ref3.status = "Inactive";

        History h3 = new History();
        h3.historyId = 103;
        h3.transactionType = "Credit";
        h3.amount = 3000;
        h3.date = "03-01-2026";
        h3.status = "Failed";

        ref3.history = h3;
        ref3.getPhonePeDetails();


        PhonePe ref4 = new PhonePe();
        ref4.phonePeId = 4;
        ref4.mobileNumber = "9000000004";
        ref4.upiId = "user4@upi";
        ref4.accountType = "Savings";
        ref4.status = "Active";

        History h4 = new History();
        h4.historyId = 104;
        h4.transactionType = "Debit";
        h4.amount = 4000;
        h4.date = "04-01-2026";
        h4.status = "Success";

        ref4.history = h4;
        ref4.getPhonePeDetails();


        PhonePe ref5 = new PhonePe();
        ref5.phonePeId = 5;
        ref5.mobileNumber = "9000000005";
        ref5.upiId = "user5@upi";
        ref5.accountType = "Current";
        ref5.status = "Active";

        History h5 = new History();
        h5.historyId = 105;
        h5.transactionType = "Credit";
        h5.amount = 5000;
        h5.date = "05-01-2026";
        h5.status = "Success";

        ref5.history = h5;
        ref5.getPhonePeDetails();
		
		        PhonePe ref6 = new PhonePe();
        ref6.phonePeId = 6;
        ref6.mobileNumber = "9000000006";
        ref6.upiId = "user6@upi";
        ref6.accountType = "Savings";
        ref6.status = "Active";

        History h6 = new History();
        h6.historyId = 106;
        h6.transactionType = "Debit";
        h6.amount = 6000;
        h6.date = "06-01-2026";
        h6.status = "Success";

        ref6.history = h6;
        ref6.getPhonePeDetails();


        PhonePe ref7 = new PhonePe();
        ref7.phonePeId = 7;
        ref7.mobileNumber = "9000000007";
        ref7.upiId = "user7@upi";
        ref7.accountType = "Current";
        ref7.status = "Active";

        History h7 = new History();
        h7.historyId = 107;
        h7.transactionType = "Credit";
        h7.amount = 7000;
        h7.date = "07-01-2026";
        h7.status = "Success";

        ref7.history = h7;
        ref7.getPhonePeDetails();


        PhonePe ref8 = new PhonePe();
        ref8.phonePeId = 8;
        ref8.mobileNumber = "9000000008";
        ref8.upiId = "user8@upi";
        ref8.accountType = "Savings";
        ref8.status = "Inactive";

        History h8 = new History();
        h8.historyId = 108;
        h8.transactionType = "Debit";
        h8.amount = 8000;
        h8.date = "08-01-2026";
        h8.status = "Failed";

        ref8.history = h8;
        ref8.getPhonePeDetails();


        PhonePe ref9 = new PhonePe();
        ref9.phonePeId = 9;
        ref9.mobileNumber = "9000000009";
        ref9.upiId = "user9@upi";
        ref9.accountType = "Savings";
        ref9.status = "Active";

        History h9 = new History();
        h9.historyId = 109;
        h9.transactionType = "Credit";
        h9.amount = 9000;
        h9.date = "09-01-2026";
        h9.status = "Success";

        ref9.history = h9;
        ref9.getPhonePeDetails();


        PhonePe ref10 = new PhonePe();
        ref10.phonePeId = 10;
        ref10.mobileNumber = "9000000010";
        ref10.upiId = "user10@upi";
        ref10.accountType = "Current";
        ref10.status = "Active";

        History h10 = new History();
        h10.historyId = 110;
        h10.transactionType = "Debit";
        h10.amount = 10000;
        h10.date = "10-01-2026";
        h10.status = "Success";

        ref10.history = h10;
        ref10.getPhonePeDetails();


        PhonePe ref11 = new PhonePe();
        ref11.phonePeId = 11;
        ref11.mobileNumber = "9000000011";
        ref11.upiId = "user11@upi";
        ref11.accountType = "Savings";
        ref11.status = "Active";

        History h11 = new History();
        h11.historyId = 111;
        h11.transactionType = "Credit";
        h11.amount = 11000;
        h11.date = "11-01-2026";
        h11.status = "Success";

        ref11.history = h11;
        ref11.getPhonePeDetails();


        PhonePe ref12 = new PhonePe();
        ref12.phonePeId = 12;
        ref12.mobileNumber = "9000000012";
        ref12.upiId = "user12@upi";
        ref12.accountType = "Savings";
        ref12.status = "Inactive";

        History h12 = new History();
        h12.historyId = 112;
        h12.transactionType = "Debit";
        h12.amount = 12000;
        h12.date = "12-01-2026";
        h12.status = "Failed";

        ref12.history = h12;
        ref12.getPhonePeDetails();


        PhonePe ref13 = new PhonePe();
        ref13.phonePeId = 13;
        ref13.mobileNumber = "9000000013";
        ref13.upiId = "user13@upi";
        ref13.accountType = "Current";
        ref13.status = "Active";

        History h13 = new History();
        h13.historyId = 113;
        h13.transactionType = "Credit";
        h13.amount = 13000;
        h13.date = "13-01-2026";
        h13.status = "Success";

        ref13.history = h13;
        ref13.getPhonePeDetails();


        PhonePe ref14 = new PhonePe();
        ref14.phonePeId = 14;
        ref14.mobileNumber = "9000000014";
        ref14.upiId = "user14@upi";
        ref14.accountType = "Savings";
        ref14.status = "Active";

        History h14 = new History();
        h14.historyId = 114;
        h14.transactionType = "Debit";
        h14.amount = 14000;
        h14.date = "14-01-2026";
        h14.status = "Success";

        ref14.history = h14;
        ref14.getPhonePeDetails();


        PhonePe ref15 = new PhonePe();
        ref15.phonePeId = 15;
        ref15.mobileNumber = "9000000015";
        ref15.upiId = "user15@upi";
        ref15.accountType = "Savings";
        ref15.status = "Active";

        History h15 = new History();
        h15.historyId = 115;
        h15.transactionType = "Credit";
        h15.amount = 15000;
        h15.date = "15-01-2026";
        h15.status = "Success";

        ref15.history = h15;
        ref15.getPhonePeDetails();


        PhonePe ref16 = new PhonePe();
        ref16.phonePeId = 16;
        ref16.mobileNumber = "9000000016";
        ref16.upiId = "user16@upi";
        ref16.accountType = "Current";
        ref16.status = "Active";

        History h16 = new History();
        h16.historyId = 116;
        h16.transactionType = "Debit";
        h16.amount = 16000;
        h16.date = "16-01-2026";
        h16.status = "Success";

        ref16.history = h16;
        ref16.getPhonePeDetails();


        PhonePe ref17 = new PhonePe();
        ref17.phonePeId = 17;
        ref17.mobileNumber = "9000000017";
        ref17.upiId = "user17@upi";
        ref17.accountType = "Savings";
        ref17.status = "Inactive";

        History h17 = new History();
        h17.historyId = 117;
        h17.transactionType = "Credit";
        h17.amount = 17000;
        h17.date = "17-01-2026";
        h17.status = "Failed";

        ref17.history = h17;
        ref17.getPhonePeDetails();


        PhonePe ref18 = new PhonePe();
        ref18.phonePeId = 18;
        ref18.mobileNumber = "9000000018";
        ref18.upiId = "user18@upi";
        ref18.accountType = "Savings";
        ref18.status = "Active";

        History h18 = new History();
        h18.historyId = 118;
        h18.transactionType = "Debit";
        h18.amount = 18000;
        h18.date = "18-01-2026";
        h18.status = "Success";

        ref18.history = h18;
        ref18.getPhonePeDetails();


        PhonePe ref19 = new PhonePe();
        ref19.phonePeId = 19;
        ref19.mobileNumber = "9000000019";
        ref19.upiId = "user19@upi";
        ref19.accountType = "Current";
        ref19.status = "Active";

        History h19 = new History();
        h19.historyId = 119;
        h19.transactionType = "Credit";
        h19.amount = 19000;
        h19.date = "19-01-2026";
        h19.status = "Success";

        ref19.history = h19;
        ref19.getPhonePeDetails();


        PhonePe ref20 = new PhonePe();
        ref20.phonePeId = 20;
        ref20.mobileNumber = "9000000020";
        ref20.upiId = "user20@upi";
        ref20.accountType = "Savings";
        ref20.status = "Active";

        History h20 = new History();
        h20.historyId = 120;
        h20.transactionType = "Debit";
        h20.amount = 20000;
        h20.date = "20-01-2026";
        h20.status = "Success";

        ref20.history = h20;
        ref20.getPhonePeDetails();


        PhonePe ref21 = new PhonePe();
        ref21.phonePeId = 21;
        ref21.mobileNumber = "9000000021";
        ref21.upiId = "user21@upi";
        ref21.accountType = "Savings";
        ref21.status = "Active";

        History h21 = new History();
        h21.historyId = 121;
        h21.transactionType = "Credit";
        h21.amount = 21000;
        h21.date = "21-01-2026";
        h21.status = "Success";

        ref21.history = h21;
        ref21.getPhonePeDetails();


        PhonePe ref22 = new PhonePe();
        ref22.phonePeId = 22;
        ref22.mobileNumber = "9000000022";
        ref22.upiId = "user22@upi";
        ref22.accountType = "Current";
        ref22.status = "Active";

        History h22 = new History();
        h22.historyId = 122;
        h22.transactionType = "Debit";
        h22.amount = 22000;
        h22.date = "22-01-2026";
        h22.status = "Success";

        ref22.history = h22;
        ref22.getPhonePeDetails();


        PhonePe ref23 = new PhonePe();
        ref23.phonePeId = 23;
        ref23.mobileNumber = "9000000023";
        ref23.upiId = "user23@upi";
        ref23.accountType = "Savings";
        ref23.status = "Inactive";

        History h23 = new History();
        h23.historyId = 123;
        h23.transactionType = "Credit";
        h23.amount = 23000;
        h23.date = "23-01-2026";
        h23.status = "Failed";

        ref23.history = h23;
        ref23.getPhonePeDetails();


        PhonePe ref24 = new PhonePe();
        ref24.phonePeId = 24;
        ref24.mobileNumber = "9000000024";
        ref24.upiId = "user24@upi";
        ref24.accountType = "Savings";
        ref24.status = "Active";

        History h24 = new History();
        h24.historyId = 124;
        h24.transactionType = "Debit";
        h24.amount = 24000;
        h24.date = "24-01-2026";
        h24.status = "Success";

        ref24.history = h24;
        ref24.getPhonePeDetails();


        PhonePe ref25 = new PhonePe();
        ref25.phonePeId = 25;
        ref25.mobileNumber = "9000000025";
        ref25.upiId = "user25@upi";
        ref25.accountType = "Current";
        ref25.status = "Active";

        History h25 = new History();
        h25.historyId = 125;
        h25.transactionType = "Credit";
        h25.amount = 25000;
        h25.date = "25-01-2026";
        h25.status = "Success";

        ref25.history = h25;
        ref25.getPhonePeDetails();


        PhonePe ref26 = new PhonePe();
        ref26.phonePeId = 26;
        ref26.mobileNumber = "9000000026";
        ref26.upiId = "user26@upi";
        ref26.accountType = "Savings";
        ref26.status = "Active";

        History h26 = new History();
        h26.historyId = 126;
        h26.transactionType = "Debit";
        h26.amount = 26000;
        h26.date = "26-01-2026";
        h26.status = "Success";

        ref26.history = h26;
        ref26.getPhonePeDetails();


        PhonePe ref27 = new PhonePe();
        ref27.phonePeId = 27;
        ref27.mobileNumber = "9000000027";
        ref27.upiId = "user27@upi";
        ref27.accountType = "Savings";
        ref27.status = "Inactive";

        History h27 = new History();
        h27.historyId = 127;
        h27.transactionType = "Credit";
        h27.amount = 27000;
        h27.date = "27-01-2026";
        h27.status = "Failed";

        ref27.history = h27;
        ref27.getPhonePeDetails();


        PhonePe ref28 = new PhonePe();
        ref28.phonePeId = 28;
        ref28.mobileNumber = "9000000028";
        ref28.upiId = "user28@upi";
        ref28.accountType = "Current";
        ref28.status = "Active";

        History h28 = new History();
        h28.historyId = 128;
        h28.transactionType = "Debit";
        h28.amount = 28000;
        h28.date = "28-01-2026";
        h28.status = "Success";

        ref28.history = h28;
        ref28.getPhonePeDetails();


        PhonePe ref29 = new PhonePe();
        ref29.phonePeId = 29;
        ref29.mobileNumber = "9000000029";
        ref29.upiId = "user29@upi";
        ref29.accountType = "Savings";
        ref29.status = "Active";

        History h29 = new History();
        h29.historyId = 129;
        h29.transactionType = "Credit";
        h29.amount = 29000;
        h29.date = "29-01-2026";
        h29.status = "Success";

        ref29.history = h29;
        ref29.getPhonePeDetails();
    }
}