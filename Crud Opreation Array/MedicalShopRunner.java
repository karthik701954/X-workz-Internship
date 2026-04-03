class MedicalShopRunner {
    public static void main(String[] args) {

        MedicalShop ms = new MedicalShop();

        ms.addMedicine("Paracetamol");
        ms.addMedicine("Ibuprofen");
        ms.addMedicine("Aspirin");
        ms.addMedicine("Amoxicillin");
        ms.addMedicine("Cetirizine");
        ms.addMedicine("Metformin");
        ms.addMedicine("Omeprazole");
        ms.addMedicine("Azithromycin");
        ms.addMedicine("Dolo 650");
        ms.addMedicine("Vitamin C");

        ms.getMedicines();
    }
}