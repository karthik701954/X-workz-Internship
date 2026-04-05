class HouseRunner {
    public static void main(String[] args) {

        House house = new House();

        boolean added = house.addGame("Chess");
        System.out.println(added);
        added = house.addGame("Carrom");
        System.out.println(added);
        added = house.addGame("Ludo");
        System.out.println(added);
        added = house.addGame("Snake and Ladder");
        System.out.println(added);
        added = house.addGame("Cards");
        System.out.println(added);
        added = house.addGame("Table Tennis");
        System.out.println(added);

        house.getGames();

        String name = house.getGameByName("Chess");
        System.out.println(name + " is available");

        boolean updated = house.updateGameName("Ludo", "Ludo King");
        System.out.println(updated);

        house.getGames();

        boolean deleted = house.deleteGame("Cards");
        System.out.println(deleted);

        house.getGames();
    }
}