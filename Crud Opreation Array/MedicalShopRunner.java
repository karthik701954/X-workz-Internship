class MedicalShopRunner {
    public static void main(String[] args) {

        MedicalShop shop = new MedicalShop();

        boolean added = shop.addMedicine("Paracetamol");
        System.out.println(added);
        added = shop.addMedicine("Dolo 650");
        System.out.println(added);
        added = shop.addMedicine("Aspirin");
        System.out.println(added);
        added = shop.addMedicine("Crocin");
        System.out.println(added);
        added = shop.addMedicine("Vicks");
        System.out.println(added);
        added = shop.addMedicine("Benadryl");
        System.out.println(added);
        added = shop.addMedicine("Amoxicillin");
        System.out.println(added);
        added = shop.addMedicine("Cetirizine");
        System.out.println(added);
        added = shop.addMedicine("ORS");
        System.out.println(added);
        added = shop.addMedicine("Insulin");
        System.out.println(added);

        shop.getMedicines();

        String name = shop.getMedicineByName("Dolo 650");
        System.out.println(name + " is available");

        boolean updated = shop.updateMedicineName("Crocin", "Crocin Advance");
        System.out.println(updated);

        shop.getMedicines();

        boolean deleted = shop.deleteMedicine("Vicks");
        System.out.println(deleted);

        shop.getMedicines();
    }
}