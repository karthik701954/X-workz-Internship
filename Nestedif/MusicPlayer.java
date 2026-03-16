class MusicPlayer{
	static boolean isOn=true;
	static int maxVolume=15;
	static int minVolume=0;
	static int currentVolume=7;

	static void increaseVolume(){
		if(isOn){
			if(currentVolume<maxVolume){
				currentVolume++;
				System.out.println("Music volume increased to: "+currentVolume);
			}else{
				System.out.println("Reached maximum volume");
			}
		}
	}

	static void decreaseVolume(){
		if(isOn){
			if(currentVolume>minVolume){
				currentVolume--;
				System.out.println("Music volume decreased to: "+currentVolume);
			}else{
				System.out.println("Reached minimum volume");
			}
		}
	}
}