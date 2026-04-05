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

    public String getAirportByName(String airportName) {
        String name = null;

        for (String airport : airportNames) {
            if (airport == airportName) {
                name = airport;
                break;
            }
        }

        if (name == null)
            System.out.println(airportName + " is not available");

        return name;
    }

    public boolean updateAirport(String existingAirport, String updatedAirport) {
        boolean isUpdated = false;

        for (int i = 0; i < airportNames.length; i++) {
            if (existingAirport == airportNames[i]) {
                airportNames[i] = updatedAirport;
                isUpdated = true;
            }
        }

        if (isUpdated == false)
            System.out.println(existingAirport + " is not updated");

        return isUpdated;
    }

    public boolean deleteAirport(String airportName) {
        boolean isDeleted = false;

        for (int i = 0; i < airportNames.length; i++) {
            if (airportName == airportNames[i]) {
                airportNames[i] = null;
                isDeleted = true;
            }
        }

        if (isDeleted == false)
            System.out.println(airportName + " is not deleted");

        return isDeleted;
    }
}

