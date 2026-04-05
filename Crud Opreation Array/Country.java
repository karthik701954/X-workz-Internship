class Country {
    String States[] = new String[29];
    int index;

    public boolean addStates(String state) {
        boolean isAdded = false;
        if (index < States.length) {
            if (state != null && !state.isEmpty()) {
                States[index++] = state;
                isAdded = true;
                System.out.println("Total states added: " + index);
            } else {
                System.out.println("This is not valid");
            }
        } else
            System.out.println("Try next time");
        return isAdded;
    }

    public void getStates() {
        for (String State : States) {
            System.out.println(State);
        }
    }

    public String getStateByName(String stateName) {
        String name = null;
        for (String state : States) {
            if (state == stateName) {
                name = state;
                break;
            }
        }
        if (name == null)
            System.out.println(stateName + " is not available");

        return name;
    }

    public boolean updateStateName(String existingStateName, String updatedStateName) {
        boolean isUpdated = false;
        for (int i = 0; i < States.length; i++) {
            if (existingStateName == States[i]) {
                States[i] = updatedStateName;
                isUpdated = true;
            }
        }
        if (isUpdated == false)
            System.out.println(existingStateName + " is not updated");

        return isUpdated;
    }

    public boolean deleteState(String stateName) {
        boolean isDeleted = false;
        for (int i = 0; i < States.length; i++) {
            if (stateName == States[i]) {
                States[i] = null;
                isDeleted = true;
            }
        }
        if (isDeleted == false)
            System.out.println(stateName + " is not deleted");

        return isDeleted;
    }
}