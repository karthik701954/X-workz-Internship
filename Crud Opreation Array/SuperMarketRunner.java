class SuperMarketRunner {
    public static void main(String[] args) {

        SuperMarket sm = new SuperMarket();

        boolean added = sm.addProduct("Rice");
        System.out.println(added);
        added = sm.addProduct("Wheat");
        System.out.println(added);
        added = sm.addProduct("Milk");
        System.out.println(added);
        added = sm.addProduct("Bread");
        System.out.println(added);
        added = sm.addProduct("Sugar");
        System.out.println(added);
        added = sm.addProduct("Salt");
        System.out.println(added);
        added = sm.addProduct("Oil");
        System.out.println(added);
        added = sm.addProduct("Soap");
        System.out.println(added);

        sm.getProducts();

        String name = sm.getProductByName("Milk");
        System.out.println(name + " is available");

        boolean updated = sm.updateProduct("Bread", "Brown Bread");
        System.out.println(updated);

        sm.getProducts();

        boolean deleted = sm.deleteProduct("Soap");
        System.out.println(deleted);

        sm.getProducts();
    }
}