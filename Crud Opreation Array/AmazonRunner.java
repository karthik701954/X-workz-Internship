class AmazonRunner {
    public static void main(String[] args) {

        Amazon amazon = new Amazon();

        boolean added = amazon.addCategory("Electronics");
        System.out.println(added);
        added = amazon.addCategory("Clothing");
        System.out.println(added);
        added = amazon.addCategory("Books");
        System.out.println(added);
        added = amazon.addCategory("Home");
        System.out.println(added);
        added = amazon.addCategory("Furniture");
        System.out.println(added);
        added = amazon.addCategory("Toys");
        System.out.println(added);
        added = amazon.addCategory("Groceries");
        System.out.println(added);
        added = amazon.addCategory("Sports");
        System.out.println(added);
        added = amazon.addCategory("Beauty");
        System.out.println(added);
        added = amazon.addCategory("Mobiles");
        System.out.println(added);
        added = amazon.addCategory("Laptops");
        System.out.println(added);
        added = amazon.addCategory("Accessories");
        System.out.println(added);
        added = amazon.addCategory("Shoes");
        System.out.println(added);
        added = amazon.addCategory("Watches");
        System.out.println(added);
        added = amazon.addCategory("Kitchen");
        System.out.println(added);
        added = amazon.addCategory("Garden");
        System.out.println(added);
        added = amazon.addCategory("Automotive");
        System.out.println(added);
        added = amazon.addCategory("Health");
        System.out.println(added);
        added = amazon.addCategory("Baby");
        System.out.println(added);
        added = amazon.addCategory("Pet Supplies");
        System.out.println(added);
        added = amazon.addCategory("Office Products");
        System.out.println(added);

        amazon.getCategories();

        String name = amazon.getCategoryByName("Mobiles");
        System.out.println(name + " is available");

        boolean updated = amazon.updateCategoryName("Books", "Stationery");
        System.out.println(updated);

        amazon.getCategories();

        boolean deleted = amazon.deleteCategory("Toys");
        System.out.println(deleted);

        amazon.getCategories();
    }
}