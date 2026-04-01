class Property {

    int propertyId;
    String propertyType;
    int price;
    String area;
    String status;

    public void getPropertyDetails() {
        System.out.println("The propertyId is: " + propertyId);
        System.out.println("The propertyType is: " + propertyType);
        System.out.println("The price is: " + price);
        System.out.println("The area is: " + area);
        System.out.println("The status is: " + status);
    }
}
