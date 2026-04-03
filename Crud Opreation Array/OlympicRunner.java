class OlympicRunner {
    public static void main(String[] args) {
        Olympic olympic = new Olympic();

        olympic.addSport("Athletics");
        olympic.addSport("Swimming");
        olympic.addSport("Gymnastics");
        olympic.addSport("Boxing");
        olympic.addSport("Wrestling");
        olympic.addSport("Hockey");
        olympic.addSport("Badminton");
        olympic.addSport("Tennis");
        olympic.addSport("Football");
        olympic.addSport("Cycling");
        olympic.addSport("Shooting");

        olympic.getSports();
    }
}