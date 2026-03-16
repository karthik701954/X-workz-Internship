class PerfumeProduct {

    static String productDimensions = "8 x 5 x 16 cm";
    static String dateFirstAvailable = "10 March 2023";
    static String manufacturer = "Aroma Fragrances Pvt Ltd";
    static String asin = "B0PERF12345";
    static String itemPartNumber = "AR-2023";
    static String countryOfOrigin = "India";
    static String packer = "Aroma Fragrances Pvt Ltd";
    static int itemWeight = 400;
    static String itemDimensions = "8 x 5 x 16 Centimeters";
    static double netQuantity = 120.0;
    static String genericName = "Perfume - Eau De Toilette";

    public static void main(String[] args) {

        String productDimensions = "7.5 x 4 x 15 cm";
        String dateFirstAvailable = "19 September 2022";
        String manufacturer = "Divine Cosmetics LLP";
        String asin = "B0BGSNXG69";
        String itemPartNumber = "10911";
        String countryOfOrigin = "India";
        String packer = "Divine Cosmetics LLP";
        int itemWeight = 450;
        String itemDimensions = "7.5 x 4 x 15 Centimeters";
        double netQuantity = 100.0;
        String genericName = "Perfume - Eau De Parfum";

        System.out.println("Product Dimensions: " + productDimensions);
        System.out.println("Product Dimensions: " + PerfumeProduct.productDimensions);

        System.out.println("Date First Available: " + dateFirstAvailable);
        System.out.println("Date First Available: " + PerfumeProduct.dateFirstAvailable);

        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Manufacturer: " + PerfumeProduct.manufacturer);

        System.out.println("ASIN: " + asin);
        System.out.println("ASIN: " + PerfumeProduct.asin);

        System.out.println("Item Part Number: " + itemPartNumber);
        System.out.println("Item Part Number: " + PerfumeProduct.itemPartNumber);

        System.out.println("Country of Origin: " + countryOfOrigin);
        System.out.println("Country of Origin: " + PerfumeProduct.countryOfOrigin);

        System.out.println("Packer: " + packer);
        System.out.println("Packer: " + PerfumeProduct.packer);

        System.out.println("Item Weight: " + itemWeight + " g");
        System.out.println("Item Weight: " + PerfumeProduct.itemWeight + " g");

        System.out.println("Item Dimensions LxWxH: " + itemDimensions);
        System.out.println("Item Dimensions LxWxH: " + PerfumeProduct.itemDimensions);

        System.out.println("Net Quantity: " + netQuantity + " Milliliters");
        System.out.println("Net Quantity: " + PerfumeProduct.netQuantity + " Milliliters");

        System.out.println("Generic Name: " + genericName);
        System.out.println("Generic Name: " + PerfumeProduct.genericName);
    }
}
