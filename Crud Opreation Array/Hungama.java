class Hungama {
    String showNames[] = new String[14];
    int index;

    public boolean addShow(String show) {
        boolean isAdded = false;

        if (index < showNames.length) {
            if (show != null && !show.isEmpty()) {
                showNames[index++] = show;
                isAdded = true;
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
}