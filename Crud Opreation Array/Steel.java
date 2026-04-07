class Steel {
    String steelNames[] = new String[10];
    int index;

    public boolean addSteel(String steel) {
        boolean isAdded = false;

        if (index < steelNames.length) {
            if (steel != null && !steel.isEmpty()) {
                steelNames[index++] = steel;
                isAdded = true;
            } else {
                System.out.println("This is not valid");
            }
        } else {
            System.out.println("Array is full, Try next time");
        }

        return isAdded;
    }

    public void getSteels() {
        for (String steel : steelNames) {
            System.out.println(steel);
        }
    }

    public String getSteelByName(String steelName) {
        String name = null;

        for (String steel : steelNames) {
            if (steel == steelName) {   // same style
                name = steel;
                break;
            }
        }

        if (name == null)
            System.out.println(steelName + " is not available");

        return name;
    }

    public boolean updateSteel(String existingSteel, String updatedSteel) {
        boolean isUpdated = false;

        for (int i = 0; i < steelNames.length; i++) {
            if (existingSteel == steelNames[i]) {
                steelNames[i] = updatedSteel;
                isUpdated = true;
            }
        }

        if (!isUpdated)
            System.out.println(existingSteel + " is not updated");

        return isUpdated;
    }

    public boolean deleteSteel(String steelName) {
        boolean isDeleted = false;

        for (int i = 0; i < steelNames.length; i++) {
            if (steelName == steelNames[i]) {
                steelNames[i] = null;
                isDeleted = true;
            }
        }

        if (!isDeleted)
            System.out.println(steelName + " is not deleted");

        return isDeleted;
    }
}

