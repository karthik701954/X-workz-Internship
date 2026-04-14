class PlayerExecutor {

    public static void main(String args[]) {

        Player players[] = new Player[15];

        Player player1 = new Player();
        player1.playerId = 1;
        player1.playerName = "Virat Kohli";
        player1.playerAge = 35;
        player1.playerRole = "Batsman";
        player1.playerSalary = 1500000;
        players[0] = player1;

        Player player2 = new Player();
        player2.playerId = 2;
        player2.playerName = "Steve Smith";
        player2.playerAge = 34;
        player2.playerRole = "Batsman";
        player2.playerSalary = 1400000;
        players[1] = player2;

        Player player3 = new Player();
        player3.playerId = 3;
        player3.playerName = "Joe Root";
        player3.playerAge = 33;
        player3.playerRole = "Batsman";
        player3.playerSalary = 1300000;
        players[2] = player3;

        Player player4 = new Player();
        player4.playerId = 4;
        player4.playerName = "Babar Azam";
        player4.playerAge = 30;
        player4.playerRole = "Batsman";
        player4.playerSalary = 1200000;
        players[3] = player4;

        Player player5 = new Player();
        player5.playerId = 5;
        player5.playerName = "Kane Williamson";
        player5.playerAge = 33;
        player5.playerRole = "Batsman";
        player5.playerSalary = 1250000;
        players[4] = player5;

        Player player6 = new Player();
        player6.playerId = 6;
        player6.playerName = "Rohit Sharma";
        player6.playerAge = 36;
        player6.playerRole = "Batsman";
        player6.playerSalary = 1400000;
        players[5] = player6;

        Player player7 = new Player();
        player7.playerId = 7;
        player7.playerName = "Ben Stokes";
        player7.playerAge = 32;
        player7.playerRole = "All-Rounder";
        player7.playerSalary = 1500000;
        players[6] = player7;

        Player player8 = new Player();
        player8.playerId = 8;
        player8.playerName = "Hardik Pandya";
        player8.playerAge = 30;
        player8.playerRole = "All-Rounder";
        player8.playerSalary = 1300000;
        players[7] = player8;

        Player player9 = new Player();
        player9.playerId = 9;
        player9.playerName = "Shakib Al Hasan";
        player9.playerAge = 36;
        player9.playerRole = "All-Rounder";
        player9.playerSalary = 1200000;
        players[8] = player9;

        Player player10 = new Player();
        player10.playerId = 10;
        player10.playerName = "Jasprit Bumrah";
        player10.playerAge = 30;
        player10.playerRole = "Bowler";
        player10.playerSalary = 1400000;
        players[9] = player10;

        Player player11 = new Player();
        player11.playerId = 11;
        player11.playerName = "Mitchell Starc";
        player11.playerAge = 34;
        player11.playerRole = "Bowler";
        player11.playerSalary = 1350000;
        players[10] = player11;

        Player player12 = new Player();
        player12.playerId = 12;
        player12.playerName = "Trent Boult";
        player12.playerAge = 34;
        player12.playerRole = "Bowler";
        player12.playerSalary = 1250000;
        players[11] = player12;

        Player player13 = new Player();
        player13.playerId = 13;
        player13.playerName = "Rashid Khan";
        player13.playerAge = 25;
        player13.playerRole = "Bowler";
        player13.playerSalary = 1300000;
        players[12] = player13;

        Player player14 = new Player();
        player14.playerId = 14;
        player14.playerName = "MS Dhoni";
        player14.playerAge = 42;
        player14.playerRole = "Wicket Keeper";
        player14.playerSalary = 1500000;
        players[13] = player14;

        Player player15 = new Player();
        player15.playerId = 15;
        player15.playerName = "Jos Buttler";
        player15.playerAge = 33;
        player15.playerRole = "Wicket Keeper";
        player15.playerSalary = 1400000;
        players[14] = player15;


        for (Player ref : players) {

            System.out.println("playerId is :" + ref.playerId);
            System.out.println("playerName is :" + ref.playerName);
            System.out.println("playerAge is :" + ref.playerAge);
            System.out.println("playerRole is :" + ref.playerRole);
            System.out.println("playerSalary is :" + ref.playerSalary);
            System.out.println("----------------------------------");
        }
    }
}