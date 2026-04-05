class PetShop {
    String accessories[] = new String[16];
    int index;

    public boolean addAccessory(String accessory) {
        boolean isAdded = false;

        if (index < accessories.length) {
            if (accessory != null && !accessory.isEmpty()) {
                accessories[index++] = accessory;
                isAdded = true;
                System.out.println("Total accessories added: " + index);
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

    public String getAccessoryByName(String accessoryName) {
        String name = null;
        for (String accessory : accessories) {
            if (accessory != null && accessory.equals(accessoryName)) {
                name = accessory;
                break;
            }
        }
        if (name == null)
            System.out.println(accessoryName + " is not available");

        return name;
    }

    public boolean updateAccessoryName(String existingAccessoryName, String updatedAccessoryName) {
        boolean isUpdated = false;
        for (int i = 0; i < accessories.length; i++) {
            if (accessories[i] != null && accessories[i].equals(existingAccessoryName)) {
                accessories[i] = updatedAccessoryName;
                isUpdated = true;
            }
        }
        if (isUpdated == false)
            System.out.println(existingAccessoryName + " is not updated");

        return isUpdated;
    }

    public boolean deleteAccessory(String accessoryName) {
        boolean isDeleted = false;
        for (int i = 0; i < accessories.length; i++) {
            if (accessories[i] != null && accessories[i].equals(accessoryName)) {
                accessories[i] = null;
                isDeleted = true;
            }
        }
        if (isDeleted == false)
            System.out.println(accessoryName + " is not deleted");

        return isDeleted;
    }
}