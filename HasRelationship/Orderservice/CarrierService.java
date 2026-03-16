class CarrierService {
    public static void pickUpPackage() {
        System.out.println("CarrierService: Picking up package");
        HubRouter.sortToZipCode();
    }
}