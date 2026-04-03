class Universe {
    String galaxies[] = new String[11];
    int index;

    public boolean addGalaxy(String galaxy) {
        boolean isAdded = false;

        if (index < galaxies.length) {
            if (galaxy != null && !galaxy.isEmpty()) {
                galaxies[index++] = galaxy;
                isAdded = true;
            } else {
                System.out.println("This is not valid");
            }
        } else {
            System.out.println("Array is full, Try next time");
        }

        return isAdded;
    }

    public void getGalaxies() {
        for (String galaxy : galaxies) {
            System.out.println(galaxy);
        }
    }
}