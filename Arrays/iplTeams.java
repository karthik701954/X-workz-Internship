class iplTeams{
	public static void main(String args[]){
		
		System.out.println("The IPL teams are:");
		
		String team1="Chennai Super Kings";
		String team2="Royal Challengers Bangalore";
		String team3="Mumbai Indians";
		String team4="Delhi Capitals";
		String team5="Punjab Kings";
		String team6="Lucknow Super Giants";
		String team7="Kolkata Knight Riders";
		String team8="Sunrisers Hyderabad";
		String team9="Gujarat Titans";
		String team10="Rajasthan Royals";
		
		String iplTeams[]={
		"Chennai Super Kings","Royal Challengers Bangalore","Mumbai Indians","Delhi Capitals",
		"Punjab Kings","Lucknow Super Giants","Kolkata Knight Riders","Sunrisers Hyderabad",
		"Gujarat Titans","Rajasthan Royals"
		};
		
		for(String team : iplTeams)
		{
			System.out.println(team);
		}
	}
}
