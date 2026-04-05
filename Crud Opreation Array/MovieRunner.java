class MovieRunner {
    public static void main(String[] args) {

        Movie movie = new Movie();

        boolean added = movie.addCast("Hero");
        System.out.println(added);
        added = movie.addCast("Heroine");
        System.out.println(added);
        added = movie.addCast("Villain");
        System.out.println(added);
        added = movie.addCast("Comedian");
        System.out.println(added);
        added = movie.addCast("Supporting Actor");
        System.out.println(added);
        added = movie.addCast("Supporting Actress");
        System.out.println(added);
        added = movie.addCast("Child Artist");
        System.out.println(added);
        added = movie.addCast("Guest Appearance");
        System.out.println(added);
        added = movie.addCast("Dancer");
        System.out.println(added);

        movie.getCasts();

        String name = movie.getCastByName("Villain");
        System.out.println(name + " is available");

        boolean updated = movie.updateCastName("Heroine", "Lead Actress");
        System.out.println(updated);

        movie.getCasts();

        boolean deleted = movie.deleteCast("Dancer");
        System.out.println(deleted);

        movie.getCasts();
    }
}