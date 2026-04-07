class Pasta {
    String pastaNames[] = new String[21];
    int index;

    public boolean addPasta(String pasta) {
        boolean isAdded = false;

        if (index < pastaNames.length) {
            if (pasta != null && !pasta.isEmpty()) {
                pastaNames[index++] = pasta;
                isAdded = true;
            } else {
                System.out.println("This is not valid");
            }
        } else {
            System.out.println("Array is full, Try next time");
        }

        return isAdded;
    }

    public void getPastas() {
        for (String pasta : pastaNames) {
            System.out.println(pasta);
        }
    }

    public String getPastaByName(String pastaName) {
        String name = null;

        for (String pasta : pastaNames) {
            if (pasta == pastaName) {   // same style as your code
                name = pasta;
                break;
            }
        }

        if (name == null)
            System.out.println(pastaName + " is not available");

        return name;
    }

    public boolean updatePasta(String existingPasta, String updatedPasta) {
        boolean isUpdated = false;

        for (int i = 0; i < pastaNames.length; i++) {
            if (existingPasta == pastaNames[i]) {
                pastaNames[i] = updatedPasta;
                isUpdated = true;
            }
        }

        if (!isUpdated)
            System.out.println(existingPasta + " is not updated");

        return isUpdated;
    }

    public boolean deletePasta(String pastaName) {
        boolean isDeleted = false;

        for (int i = 0; i < pastaNames.length; i++) {
            if (pastaName == pastaNames[i]) {
                pastaNames[i] = null;
                isDeleted = true;
            }
        }

        if (!isDeleted)
            System.out.println(pastaName + " is not deleted");

        return isDeleted;
    }
}