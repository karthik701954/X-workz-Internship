class SuperMarket {
    String productNames[] = new String[8];
    int index;

    public boolean addProduct(String product) {
        boolean isAdded = false;

        if (index < productNames.length) {
            if (product != null && !product.isEmpty()) {
                productNames[index++] = product;
                isAdded = true;
            } else {
                System.out.println("This is not valid");
            }
        } else {
            System.out.println("Array is full, Try next time");
        }

        return isAdded;
    }

    public void getProducts() {
        for (String product : productNames) {
            System.out.println(product);
        }
    }

    public String getProductByName(String productName) {
        String name = null;

        for (String product : productNames) {
            if (product == productName) {
                name = product;
                break;
            }
        }

        if (name == null)
            System.out.println(productName + " is not available");

        return name;
    }

    public boolean updateProduct(String existingProduct, String updatedProduct) {
        boolean isUpdated = false;

        for (int i = 0; i < productNames.length; i++) {
            if (existingProduct == productNames[i]) {
                productNames[i] = updatedProduct;
                isUpdated = true;
            }
        }

        if (isUpdated == false)
            System.out.println(existingProduct + " is not updated");

        return isUpdated;
    }

    public boolean deleteProduct(String productName) {
        boolean isDeleted = false;

        for (int i = 0; i < productNames.length; i++) {
            if (productName == productNames[i]) {
                productNames[i] = null;
                isDeleted = true;
            }
        }

        if (isDeleted == false)
            System.out.println(productName + " is not deleted");

        return isDeleted;
    }
}

