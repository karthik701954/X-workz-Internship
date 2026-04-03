class YouTube {
    String videoTitleNames[] = new String[15];
    int index;

    public boolean addVideoTitle(String title) {
        boolean isAdded = false;

        if (index < videoTitleNames.length) {
            if (title != null && !title.isEmpty()) {
                videoTitleNames[index++] = title;
                isAdded = true;
            } else {
                System.out.println("This is not valid");
            }
        } else {
            System.out.println("Array is full, Try next time");
        }

        return isAdded;
    }

    public void getVideoTitles() {
        for (String title : videoTitleNames) {
            System.out.println(title);
        }
    }
}