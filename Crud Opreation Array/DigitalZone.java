class DigitalZone {
    String laptopBrandNames[] = new String[6];
    int index;

    public boolean addLaptopBrand(String brand) {
        boolean isAdded = false;

        if (index < laptopBrandNames.length) {
            if (brand != null && !brand.isEmpty()) {
                laptopBrandNames[index++] = brand;
                isAdded = true;
                System.out.println("Total brands added: " + index);
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

    public String getLaptopBrandByName(String brandName) {
        String name = null;
        for (String brand : laptopBrandNames) {
            if (brand == brandName) {
                name = brand;
                break;
            }
        }
        if (name == null)
            System.out.println(brandName + " is not available");

        return name;
    }

    public boolean updateLaptopBrandName(String existingBrandName, String updatedBrandName) {
        boolean isUpdated = false;
        for (int i = 0; i < laptopBrandNames.length; i++) {
            if (existingBrandName == laptopBrandNames[i]) {
                laptopBrandNames[i] = updatedBrandName;
                isUpdated = true;
            }
        }
        if (isUpdated == false)
            System.out.println(existingBrandName + " is not updated");

        return isUpdated;
    }

    public boolean deleteLaptopBrand(String brandName) {
        boolean isDeleted = false;
        for (int i = 0; i < laptopBrandNames.length; i++) {
            if (brandName == laptopBrandNames[i]) {
                laptopBrandNames[i] = null;
                isDeleted = true;
            }
        }
        if (isDeleted == false)
            System.out.println(brandName + " is not deleted");

        return isDeleted;
    }
}