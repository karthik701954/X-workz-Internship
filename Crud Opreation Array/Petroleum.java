class Petroleum {
    String petroleumNames[] = new String[10];
    int index;

    public boolean addPetroleum(String petroleum) {
        boolean isAdded = false;

        if (index < petroleumNames.length) {
            if (petroleum != null && !petroleum.isEmpty()) {
                petroleumNames[index++] = petroleum;
                isAdded = true;
            } else {
                System.out.println("This is not valid");
            }
        } else {
            System.out.println("Array is full, Try next time");
        }

        return isAdded;
    }

    public void getPetroleums() {
        for (String petroleum : petroleumNames) {
            System.out.println(petroleum);
        }
    }

    public String getPetroleumByName(String petroleumName) {
        String name = null;

        for (String petroleum : petroleumNames) {
            if (petroleum == petroleumName) {   // same style
                name = petroleum;
                break;
            }
        }

        if (name == null)
            System.out.println(petroleumName + " is not available");

        return name;
    }

    public boolean updatePetroleum(String existingPetroleum, String updatedPetroleum) {
        boolean isUpdated = false;

        for (int i = 0; i < petroleumNames.length; i++) {
            if (existingPetroleum == petroleumNames[i]) {
                petroleumNames[i] = updatedPetroleum;
                isUpdated = true;
            }
        }

        if (!isUpdated)
            System.out.println(existingPetroleum + " is not updated");

        return isUpdated;
    }

    public boolean deletePetroleum(String petroleumName) {
        boolean isDeleted = false;

        for (int i = 0; i < petroleumNames.length; i++) {
            if (petroleumName == petroleumNames[i]) {
                petroleumNames[i] = null;
                isDeleted = true;
            }
        }

        if (!isDeleted)
            System.out.println(petroleumName + " is not deleted");

        return isDeleted;
    }
}