class InventoryCheck {
    public static void validate() {
        System.out.println("InventoryCheck: Validating stock");
        WareHouse.fetchFromAisle();
    }
}