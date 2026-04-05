class MedicalShop {
    String medicineNames[] = new String[10];
    int index;

    public boolean addMedicine(String medicine) {
        boolean isAdded = false;

        if (index < medicineNames.length) {
            if (medicine != null && !medicine.isEmpty()) {
                medicineNames[index++] = medicine;
                isAdded = true;
                System.out.println("Total medicines added: " + index);
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

    public String getMedicineByName(String medicineName) {
        String name = null;
        for (String medicine : medicineNames) {
            if (medicine == medicineName) {
                name = medicine;
                break;
            }
        }
        if (name == null)
            System.out.println(medicineName + " is not available");

        return name;
    }

    public boolean updateMedicineName(String existingMedicineName, String updatedMedicineName) {
        boolean isUpdated = false;
        for (int i = 0; i < medicineNames.length; i++) {
            if (existingMedicineName == medicineNames[i]) {
                medicineNames[i] = updatedMedicineName;
                isUpdated = true;
            }
        }
        if (isUpdated == false)
            System.out.println(existingMedicineName + " is not updated");

        return isUpdated;
    }

    public boolean deleteMedicine(String medicineName) {
        boolean isDeleted = false;
        for (int i = 0; i < medicineNames.length; i++) {
            if (medicineName == medicineNames[i]) {
                medicineNames[i] = null;
                isDeleted = true;
            }
        }
        if (isDeleted == false)
            System.out.println(medicineName + " is not deleted");

        return isDeleted;
    }
}