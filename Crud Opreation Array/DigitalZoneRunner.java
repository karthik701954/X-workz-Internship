class DigitalZoneRunner {
    public static void main(String[] args) {

        DigitalZone zone = new DigitalZone();

        boolean added = zone.addLaptopBrand("HP");
        System.out.println(added);
        added = zone.addLaptopBrand("Dell");
        System.out.println(added);
        added = zone.addLaptopBrand("Lenovo");
        System.out.println(added);
        added = zone.addLaptopBrand("Asus");
        System.out.println(added);
        added = zone.addLaptopBrand("Acer");
        System.out.println(added);
        added = zone.addLaptopBrand("Apple");
        System.out.println(added);

        zone.getLaptopBrands();

        String name = zone.getLaptopBrandByName("Dell");
        System.out.println(name + " is available");

        boolean updated = zone.updateLaptopBrandName("HP", "HP Pavilion");
        System.out.println(updated);

        zone.getLaptopBrands();

        boolean deleted = zone.deleteLaptopBrand("Acer");
        System.out.println(deleted);

        zone.getLaptopBrands();
    }
}