class Olympic {
    String sportNames[] = new String[11];
    int index;

    public boolean addSport(String sport) {
        boolean isAdded = false;

        if (index < sportNames.length) {
            if (sport != null && !sport.isEmpty()) {
                sportNames[index++] = sport;
                isAdded = true;
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
}