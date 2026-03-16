class District {
    public static void run() {
        System.out.println("District: Running district administration");
        District.taxing();
    }

    public static void taxing() {
        System.out.println("District: Taxing process started");
        measure();
    }

    public static void measure() {
        System.out.println("District: Measuring revenue sources");
        collect();
    }

    public static void collect() {
        System.out.println("District: Collecting tax");
        revenue();
    }

    public static void revenue() {
        System.out.println("District: Calculating revenue");
        budget();
    }

    public static void budget() {
        System.out.println("District: Preparing budget");
    }
}