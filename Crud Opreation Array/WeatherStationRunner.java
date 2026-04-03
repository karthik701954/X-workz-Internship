class WeatherStationRunner {
    public static void main(String[] args) {

        WeatherStation ws = new WeatherStation();

        ws.addTemperature(30.5);
        ws.addTemperature(31.2);
        ws.addTemperature(29.8);
        ws.addTemperature(28.4);
        ws.addTemperature(32.0);
        ws.addTemperature(33.5);
        ws.addTemperature(34.1);
        ws.addTemperature(35.0);
        ws.addTemperature(36.2);
        ws.addTemperature(37.5);
        ws.addTemperature(38.0);
        ws.addTemperature(39.3);
        ws.addTemperature(40.1);
        ws.addTemperature(41.0);
        ws.addTemperature(42.2);
        ws.addTemperature(43.0);
        ws.addTemperature(44.5);

        ws.getTemperatures();
    }
}