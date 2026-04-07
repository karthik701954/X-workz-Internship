class KettleRunner {

    public static void main(String[] args) {

        Kettle kettle = new Kettle();

        boolean added = kettle.addKettle("Electric Kettle");
        System.out.println(added);

        added = kettle.addKettle("Steel Kettle");
        System.out.println(added);

        added = kettle.addKettle("Glass Kettle");
        System.out.println(added);

        added = kettle.addKettle("Travel Kettle");
        System.out.println(added);

        added = kettle.addKettle("Tea Kettle");
        System.out.println(added);

        added = kettle.addKettle("Coffee Kettle");
        System.out.println(added);

        added = kettle.addKettle("Whistling Kettle");
        System.out.println(added);

        added = kettle.addKettle("Cordless Kettle");
        System.out.println(added);

        added = kettle.addKettle("Mini Kettle");
        System.out.println(added);

        added = kettle.addKettle("Smart Kettle");
        System.out.println(added);

        kettle.getKettles();

        String name = kettle.getKettleByName("Tea Kettle");
        System.out.println(name + " is available");

        boolean updated = kettle.updateKettle("Travel Kettle", "Portable Travel Kettle");
        System.out.println(updated);

        kettle.getKettles();

        boolean deleted = kettle.deleteKettle("Electric Kettle");
        System.out.println(deleted);

        kettle.getKettles();
    }
}