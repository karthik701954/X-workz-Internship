class PetroleumRunner {
    public static void main(String[] args) {

        Petroleum petroleum = new Petroleum();

        boolean added = petroleum.addPetroleum("Petrol");
        System.out.println(added);

        added = petroleum.addPetroleum("Diesel");
        System.out.println(added);

        added = petroleum.addPetroleum("Kerosene");
        System.out.println(added);

        added = petroleum.addPetroleum("LPG");
        System.out.println(added);

        added = petroleum.addPetroleum("CNG");
        System.out.println(added);

        added = petroleum.addPetroleum("Aviation Fuel");
        System.out.println(added);

        added = petroleum.addPetroleum("Lubricating Oil");
        System.out.println(added);

        added = petroleum.addPetroleum("Bitumen");
        System.out.println(added);

        added = petroleum.addPetroleum("Paraffin Wax");
        System.out.println(added);

        added = petroleum.addPetroleum("Naphtha");
        System.out.println(added);

        petroleum.getPetroleums();

        String name = petroleum.getPetroleumByName("Diesel");
        System.out.println(name + " is available");

        boolean updated = petroleum.updatePetroleum("CNG", "Compressed Natural Gas");
        System.out.println(updated);

        petroleum.getPetroleums();

        boolean deleted = petroleum.deletePetroleum("Petrol");
        System.out.println(deleted);

        petroleum.getPetroleums();
    }
}