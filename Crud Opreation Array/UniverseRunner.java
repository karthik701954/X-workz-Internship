class UniverseRunner {
    public static void main(String[] args) {

        Universe universe = new Universe();

        boolean added = universe.addGalaxy("Milky Way");
        System.out.println(added);
        added = universe.addGalaxy("Andromeda");
        System.out.println(added);
        added = universe.addGalaxy("Triangulum");
        System.out.println(added);
        added = universe.addGalaxy("Whirlpool");
        System.out.println(added);
        added = universe.addGalaxy("Sombrero");
        System.out.println(added);
        added = universe.addGalaxy("Pinwheel");
        System.out.println(added);
        added = universe.addGalaxy("Cartwheel");
        System.out.println(added);
        added = universe.addGalaxy("Black Eye");
        System.out.println(added);
        added = universe.addGalaxy("Cigar Galaxy");
        System.out.println(added);
        added = universe.addGalaxy("Tadpole Galaxy");
        System.out.println(added);
        added = universe.addGalaxy("Messier 87");
        System.out.println(added);

        universe.getGalaxies();

        String name = universe.getGalaxyByName("Andromeda");
        System.out.println(name + " is available");

        boolean updated = universe.updateGalaxy("Whirlpool", "Whirlpool Galaxy");
        System.out.println(updated);

        universe.getGalaxies();

        boolean deleted = universe.deleteGalaxy("Black Eye");
        System.out.println(deleted);

        universe.getGalaxies();
    }
}