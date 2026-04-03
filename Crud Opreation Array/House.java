class House {
    String indoorGames[] = new String[6];
    int index;

    public boolean addGame(String game) {
        boolean isAdded = false;

        if (index < indoorGames.length) {
            if (game != null && !game.isEmpty()) {
                indoorGames[index++] = game;
                isAdded = true;
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
}