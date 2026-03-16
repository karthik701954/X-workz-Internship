class Gym{
	
	static String equipments[]={"Dumbbells","Barbells","Weight plates","Kettlebells","Smith machine"};
	public static void getequipment(){
		System.out.println("List of Gym equipments are:");
		for(String equipment:equipments)
			System.out.println(equipment);
	}
}