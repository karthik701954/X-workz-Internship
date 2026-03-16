class OrderSystem {
    public static void takeOrder() {
        System.out.println("OrderSystem: Order taken");
        InventoryCheck.validate();
    }
}


