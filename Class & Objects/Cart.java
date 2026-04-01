class Cart {

    int cartId;
    String userName;
    int itemCount;
    double totalPrice;
    String status;

    Order order;

    public void getCartDetails() {
        System.out.println("The cartId is: " + cartId);
        System.out.println("The userName is: " + userName);
        System.out.println("The itemCount is: " + itemCount);
        System.out.println("The totalPrice is: " + totalPrice);
        System.out.println("The status is: " + status);

        order.getOrderDetails();
    }
}