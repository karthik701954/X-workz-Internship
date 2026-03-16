class DispatchVehicle {
    public static void outOfDelivery() {
        System.out.println("DispatchVehicle: Out for delivery");
        DeliveryAgent.reachDoorStep();
    }
}