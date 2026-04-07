class Bed {

    String bedNames[] = new String[10];
    int index;

    public boolean addBed(String name) {
        boolean isAdded = false;

        if (index < bedNames.length) {
            if (name != null && !name.isEmpty()) {
                bedNames[index++] = name;
                isAdded = true;
            } else {
                System.out.println("Invalid bed name");
            }
        } else {
            System.out.println("Array is full");
        }

        return isAdded;
    }

    public void getBeds() {
        for (String name : bedNames) {
            System.out.println(name);
        }
    }

    public String getBedByName(String name) {
        String result = null;

        for (String bed : bedNames) {
            if (bed == name) {
                result = bed;
                break;
            }
        }

        if (result == null)
            System.out.println(name + " is not available");

        return result;
    }

    public boolean updateBed(String oldName, String newName) {
        boolean isUpdated = false;

        for (int i = 0; i < bedNames.length; i++) {
            if (bedNames[i] == oldName) {
                bedNames[i] = newName;
                isUpdated = true;
            }
        }

        if (!isUpdated)
            System.out.println(oldName + " is not updated");

        return isUpdated;
    }

    public boolean deleteBed(String name) {
        boolean isDeleted = false;

        for (int i = 0; i < bedNames.length; i++) {
            if (bedNames[i] == name) {
                bedNames[i] = null;
                isDeleted = true;
            }
        }

        if (!isDeleted)
            System.out.println(name + " is not deleted");

        return isDeleted;
    }
}