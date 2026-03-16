class BakeryProduct {

    static int weight = 250;
    static String brand = "SweetCrust";
    static String manufacturer = "Golden Oven Pvt Ltd";
    static String additives = "No Preservatives";
    static String allergenInformation = "Contains Wheat and Milk";
    static double netQuantity = 250.0;
    static String productDimensions = "10 x 8 x 6 cm";
    static String ingredients = "Flour, Sugar, Butter, Milk, Baking Powder";
    static String countryOfOrigin = "India";

    public static void main(String[] args) {

        int weight = 300;
        String brand = "BakeFresh";
        String manufacturer = "BakeFresh Foods";
        String additives = "Natural Flavours";
        String allergenInformation = "Contains Gluten";
        double netQuantity = 300.0;
        String productDimensions = "12 x 10 x 5 cm";
        String ingredients = "Flour, Jaggery, Butter, Eggs";
        String countryOfOrigin = "India";

        System.out.println("Weight: " + weight + " Grams");
        System.out.println("Weight: " + BakeryProduct.weight + " Grams");

        System.out.println("Brand: " + brand);
        System.out.println("Brand: " + BakeryProduct.brand);

        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Manufacturer: " + BakeryProduct.manufacturer);

        System.out.println("Additives: " + additives);
        System.out.println("Additives: " + BakeryProduct.additives);

        System.out.println("Allergen Information: " + allergenInformation);
        System.out.println("Allergen Information: " + BakeryProduct.allergenInformation);

        System.out.println("Net Quantity: " + netQuantity + " Grams");
        System.out.println("Net Quantity: " + BakeryProduct.netQuantity + " Grams");

        System.out.println("Product Dimensions: " + productDimensions);
        System.out.println("Product Dimensions: " + BakeryProduct.productDimensions);

        System.out.println("Ingredients: " + ingredients);
        System.out.println("Ingredients: " + BakeryProduct.ingredients);

        System.out.println("Country of Origin: " + countryOfOrigin);
        System.out.println("Country of Origin: " + BakeryProduct.countryOfOrigin);
    }
}
