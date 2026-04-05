class IndianTestTeamRunner {
    public static void main(String[] args) {

        IndianTestTeam team = new IndianTestTeam();

        boolean added = team.addPlayer("Rohit Sharma");
        System.out.println(added);
        added = team.addPlayer("Shubman Gill");
        System.out.println(added);
        added = team.addPlayer("Virat Kohli");
        System.out.println(added);
        added = team.addPlayer("KL Rahul");
        System.out.println(added);
        added = team.addPlayer("Ajinkya Rahane");
        System.out.println(added);
        added = team.addPlayer("Ravindra Jadeja");
        System.out.println(added);
        added = team.addPlayer("Ravichandran Ashwin");
        System.out.println(added);
        added = team.addPlayer("Jasprit Bumrah");
        System.out.println(added);
        added = team.addPlayer("Mohammed Shami");
        System.out.println(added);
        added = team.addPlayer("Siraj");
        System.out.println(added);
        added = team.addPlayer("KS Bharat");
        System.out.println(added);

        team.getPlayers();

        String name = team.getPlayerByName("Virat Kohli");
        System.out.println(name + " is available");

        boolean updated = team.updatePlayerName("Siraj", "Mohammed Siraj");
        System.out.println(updated);

        team.getPlayers();

        boolean deleted = team.deletePlayer("KS Bharat");
        System.out.println(deleted);

        team.getPlayers();
    }
}