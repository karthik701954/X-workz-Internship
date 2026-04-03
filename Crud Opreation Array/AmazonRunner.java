class AmazonRunner {
    public static void main(String[] args) {

        Amazon amz = new Amazon();

        amz.addCategory("Electronics");
        amz.addCategory("Mobiles");
        amz.addCategory("Laptops");
        amz.addCategory("Fashion");
        amz.addCategory("Men Clothing");
        amz.addCategory("Women Clothing");
        amz.addCategory("Home Appliances");
        amz.addCategory("Kitchen Items");
        amz.addCategory("Books");
        amz.addCategory("Toys");
        amz.addCategory("Beauty Products");
        amz.addCategory("Sports");
        amz.addCategory("Automotive");
        amz.addCategory("Groceries");
        amz.addCategory("Furniture");
        amz.addCategory("Jewellery");
        amz.addCategory("Watches");
        amz.addCategory("Footwear");
        amz.addCategory("Pet Supplies");
        amz.addCategory("Stationery");
        amz.addCategory("Gaming");

        amz.getCategories();
    }
}