class SportsExecutor {

    public static void main(String args[]) {

        Sports sports[] = new Sports[15];

        Sports sport1 = new Sports();
        sport1.sportId = 1;
        sport1.sportName = "Cricket";
        sport1.type = "Outdoor";
        sport1.noOfPlayers = 11;
        sport1.originCountry = "England";
        sports[0] = sport1;

        Sports sport2 = new Sports();
        sport2.sportId = 2;
        sport2.sportName = "Football";
        sport2.type = "Outdoor";
        sport2.noOfPlayers = 11;
        sport2.originCountry = "England";
        sports[1] = sport2;

        Sports sport3 = new Sports();
        sport3.sportId = 3;
        sport3.sportName = "Basketball";
        sport3.type = "Indoor";
        sport3.noOfPlayers = 5;
        sport3.originCountry = "USA";
        sports[2] = sport3;

        Sports sport4 = new Sports();
        sport4.sportId = 4;
        sport4.sportName = "Tennis";
        sport4.type = "Outdoor";
        sport4.noOfPlayers = 2;
        sport4.originCountry = "France";
        sports[3] = sport4;

        Sports sport5 = new Sports();
        sport5.sportId = 5;
        sport5.sportName = "Badminton";
        sport5.type = "Indoor";
        sport5.noOfPlayers = 2;
        sport5.originCountry = "India";
        sports[4] = sport5;

        Sports sport6 = new Sports();
        sport6.sportId = 6;
        sport6.sportName = "Hockey";
        sport6.type = "Outdoor";
        sport6.noOfPlayers = 11;
        sport6.originCountry = "India";
        sports[5] = sport6;

        Sports sport7 = new Sports();
        sport7.sportId = 7;
        sport7.sportName = "Volleyball";
        sport7.type = "Indoor";
        sport7.noOfPlayers = 6;
        sport7.originCountry = "USA";
        sports[6] = sport7;

        Sports sport8 = new Sports();
        sport8.sportId = 8;
        sport8.sportName = "Table Tennis";
        sport8.type = "Indoor";
        sport8.noOfPlayers = 2;
        sport8.originCountry = "China";
        sports[7] = sport8;

        Sports sport9 = new Sports();
        sport9.sportId = 9;
        sport9.sportName = "Kabaddi";
        sport9.type = "Outdoor";
        sport9.noOfPlayers = 7;
        sport9.originCountry = "India";
        sports[8] = sport9;

        Sports sport10 = new Sports();
        sport10.sportId = 10;
        sport10.sportName = "Baseball";
        sport10.type = "Outdoor";
        sport10.noOfPlayers = 9;
        sport10.originCountry = "USA";
        sports[9] = sport10;

        Sports sport11 = new Sports();
        sport11.sportId = 11;
        sport11.sportName = "Rugby";
        sport11.type = "Outdoor";
        sport11.noOfPlayers = 15;
        sport11.originCountry = "England";
        sports[10] = sport11;

        Sports sport12 = new Sports();
        sport12.sportId = 12;
        sport12.sportName = "Boxing";
        sport12.type = "Indoor";
        sport12.noOfPlayers = 2;
        sport12.originCountry = "USA";
        sports[11] = sport12;

        Sports sport13 = new Sports();
        sport13.sportId = 13;
        sport13.sportName = "Swimming";
        sport13.type = "Indoor";
        sport13.noOfPlayers = 1;
        sport13.originCountry = "Australia";
        sports[12] = sport13;

        Sports sport14 = new Sports();
        sport14.sportId = 14;
        sport14.sportName = "Athletics";
        sport14.type = "Outdoor";
        sport14.noOfPlayers = 1;
        sport14.originCountry = "Greece";
        sports[13] = sport14;

        Sports sport15 = new Sports();
        sport15.sportId = 15;
        sport15.sportName = "Golf";
        sport15.type = "Outdoor";
        sport15.noOfPlayers = 1;
        sport15.originCountry = "Scotland";
        sports[14] = sport15;


        for (Sports ref : sports) {

            System.out.println("Sport Id is :" + ref.sportId);
            System.out.println("Sport Name is :" + ref.sportName);
            System.out.println("Type is :" + ref.type);
            System.out.println("No Of Players is :" + ref.noOfPlayers);
            System.out.println("Origin Country is :" + ref.originCountry);
            System.out.println("----------------------------------");
        }
    }
}