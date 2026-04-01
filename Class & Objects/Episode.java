class Episode {

    int episodeId;
    String title;
    int duration;
    String releaseDate;
    String rating;

    public void getEpisodeDetails() {
        System.out.println("The episodeId is: " + episodeId);
        System.out.println("The title is: " + title);
        System.out.println("The duration is: " + duration);
        System.out.println("The releaseDate is: " + releaseDate);
        System.out.println("The rating is: " + rating);
    }
}
