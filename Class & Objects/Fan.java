class Fan {

    int fanId;
    String brand;
    String type;
    int speedLevels;
    String color;

    Capacitor capacitor;

    public void getFanDetails() {
        System.out.println("The fanId is: " + fanId);
        System.out.println("The brand is: " + brand);
        System.out.println("The type is: " + type);
        System.out.println("The speedLevels is: " + speedLevels);
        System.out.println("The color is: " + color);

        capacitor.getCapacitorDetails();
    }
}
