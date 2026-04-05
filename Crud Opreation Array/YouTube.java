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

    public String getVideoTitleByName(String titleName) {
        String name = null;

        for (String title : videoTitleNames) {
            if (title == titleName) {
                name = title;
                break;
            }
        }

        if (name == null)
            System.out.println(titleName + " is not available");

        return name;
    }

    public boolean updateVideoTitle(String existingTitle, String updatedTitle) {
        boolean isUpdated = false;

        for (int i = 0; i < videoTitleNames.length; i++) {
            if (existingTitle == videoTitleNames[i]) {
                videoTitleNames[i] = updatedTitle;
                isUpdated = true;
            }
        }

        if (isUpdated == false)
            System.out.println(existingTitle + " is not updated");

        return isUpdated;
    }

    public boolean deleteVideoTitle(String titleName) {
        boolean isDeleted = false;

        for (int i = 0; i < videoTitleNames.length; i++) {
            if (titleName == videoTitleNames[i]) {
                videoTitleNames[i] = null;
                isDeleted = true;
            }
        }

        if (isDeleted == false)
            System.out.println(titleName + " is not deleted");

        return isDeleted;
    }
}

