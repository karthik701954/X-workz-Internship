class Capacitor {

    int capacitorId;
    String type;
    int voltage;
    String material;
    String size;

    public void getCapacitorDetails() {
        System.out.println("The capacitorId is: " + capacitorId);
        System.out.println("The type is: " + type);
        System.out.println("The voltage is: " + voltage);
        System.out.println("The material is: " + material);
        System.out.println("The size is: " + size);
    }
}