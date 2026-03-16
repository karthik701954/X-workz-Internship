class Mixer{
	
	static boolean isOn = true;
	static boolean isOff = false;

	static int Speed  = 3;
    static int maxSpeed  = 5;
    static int minSpeed  = 0;

    static void increaseSpeed () {

        if(isOn) {

            if(Speed  < maxSpeed )
			{
                Speed ++;
                System.out.println("Speed  Increased to: " + Speed );
            }
            else 
			{
                System.out.println("Speed  is already at Maximum: " + maxSpeed);
            }

        }
        else {
            System.out.println("Mixer is OFF");
        }

    }

    static void decreaseSpeed() {

        if(isOff) {

            if(Speed > minSpeed) 
			{
                Speed--;
                System.out.println("Speed Decreased to: " + Speed);
            }
            else
			{
                System.out.println("Speed already at Minimum: " + minSpeed);
            }

        }
        else 
		{
            System.out.println("Mixer is OFF");
        }

    }
}


