class StateElectionRunner {
    public static void main(String[] args) {

        StateElection se = new StateElection();

        se.addParty("BJP");
        se.addParty("INC");
        se.addParty("AAP");
        se.addParty("TMC");
        se.addParty("BSP");
        se.addParty("SP");
        se.addParty("CPI");

        se.getParties();
    }
}