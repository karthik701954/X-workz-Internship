class UniverseRunner {
    public static void main(String[] args) {

        Universe universe = new Universe();

        universe.addGalaxy("Milky Way");
        universe.addGalaxy("Andromeda");
        universe.addGalaxy("Triangulum");
        universe.addGalaxy("Whirlpool");
        universe.addGalaxy("Sombrero");
        universe.addGalaxy("Pinwheel");
        universe.addGalaxy("Cartwheel");
        universe.addGalaxy("Black Eye");
        universe.addGalaxy("Cigar Galaxy");
        universe.addGalaxy("Tadpole Galaxy");
        universe.addGalaxy("Messier 87");

        universe.getGalaxies();
    }
}