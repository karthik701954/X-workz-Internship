class Turbine {

    String turbineNames[] = new String[10];
    int index;

    public boolean addTurbine(String name) {
        boolean isAdded = false;

        if (index < turbineNames.length) {
            if (name != null && !name.isEmpty()) {
                turbineNames[index++] = name;
                isAdded = true;
            } else {
                System.out.println("Invalid turbine name");
            }
        } else {
            System.out.println("Array is full");
        }

        return isAdded;
    }

    public void getTurbines() {
        for (String name : turbineNames) {
            System.out.println(name);
        }
    }

    public String getTurbineByName(String name) {
        String result = null;

        for (String turbine : turbineNames) {
            if (turbine == name) {
                result = turbine;
                break;
            }
        }

        if (result == null)
            System.out.println(name + " is not available");

        return result;
    }

    public boolean updateTurbine(String oldName, String newName) {
        boolean isUpdated = false;

        for (int i = 0; i < turbineNames.length; i++) {
            if (turbineNames[i] == oldName) {
                turbineNames[i] = newName;
                isUpdated = true;
            }
        }

        if (!isUpdated)
            System.out.println(oldName + " is not updated");

        return isUpdated;
    }

    public boolean deleteTurbine(String name) {
        boolean isDeleted = false;

        for (int i = 0; i < turbineNames.length; i++) {
            if (turbineNames[i] == name) {
                turbineNames[i] = null;
                isDeleted = true;
            }
        }

        if (!isDeleted)
            System.out.println(name + " is not deleted");

        return isDeleted;
    }
}