class Series {

    int seriesId;
    String seriesName;
    String genre;
    int seasons;
    String platform;

    Episode episode;

    public void getSeriesDetails() {
        System.out.println("The seriesId is: " + seriesId);
        System.out.println("The seriesName is: " + seriesName);
        System.out.println("The genre is: " + genre);
        System.out.println("The seasons is: " + seasons);
        System.out.println("The platform is: " + platform);

        episode.getEpisodeDetails();
    }
}
