class SouthIndiaRunner {
    public static void main(String[] args) {

        SouthIndia si = new SouthIndia();

        boolean added = si.addAirport("Kempegowda International Airport");
        System.out.println(added);
        added = si.addAirport("Chennai International Airport");
        System.out.println(added);
        added = si.addAirport("Rajiv Gandhi International Airport");
        System.out.println(added);
        added = si.addAirport("Cochin International Airport");
        System.out.println(added);
        added = si.addAirport("Trivandrum International Airport");
        System.out.println(added);
        added = si.addAirport("Mangalore International Airport");
        System.out.println(added);
        added = si.addAirport("Coimbatore International Airport");
        System.out.println(added);
        added = si.addAirport("Madurai Airport");
        System.out.println(added);
        added = si.addAirport("Vijayawada Airport");
        System.out.println(added);

        si.getAirports();

        String name = si.getAirportByName("Cochin International Airport");
        System.out.println(name + " is available");

        boolean updated = si.updateAirport("Madurai Airport", "Madurai International Airport");
        System.out.println(updated);

        si.getAirports();

        boolean deleted = si.deleteAirport("Vijayawada Airport");
        System.out.println(deleted);

        si.getAirports();
    }
}