class PoliceStationRunner {
    public static void main(String[] args) {

        PoliceStation policeStation = new PoliceStation();

        boolean added = policeStation.addCase("Theft Case");
        System.out.println(added);
        added = policeStation.addCase("Murder Case");
        System.out.println(added);
        added = policeStation.addCase("Fraud Case");
        System.out.println(added);
        added = policeStation.addCase("Cyber Crime");
        System.out.println(added);
        added = policeStation.addCase("Kidnap Case");
        System.out.println(added);
        added = policeStation.addCase("Accident Case");
        System.out.println(added);
        added = policeStation.addCase("Drug Case");
        System.out.println(added);
        added = policeStation.addCase("Robbery Case");
        System.out.println(added);
        added = policeStation.addCase("Missing Person");
        System.out.println(added);
        added = policeStation.addCase("Domestic Violence");
        System.out.println(added);
        added = policeStation.addCase("Assault Case");
        System.out.println(added);
        added = policeStation.addCase("Bribery Case");
        System.out.println(added);
        added = policeStation.addCase("Smuggling Case");
        System.out.println(added);
        added = policeStation.addCase("Traffic Violation");
        System.out.println(added);
        added = policeStation.addCase("Property Dispute");
        System.out.println(added);
        added = policeStation.addCase("Harassment Case");
        System.out.println(added);

        policeStation.getCases();

        String name = policeStation.getCaseByName("Cyber Crime");
        System.out.println(name + " is available");

        boolean updated = policeStation.updateCaseName("Fraud Case", "Online Fraud Case");
        System.out.println(updated);

        policeStation.getCases();

        boolean deleted = policeStation.deleteCase("Drug Case");
        System.out.println(deleted);

        policeStation.getCases();
    }
}