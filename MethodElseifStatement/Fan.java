class Fan {

    static int MaxSpeed = 5;
    static int MinSpeed = 0;
    static int CurrentSpeed = 0;

    static int getSpeed() {
        return CurrentSpeed;
    }

    static void FanOn() {
        if (CurrentSpeed == 0) 
		{
            CurrentSpeed = 2;   
            System.out.println("The fan is running at speed: " + CurrentSpeed);
        } 
		else
		{
            System.out.println("Fan is already running");
        }
    }

    static void FanOff() {
        if (CurrentSpeed > 0) 
		{
            CurrentSpeed = 0;
            System.out.println("The fan is stopped:" + CurrentSpeed);
        } 
		else
		{
            System.out.println("Fan is already off");
        }
	
    }
}