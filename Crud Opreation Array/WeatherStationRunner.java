class WeatherStationRunner {
    public static void main(String[] args) {

        WeatherStation ws = new WeatherStation();

        boolean added = ws.addTemperature(30.5);
        System.out.println(added);
        added = ws.addTemperature(31.2);
        System.out.println(added);
        added = ws.addTemperature(29.8);
        System.out.println(added);
        added = ws.addTemperature(28.4);
        System.out.println(added);
        added = ws.addTemperature(32.0);
        System.out.println(added);
        added = ws.addTemperature(33.5);
        System.out.println(added);
        added = ws.addTemperature(34.1);
        System.out.println(added);
        added = ws.addTemperature(35.0);
        System.out.println(added);
        added = ws.addTemperature(36.2);
        System.out.println(added);
        added = ws.addTemperature(37.5);
        System.out.println(added);
        added = ws.addTemperature(38.0);
        System.out.println(added);
        added = ws.addTemperature(39.3);
        System.out.println(added);
        added = ws.addTemperature(40.1);
        System.out.println(added);
        added = ws.addTemperature(41.0);
        System.out.println(added);
        added = ws.addTemperature(42.2);
        System.out.println(added);
        added = ws.addTemperature(43.0);
        System.out.println(added);
        added = ws.addTemperature(44.5);
        System.out.println(added);

        ws.getTemperatures();

        double value = ws.getTemperature(35.0);
        System.out.println(value + " is available");

        boolean updated = ws.updateTemperature(30.5, 31.0);
        System.out.println(updated);

        ws.getTemperatures();

        boolean deleted = ws.deleteTemperature(44.5);
        System.out.println(deleted);

        ws.getTemperatures();
    }
}