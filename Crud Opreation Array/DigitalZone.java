class DigitalZone {
    String laptopBrandNames[] = new String[6];
    int index;

    public boolean addLaptopBrand(String brand) {
        boolean isAdded = false;

        if (index < laptopBrandNames.length) {
            if (brand != null && !brand.isEmpty()) {
                laptopBrandNames[index++] = brand;
                isAdded = true;
            } else {
                System.out.println("This is not valid");
            }
        } else {
            System.out.println("Array is full, Try next time");
        }

        return isAdded;
    }

    public void getLaptopBrands() {
        for (String brand : laptopBrandNames) {
            System.out.println(brand);
        }
    }
}