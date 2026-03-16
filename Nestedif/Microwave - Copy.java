class Microwave{
	static boolean isOn=true;
	static int maxTime=60;
	static int minTime=0;
	static int currentTime=10;

	static void increaseTime(){
		if(isOn){
			if(currentTime<maxTime){
				currentTime++;
				System.out.println("Time increased to: "+currentTime);
			}else{
				System.out.println("Reached maximum time");
			}
		}
	}

	static void decreaseTime(){
		if(isOn){
			if(currentTime>minTime){
				currentTime--;
				System.out.println("Time decreased to: "+currentTime);
			}else{
				System.out.println("Reached minimum time");
			}
		}
	}
}