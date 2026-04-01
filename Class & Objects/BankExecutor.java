class BankExecutor {

    public static void main(String args[]) {

        Bank ref1 = new Bank();
        ref1.bankId = 1;
        ref1.bankName = "Bank1";
        ref1.branch = "Branch1";
        ref1.ifsc = "IFSC1";
        ref1.location = "City1";

        AccountHolder a1 = new AccountHolder();
        a1.accountId = 101;
        a1.name = "User1";
        a1.accountNumber = 11111111;
        a1.accountType = "Savings";
        a1.balance = 1000;

        ref1.accountHolder = a1;
        ref1.getBankDetails();


        Bank ref2 = new Bank();
        ref2.bankId = 2;
        ref2.bankName = "Bank2";
        ref2.branch = "Branch2";
        ref2.ifsc = "IFSC2";
        ref2.location = "City2";

        AccountHolder a2 = new AccountHolder();
        a2.accountId = 102;
        a2.name = "User2";
        a2.accountNumber = 22222222;
        a2.accountType = "Current";
        a2.balance = 2000;

        ref2.accountHolder = a2;
        ref2.getBankDetails();


        Bank ref3 = new Bank();
        ref3.bankId = 3;
        ref3.bankName = "Bank3";
        ref3.branch = "Branch3";
        ref3.ifsc = "IFSC3";
        ref3.location = "City3";

        AccountHolder a3 = new AccountHolder();
        a3.accountId = 103;
        a3.name = "User3";
        a3.accountNumber = 33333333;
        a3.accountType = "Savings";
        a3.balance = 3000;

        ref3.accountHolder = a3;
        ref3.getBankDetails();


        Bank ref4 = new Bank();
        ref4.bankId = 4;
        ref4.bankName = "Bank4";
        ref4.branch = "Branch4";
        ref4.ifsc = "IFSC4";
        ref4.location = "City4";

        AccountHolder a4 = new AccountHolder();
        a4.accountId = 104;
        a4.name = "User4";
        a4.accountNumber = 44444444;
        a4.accountType = "Savings";
        a4.balance = 4000;

        ref4.accountHolder = a4;
        ref4.getBankDetails();


        Bank ref5 = new Bank();
        ref5.bankId = 5;
        ref5.bankName = "Bank5";
        ref5.branch = "Branch5";
        ref5.ifsc = "IFSC5";
        ref5.location = "City5";

        AccountHolder a5 = new AccountHolder();
        a5.accountId = 105;
        a5.name = "User5";
        a5.accountNumber = 55555555;
        a5.accountType = "Current";
        a5.balance = 5000;

        ref5.accountHolder = a5;
        ref5.getBankDetails();
		        Bank ref6 = new Bank();
        ref6.bankId = 6;
        ref6.bankName = "Bank6";
        ref6.branch = "Branch6";
        ref6.ifsc = "IFSC6";
        ref6.location = "City6";

        AccountHolder a6 = new AccountHolder();
        a6.accountId = 106;
        a6.name = "User6";
        a6.accountNumber = 66666666;
        a6.accountType = "Savings";
        a6.balance = 6000;

        ref6.accountHolder = a6;
        ref6.getBankDetails();


        Bank ref7 = new Bank();
        ref7.bankId = 7;
        ref7.bankName = "Bank7";
        ref7.branch = "Branch7";
        ref7.ifsc = "IFSC7";
        ref7.location = "City7";

        AccountHolder a7 = new AccountHolder();
        a7.accountId = 107;
        a7.name = "User7";
        a7.accountNumber = 77777777;
        a7.accountType = "Current";
        a7.balance = 7000;

        ref7.accountHolder = a7;
        ref7.getBankDetails();


        Bank ref8 = new Bank();
        ref8.bankId = 8;
        ref8.bankName = "Bank8";
        ref8.branch = "Branch8";
        ref8.ifsc = "IFSC8";
        ref8.location = "City8";

        AccountHolder a8 = new AccountHolder();
        a8.accountId = 108;
        a8.name = "User8";
        a8.accountNumber = 88888888;
        a8.accountType = "Savings";
        a8.balance = 8000;

        ref8.accountHolder = a8;
        ref8.getBankDetails();


        Bank ref9 = new Bank();
        ref9.bankId = 9;
        ref9.bankName = "Bank9";
        ref9.branch = "Branch9";
        ref9.ifsc = "IFSC9";
        ref9.location = "City9";

        AccountHolder a9 = new AccountHolder();
        a9.accountId = 109;
        a9.name = "User9";
        a9.accountNumber = 99999999;
        a9.accountType = "Current";
        a9.balance = 9000;

        ref9.accountHolder = a9;
        ref9.getBankDetails();


        Bank ref10 = new Bank();
        ref10.bankId = 10;
        ref10.bankName = "Bank10";
        ref10.branch = "Branch10";
        ref10.ifsc = "IFSC10";
        ref10.location = "City10";

        AccountHolder a10 = new AccountHolder();
        a10.accountId = 110;
        a10.name = "User10";
        a10.accountNumber = 10101010;
        a10.accountType = "Savings";
        a10.balance = 10000;

        ref10.accountHolder = a10;
        ref10.getBankDetails();


        Bank ref11 = new Bank();
        ref11.bankId = 11;
        ref11.bankName = "Bank11";
        ref11.branch = "Branch11";
        ref11.ifsc = "IFSC11";
        ref11.location = "City11";

        AccountHolder a11 = new AccountHolder();
        a11.accountId = 111;
        a11.name = "User11";
        a11.accountNumber = 11111110;
        a11.accountType = "Current";
        a11.balance = 11000;

        ref11.accountHolder = a11;
        ref11.getBankDetails();


        Bank ref12 = new Bank();
        ref12.bankId = 12;
        ref12.bankName = "Bank12";
        ref12.branch = "Branch12";
        ref12.ifsc = "IFSC12";
        ref12.location = "City12";

        AccountHolder a12 = new AccountHolder();
        a12.accountId = 112;
        a12.name = "User12";
        a12.accountNumber = 12121212;
        a12.accountType = "Savings";
        a12.balance = 12000;

        ref12.accountHolder = a12;
        ref12.getBankDetails();


        Bank ref13 = new Bank();
        ref13.bankId = 13;
        ref13.bankName = "Bank13";
        ref13.branch = "Branch13";
        ref13.ifsc = "IFSC13";
        ref13.location = "City13";

        AccountHolder a13 = new AccountHolder();
        a13.accountId = 113;
        a13.name = "User13";
        a13.accountNumber = 13131313;
        a13.accountType = "Current";
        a13.balance = 13000;

        ref13.accountHolder = a13;
        ref13.getBankDetails();


        Bank ref14 = new Bank();
        ref14.bankId = 14;
        ref14.bankName = "Bank14";
        ref14.branch = "Branch14";
        ref14.ifsc = "IFSC14";
        ref14.location = "City14";

        AccountHolder a14 = new AccountHolder();
        a14.accountId = 114;
        a14.name = "User14";
        a14.accountNumber = 14141414;
        a14.accountType = "Savings";
        a14.balance = 14000;

        ref14.accountHolder = a14;
        ref14.getBankDetails();


        Bank ref15 = new Bank();
        ref15.bankId = 15;
        ref15.bankName = "Bank15";
        ref15.branch = "Branch15";
        ref15.ifsc = "IFSC15";
        ref15.location = "City15";

        AccountHolder a15 = new AccountHolder();
        a15.accountId = 115;
        a15.name = "User15";
        a15.accountNumber = 15151515;
        a15.accountType = "Current";
        a15.balance = 15000;

        ref15.accountHolder = a15;
        ref15.getBankDetails();


        Bank ref16 = new Bank();
        ref16.bankId = 16;
        ref16.bankName = "Bank16";
        ref16.branch = "Branch16";
        ref16.ifsc = "IFSC16";
        ref16.location = "City16";

        AccountHolder a16 = new AccountHolder();
        a16.accountId = 116;
        a16.name = "User16";
        a16.accountNumber = 16161616;
        a16.accountType = "Savings";
        a16.balance = 16000;

        ref16.accountHolder = a16;
        ref16.getBankDetails();


        Bank ref17 = new Bank();
        ref17.bankId = 17;
        ref17.bankName = "Bank17";
        ref17.branch = "Branch17";
        ref17.ifsc = "IFSC17";
        ref17.location = "City17";

        AccountHolder a17 = new AccountHolder();
        a17.accountId = 117;
        a17.name = "User17";
        a17.accountNumber = 17171717;
        a17.accountType = "Current";
        a17.balance = 17000;

        ref17.accountHolder = a17;
        ref17.getBankDetails();


        Bank ref18 = new Bank();
        ref18.bankId = 18;
        ref18.bankName = "Bank18";
        ref18.branch = "Branch18";
        ref18.ifsc = "IFSC18";
        ref18.location = "City18";

        AccountHolder a18 = new AccountHolder();
        a18.accountId = 118;
        a18.name = "User18";
        a18.accountNumber = 18181818;
        a18.accountType = "Savings";
        a18.balance = 18000;

        ref18.accountHolder = a18;
        ref18.getBankDetails();


        Bank ref19 = new Bank();
        ref19.bankId = 19;
        ref19.bankName = "Bank19";
        ref19.branch = "Branch19";
        ref19.ifsc = "IFSC19";
        ref19.location = "City19";

        AccountHolder a19 = new AccountHolder();
        a19.accountId = 119;
        a19.name = "User19";
        a19.accountNumber = 19191919;
        a19.accountType = "Current";
        a19.balance = 19000;

        ref19.accountHolder = a19;
        ref19.getBankDetails();


        Bank ref20 = new Bank();
        ref20.bankId = 20;
        ref20.bankName = "Bank20";
        ref20.branch = "Branch20";
        ref20.ifsc = "IFSC20";
        ref20.location = "City20";

        AccountHolder a20 = new AccountHolder();
        a20.accountId = 120;
        a20.name = "User20";
        a20.accountNumber = 20202020;
        a20.accountType = "Savings";
        a20.balance = 20000;

        ref20.accountHolder = a20;
        ref20.getBankDetails();


        Bank ref21 = new Bank();
        ref21.bankId = 21;
        ref21.bankName = "Bank21";
        ref21.branch = "Branch21";
        ref21.ifsc = "IFSC21";
        ref21.location = "City21";

        AccountHolder a21 = new AccountHolder();
        a21.accountId = 121;
        a21.name = "User21";
        a21.accountNumber = 21212121;
        a21.accountType = "Current";
        a21.balance = 21000;

        ref21.accountHolder = a21;
        ref21.getBankDetails();


        Bank ref22 = new Bank();
        ref22.bankId = 22;
        ref22.bankName = "Bank22";
        ref22.branch = "Branch22";
        ref22.ifsc = "IFSC22";
        ref22.location = "City22";

        AccountHolder a22 = new AccountHolder();
        a22.accountId = 122;
        a22.name = "User22";
        a22.accountNumber = 22222221;
        a22.accountType = "Savings";
        a22.balance = 22000;

        ref22.accountHolder = a22;
        ref22.getBankDetails();


        Bank ref23 = new Bank();
        ref23.bankId = 23;
        ref23.bankName = "Bank23";
        ref23.branch = "Branch23";
        ref23.ifsc = "IFSC23";
        ref23.location = "City23";

        AccountHolder a23 = new AccountHolder();
        a23.accountId = 123;
        a23.name = "User23";
        a23.accountNumber = 23232323;
        a23.accountType = "Current";
        a23.balance = 23000;

        ref23.accountHolder = a23;
        ref23.getBankDetails();


        Bank ref24 = new Bank();
        ref24.bankId = 24;
        ref24.bankName = "Bank24";
        ref24.branch = "Branch24";
        ref24.ifsc = "IFSC24";
        ref24.location = "City24";

        AccountHolder a24 = new AccountHolder();
        a24.accountId = 124;
        a24.name = "User24";
        a24.accountNumber = 24242424;
        a24.accountType = "Savings";
        a24.balance = 24000;

        ref24.accountHolder = a24;
        ref24.getBankDetails();


        Bank ref25 = new Bank();
        ref25.bankId = 25;
        ref25.bankName = "Bank25";
        ref25.branch = "Branch25";
        ref25.ifsc = "IFSC25";
        ref25.location = "City25";

        AccountHolder a25 = new AccountHolder();
        a25.accountId = 125;
        a25.name = "User25";
        a25.accountNumber = 25252525;
        a25.accountType = "Current";
        a25.balance = 25000;

        ref25.accountHolder = a25;
        ref25.getBankDetails();


        Bank ref26 = new Bank();
        ref26.bankId = 26;
        ref26.bankName = "Bank26";
        ref26.branch = "Branch26";
        ref26.ifsc = "IFSC26";
        ref26.location = "City26";

        AccountHolder a26 = new AccountHolder();
        a26.accountId = 126;
        a26.name = "User26";
        a26.accountNumber = 26262626;
        a26.accountType = "Savings";
        a26.balance = 26000;

        ref26.accountHolder = a26;
        ref26.getBankDetails();


        Bank ref27 = new Bank();
        ref27.bankId = 27;
        ref27.bankName = "Bank27";
        ref27.branch = "Branch27";
        ref27.ifsc = "IFSC27";
        ref27.location = "City27";

        AccountHolder a27 = new AccountHolder();
        a27.accountId = 127;
        a27.name = "User27";
        a27.accountNumber = 27272727;
        a27.accountType = "Current";
        a27.balance = 27000;

        ref27.accountHolder = a27;
        ref27.getBankDetails();


        Bank ref28 = new Bank();
        ref28.bankId = 28;
        ref28.bankName = "Bank28";
        ref28.branch = "Branch28";
        ref28.ifsc = "IFSC28";
        ref28.location = "City28";

        AccountHolder a28 = new AccountHolder();
        a28.accountId = 128;
        a28.name = "User28";
        a28.accountNumber = 28282828;
        a28.accountType = "Savings";
        a28.balance = 28000;

        ref28.accountHolder = a28;
        ref28.getBankDetails();


        Bank ref29 = new Bank();
        ref29.bankId = 29;
        ref29.bankName = "Bank29";
        ref29.branch = "Branch29";
        ref29.ifsc = "IFSC29";
        ref29.location = "City29";

        AccountHolder a29 = new AccountHolder();
        a29.accountId = 129;
        a29.name = "User29";
        a29.accountNumber = 29292929;
        a29.accountType = "Current";
        a29.balance = 29000;

        ref29.accountHolder = a29;
        ref29.getBankDetails();
    }
}