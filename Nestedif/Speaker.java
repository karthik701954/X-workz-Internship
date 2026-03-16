class Speaker{
	static boolean isOn=true;
	static int maxVolume=10;
	static int minVolume=0;
	static int currentVolume=5;

	static void increaseVolume(){
		if(isOn){
			if(currentVolume<maxVolume){
				currentVolume++;
				System.out.println("Volume increased to: "+currentVolume);
			}
		}else{
			System.out.println("Reached maximum volume");
		}
	}

	static void decreaseVolume(){
		if(isOn){
			if(currentVolume>minVolume){
				currentVolume--;
				System.out.println("Volume decreased to: "+currentVolume);
			}
		}else{
			System.out.println("Reached minimum volume");
		}
	}
}