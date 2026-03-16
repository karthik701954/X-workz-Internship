class KTMBikeProduct {

    static String manufacturer = "KTM Motors";
    static String brand = "KTM";
    static String model = "390 Duke Orange";
    static String productDimensions = "2090 x 830 x 1100 mm";
    static double weightWithDimensions = 170.5;
    static String itemPartNumber = "KTM390DUKE01";
    static String manufacturerPartNumber = "KTM390DUKE01";
    static String size = "2090mm x 830mm x 1100mm";
    static String colour = "Orange Black";
    static String specialFeatures = "Digital Console, 373cc Engine, ABS";
    static String countryOfOrigin = "India";
    static double itemWeight = 171;

    public static void main(String[] args) {

        String manufacturer = "KTM India";
        String brand = "KTM";
        String model = "250 Duke Blue";
        String productDimensions = "2071 x 833 x 1065 mm";
        double weightWithDimensions = 162.8;
        String itemPartNumber = "KTM250DUKE02";
        String manufacturerPartNumber = "KTM250DUKE02";
        String size = "2071mm x 833mm x 1065mm";
        String colour = "Blue";
        String specialFeatures = "LCD Display, 249cc Engine, ABS";
        String countryOfOrigin = "India";
        double itemWeight = 163;

        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Manufacturer: " + KTMBikeProduct.manufacturer);

        System.out.println("Brand: " + brand);
        System.out.println("Brand: " + KTMBikeProduct.brand);

        System.out.println("Model: " + model);
        System.out.println("Model: " + KTMBikeProduct.model);

        System.out.println("Product Dimensions: " + productDimensions);
        System.out.println("Product Dimensions: " + KTMBikeProduct.productDimensions);

        System.out.println("Weight (with dimensions): " + weightWithDimensions + " kg");
        System.out.println("Weight (with dimensions): " + KTMBikeProduct.weightWithDimensions + " kg");

        System.out.println("Item Part Number: " + itemPartNumber);
        System.out.println("Item Part Number: " + KTMBikeProduct.itemPartNumber);

        System.out.println("Manufacturer Part Number: " + manufacturerPartNumber);
        System.out.println("Manufacturer Part Number: " + KTMBikeProduct.manufacturerPartNumber);

        System.out.println("Size: " + size);
        System.out.println("Size: " + KTMBikeProduct.size);

        System.out.println("Colour: " + colour);
        System.out.println("Colour: " + KTMBikeProduct.colour);

        System.out.println("Special Features: " + specialFeatures);
        System.out.println("Special Features: " + KTMBikeProduct.specialFeatures);

        System.out.println("Country of Origin: " + countryOfOrigin);
        System.out.println("Country of Origin: " + KTMBikeProduct.countryOfOrigin);

        System.out.println("Item Weight: " + itemWeight + " kg");
        System.out.println("Item Weight: " + KTMBikeProduct.itemWeight + " kg");
    }
}
