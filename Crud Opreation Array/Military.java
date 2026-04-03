class Military {
    String weaponNames[] = new String[21];
    int index;

    public boolean addWeapon(String weapon) {
        boolean isAdded = false;

        if (index < weaponNames.length) {
            if (weapon != null && !weapon.isEmpty()) {
                weaponNames[index++] = weapon;
                isAdded = true;
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
}