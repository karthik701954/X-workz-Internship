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
}