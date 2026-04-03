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
}