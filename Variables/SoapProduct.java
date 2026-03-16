class SoapProduct {

    static String manufacturer = "FreshGlow Soaps";
    static String countryOfOrigin = "India";
    static String itemModelNumber = "FG-SOAP-101";
    static String productDimensions = "11 x 7 x 9 cm";
    static int itemWeight = 180;
    static String asin = "B0SOAP12345";

    public static void main(String[] args) {

        String manufacturer = "Ghar Soaps";
        String countryOfOrigin = "India";
        String itemModelNumber = "MG-SOAP-Pk2";
        String productDimensions = "12 x 8.5 x 10 cm";
        int itemWeight = 200;
        String asin = "B0CXXQL33D";

        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Manufacturer: " + SoapProduct.manufacturer);

        System.out.println("Country of Origin: " + countryOfOrigin);
        System.out.println("Country of Origin: " + SoapProduct.countryOfOrigin);

        System.out.println("Item Model Number: " + itemModelNumber);
        System.out.println("Item Model Number: " + SoapProduct.itemModelNumber);

        System.out.println("Product Dimensions: " + productDimensions);
        System.out.println("Product Dimensions: " + SoapProduct.productDimensions);

        System.out.println("Item Weight: " + itemWeight + " g");
        System.out.println("Item Weight: " + SoapProduct.itemWeight + " g");

        System.out.println("ASIN: " + asin);
        System.out.println("ASIN: " + SoapProduct.asin);
    }
}
