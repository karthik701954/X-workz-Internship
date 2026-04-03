class PetShop {
    String accessories[] = new String[16];
    int index;

    public boolean addAccessory(String accessory) {
        boolean isAdded = false;

        if (index < accessories.length) {
            if (accessory != null && !accessory.isEmpty()) {
                accessories[index++] = accessory;
                isAdded = true;
            } else {
                System.out.println("This is not valid");
            }
        } else {
            System.out.println("Array is full, Try next time");
        }

        return isAdded;
    }

    public void getAccessories() {
        for (String accessory : accessories) {
            System.out.println(accessory);
        }
    }
}