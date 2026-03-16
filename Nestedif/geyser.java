class geyser{
	
	static boolean isOn = true;
	static boolean isOff = false;

	static int Temperature  = 3;
    static int maxTemperature  = 5;
    static int minTemperature  = 0;

    static void increaseTemperature () {

        if(isOn) {

            if(Temperature  < maxTemperature )
			{
                Temperature ++;
                System.out.println("Temperature  Increased to: " + Temperature );
            }
            else 
			{
                System.out.println("Temperature  is already at Maximum: " + maxTemperature);
            }

        }
        else {
            System.out.println("geyser is OFF");
        }

    }

    static void decreaseTemperature() {

        if(isOff) {

            if(Temperature > minTemperature) 
			{
                Temperature--;
                System.out.println("Temperature Decreased to: " + Temperature);
            }
            else
			{
                System.out.println("Temperature already at Minimum: " + minTemperature);
            }

        }
        else 
		{
            System.out.println("geyser is OFF");
        }

    }
}


