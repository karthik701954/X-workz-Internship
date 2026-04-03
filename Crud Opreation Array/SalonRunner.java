class SalonRunner {
    public static void main(String[] args) {

        Salon salon = new Salon();

        salon.addService("Haircut");
        salon.addService("Shaving");
        salon.addService("Facial");
        salon.addService("Hair Coloring");
        salon.addService("Manicure");
        salon.addService("Pedicure");
        salon.addService("Spa");

        salon.getServices();
    }
}