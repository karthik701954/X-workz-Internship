class SouthIndia {
    String airportNames[] = new String[9];
    int index;

    public boolean addAirport(String airport) {
        boolean isAdded = false;

        if (index < airportNames.length) {
            if (airport != null && !airport.isEmpty()) {
                airportNames[index++] = airport;
                isAdded = true;
            } else {
                System.out.println("This is not valid");
            }
        } else {
            System.out.println("Array is full, Try next time");
        }

        return isAdded;
    }

    public void getAirports() {
        for (String airport : airportNames) {
            System.out.println(airport);
        }
    }
}