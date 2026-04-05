class StateElection {
    String partyNames[] = new String[7];
    int index;

    public boolean addParty(String party) {
        boolean isAdded = false;

        if (index < partyNames.length) {
            if (party != null && !party.isEmpty()) {
                partyNames[index++] = party;
                isAdded = true;
            } else {
                System.out.println("This is not valid");
            }
        } else {
            System.out.println("Array is full, Try next time");
        }

        return isAdded;
    }

    public void getParties() {
        for (String party : partyNames) {
            System.out.println(party);
        }
    }

    public String getPartyByName(String partyName) {
        String name = null;

        for (String party : partyNames) {
            if (party == partyName) {
                name = party;
                break;
            }
        }

        if (name == null)
            System.out.println(partyName + " is not available");

        return name;
    }

    public boolean updateParty(String existingParty, String updatedParty) {
        boolean isUpdated = false;

        for (int i = 0; i < partyNames.length; i++) {
            if (existingParty == partyNames[i]) {
                partyNames[i] = updatedParty;
                isUpdated = true;
            }
        }

        if (isUpdated == false)
            System.out.println(existingParty + " is not updated");

        return isUpdated;
    }

    public boolean deleteParty(String partyName) {
        boolean isDeleted = false;

        for (int i = 0; i < partyNames.length; i++) {
            if (partyName == partyNames[i]) {
                partyNames[i] = null;
                isDeleted = true;
            }
        }

        if (isDeleted == false)
            System.out.println(partyName + " is not deleted");

        return isDeleted;
    }
}

