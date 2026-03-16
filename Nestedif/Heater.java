class Heater{
	static boolean isOn=true;
	static int maxHeat=10;
	static int minHeat=0;
	static int currentHeat=4;

	static void increaseHeat(){
		if(isOn){
			if(currentHeat<maxHeat){
				currentHeat++;
				System.out.println("Heat increased to: "+currentHeat);
			}else{
				System.out.println("Reached maximum heat");
			}
		}
	}

	static void decreaseHeat(){
		if(isOn){
			if(currentHeat>minHeat){
				currentHeat--;
				System.out.println("Heat decreased to: "+currentHeat);
			}else{
				System.out.println("Reached minimum heat");
			}
		}
	}
}