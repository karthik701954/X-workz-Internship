class TeamsExecutor{

	public static void main(String args[]){
	
        Teams teams[] = new Teams[15];

        Teams team1 = new Teams();
        team1.teamId = 1;
        team1.teamNames = "India";
        team1.NoOfPlayers = 12;
        team1.CaptainName = "Rohit Sharma";
        team1.teamCochName = "Rahul Dravid";
        teams[0] = team1;

        Teams team2 = new Teams();
        team2.teamId = 2;
        team2.teamNames = "Australia";
        team2.NoOfPlayers = 12;
        team2.CaptainName = "Pat Cummins";
        team2.teamCochName = "Andrew McDonald";
        teams[1] = team2;

        Teams team3 = new Teams();
        team3.teamId = 3;
        team3.teamNames = "England";
        team3.NoOfPlayers = 12;
        team3.CaptainName = "Jos Buttler";
        team3.teamCochName = "Matthew Mott";
        teams[2] = team3;

        Teams team4 = new Teams();
        team4.teamId = 4;
        team4.teamNames = "Pakistan";
        team4.NoOfPlayers = 12;
        team4.CaptainName = "Babar Azam";
        team4.teamCochName = "Grant Bradburn";
        teams[3] = team4;

        Teams team5 = new Teams();
        team5.teamId = 5;
        team5.teamNames = "South Africa";
        team5.NoOfPlayers = 12;
        team5.CaptainName = "Temba Bavuma";
        team5.teamCochName = "Rob Walter";
        teams[4] = team5;

        Teams team6 = new Teams();
        team6.teamId = 6;
        team6.teamNames = "New Zealand";
        team6.NoOfPlayers = 12;
        team6.CaptainName = "Kane Williamson";
        team6.teamCochName = "Gary Stead";
        teams[5] = team6;

        Teams team7 = new Teams();
        team7.teamId = 7;
        team7.teamNames = "Sri Lanka";
        team7.NoOfPlayers = 12;
        team7.CaptainName = "Dasun Shanaka";
        team7.teamCochName = "Chris Silverwood";
        teams[6] = team7;

        Teams team8 = new Teams();
        team8.teamId = 8;
        team8.teamNames = "Bangladesh";
        team8.NoOfPlayers = 12;
        team8.CaptainName = "Shakib Al Hasan";
        team8.teamCochName = "Chandika Hathurusingha";
        teams[7] = team8;

        Teams team9 = new Teams();
        team9.teamId = 9;
        team9.teamNames = "Afghanistan";
        team9.NoOfPlayers = 12;
        team9.CaptainName = "Hashmatullah Shahidi";
        team9.teamCochName = "Jonathan Trott";
        teams[8] = team9;

        Teams team10 = new Teams();
        team10.teamId = 10;
        team10.teamNames = "West Indies";
        team10.NoOfPlayers = 12;
        team10.CaptainName = "Shai Hope";
        team10.teamCochName = "Andre Coley";
        teams[9] = team10;

        Teams team11 = new Teams();
        team11.teamId = 11;
        team11.teamNames = "Ireland";
        team11.NoOfPlayers = 12;
        team11.CaptainName = "Paul Stirling";
        team11.teamCochName = "Heinrich Malan";
        teams[10] = team11;

        Teams team12 = new Teams();
        team12.teamId = 12;
        team12.teamNames = "Zimbabwe";
        team12.NoOfPlayers = 12;
        team12.CaptainName = "Craig Ervine";
        team12.teamCochName = "Dave Houghton";
        teams[11] = team12;

        Teams team13 = new Teams();
        team13.teamId = 13;
        team13.teamNames = "Netherlands";
        team13.NoOfPlayers = 12;
        team13.CaptainName = "Scott Edwards";
        team13.teamCochName = "Ryan Cook";
        teams[12] = team13;

        Teams team14 = new Teams();
        team14.teamId = 14;
        team14.teamNames = "Nepal";
        team14.NoOfPlayers = 12;
        team14.CaptainName = "Rohit Paudel";
        team14.teamCochName = "Monty Desai";
        teams[13] = team14;

        Teams team15 = new Teams();
        team15.teamId = 15;
        team15.teamNames = "UAE";
        team15.NoOfPlayers = 12;
        team15.CaptainName = "Muhammad Waseem";
        team15.teamCochName = "Lalchand Rajput";
        teams[14] = team15;
	 
	 for( Teams ref : teams){
		 
		 System.out.println("teamId is :"+ref.teamId);
		 System.out.println("teamNames is :"+ref.teamNames);
		 System.out.println("NoOfPlayers is :"+ref.NoOfPlayers);
		 System.out.println("CaptainName is :"+ref.CaptainName);
		 System.out.println("teamCaochName is :"+ref.teamCochName);
		 System.out.println("----------------------------------");
	}
	}
}