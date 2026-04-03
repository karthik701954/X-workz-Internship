class HouseRunner {
    public static void main(String[] args) {

        House house = new House();

        house.addGame("Chess");
        house.addGame("Carrom");
        house.addGame("Ludo");
        house.addGame("Snake and Ladder");
        house.addGame("Cards");
        house.addGame("Table Tennis");

        house.getGames();
    }
}