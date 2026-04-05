class Hungama {
    String showNames[] = new String[14];
    int index;

    public boolean addShow(String show) {
        boolean isAdded = false;

        if (index < showNames.length) {
            if (show != null && !show.isEmpty()) {
                showNames[index++] = show;
                isAdded = true;
                System.out.println("Total shows added: " + index);
            } else {
                System.out.println("This is not valid");
            }
        } else {
            System.out.println("Array is full, Try next time");
        }

        return isAdded;
    }

    public void getShows() {
        for (String show : showNames) {
            System.out.println(show);
        }
    }

    public String getShowByName(String showName) {
        String name = null;
        for (String show : showNames) {
            if (show == showName) {
                name = show;
                break;
            }
        }
        if (name == null)
            System.out.println(showName + " is not available");

        return name;
    }

    public boolean updateShowName(String existingShowName, String updatedShowName) {
        boolean isUpdated = false;
        for (int i = 0; i < showNames.length; i++) {
            if (existingShowName == showNames[i]) {
                showNames[i] = updatedShowName;
                isUpdated = true;
            }
        }
        if (isUpdated == false)
            System.out.println(existingShowName + " is not updated");

        return isUpdated;
    }

    public boolean deleteShow(String showName) {
        boolean isDeleted = false;
        for (int i = 0; i < showNames.length; i++) {
            if (showName == showNames[i]) {
                showNames[i] = null;
                isDeleted = true;
            }
        }
        if (isDeleted == false)
            System.out.println(showName + " is not deleted");

        return isDeleted;
    }
}