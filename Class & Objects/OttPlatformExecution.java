class OttPlatformExecution {

    public static void main(String args[]) {

        OttPlatform ref1 = new OttPlatform();
        ref1.platformId = 1;
        ref1.platformName = "Platform1";
        ref1.region = "India";
        ref1.users = 100000;
        ref1.contentType = "Movies";

        Subscription s1 = new Subscription();
        s1.subscriptionId = 101;
        s1.planName = "Basic";
        s1.duration = 1;
        s1.price = 199;
        s1.benefits = "SD Quality";

        ref1.subscription = s1;
        ref1.getPlatformDetails();


        OttPlatform ref2 = new OttPlatform();
        ref2.platformId = 2;
        ref2.platformName = "Platform2";
        ref2.region = "USA";
        ref2.users = 200000;
        ref2.contentType = "Series";

        Subscription s2 = new Subscription();
        s2.subscriptionId = 102;
        s2.planName = "Standard";
        s2.duration = 3;
        s2.price = 499;
        s2.benefits = "HD Quality";

        ref2.subscription = s2;
        ref2.getPlatformDetails();


        OttPlatform ref3 = new OttPlatform();
        ref3.platformId = 3;
        ref3.platformName = "Platform3";
        ref3.region = "UK";
        ref3.users = 150000;
        ref3.contentType = "Movies & Series";

        Subscription s3 = new Subscription();
        s3.subscriptionId = 103;
        s3.planName = "Premium";
        s3.duration = 6;
        s3.price = 999;
        s3.benefits = "4K Quality";

        ref3.subscription = s3;
        ref3.getPlatformDetails();


        OttPlatform ref4 = new OttPlatform();
        ref4.platformId = 4;
        ref4.platformName = "Platform4";
        ref4.region = "Canada";
        ref4.users = 120000;
        ref4.contentType = "Sports";

        Subscription s4 = new Subscription();
        s4.subscriptionId = 104;
        s4.planName = "Basic";
        s4.duration = 1;
        s4.price = 149;
        s4.benefits = "SD Quality";

        ref4.subscription = s4;
        ref4.getPlatformDetails();


        OttPlatform ref5 = new OttPlatform();
        ref5.platformId = 5;
        ref5.platformName = "Platform5";
        ref5.region = "Australia";
        ref5.users = 90000;
        ref5.contentType = "Documentary";

        Subscription s5 = new Subscription();
        s5.subscriptionId = 105;
        s5.planName = "Premium";
        s5.duration = 12;
        s5.price = 1499;
        s5.benefits = "All Access";

        ref5.subscription = s5;
        ref5.getPlatformDetails();
		
		        OttPlatform ref6 = new OttPlatform();
        ref6.platformId = 6;
        ref6.platformName = "Platform6";
        ref6.region = "India";
        ref6.users = 110000;
        ref6.contentType = "Movies";

        Subscription s6 = new Subscription();
        s6.subscriptionId = 106;
        s6.planName = "Basic";
        s6.duration = 1;
        s6.price = 199;
        s6.benefits = "SD Quality";

        ref6.subscription = s6;
        ref6.getPlatformDetails();


        OttPlatform ref7 = new OttPlatform();
        ref7.platformId = 7;
        ref7.platformName = "Platform7";
        ref7.region = "USA";
        ref7.users = 210000;
        ref7.contentType = "Series";

        Subscription s7 = new Subscription();
        s7.subscriptionId = 107;
        s7.planName = "Standard";
        s7.duration = 3;
        s7.price = 499;
        s7.benefits = "HD Quality";

        ref7.subscription = s7;
        ref7.getPlatformDetails();


        OttPlatform ref8 = new OttPlatform();
        ref8.platformId = 8;
        ref8.platformName = "Platform8";
        ref8.region = "UK";
        ref8.users = 160000;
        ref8.contentType = "Movies & Series";

        Subscription s8 = new Subscription();
        s8.subscriptionId = 108;
        s8.planName = "Premium";
        s8.duration = 6;
        s8.price = 999;
        s8.benefits = "4K Quality";

        ref8.subscription = s8;
        ref8.getPlatformDetails();


        OttPlatform ref9 = new OttPlatform();
        ref9.platformId = 9;
        ref9.platformName = "Platform9";
        ref9.region = "Canada";
        ref9.users = 130000;
        ref9.contentType = "Sports";

        Subscription s9 = new Subscription();
        s9.subscriptionId = 109;
        s9.planName = "Basic";
        s9.duration = 1;
        s9.price = 149;
        s9.benefits = "SD Quality";

        ref9.subscription = s9;
        ref9.getPlatformDetails();


        OttPlatform ref10 = new OttPlatform();
        ref10.platformId = 10;
        ref10.platformName = "Platform10";
        ref10.region = "Australia";
        ref10.users = 100000;
        ref10.contentType = "Documentary";

        Subscription s10 = new Subscription();
        s10.subscriptionId = 110;
        s10.planName = "Premium";
        s10.duration = 12;
        s10.price = 1499;
        s10.benefits = "All Access";

        ref10.subscription = s10;
        ref10.getPlatformDetails();


        OttPlatform ref11 = new OttPlatform();
        ref11.platformId = 11;
        ref11.platformName = "Platform11";
        ref11.region = "India";
        ref11.users = 120000;
        ref11.contentType = "Movies";

        Subscription s11 = new Subscription();
        s11.subscriptionId = 111;
        s11.planName = "Standard";
        s11.duration = 3;
        s11.price = 499;
        s11.benefits = "HD Quality";

        ref11.subscription = s11;
        ref11.getPlatformDetails();


        OttPlatform ref12 = new OttPlatform();
        ref12.platformId = 12;
        ref12.platformName = "Platform12";
        ref12.region = "USA";
        ref12.users = 220000;
        ref12.contentType = "Series";

        Subscription s12 = new Subscription();
        s12.subscriptionId = 112;
        s12.planName = "Premium";
        s12.duration = 6;
        s12.price = 999;
        s12.benefits = "4K Quality";

        ref12.subscription = s12;
        ref12.getPlatformDetails();


        OttPlatform ref13 = new OttPlatform();
        ref13.platformId = 13;
        ref13.platformName = "Platform13";
        ref13.region = "UK";
        ref13.users = 170000;
        ref13.contentType = "Movies";

        Subscription s13 = new Subscription();
        s13.subscriptionId = 113;
        s13.planName = "Basic";
        s13.duration = 1;
        s13.price = 199;
        s13.benefits = "SD Quality";

        ref13.subscription = s13;
        ref13.getPlatformDetails();


        OttPlatform ref14 = new OttPlatform();
        ref14.platformId = 14;
        ref14.platformName = "Platform14";
        ref14.region = "Canada";
        ref14.users = 140000;
        ref14.contentType = "Sports";

        Subscription s14 = new Subscription();
        s14.subscriptionId = 114;
        s14.planName = "Standard";
        s14.duration = 3;
        s14.price = 499;
        s14.benefits = "HD Quality";

        ref14.subscription = s14;
        ref14.getPlatformDetails();


        OttPlatform ref15 = new OttPlatform();
        ref15.platformId = 15;
        ref15.platformName = "Platform15";
        ref15.region = "Australia";
        ref15.users = 110000;
        ref15.contentType = "Documentary";

        Subscription s15 = new Subscription();
        s15.subscriptionId = 115;
        s15.planName = "Premium";
        s15.duration = 12;
        s15.price = 1499;
        s15.benefits = "All Access";

        ref15.subscription = s15;
        ref15.getPlatformDetails();

        OttPlatform ref29 = new OttPlatform();
        ref29.platformId = 29;
        ref29.platformName = "Platform29";
        ref29.region = "India";
        ref29.users = 180000;
        ref29.contentType = "Movies";

        Subscription s29 = new Subscription();
        s29.subscriptionId = 129;
        s29.planName = "Premium";
        s29.duration = 12;
        s29.price = 1499;
        s29.benefits = "All Access";

        ref29.subscription = s29;
        ref29.getPlatformDetails();
    }
}