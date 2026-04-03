class TripRunner {
    public static void main(String[] args) {

        Trip trip = new Trip();

        trip.addPlace("Goa");
        trip.addPlace("Ooty");
        trip.addPlace("Manali");
        trip.addPlace("Mysore");
        trip.addPlace("Coorg");
        trip.addPlace("Kerala");
        trip.addPlace("Jaipur");
        trip.addPlace("Delhi");
        trip.addPlace("Agra");
        trip.addPlace("Kodaikanal");
        trip.addPlace("Darjeeling");
        trip.addPlace("Shimla");
        trip.addPlace("Andaman");

        trip.getPlaces();
    }
}