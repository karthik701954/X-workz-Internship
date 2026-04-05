class StateElectionRunner {
    public static void main(String[] args) {

        StateElection se = new StateElection();

        boolean added = se.addParty("BJP");
        System.out.println(added);
        added = se.addParty("INC");
        System.out.println(added);
        added = se.addParty("AAP");
        System.out.println(added);
        added = se.addParty("TMC");
        System.out.println(added);
        added = se.addParty("BSP");
        System.out.println(added);
        added = se.addParty("SP");
        System.out.println(added);
        added = se.addParty("CPI");
        System.out.println(added);

        se.getParties();

        String name = se.getPartyByName("AAP");
        System.out.println(name + " is available");

        boolean updated = se.updateParty("SP", "Samajwadi Party");
        System.out.println(updated);

        se.getParties();

        boolean deleted = se.deleteParty("CPI");
        System.out.println(deleted);

        se.getParties();
    }
}