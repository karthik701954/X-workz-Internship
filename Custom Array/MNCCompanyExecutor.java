class MNCCompanyExecutor {

    public static void main(String args[]) {

        MNCCompany companies[] = new MNCCompany[15];

        MNCCompany company1 = new MNCCompany();
        company1.companyId = 1;
        company1.companyName = "Google";
        company1.location = "USA";
        company1.noOfEmployees = 180000;
        company1.ceoName = "Sundar Pichai";
        companies[0] = company1;

        MNCCompany company2 = new MNCCompany();
        company2.companyId = 2;
        company2.companyName = "Microsoft";
        company2.location = "USA";
        company2.noOfEmployees = 220000;
        company2.ceoName = "Satya Nadella";
        companies[1] = company2;

        MNCCompany company3 = new MNCCompany();
        company3.companyId = 3;
        company3.companyName = "Amazon";
        company3.location = "USA";
        company3.noOfEmployees = 1500000;
        company3.ceoName = "Andy Jassy";
        companies[2] = company3;

        MNCCompany company4 = new MNCCompany();
        company4.companyId = 4;
        company4.companyName = "Apple";
        company4.location = "USA";
        company4.noOfEmployees = 160000;
        company4.ceoName = "Tim Cook";
        companies[3] = company4;

        MNCCompany company5 = new MNCCompany();
        company5.companyId = 5;
        company5.companyName = "IBM";
        company5.location = "USA";
        company5.noOfEmployees = 300000;
        company5.ceoName = "Arvind Krishna";
        companies[4] = company5;

        MNCCompany company6 = new MNCCompany();
        company6.companyId = 6;
        company6.companyName = "Infosys";
        company6.location = "India";
        company6.noOfEmployees = 340000;
        company6.ceoName = "Salil Parekh";
        companies[5] = company6;

        MNCCompany company7 = new MNCCompany();
        company7.companyId = 7;
        company7.companyName = "TCS";
        company7.location = "India";
        company7.noOfEmployees = 600000;
        company7.ceoName = "K Krithivasan";
        companies[6] = company7;

        MNCCompany company8 = new MNCCompany();
        company8.companyId = 8;
        company8.companyName = "Wipro";
        company8.location = "India";
        company8.noOfEmployees = 250000;
        company8.ceoName = "Thierry Delaporte";
        companies[7] = company8;

        MNCCompany company9 = new MNCCompany();
        company9.companyId = 9;
        company9.companyName = "Accenture";
        company9.location = "Ireland";
        company9.noOfEmployees = 700000;
        company9.ceoName = "Julie Sweet";
        companies[8] = company9;

        MNCCompany company10 = new MNCCompany();
        company10.companyId = 10;
        company10.companyName = "Capgemini";
        company10.location = "France";
        company10.noOfEmployees = 360000;
        company10.ceoName = "Aiman Ezzat";
        companies[9] = company10;

        MNCCompany company11 = new MNCCompany();
        company11.companyId = 11;
        company11.companyName = "Cognizant";
        company11.location = "USA";
        company11.noOfEmployees = 350000;
        company11.ceoName = "Ravi Kumar S";
        companies[10] = company11;

        MNCCompany company12 = new MNCCompany();
        company12.companyId = 12;
        company12.companyName = "HCL";
        company12.location = "India";
        company12.noOfEmployees = 220000;
        company12.ceoName = "C Vijayakumar";
        companies[11] = company12;

        MNCCompany company13 = new MNCCompany();
        company13.companyId = 13;
        company13.companyName = "Oracle";
        company13.location = "USA";
        company13.noOfEmployees = 150000;
        company13.ceoName = "Safra Catz";
        companies[12] = company13;

        MNCCompany company14 = new MNCCompany();
        company14.companyId = 14;
        company14.companyName = "SAP";
        company14.location = "Germany";
        company14.noOfEmployees = 110000;
        company14.ceoName = "Christian Klein";
        companies[13] = company14;

        MNCCompany company15 = new MNCCompany();
        company15.companyId = 15;
        company15.companyName = "Dell";
        company15.location = "USA";
        company15.noOfEmployees = 130000;
        company15.ceoName = "Michael Dell";
        companies[14] = company15;


        for (MNCCompany ref : companies) {

            System.out.println("Company Id is :" + ref.companyId);
            System.out.println("Company Name is :" + ref.companyName);
            System.out.println("Location is :" + ref.location);
            System.out.println("No Of Employees is :" + ref.noOfEmployees);
            System.out.println("CEO Name is :" + ref.ceoName);
            System.out.println("----------------------------------");
        }
    }
}