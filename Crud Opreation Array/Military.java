class Military {
    String weaponNames[] = new String[21];
    int index;

    public boolean addWeapon(String weapon) {
        boolean isAdded = false;

        if (index < weaponNames.length) {
            if (weapon != null && !weapon.isEmpty()) {
                weaponNames[index++] = weapon;
                isAdded = true;
                System.out.println("Total weapons added: " + index);
            } else {
                System.out.println("This is not valid");
            }
        } else {
            System.out.println("Array is full, Try next time");
        }

        return isAdded;
    }

    public void getWeapons() {
        for (String weapon : weaponNames) {
            System.out.println(weapon);
        }
    }

    public String getWeaponByName(String weaponName) {
        String name = null;
        for (String weapon : weaponNames) {
            if (weapon == weaponName) {
                name = weapon;
                break;
            }
        }
        if (name == null)
            System.out.println(weaponName + " is not available");

        return name;
    }

    public boolean updateWeaponName(String existingWeaponName, String updatedWeaponName) {
        boolean isUpdated = false;
        for (int i = 0; i < weaponNames.length; i++) {
            if (existingWeaponName == weaponNames[i]) {
                weaponNames[i] = updatedWeaponName;
                isUpdated = true;
            }
        }
        if (isUpdated == false)
            System.out.println(existingWeaponName + " is not updated");

        return isUpdated;
    }

    public boolean deleteWeapon(String weaponName) {
        boolean isDeleted = false;
        for (int i = 0; i < weaponNames.length; i++) {
            if (weaponName == weaponNames[i]) {
                weaponNames[i] = null;
                isDeleted = true;
            }
        }
        if (isDeleted == false)
            System.out.println(weaponName + " is not deleted");

        return isDeleted;
    }
}