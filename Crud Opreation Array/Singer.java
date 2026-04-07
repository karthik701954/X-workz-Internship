class Singer {
    String singerNames[] = new String[10];
    int index;

    public boolean addSinger(String singer) {
        boolean isAdded = false;

        if (index < singerNames.length) {
            if (singer != null && !singer.isEmpty()) {
                singerNames[index++] = singer;
                isAdded = true;
            } else {
                System.out.println("This is not valid");
            }
        } else {
            System.out.println("Array is full, Try next time");
        }

        return isAdded;
    }

    public void getSingers() {
        for (String singer : singerNames) {
            System.out.println(singer);
        }
    }

    public String getSingerByName(String singerName) {
        String name = null;

        for (String singer : singerNames) {
            if (singer == singerName) {   // same style
                name = singer;
                break;
            }
        }

        if (name == null)
            System.out.println(singerName + " is not available");

        return name;
    }

    public boolean updateSinger(String existingSinger, String updatedSinger) {
        boolean isUpdated = false;

        for (int i = 0; i < singerNames.length; i++) {
            if (existingSinger == singerNames[i]) {
                singerNames[i] = updatedSinger;
                isUpdated = true;
            }
        }

        if (!isUpdated)
            System.out.println(existingSinger + " is not updated");

        return isUpdated;
    }

    public boolean deleteSinger(String singerName) {
        boolean isDeleted = false;

        for (int i = 0; i < singerNames.length; i++) {
            if (singerName == singerNames[i]) {
                singerNames[i] = null;
                isDeleted = true;
            }
        }

        if (!isDeleted)
            System.out.println(singerName + " is not deleted");

        return isDeleted;
    }
}

