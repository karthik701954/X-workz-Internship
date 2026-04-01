class RealEstateExecutor {

    public static void main(String args[]) {

        RealEstate ref1 = new RealEstate();
        ref1.realEstateId = 1;
        ref1.companyName = "Company1";
        ref1.location = "City1";
        ref1.totalProjects = 5;
        ref1.owner = "Owner1";

        Property p1 = new Property();
        p1.propertyId = 101;
        p1.propertyType = "Apartment";
        p1.price = 1000000;
        p1.area = "1000sqft";
        p1.status = "Available";

        ref1.property = p1;
        ref1.getRealEstateDetails();


        RealEstate ref2 = new RealEstate();
        ref2.realEstateId = 2;
        ref2.companyName = "Company2";
        ref2.location = "City2";
        ref2.totalProjects = 6;
        ref2.owner = "Owner2";

        Property p2 = new Property();
        p2.propertyId = 102;
        p2.propertyType = "Villa";
        p2.price = 2000000;
        p2.area = "2000sqft";
        p2.status = "Sold";

        ref2.property = p2;
        ref2.getRealEstateDetails();


        RealEstate ref3 = new RealEstate();
        ref3.realEstateId = 3;
        ref3.companyName = "Company3";
        ref3.location = "City3";
        ref3.totalProjects = 4;
        ref3.owner = "Owner3";

        Property p3 = new Property();
        p3.propertyId = 103;
        p3.propertyType = "Plot";
        p3.price = 1500000;
        p3.area = "1500sqft";
        p3.status = "Available";

        ref3.property = p3;
        ref3.getRealEstateDetails();


        RealEstate ref4 = new RealEstate();
        ref4.realEstateId = 4;
        ref4.companyName = "Company4";
        ref4.location = "City4";
        ref4.totalProjects = 7;
        ref4.owner = "Owner4";

        Property p4 = new Property();
        p4.propertyId = 104;
        p4.propertyType = "Apartment";
        p4.price = 1800000;
        p4.area = "1200sqft";
        p4.status = "Sold";

        ref4.property = p4;
        ref4.getRealEstateDetails();


        RealEstate ref5 = new RealEstate();
        ref5.realEstateId = 5;
        ref5.companyName = "Company5";
        ref5.location = "City5";
        ref5.totalProjects = 8;
        ref5.owner = "Owner5";

        Property p5 = new Property();
        p5.propertyId = 105;
        p5.propertyType = "Villa";
        p5.price = 2500000;
        p5.area = "2500sqft";
        p5.status = "Available";

        ref5.property = p5;
        ref5.getRealEstateDetails();
		
		        RealEstate ref6 = new RealEstate();
        ref6.realEstateId = 6;
        ref6.companyName = "Company6";
        ref6.location = "City6";
        ref6.totalProjects = 5;
        ref6.owner = "Owner6";

        Property p6 = new Property();
        p6.propertyId = 106;
        p6.propertyType = "Apartment";
        p6.price = 2600000;
        p6.area = "1100sqft";
        p6.status = "Available";

        ref6.property = p6;
        ref6.getRealEstateDetails();


        RealEstate ref7 = new RealEstate();
        ref7.realEstateId = 7;
        ref7.companyName = "Company7";
        ref7.location = "City7";
        ref7.totalProjects = 6;
        ref7.owner = "Owner7";

        Property p7 = new Property();
        p7.propertyId = 107;
        p7.propertyType = "Villa";
        p7.price = 2700000;
        p7.area = "2100sqft";
        p7.status = "Sold";

        ref7.property = p7;
        ref7.getRealEstateDetails();


        RealEstate ref8 = new RealEstate();
        ref8.realEstateId = 8;
        ref8.companyName = "Company8";
        ref8.location = "City8";
        ref8.totalProjects = 4;
        ref8.owner = "Owner8";

        Property p8 = new Property();
        p8.propertyId = 108;
        p8.propertyType = "Plot";
        p8.price = 2800000;
        p8.area = "1600sqft";
        p8.status = "Available";

        ref8.property = p8;
        ref8.getRealEstateDetails();


        RealEstate ref9 = new RealEstate();
        ref9.realEstateId = 9;
        ref9.companyName = "Company9";
        ref9.location = "City9";
        ref9.totalProjects = 7;
        ref9.owner = "Owner9";

        Property p9 = new Property();
        p9.propertyId = 109;
        p9.propertyType = "Apartment";
        p9.price = 2900000;
        p9.area = "1300sqft";
        p9.status = "Sold";

        ref9.property = p9;
        ref9.getRealEstateDetails();


        RealEstate ref10 = new RealEstate();
        ref10.realEstateId = 10;
        ref10.companyName = "Company10";
        ref10.location = "City10";
        ref10.totalProjects = 8;
        ref10.owner = "Owner10";

        Property p10 = new Property();
        p10.propertyId = 110;
        p10.propertyType = "Villa";
        p10.price = 3000000;
        p10.area = "2600sqft";
        p10.status = "Available";

        ref10.property = p10;
        ref10.getRealEstateDetails();


        RealEstate ref11 = new RealEstate();
        ref11.realEstateId = 11;
        ref11.companyName = "Company11";
        ref11.location = "City11";
        ref11.totalProjects = 5;
        ref11.owner = "Owner11";

        Property p11 = new Property();
        p11.propertyId = 111;
        p11.propertyType = "Apartment";
        p11.price = 3100000;
        p11.area = "1400sqft";
        p11.status = "Available";

        ref11.property = p11;
        ref11.getRealEstateDetails();


        RealEstate ref12 = new RealEstate();
        ref12.realEstateId = 12;
        ref12.companyName = "Company12";
        ref12.location = "City12";
        ref12.totalProjects = 6;
        ref12.owner = "Owner12";

        Property p12 = new Property();
        p12.propertyId = 112;
        p12.propertyType = "Plot";
        p12.price = 3200000;
        p12.area = "1700sqft";
        p12.status = "Sold";

        ref12.property = p12;
        ref12.getRealEstateDetails();


        RealEstate ref13 = new RealEstate();
        ref13.realEstateId = 13;
        ref13.companyName = "Company13";
        ref13.location = "City13";
        ref13.totalProjects = 4;
        ref13.owner = "Owner13";

        Property p13 = new Property();
        p13.propertyId = 113;
        p13.propertyType = "Villa";
        p13.price = 3300000;
        p13.area = "2700sqft";
        p13.status = "Available";

        ref13.property = p13;
        ref13.getRealEstateDetails();


        RealEstate ref14 = new RealEstate();
        ref14.realEstateId = 14;
        ref14.companyName = "Company14";
        ref14.location = "City14";
        ref14.totalProjects = 7;
        ref14.owner = "Owner14";

        Property p14 = new Property();
        p14.propertyId = 114;
        p14.propertyType = "Apartment";
        p14.price = 3400000;
        p14.area = "1500sqft";
        p14.status = "Sold";

        ref14.property = p14;
        ref14.getRealEstateDetails();


        RealEstate ref15 = new RealEstate();
        ref15.realEstateId = 15;
        ref15.companyName = "Company15";
        ref15.location = "City15";
        ref15.totalProjects = 8;
        ref15.owner = "Owner15";

        Property p15 = new Property();
        p15.propertyId = 115;
        p15.propertyType = "Plot";
        p15.price = 3500000;
        p15.area = "1800sqft";
        p15.status = "Available";

        ref15.property = p15;
        ref15.getRealEstateDetails();


        RealEstate ref16 = new RealEstate();
        ref16.realEstateId = 16;
        ref16.companyName = "Company16";
        ref16.location = "City16";
        ref16.totalProjects = 5;
        ref16.owner = "Owner16";

        Property p16 = new Property();
        p16.propertyId = 116;
        p16.propertyType = "Villa";
        p16.price = 3600000;
        p16.area = "2800sqft";
        p16.status = "Sold";

        ref16.property = p16;
        ref16.getRealEstateDetails();


        RealEstate ref17 = new RealEstate();
        ref17.realEstateId = 17;
        ref17.companyName = "Company17";
        ref17.location = "City17";
        ref17.totalProjects = 6;
        ref17.owner = "Owner17";

        Property p17 = new Property();
        p17.propertyId = 117;
        p17.propertyType = "Apartment";
        p17.price = 3700000;
        p17.area = "1600sqft";
        p17.status = "Available";

        ref17.property = p17;
        ref17.getRealEstateDetails();


        RealEstate ref18 = new RealEstate();
        ref18.realEstateId = 18;
        ref18.companyName = "Company18";
        ref18.location = "City18";
        ref18.totalProjects = 4;
        ref18.owner = "Owner18";

        Property p18 = new Property();
        p18.propertyId = 118;
        p18.propertyType = "Plot";
        p18.price = 3800000;
        p18.area = "1900sqft";
        p18.status = "Sold";

        ref18.property = p18;
        ref18.getRealEstateDetails();


        RealEstate ref19 = new RealEstate();
        ref19.realEstateId = 19;
        ref19.companyName = "Company19";
        ref19.location = "City19";
        ref19.totalProjects = 7;
        ref19.owner = "Owner19";

        Property p19 = new Property();
        p19.propertyId = 119;
        p19.propertyType = "Villa";
        p19.price = 3900000;
        p19.area = "2900sqft";
        p19.status = "Available";

        ref19.property = p19;
        ref19.getRealEstateDetails();


        RealEstate ref20 = new RealEstate();
        ref20.realEstateId = 20;
        ref20.companyName = "Company20";
        ref20.location = "City20";
        ref20.totalProjects = 8;
        ref20.owner = "Owner20";

        Property p20 = new Property();
        p20.propertyId = 120;
        p20.propertyType = "Apartment";
        p20.price = 4000000;
        p20.area = "1700sqft";
        p20.status = "Sold";

        ref20.property = p20;
        ref20.getRealEstateDetails();


        RealEstate ref21 = new RealEstate();
        ref21.realEstateId = 21;
        ref21.companyName = "Company21";
        ref21.location = "City21";
        ref21.totalProjects = 5;
        ref21.owner = "Owner21";

        Property p21 = new Property();
        p21.propertyId = 121;
        p21.propertyType = "Plot";
        p21.price = 4100000;
        p21.area = "2000sqft";
        p21.status = "Available";

        ref21.property = p21;
        ref21.getRealEstateDetails();


        RealEstate ref22 = new RealEstate();
        ref22.realEstateId = 22;
        ref22.companyName = "Company22";
        ref22.location = "City22";
        ref22.totalProjects = 6;
        ref22.owner = "Owner22";

        Property p22 = new Property();
        p22.propertyId = 122;
        p22.propertyType = "Villa";
        p22.price = 4200000;
        p22.area = "3000sqft";
        p22.status = "Sold";

        ref22.property = p22;
        ref22.getRealEstateDetails();


        RealEstate ref23 = new RealEstate();
        ref23.realEstateId = 23;
        ref23.companyName = "Company23";
        ref23.location = "City23";
        ref23.totalProjects = 4;
        ref23.owner = "Owner23";

        Property p23 = new Property();
        p23.propertyId = 123;
        p23.propertyType = "Apartment";
        p23.price = 4300000;
        p23.area = "1800sqft";
        p23.status = "Available";

        ref23.property = p23;
        ref23.getRealEstateDetails();


        RealEstate ref24 = new RealEstate();
        ref24.realEstateId = 24;
        ref24.companyName = "Company24";
        ref24.location = "City24";
        ref24.totalProjects = 7;
        ref24.owner = "Owner24";

        Property p24 = new Property();
        p24.propertyId = 124;
        p24.propertyType = "Plot";
        p24.price = 4400000;
        p24.area = "2100sqft";
        p24.status = "Sold";

        ref24.property = p24;
        ref24.getRealEstateDetails();


        RealEstate ref25 = new RealEstate();
        ref25.realEstateId = 25;
        ref25.companyName = "Company25";
        ref25.location = "City25";
        ref25.totalProjects = 8;
        ref25.owner = "Owner25";

        Property p25 = new Property();
        p25.propertyId = 125;
        p25.propertyType = "Villa";
        p25.price = 4500000;
        p25.area = "3200sqft";
        p25.status = "Available";

        ref25.property = p25;
        ref25.getRealEstateDetails();


        RealEstate ref26 = new RealEstate();
        ref26.realEstateId = 26;
        ref26.companyName = "Company26";
        ref26.location = "City26";
        ref26.totalProjects = 5;
        ref26.owner = "Owner26";

        Property p26 = new Property();
        p26.propertyId = 126;
        p26.propertyType = "Apartment";
        p26.price = 4600000;
        p26.area = "1900sqft";
        p26.status = "Sold";

        ref26.property = p26;
        ref26.getRealEstateDetails();


        RealEstate ref27 = new RealEstate();
        ref27.realEstateId = 27;
        ref27.companyName = "Company27";
        ref27.location = "City27";
        ref27.totalProjects = 6;
        ref27.owner = "Owner27";

        Property p27 = new Property();
        p27.propertyId = 127;
        p27.propertyType = "Plot";
        p27.price = 4700000;
        p27.area = "2200sqft";
        p27.status = "Available";

        ref27.property = p27;
        ref27.getRealEstateDetails();


        RealEstate ref28 = new RealEstate();
        ref28.realEstateId = 28;
        ref28.companyName = "Company28";
        ref28.location = "City28";
        ref28.totalProjects = 4;
        ref28.owner = "Owner28";

        Property p28 = new Property();
        p28.propertyId = 128;
        p28.propertyType = "Villa";
        p28.price = 4800000;
        p28.area = "3300sqft";
        p28.status = "Sold";

        ref28.property = p28;
        ref28.getRealEstateDetails();


        RealEstate ref29 = new RealEstate();
        ref29.realEstateId = 29;
        ref29.companyName = "Company29";
        ref29.location = "City29";
        ref29.totalProjects = 7;
        ref29.owner = "Owner29";

        Property p29 = new Property();
        p29.propertyId = 129;
        p29.propertyType = "Apartment";
        p29.price = 4900000;
        p29.area = "2000sqft";
        p29.status = "Available";

        ref29.property = p29;
        ref29.getRealEstateDetails();
    }
}