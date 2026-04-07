class Kettle {

    String kettleNames[] = new String[10];
    int index;

    public boolean addKettle(String name) {
        boolean isAdded = false;

        if (index < kettleNames.length) {
            if (name != null && !name.isEmpty()) {
                kettleNames[index++] = name;
                isAdded = true;
            } else {
                System.out.println("Invalid kettle name");
            }
        } else {
            System.out.println("Array is full");
        }

        return isAdded;
    }

    public void getKettles() {
        for (String name : kettleNames) {
            System.out.println(name);
        }
    }

    public String getKettleByName(String name) {
        String result = null;

        for (String kettle : kettleNames) {
            if (kettle == name) {  
                result = kettle;
                break;
            }
        }

        if (result == null)
            System.out.println(name + " is not available");

        return result;
    }

    public boolean updateKettle(String oldName, String newName) {
        boolean isUpdated = false;

        for (int i = 0; i < kettleNames.length; i++) {
            if (kettleNames[i] == oldName) {
                kettleNames[i] = newName;
                isUpdated = true;
            }
        }

        if (!isUpdated)
            System.out.println(oldName + " is not updated");

        return isUpdated;
    }

    public boolean deleteKettle(String name) {
        boolean isDeleted = false;

        for (int i = 0; i < kettleNames.length; i++) {
            if (kettleNames[i] == name) {
                kettleNames[i] = null;
                isDeleted = true;
            }
        }

        if (!isDeleted)
            System.out.println(name + " is not deleted");

        return isDeleted;
    }
}