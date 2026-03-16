class PrinterSpeed{
	static boolean isOn=true;
	static int maxSpeed=20;
	static int minSpeed=0;
	static int currentSpeed=8;

	static void increaseSpeed(){
		if(isOn){
			if(currentSpeed<maxSpeed){
				currentSpeed++;
				System.out.println("Speed increased to: "+currentSpeed);
			}else{
				System.out.println("Reached maximum speed");
			}
		}
	}

	static void decreaseSpeed(){
		if(isOn){
			if(currentSpeed>minSpeed){
				currentSpeed--;
				System.out.println("Speed decreased to: "+currentSpeed);
			}else{
				System.out.println("Reached minimum speed");
			}
		}
	}
}