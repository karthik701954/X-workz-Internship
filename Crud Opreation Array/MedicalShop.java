class MedicalShop {
    String medicineNames[] = new String[10];
    int index;

    public boolean addMedicine(String medicine) {
        boolean isAdded = false;

        if (index < medicineNames.length) {
            if (medicine != null && !medicine.isEmpty()) {
                medicineNames[index++] = medicine;
                isAdded = true;
            } else {
                System.out.println("This is not valid");
            }
        } else {
            System.out.println("Array is full, Try next time");
        }

        return isAdded;
    }

    public void getMedicines() {
        for (String medicine : medicineNames) {
            System.out.println(medicine);
        }
    }
}