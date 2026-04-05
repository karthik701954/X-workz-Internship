class TripRunner {
    public static void main(String[] args) {

        Trip trip = new Trip();

        boolean added = trip.addPlace("Goa");
        System.out.println(added);
        added = trip.addPlace("Ooty");
        System.out.println(added);
        added = trip.addPlace("Manali");
        System.out.println(added);
        added = trip.addPlace("Mysore");
        System.out.println(added);
        added = trip.addPlace("Coorg");
        System.out.println(added);
        added = trip.addPlace("Kerala");
        System.out.println(added);
        added = trip.addPlace("Jaipur");
        System.out.println(added);
        added = trip.addPlace("Delhi");
        System.out.println(added);
        added = trip.addPlace("Agra");
        System.out.println(added);
        added = trip.addPlace("Kodaikanal");
        System.out.println(added);
        added = trip.addPlace("Darjeeling");
        System.out.println(added);
        added = trip.addPlace("Shimla");
        System.out.println(added);
        added = trip.addPlace("Andaman");
        System.out.println(added);

        trip.getPlaces();

        String name = trip.getPlaceByName("Coorg");
        System.out.println(name + " is available");

        boolean updated = trip.updatePlace("Delhi", "New Delhi");
        System.out.println(updated);

        trip.getPlaces();

        boolean deleted = trip.deletePlace("Agra");
        System.out.println(deleted);

        trip.getPlaces();
    }
}