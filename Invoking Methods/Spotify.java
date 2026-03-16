class Spotify{
	
	static String songs[]={"Trendingsongs","Diveotionalsongs","Horrorsongs","melodysongs","Retrosongs","Attitudesongs"};
	public static void getSongs(){
		System.out.println("List of Sotify songs are:");
		for(String song:songs){
			System.out.println(song);
		}
		
	}
	
}