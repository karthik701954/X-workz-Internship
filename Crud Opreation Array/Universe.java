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

    public String getGalaxyByName(String galaxyName) {
        String name = null;

        for (String galaxy : galaxies) {
            if (galaxy == galaxyName) {
                name = galaxy;
                break;
            }
        }

        if (name == null)
            System.out.println(galaxyName + " is not available");

        return name;
    }

    public boolean updateGalaxy(String existingGalaxy, String updatedGalaxy) {
        boolean isUpdated = false;

        for (int i = 0; i < galaxies.length; i++) {
            if (existingGalaxy == galaxies[i]) {
                galaxies[i] = updatedGalaxy;
                isUpdated = true;
            }
        }

        if (isUpdated == false)
            System.out.println(existingGalaxy + " is not updated");

        return isUpdated;
    }

    public boolean deleteGalaxy(String galaxyName) {
        boolean isDeleted = false;

        for (int i = 0; i < galaxies.length; i++) {
            if (galaxyName == galaxies[i]) {
                galaxies[i] = null;
                isDeleted = true;
            }
        }

        if (isDeleted == false)
            System.out.println(galaxyName + " is not deleted");

        return isDeleted;
    }
}

