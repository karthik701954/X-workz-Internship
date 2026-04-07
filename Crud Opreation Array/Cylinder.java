class Cylinder {
    String cylinderNames[] = new String[10];
    int index;

    public boolean addCylinder(String name) {
        boolean isAdded = false;

        if (index < cylinderNames.length) {
            if (name != null && !name.isEmpty()) {
                cylinderNames[index++] = name;
                isAdded = true;
            } else {
                System.out.println("Invalid cylinder name");
            }
        } else {
            System.out.println("Array is full");
        }

        return isAdded;
    }

    public void getCylinders() {
        for (String name : cylinderNames) {
            System.out.println(name);
        }
    }

    public String getCylinderByName(String name) {
        String result = null;

        for (String cylinder : cylinderNames) {
            if (cylinder == name) {   // same as your style
                result = cylinder;
                break;
            }
        }

        if (result == null)
            System.out.println(name + " is not available");

        return result;
    }

    public boolean updateCylinder(String oldName, String newName) {
        boolean isUpdated = false;

        for (int i = 0; i < cylinderNames.length; i++) {
            if (cylinderNames[i] == oldName) {
                cylinderNames[i] = newName;
                isUpdated = true;
            }
        }

        if (!isUpdated)
            System.out.println(oldName + " is not updated");

        return isUpdated;
    }

    public boolean deleteCylinder(String name) {
        boolean isDeleted = false;

        for (int i = 0; i < cylinderNames.length; i++) {
            if (cylinderNames[i] == name) {
                cylinderNames[i] = null;
                isDeleted = true;
            }
        }

        if (!isDeleted)
            System.out.println(name + " is not deleted");

        return isDeleted;
    }
}