class SteelRunner {
    public static void main(String[] args) {

        Steel steel = new Steel();

        boolean added = steel.addSteel("Carbon Steel");
        System.out.println(added);

        added = steel.addSteel("Alloy Steel");
        System.out.println(added);

        added = steel.addSteel("Stainless Steel");
        System.out.println(added);

        added = steel.addSteel("Tool Steel");
        System.out.println(added);

        added = steel.addSteel("Spring Steel");
        System.out.println(added);

        added = steel.addSteel("Mild Steel");
        System.out.println(added);

        added = steel.addSteel("High Speed Steel");
        System.out.println(added);

        added = steel.addSteel("Duplex Steel");
        System.out.println(added);

        added = steel.addSteel("Galvanized Steel");
        System.out.println(added);

        added = steel.addSteel("Structural Steel");
        System.out.println(added);

        steel.getSteels();

        String name = steel.getSteelByName("Alloy Steel");
        System.out.println(name + " is available");

        boolean updated = steel.updateSteel("Mild Steel", "Low Carbon Steel");
        System.out.println(updated);

        steel.getSteels();

        boolean deleted = steel.deleteSteel("Carbon Steel");
        System.out.println(deleted);

        steel.getSteels();
    }
}