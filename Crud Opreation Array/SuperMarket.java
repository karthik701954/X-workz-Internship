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
}