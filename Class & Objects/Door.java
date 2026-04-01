class Door {

    int doorId;
    String material;
    String color;
    String type;
    double height;

    Lock lock;

    public void getDoorDetails() {
        System.out.println("The doorId is: " + doorId);
        System.out.println("The material is: " + material);
        System.out.println("The color is: " + color);
        System.out.println("The type is: " + type);
        System.out.println("The height is: " + height);

        lock.getLockDetails();
    }
}