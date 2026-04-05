class Movie {
    String casts[] = new String[9];
    int index;

    public boolean addCast(String cast) {
        boolean isAdded = false;

        if (index < casts.length) {
            if (cast != null && !cast.isEmpty()) {
                casts[index++] = cast;
                isAdded = true;
                System.out.println("Total casts added: " + index);
            } else {
                System.out.println("This is not valid");
            }
        } else {
            System.out.println("Array is full, Try next time");
        }

        return isAdded;
    }

    public void getCasts() {
        for (String cast : casts) {
            System.out.println(cast);
        }
    }

    public String getCastByName(String castName) {
        String name = null;
        for (String cast : casts) {
            if (cast == castName) {
                name = cast;
                break;
            }
        }
        if (name == null)
            System.out.println(castName + " is not available");

        return name;
    }

    public boolean updateCastName(String existingCastName, String updatedCastName) {
        boolean isUpdated = false;
        for (int i = 0; i < casts.length; i++) {
            if (existingCastName == casts[i]) {
                casts[i] = updatedCastName;
                isUpdated = true;
            }
        }
        if (isUpdated == false)
            System.out.println(existingCastName + " is not updated");

        return isUpdated;
    }

    public boolean deleteCast(String castName) {
        boolean isDeleted = false;
        for (int i = 0; i < casts.length; i++) {
            if (castName == casts[i]) {
                casts[i] = null;
                isDeleted = true;
            }
        }
        if (isDeleted == false)
            System.out.println(castName + " is not deleted");

        return isDeleted;
    }
}