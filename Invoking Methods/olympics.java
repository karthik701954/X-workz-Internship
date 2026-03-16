class olympics {

    static String sportsNames[] = {"swimming", "running", "cycling", "wrestling", "javelin", "shotput"};

    public static void getSportsNames() {

        System.out.println("getSportsNames is invoked");

        for (String sportsName : sportsNames) {
            System.out.println(sportsName);
        }

        System.out.println("End of getSportsNames");
    }
}

