class PersonExecutor {

    public static void main(String args[]) {

        Person ref1 = new Person();
        ref1.personId = 1;
        ref1.name = "Person1";
        ref1.age = 25;
        ref1.gender = "Male";
        ref1.city = "City1";

        GovernmentIdentification g1 = new GovernmentIdentification();
        g1.idNumber = 1001;
        g1.idType = "Aadhar";
        g1.issueDate = "2020-01-01";
        g1.expiryDate = "2030-01-01";
        g1.authority = "Govt1";

        ref1.govId = g1;
        ref1.getPersonDetails();


        Person ref2 = new Person();
        ref2.personId = 2;
        ref2.name = "Person2";
        ref2.age = 30;
        ref2.gender = "Female";
        ref2.city = "City2";

        GovernmentIdentification g2 = new GovernmentIdentification();
        g2.idNumber = 1002;
        g2.idType = "PAN";
        g2.issueDate = "2019-02-01";
        g2.expiryDate = "2030-02-01";
        g2.authority = "Govt2";

        ref2.govId = g2;
        ref2.getPersonDetails();


        Person ref3 = new Person();
        ref3.personId = 3;
        ref3.name = "Person3";
        ref3.age = 28;
        ref3.gender = "Male";
        ref3.city = "City3";

        GovernmentIdentification g3 = new GovernmentIdentification();
        g3.idNumber = 1003;
        g3.idType = "Passport";
        g3.issueDate = "2018-03-01";
        g3.expiryDate = "2028-03-01";
        g3.authority = "Govt3";

        ref3.govId = g3;
        ref3.getPersonDetails();


        Person ref4 = new Person();
        ref4.personId = 4;
        ref4.name = "Person4";
        ref4.age = 35;
        ref4.gender = "Female";
        ref4.city = "City4";

        GovernmentIdentification g4 = new GovernmentIdentification();
        g4.idNumber = 1004;
        g4.idType = "DrivingLicense";
        g4.issueDate = "2021-04-01";
        g4.expiryDate = "2031-04-01";
        g4.authority = "Govt4";

        ref4.govId = g4;
        ref4.getPersonDetails();


        Person ref5 = new Person();
        ref5.personId = 5;
        ref5.name = "Person5";
        ref5.age = 27;
        ref5.gender = "Male";
        ref5.city = "City5";

        GovernmentIdentification g5 = new GovernmentIdentification();
        g5.idNumber = 1005;
        g5.idType = "VoterID";
        g5.issueDate = "2017-05-01";
        g5.expiryDate = "2030-05-01";
        g5.authority = "Govt5";

        ref5.govId = g5;
        ref5.getPersonDetails();
		
		        Person ref6 = new Person();
        ref6.personId = 6;
        ref6.name = "Person6";
        ref6.age = 26;
        ref6.gender = "Female";
        ref6.city = "City6";

        GovernmentIdentification g6 = new GovernmentIdentification();
        g6.idNumber = 1006;
        g6.idType = "Aadhar";
        g6.issueDate = "2020-06-01";
        g6.expiryDate = "2030-06-01";
        g6.authority = "Govt6";

        ref6.govId = g6;
        ref6.getPersonDetails();


        Person ref7 = new Person();
        ref7.personId = 7;
        ref7.name = "Person7";
        ref7.age = 31;
        ref7.gender = "Male";
        ref7.city = "City7";

        GovernmentIdentification g7 = new GovernmentIdentification();
        g7.idNumber = 1007;
        g7.idType = "PAN";
        g7.issueDate = "2019-07-01";
        g7.expiryDate = "2030-07-01";
        g7.authority = "Govt7";

        ref7.govId = g7;
        ref7.getPersonDetails();


        Person ref8 = new Person();
        ref8.personId = 8;
        ref8.name = "Person8";
        ref8.age = 29;
        ref8.gender = "Female";
        ref8.city = "City8";

        GovernmentIdentification g8 = new GovernmentIdentification();
        g8.idNumber = 1008;
        g8.idType = "Passport";
        g8.issueDate = "2018-08-01";
        g8.expiryDate = "2028-08-01";
        g8.authority = "Govt8";

        ref8.govId = g8;
        ref8.getPersonDetails();


        Person ref9 = new Person();
        ref9.personId = 9;
        ref9.name = "Person9";
        ref9.age = 34;
        ref9.gender = "Male";
        ref9.city = "City9";

        GovernmentIdentification g9 = new GovernmentIdentification();
        g9.idNumber = 1009;
        g9.idType = "DrivingLicense";
        g9.issueDate = "2021-09-01";
        g9.expiryDate = "2031-09-01";
        g9.authority = "Govt9";

        ref9.govId = g9;
        ref9.getPersonDetails();


        Person ref10 = new Person();
        ref10.personId = 10;
        ref10.name = "Person10";
        ref10.age = 28;
        ref10.gender = "Female";
        ref10.city = "City10";

        GovernmentIdentification g10 = new GovernmentIdentification();
        g10.idNumber = 1010;
        g10.idType = "VoterID";
        g10.issueDate = "2017-10-01";
        g10.expiryDate = "2030-10-01";
        g10.authority = "Govt10";

        ref10.govId = g10;
        ref10.getPersonDetails();


        Person ref11 = new Person();
        ref11.personId = 11;
        ref11.name = "Person11";
        ref11.age = 32;
        ref11.gender = "Male";
        ref11.city = "City11";

        GovernmentIdentification g11 = new GovernmentIdentification();
        g11.idNumber = 1011;
        g11.idType = "Aadhar";
        g11.issueDate = "2020-11-01";
        g11.expiryDate = "2030-11-01";
        g11.authority = "Govt11";

        ref11.govId = g11;
        ref11.getPersonDetails();


        Person ref12 = new Person();
        ref12.personId = 12;
        ref12.name = "Person12";
        ref12.age = 36;
        ref12.gender = "Female";
        ref12.city = "City12";

        GovernmentIdentification g12 = new GovernmentIdentification();
        g12.idNumber = 1012;
        g12.idType = "PAN";
        g12.issueDate = "2019-12-01";
        g12.expiryDate = "2030-12-01";
        g12.authority = "Govt12";

        ref12.govId = g12;
        ref12.getPersonDetails();


        Person ref13 = new Person();
        ref13.personId = 13;
        ref13.name = "Person13";
        ref13.age = 27;
        ref13.gender = "Male";
        ref13.city = "City13";

        GovernmentIdentification g13 = new GovernmentIdentification();
        g13.idNumber = 1013;
        g13.idType = "Passport";
        g13.issueDate = "2018-01-01";
        g13.expiryDate = "2028-01-01";
        g13.authority = "Govt13";

        ref13.govId = g13;
        ref13.getPersonDetails();


        Person ref14 = new Person();
        ref14.personId = 14;
        ref14.name = "Person14";
        ref14.age = 38;
        ref14.gender = "Female";
        ref14.city = "City14";

        GovernmentIdentification g14 = new GovernmentIdentification();
        g14.idNumber = 1014;
        g14.idType = "DrivingLicense";
        g14.issueDate = "2021-02-01";
        g14.expiryDate = "2031-02-01";
        g14.authority = "Govt14";

        ref14.govId = g14;
        ref14.getPersonDetails();


        Person ref15 = new Person();
        ref15.personId = 15;
        ref15.name = "Person15";
        ref15.age = 29;
        ref15.gender = "Male";
        ref15.city = "City15";

        GovernmentIdentification g15 = new GovernmentIdentification();
        g15.idNumber = 1015;
        g15.idType = "VoterID";
        g15.issueDate = "2017-03-01";
        g15.expiryDate = "2030-03-01";
        g15.authority = "Govt15";

        ref15.govId = g15;
        ref15.getPersonDetails();


        Person ref16 = new Person();
        ref16.personId = 16;
        ref16.name = "Person16";
        ref16.age = 33;
        ref16.gender = "Female";
        ref16.city = "City16";

        GovernmentIdentification g16 = new GovernmentIdentification();
        g16.idNumber = 1016;
        g16.idType = "Aadhar";
        g16.issueDate = "2020-04-01";
        g16.expiryDate = "2030-04-01";
        g16.authority = "Govt16";

        ref16.govId = g16;
        ref16.getPersonDetails();


        Person ref17 = new Person();
        ref17.personId = 17;
        ref17.name = "Person17";
        ref17.age = 35;
        ref17.gender = "Male";
        ref17.city = "City17";

        GovernmentIdentification g17 = new GovernmentIdentification();
        g17.idNumber = 1017;
        g17.idType = "PAN";
        g17.issueDate = "2019-05-01";
        g17.expiryDate = "2030-05-01";
        g17.authority = "Govt17";

        ref17.govId = g17;
        ref17.getPersonDetails();


        Person ref18 = new Person();
        ref18.personId = 18;
        ref18.name = "Person18";
        ref18.age = 28;
        ref18.gender = "Female";
        ref18.city = "City18";

        GovernmentIdentification g18 = new GovernmentIdentification();
        g18.idNumber = 1018;
        g18.idType = "Passport";
        g18.issueDate = "2018-06-01";
        g18.expiryDate = "2028-06-01";
        g18.authority = "Govt18";

        ref18.govId = g18;
        ref18.getPersonDetails();


        Person ref19 = new Person();
        ref19.personId = 19;
        ref19.name = "Person19";
        ref19.age = 37;
        ref19.gender = "Male";
        ref19.city = "City19";

        GovernmentIdentification g19 = new GovernmentIdentification();
        g19.idNumber = 1019;
        g19.idType = "DrivingLicense";
        g19.issueDate = "2021-07-01";
        g19.expiryDate = "2031-07-01";
        g19.authority = "Govt19";

        ref19.govId = g19;
        ref19.getPersonDetails();


        Person ref20 = new Person();
        ref20.personId = 20;
        ref20.name = "Person20";
        ref20.age = 30;
        ref20.gender = "Female";
        ref20.city = "City20";

        GovernmentIdentification g20 = new GovernmentIdentification();
        g20.idNumber = 1020;
        g20.idType = "VoterID";
        g20.issueDate = "2017-08-01";
        g20.expiryDate = "2030-08-01";
        g20.authority = "Govt20";

        ref20.govId = g20;
        ref20.getPersonDetails();


        Person ref21 = new Person();
        ref21.personId = 21;
        ref21.name = "Person21";
        ref21.age = 34;
        ref21.gender = "Male";
        ref21.city = "City21";

        GovernmentIdentification g21 = new GovernmentIdentification();
        g21.idNumber = 1021;
        g21.idType = "Aadhar";
        g21.issueDate = "2020-09-01";
        g21.expiryDate = "2030-09-01";
        g21.authority = "Govt21";

        ref21.govId = g21;
        ref21.getPersonDetails();


        Person ref22 = new Person();
        ref22.personId = 22;
        ref22.name = "Person22";
        ref22.age = 36;
        ref22.gender = "Female";
        ref22.city = "City22";

        GovernmentIdentification g22 = new GovernmentIdentification();
        g22.idNumber = 1022;
        g22.idType = "PAN";
        g22.issueDate = "2019-10-01";
        g22.expiryDate = "2030-10-01";
        g22.authority = "Govt22";

        ref22.govId = g22;
        ref22.getPersonDetails();


        Person ref23 = new Person();
        ref23.personId = 23;
        ref23.name = "Person23";
        ref23.age = 27;
        ref23.gender = "Male";
        ref23.city = "City23";

        GovernmentIdentification g23 = new GovernmentIdentification();
        g23.idNumber = 1023;
        g23.idType = "Passport";
        g23.issueDate = "2018-11-01";
        g23.expiryDate = "2028-11-01";
        g23.authority = "Govt23";

        ref23.govId = g23;
        ref23.getPersonDetails();


        Person ref24 = new Person();
        ref24.personId = 24;
        ref24.name = "Person24";
        ref24.age = 38;
        ref24.gender = "Female";
        ref24.city = "City24";

        GovernmentIdentification g24 = new GovernmentIdentification();
        g24.idNumber = 1024;
        g24.idType = "DrivingLicense";
        g24.issueDate = "2021-12-01";
        g24.expiryDate = "2031-12-01";
        g24.authority = "Govt24";

        ref24.govId = g24;
        ref24.getPersonDetails();


        Person ref25 = new Person();
        ref25.personId = 25;
        ref25.name = "Person25";
        ref25.age = 29;
        ref25.gender = "Male";
        ref25.city = "City25";

        GovernmentIdentification g25 = new GovernmentIdentification();
        g25.idNumber = 1025;
        g25.idType = "VoterID";
        g25.issueDate = "2017-01-01";
        g25.expiryDate = "2030-01-01";
        g25.authority = "Govt25";

        ref25.govId = g25;
        ref25.getPersonDetails();


        Person ref26 = new Person();
        ref26.personId = 26;
        ref26.name = "Person26";
        ref26.age = 33;
        ref26.gender = "Female";
        ref26.city = "City26";

        GovernmentIdentification g26 = new GovernmentIdentification();
        g26.idNumber = 1026;
        g26.idType = "Aadhar";
        g26.issueDate = "2020-02-01";
        g26.expiryDate = "2030-02-01";
        g26.authority = "Govt26";

        ref26.govId = g26;
        ref26.getPersonDetails();


        Person ref27 = new Person();
        ref27.personId = 27;
        ref27.name = "Person27";
        ref27.age = 35;
        ref27.gender = "Male";
        ref27.city = "City27";

        GovernmentIdentification g27 = new GovernmentIdentification();
        g27.idNumber = 1027;
        g27.idType = "PAN";
        g27.issueDate = "2019-03-01";
        g27.expiryDate = "2030-03-01";
        g27.authority = "Govt27";

        ref27.govId = g27;
        ref27.getPersonDetails();


        Person ref28 = new Person();
        ref28.personId = 28;
        ref28.name = "Person28";
        ref28.age = 28;
        ref28.gender = "Female";
        ref28.city = "City28";

        GovernmentIdentification g28 = new GovernmentIdentification();
        g28.idNumber = 1028;
        g28.idType = "Passport";
        g28.issueDate = "2018-04-01";
        g28.expiryDate = "2028-04-01";
        g28.authority = "Govt28";

        ref28.govId = g28;
        ref28.getPersonDetails();


        Person ref29 = new Person();
        ref29.personId = 29;
        ref29.name = "Person29";
        ref29.age = 37;
        ref29.gender = "Male";
        ref29.city = "City29";

        GovernmentIdentification g29 = new GovernmentIdentification();
        g29.idNumber = 1029;
        g29.idType = "DrivingLicense";
        g29.issueDate = "2021-05-01";
        g29.expiryDate = "2031-05-01";
        g29.authority = "Govt29";

        ref29.govId = g29;
        ref29.getPersonDetails();
    }
}

