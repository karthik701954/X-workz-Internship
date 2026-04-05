class WeatherStation {
    double temperatureReadings[] = new double[17];
    int index;

    public boolean addTemperature(double temp) {
        boolean isAdded = false;

        if (index < temperatureReadings.length) {
            temperatureReadings[index++] = temp;
            isAdded = true;
        } else {
            System.out.println("Array is full, Try next time");
        }

        return isAdded;
    }

    public void getTemperatures() {
        for (double temp : temperatureReadings) {
            System.out.println(temp);
        }
    }

    public double getTemperature(double value) {
        double result = 0;
        boolean found = false;

        for (double temp : temperatureReadings) {
            if (temp == value) {
                result = temp;
                found = true;
                break;
            }
        }

        if (found == false)
            System.out.println(value + " is not available");

        return result;
    }

    public boolean updateTemperature(double existingTemp, double updatedTemp) {
        boolean isUpdated = false;

        for (int i = 0; i < temperatureReadings.length; i++) {
            if (temperatureReadings[i] == existingTemp) {
                temperatureReadings[i] = updatedTemp;
                isUpdated = true;
            }
        }

        if (isUpdated == false)
            System.out.println(existingTemp + " is not updated");

        return isUpdated;
    }

    public boolean deleteTemperature(double tempValue) {
        boolean isDeleted = false;

        for (int i = 0; i < temperatureReadings.length; i++) {
            if (temperatureReadings[i] == tempValue) {
                temperatureReadings[i] = 0;
                isDeleted = true;
            }
        }

        if (isDeleted == false)
            System.out.println(tempValue + " is not deleted");

        return isDeleted;
    }
}

