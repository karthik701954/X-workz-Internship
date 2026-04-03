class ShowRoom {
    String managerNames[] = new String[8];
    int index;

    public boolean addManager(String manager) {
        boolean isAdded = false;

        if (index < managerNames.length) {
            if (manager != null && !manager.isEmpty()) {
                managerNames[index++] = manager;
                isAdded = true;
            } else {
                System.out.println("This is not valid");
            }
        } else {
            System.out.println("Array is full, Try next time");
        }

        return isAdded;
    }

    public void getManagers() {
        for (String manager : managerNames) {
            System.out.println(manager);
        }
    }
}