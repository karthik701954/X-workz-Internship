class LightBrightness{
	static boolean isOn=true;
	static int maxBrightness=10;
	static int minBrightness=0;
	static int currentBrightness=4;

	static void increaseBrightness(){
		if(isOn){
			if(currentBrightness<maxBrightness){
				currentBrightness++;
				System.out.println("Brightness increased to: "+currentBrightness);
			}else{
				System.out.println("Reached maximum brightness");
			}
		}
	}

	static void decreaseBrightness(){
		if(isOn){
			if(currentBrightness>minBrightness){
				currentBrightness--;
				System.out.println("Brightness decreased to: "+currentBrightness);
			}else{
				System.out.println("Reached minimum brightness");
			}
		}
	}
}