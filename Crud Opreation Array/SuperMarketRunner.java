class SuperMarketRunner {
    public static void main(String[] args) {

        SuperMarket sm = new SuperMarket();

        sm.addProduct("Rice");
        sm.addProduct("Wheat");
        sm.addProduct("Milk");
        sm.addProduct("Bread");
        sm.addProduct("Sugar");
        sm.addProduct("Salt");
        sm.addProduct("Oil");
        sm.addProduct("Soap");

        sm.getProducts();
    }
}