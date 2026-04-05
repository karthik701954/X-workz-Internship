class House {
    String indoorGames[] = new String[6];
    int index;

    public boolean addGame(String game) {
        boolean isAdded = false;

        if (index < indoorGames.length) {
            if (game != null && !game.isEmpty()) {
                indoorGames[index++] = game;
                isAdded = true;
                System.out.println("Total games added: " + index);
            } else {
                System.out.println("This is not valid");
            }
        } else {
            System.out.println("Array is full, Try next time");
        }

        return isAdded;
    }

    public void getGames() {
        for (String game : indoorGames) {
            System.out.println(game);
        }
    }

    public String getGameByName(String gameName) {
        String name = null;
        for (String game : indoorGames) {
            if (game == gameName) {
                name = game;
                break;
            }
        }
        if (name == null)
            System.out.println(gameName + " is not available");

        return name;
    }

    public boolean updateGameName(String existingGameName, String updatedGameName) {
        boolean isUpdated = false;
        for (int i = 0; i < indoorGames.length; i++) {
            if (existingGameName == indoorGames[i]) {
                indoorGames[i] = updatedGameName;
                isUpdated = true;
            }
        }
        if (isUpdated == false)
            System.out.println(existingGameName + " is not updated");

        return isUpdated;
    }

    public boolean deleteGame(String gameName) {
        boolean isDeleted = false;
        for (int i = 0; i < indoorGames.length; i++) {
            if (gameName == indoorGames[i]) {
                indoorGames[i] = null;
                isDeleted = true;
            }
        }
        if (isDeleted == false)
            System.out.println(gameName + " is not deleted");

        return isDeleted;
    }
}