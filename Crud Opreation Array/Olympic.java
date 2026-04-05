class Olympic {
    String sportNames[] = new String[11];
    int index;

    public boolean addSport(String sport) {
        boolean isAdded = false;

        if (index < sportNames.length) {
            if (sport != null && !sport.isEmpty()) {
                sportNames[index++] = sport;
                isAdded = true;
                System.out.println("Total sports added: " + index);
            } else {
                System.out.println("This is not valid");
            }
        } else {
            System.out.println("Try next time");
        }

        return isAdded;
    }

    public void getSports() {
        for (String sport : sportNames) {
            System.out.println(sport);
        }
    }

    public String getSportByName(String sportName) {
        String name = null;
        for (String sport : sportNames) {
            if (sport != null && sport.equals(sportName)) {
                name = sport;
                break;
            }
        }
        if (name == null)
            System.out.println(sportName + " is not available");

        return name;
    }

    public boolean updateSportName(String existingSportName, String updatedSportName) {
        boolean isUpdated = false;
        for (int i = 0; i < sportNames.length; i++) {
            if (sportNames[i] != null && sportNames[i].equals(existingSportName)) {
                sportNames[i] = updatedSportName;
                isUpdated = true;
            }
        }
        if (isUpdated == false)
            System.out.println(existingSportName + " is not updated");

        return isUpdated;
    }

    public boolean deleteSport(String sportName) {
        boolean isDeleted = false;
        for (int i = 0; i < sportNames.length; i++) {
            if (sportNames[i] != null && sportNames[i].equals(sportName)) {
                sportNames[i] = null;
                isDeleted = true;
            }
        }
        if (isDeleted == false)
            System.out.println(sportName + " is not deleted");

        return isDeleted;
    }
}