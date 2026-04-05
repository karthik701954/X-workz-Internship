class SalonRunner {
    public static void main(String[] args) {

        Salon salon = new Salon();

        boolean added = salon.addService("Haircut");
        System.out.println(added);
        added = salon.addService("Shaving");
        System.out.println(added);
        added = salon.addService("Facial");
        System.out.println(added);
        added = salon.addService("Hair Coloring");
        System.out.println(added);
        added = salon.addService("Manicure");
        System.out.println(added);
        added = salon.addService("Pedicure");
        System.out.println(added);
        added = salon.addService("Spa");
        System.out.println(added);

        salon.getServices();

        String name = salon.getServiceByName("Facial");
        System.out.println(name + " is available");

        boolean updated = salon.updateService("Shaving", "Beard Styling");
        System.out.println(updated);

        salon.getServices();

        boolean deleted = salon.deleteService("Spa");
        System.out.println(deleted);

        salon.getServices();
    }
}