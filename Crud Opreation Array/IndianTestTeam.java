class IndianTestTeam {
    String playerNames[] = new String[11];
    int index;

    public boolean addPlayer(String player) {
        boolean isAdded = false;

        if (index < playerNames.length) {
            if (player != null && !player.isEmpty()) {
                playerNames[index++] = player;
                isAdded = true;
            } else {
                System.out.println("This is not valid");
            }
        } else {
            System.out.println("Array is full, Try next time");
        }

        return isAdded;
    }

    public void getPlayers() {
        for (String player : playerNames) {
            System.out.println(player);
        }
    }
}