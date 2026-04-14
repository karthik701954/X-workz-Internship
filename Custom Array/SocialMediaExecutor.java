class SocialMediaExecutor {

    public static void main(String args[]) {

        SocialMedia apps[] = new SocialMedia[15];

        SocialMedia app1 = new SocialMedia();
        app1.appId = 1;
        app1.appName = "Facebook";
        app1.founderName = "Mark Zuckerberg";
        app1.activeUsers = 2900;
        app1.country = "USA";
        apps[0] = app1;

        SocialMedia app2 = new SocialMedia();
        app2.appId = 2;
        app2.appName = "Instagram";
        app2.founderName = "Kevin Systrom";
        app2.activeUsers = 2000;
        app2.country = "USA";
        apps[1] = app2;

        SocialMedia app3 = new SocialMedia();
        app3.appId = 3;
        app3.appName = "Twitter";
        app3.founderName = "Jack Dorsey";
        app3.activeUsers = 450;
        app3.country = "USA";
        apps[2] = app3;

        SocialMedia app4 = new SocialMedia();
        app4.appId = 4;
        app4.appName = "WhatsApp";
        app4.founderName = "Jan Koum";
        app4.activeUsers = 2400;
        app4.country = "USA";
        apps[3] = app4;

        SocialMedia app5 = new SocialMedia();
        app5.appId = 5;
        app5.appName = "Snapchat";
        app5.founderName = "Evan Spiegel";
        app5.activeUsers = 600;
        app5.country = "USA";
        apps[4] = app5;

        SocialMedia app6 = new SocialMedia();
        app6.appId = 6;
        app6.appName = "LinkedIn";
        app6.founderName = "Reid Hoffman";
        app6.activeUsers = 900;
        app6.country = "USA";
        apps[5] = app6;

        SocialMedia app7 = new SocialMedia();
        app7.appId = 7;
        app7.appName = "YouTube";
        app7.founderName = "Chad Hurley";
        app7.activeUsers = 2500;
        app7.country = "USA";
        apps[6] = app7;

        SocialMedia app8 = new SocialMedia();
        app8.appId = 8;
        app8.appName = "TikTok";
        app8.founderName = "Zhang Yiming";
        app8.activeUsers = 1500;
        app8.country = "China";
        apps[7] = app8;

        SocialMedia app9 = new SocialMedia();
        app9.appId = 9;
        app9.appName = "Telegram";
        app9.founderName = "Pavel Durov";
        app9.activeUsers = 800;
        app9.country = "Russia";
        apps[8] = app9;

        SocialMedia app10 = new SocialMedia();
        app10.appId = 10;
        app10.appName = "Reddit";
        app10.founderName = "Steve Huffman";
        app10.activeUsers = 500;
        app10.country = "USA";
        apps[9] = app10;

        SocialMedia app11 = new SocialMedia();
        app11.appId = 11;
        app11.appName = "Pinterest";
        app11.founderName = "Ben Silbermann";
        app11.activeUsers = 450;
        app11.country = "USA";
        apps[10] = app11;

        SocialMedia app12 = new SocialMedia();
        app12.appId = 12;
        app12.appName = "Quora";
        app12.founderName = "Adam D'Angelo";
        app12.activeUsers = 300;
        app12.country = "USA";
        apps[11] = app12;

        SocialMedia app13 = new SocialMedia();
        app13.appId = 13;
        app13.appName = "Discord";
        app13.founderName = "Jason Citron";
        app13.activeUsers = 350;
        app13.country = "USA";
        apps[12] = app13;

        SocialMedia app14 = new SocialMedia();
        app14.appId = 14;
        app14.appName = "Koo";
        app14.founderName = "Aprameya Radhakrishna";
        app14.activeUsers = 60;
        app14.country = "India";
        apps[13] = app14;

        SocialMedia app15 = new SocialMedia();
        app15.appId = 15;
        app15.appName = "ShareChat";
        app15.founderName = "Ankush Sachdeva";
        app15.activeUsers = 180;
        app15.country = "India";
        apps[14] = app15;


        for (SocialMedia ref : apps) {

            System.out.println("App Id is :" + ref.appId);
            System.out.println("App Name is :" + ref.appName);
            System.out.println("Founder Name is :" + ref.founderName);
            System.out.println("Active Users (in millions) is :" + ref.activeUsers);
            System.out.println("Country is :" + ref.country);
            System.out.println("----------------------------------");
        }
    }
}