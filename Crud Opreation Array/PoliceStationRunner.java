class PoliceStationRunner {
    public static void main(String[] args) {

        PoliceStation ps = new PoliceStation();

        ps.addCase("Theft Case");
        ps.addCase("Robbery Case");
        ps.addCase("Fraud Case");
        ps.addCase("Cyber Crime");
        ps.addCase("Missing Person");
        ps.addCase("Accident Case");
        ps.addCase("Murder Case");
        ps.addCase("Kidnapping Case");
        ps.addCase("Domestic Violence");
        ps.addCase("Drug Case");
        ps.addCase("Assault Case");
        ps.addCase("Burglary Case");
        ps.addCase("Traffic Violation");
        ps.addCase("Extortion Case");
        ps.addCase("Arson Case");
        ps.addCase("Smuggling Case");

        ps.getCases();
    }
}