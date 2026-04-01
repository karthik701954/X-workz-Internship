class Subscription {

    int subscriptionId;
    String planName;
    int duration;
    double price;
    String benefits;

    public void getSubscriptionDetails() {
        System.out.println("The subscriptionId is: " + subscriptionId);
        System.out.println("The planName is: " + planName);
        System.out.println("The duration is: " + duration);
        System.out.println("The price is: " + price);
        System.out.println("The benefits is: " + benefits);
    }
}
