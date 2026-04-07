class CylinderRunner {
    public static void main(String[] args) {

        Cylinder cylinder = new Cylinder();

        boolean added = cylinder.addCylinder("Gas Cylinder");
        System.out.println(added);

        added = cylinder.addCylinder("Oxygen Cylinder");
        System.out.println(added);

        added = cylinder.addCylinder("Nitrogen Cylinder");
        System.out.println(added);

        added = cylinder.addCylinder("Helium Cylinder");
        System.out.println(added);

        added = cylinder.addCylinder("LPG Cylinder");
        System.out.println(added);

        added = cylinder.addCylinder("CNG Cylinder");
        System.out.println(added);

        added = cylinder.addCylinder("Fire Extinguisher Cylinder");
        System.out.println(added);

        added = cylinder.addCylinder("Medical Oxygen Cylinder");
        System.out.println(added);

        added = cylinder.addCylinder("Carbon Dioxide Cylinder");
        System.out.println(added);

        added = cylinder.addCylinder("Hydrogen Cylinder");
        System.out.println(added);

        cylinder.getCylinders();

        String name = cylinder.getCylinderByName("LPG Cylinder");
        System.out.println(name + " is available");

        boolean updated = cylinder.updateCylinder("Helium Cylinder", "Industrial Helium Cylinder");
        System.out.println(updated);

        cylinder.getCylinders();

        boolean deleted = cylinder.deleteCylinder("Gas Cylinder");
        System.out.println(deleted);

        cylinder.getCylinders();
    }
}