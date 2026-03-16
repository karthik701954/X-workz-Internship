class MorovikProduct {

    static String manufacturer = "Morovik Industries";
    static String countryOfOrigin = "India";
    static String itemModelNumber = "MVK-100";
    static String asin = "B0MVK12345";

    public static void main(String[] args) {

        String manufacturer = "MOROVIK";
        String countryOfOrigin = "India";
        String itemModelNumber = "1";
        String asin = "B0GFNDZKJB";

        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Manufacturer: " + MorovikProduct.manufacturer);

        System.out.println("Country of Origin: " + countryOfOrigin);
        System.out.println("Country of Origin: " + MorovikProduct.countryOfOrigin);

        System.out.println("Item Model Number: " + itemModelNumber);
        System.out.println("Item Model Number: " + MorovikProduct.itemModelNumber);

        System.out.println("ASIN: " + asin);
        System.out.println("ASIN: " + MorovikProduct.asin);
    }
}
