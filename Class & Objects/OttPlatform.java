class OttPlatform {

    int platformId;
    String platformName;
    String region;
    int users;
    String contentType;

    Subscription subscription;

    public void getPlatformDetails() {
        System.out.println("The platformId is: " + platformId);
        System.out.println("The platformName is: " + platformName);
        System.out.println("The region is: " + region);
        System.out.println("The users is: " + users);
        System.out.println("The contentType is: " + contentType);

        subscription.getSubscriptionDetails();
    }
}