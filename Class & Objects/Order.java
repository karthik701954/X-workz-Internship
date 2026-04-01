class Order {

    int orderId;
    String productName;
    int quantity;
    double price;
    String deliveryDate;

    public void getOrderDetails() {
        System.out.println("The orderId is: " + orderId);
        System.out.println("The productName is: " + productName);
        System.out.println("The quantity is: " + quantity);
        System.out.println("The price is: " + price);
        System.out.println("The deliveryDate is: " + deliveryDate);
    }
}
