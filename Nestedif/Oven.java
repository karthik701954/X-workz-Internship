class Oven{
	
	static boolean isOn = true;
	static boolean isOff = false;

	static int Temperature  = 250'F;
    static int maxTemperature  = 400'F;
    static int minTemperature  = 200'F;

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
            System.out.println("Oven is OFF");
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
            System.out.println("Oven is OFF");
        }

    }
}


