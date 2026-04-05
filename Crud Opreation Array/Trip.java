class Trip {
    String places[] = new String[13];
    int index;

    public boolean addPlace(String place) {
        boolean isAdded = false;

        if (index < places.length) {
            if (place != null && !place.isEmpty()) {
                places[index++] = place;
                isAdded = true;
            } else {
                System.out.println("This is not valid");
            }
        } else {
            System.out.println("Array is full, Try next time");
        }

        return isAdded;
    }

    public void getPlaces() {
        for (String place : places) {
            System.out.println(place);
        }
    }

    public String getPlaceByName(String placeName) {
        String name = null;

        for (String place : places) {
            if (place == placeName) {
                name = place;
                break;
            }
        }

        if (name == null)
            System.out.println(placeName + " is not available");

        return name;
    }

    public boolean updatePlace(String existingPlace, String updatedPlace) {
        boolean isUpdated = false;

        for (int i = 0; i < places.length; i++) {
            if (existingPlace == places[i]) {
                places[i] = updatedPlace;
                isUpdated = true;
            }
        }

        if (isUpdated == false)
            System.out.println(existingPlace + " is not updated");

        return isUpdated;
    }

    public boolean deletePlace(String placeName) {
        boolean isDeleted = false;

        for (int i = 0; i < places.length; i++) {
            if (placeName == places[i]) {
                places[i] = null;
                isDeleted = true;
            }
        }

        if (isDeleted == false)
            System.out.println(placeName + " is not deleted");

        return isDeleted;
    }
}

