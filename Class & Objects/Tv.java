class Tv {

    int tvId;
    String brand;
    String model;
    int size;
    String type;

    Remote remote;

    public void getTvDetails() {
        System.out.println("The tvId is: " + tvId);
        System.out.println("The brand is: " + brand);
        System.out.println("The model is: " + model);
        System.out.println("The size is: " + size);
        System.out.println("The type is: " + type);

        remote.getRemoteDetails();
    }
}