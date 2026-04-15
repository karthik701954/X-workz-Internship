class Table{
	Team teams[]= new Team[10];
	
	public void getTable(){
		for(Team team: teams){
			System.out.println("The IPL team Name is :"+team.teamName);
			System.out.println("Number of Played Matches :"+team.playedMatches);
			System.out.println("Number of won the Matches :"+team.won);
			System.out.println("Number of loss the Matches :"+team.loss);
			System.out.println("Net Run Rate of the team :"+team.nrr);
			System.out.println("------------------------------------------");
		}
	}
}