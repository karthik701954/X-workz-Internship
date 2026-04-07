class BedRunner {

    public static void main(String[] args) {

        Bed bed = new Bed();

        boolean added = bed.addBed("Single Bed");
        System.out.println(added);

        added = bed.addBed("Double Bed");
        System.out.println(added);

        added = bed.addBed("Queen Size Bed");
        System.out.println(added);

        added = bed.addBed("King Size Bed");
        System.out.println(added);

        added = bed.addBed("Bunk Bed");
        System.out.println(added);

        added = bed.addBed("Sofa Bed");
        System.out.println(added);

        added = bed.addBed("Folding Bed");
        System.out.println(added);

        added = bed.addBed("Storage Bed");
        System.out.println(added);

        added = bed.addBed("Hydraulic Bed");
        System.out.println(added);

        added = bed.addBed("Adjustable Bed");
        System.out.println(added);

        bed.getBeds();

        String name = bed.getBedByName("Queen Size Bed");
        System.out.println(name + " is available");

        boolean updated = bed.updateBed("Bunk Bed", "Wooden Bunk Bed");
        System.out.println(updated);

        bed.getBeds();

        boolean deleted = bed.deleteBed("Single Bed");
        System.out.println(deleted);

        bed.getBeds();
    }
}