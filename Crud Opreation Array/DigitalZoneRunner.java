class DigitalZoneRunner {
    public static void main(String[] args) {

        DigitalZone dz = new DigitalZone();

        dz.addLaptopBrand("Dell");
        dz.addLaptopBrand("HP");
        dz.addLaptopBrand("Lenovo");
        dz.addLaptopBrand("Apple");
        dz.addLaptopBrand("Asus");
        dz.addLaptopBrand("Acer");

        dz.getLaptopBrands();
    }
}