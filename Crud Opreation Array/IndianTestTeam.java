class IndianTestTeam {
    String playerNames[] = new String[11];
    int index;

    public boolean addPlayer(String player) {
        boolean isAdded = false;

        if (index < playerNames.length) {
            if (player != null && !player.isEmpty()) {
                playerNames[index++] = player;
                isAdded = true;
                System.out.println("Total players added: " + index);
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

    public String getPlayerByName(String playerName) {
        String name = null;
        for (String player : playerNames) {
            if (player == playerName) {
                name = player;
                break;
            }
        }
        if (name == null)
            System.out.println(playerName + " is not available");

        return name;
    }

    public boolean updatePlayerName(String existingPlayerName, String updatedPlayerName) {
        boolean isUpdated = false;
        for (int i = 0; i < playerNames.length; i++) {
            if (existingPlayerName == playerNames[i]) {
                playerNames[i] = updatedPlayerName;
                isUpdated = true;
            }
        }
        if (isUpdated == false)
            System.out.println(existingPlayerName + " is not updated");

        return isUpdated;
    }

    public boolean deletePlayer(String playerName) {
        boolean isDeleted = false;
        for (int i = 0; i < playerNames.length; i++) {
            if (playerName == playerNames[i]) {
                playerNames[i] = null;
                isDeleted = true;
            }
        }
        if (isDeleted == false)
            System.out.println(playerName + " is not deleted");

        return isDeleted;
    }
}