class HeadPhones{

    static boolean isOn = true;
	
    static int volume = 89;
    static int maxVolume = 100;
    static int minVolume = 0;

    static void increaseVolume() {

        if(isOn) {

            if(volume < maxVolume) {
                volume++;
                System.out.println("Volume Increased to: " + volume);
            }
            else {
                System.out.println("Volume already at Maximum: " + maxVolume);
            }

        }
        else {
            System.out.println("HeadPhones is OFF");
        }

    }

    static void decreaseVolume() {

        if(isOn) {

            if(volume > minVolume) {
                volume--;
                System.out.println("Volume Decreased to: " + volume);
            }
            else {
                System.out.println("Volume already at Minimum: " + minVolume);
            }

        }
        else {
            System.out.println("HeadPhones is OFF");
        }

    }
}

