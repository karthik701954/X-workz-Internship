class DeliveryAgent {
    public static void reachDoorStep() {
        System.out.println("DeliveryAgent: Reached doorstep");
        SignaturePortal.collectESign();
    }
}