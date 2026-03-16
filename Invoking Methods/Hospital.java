class Hospital{
	
	static String names[]={"Gowtham R","Darshan G","Chethan G","Karthik T","Sanjay M"};
	
	public static void getNames(){
		
		System.out.println("In hospital doctors name :");
		for(String name:names){
			System.out.println(name);
		}
	}
}