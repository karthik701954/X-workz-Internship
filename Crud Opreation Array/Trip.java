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
}