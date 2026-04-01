class Podcast {

    int podcastId;
    String podcastName;
    String category;
    int duration;
    String host;

    Guest guest;

    public void getPodcastDetails() {
        System.out.println("The podcastId is: " + podcastId);
        System.out.println("The podcastName is: " + podcastName);
        System.out.println("The category is: " + category);
        System.out.println("The duration is: " + duration);
        System.out.println("The host is: " + host);

        guest.getGuestDetails();
    }
}