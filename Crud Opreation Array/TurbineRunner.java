class TurbineRunner {

    public static void main(String[] args) {

        Turbine turbine = new Turbine();

        boolean added = turbine.addTurbine("Steam Turbine");
        System.out.println(added);

        added = turbine.addTurbine("Gas Turbine");
        System.out.println(added);

        added = turbine.addTurbine("Water Turbine");
        System.out.println(added);

        added = turbine.addTurbine("Wind Turbine");
        System.out.println(added);

        added = turbine.addTurbine("Hydraulic Turbine");
        System.out.println(added);

        added = turbine.addTurbine("Pelton Turbine");
        System.out.println(added);

        added = turbine.addTurbine("Francis Turbine");
        System.out.println(added);

        added = turbine.addTurbine("Kaplan Turbine");
        System.out.println(added);

        added = turbine.addTurbine("Impulse Turbine");
        System.out.println(added);

        added = turbine.addTurbine("Reaction Turbine");
        System.out.println(added);

        turbine.getTurbines();

        String name = turbine.getTurbineByName("Wind Turbine");
        System.out.println(name + " is available");

        boolean updated = turbine.updateTurbine("Gas Turbine", "Industrial Gas Turbine");
        System.out.println(updated);

        turbine.getTurbines();

        boolean deleted = turbine.deleteTurbine("Steam Turbine");
        System.out.println(deleted);

        turbine.getTurbines();
    }
}