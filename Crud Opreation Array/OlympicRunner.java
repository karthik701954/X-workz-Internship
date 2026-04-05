class OlympicRunner {
    public static void main(String[] args) {

        Olympic olympic = new Olympic();

        boolean added = olympic.addSport("Cricket");
        System.out.println(added);
        added = olympic.addSport("Football");
        System.out.println(added);
        added = olympic.addSport("Hockey");
        System.out.println(added);
        added = olympic.addSport("Tennis");
        System.out.println(added);
        added = olympic.addSport("Badminton");
        System.out.println(added);
        added = olympic.addSport("Swimming");
        System.out.println(added);
        added = olympic.addSport("Boxing");
        System.out.println(added);
        added = olympic.addSport("Wrestling");
        System.out.println(added);
        added = olympic.addSport("Athletics");
        System.out.println(added);
        added = olympic.addSport("Gymnastics");
        System.out.println(added);
        added = olympic.addSport("Shooting");
        System.out.println(added);

        olympic.getSports();

        String name = olympic.getSportByName("Hockey");
        System.out.println(name + " is available");

        boolean updated = olympic.updateSportName("Cricket", "T20 Cricket");
        System.out.println(updated);

        olympic.getSports();

        boolean deleted = olympic.deleteSport("Boxing");
        System.out.println(deleted);

        olympic.getSports();
    }
}