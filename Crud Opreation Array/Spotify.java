class Spotify {
    String artistNames[] = new String[10];
    String songNames[] = new String[10];
    int index;

    public boolean addSong(String artist, String song) {
        boolean isAdded = false;

        if (index < artistNames.length && index < songNames.length) {
            if (artist != null && !artist.isEmpty() && song != null && !song.isEmpty()) {
                artistNames[index] = artist;
                songNames[index] = song;
                index++;
                isAdded = true;
            } else {
                System.out.println("Invalid artist or song");
            }
        } else {
            System.out.println("Array is full, Try next time");
        }

        return isAdded;
    }

    public void getSongs() {
        for (int i = 0; i < artistNames.length; i++) {
            System.out.println("Artist: " + artistNames[i] + " | Song: " + songNames[i]);
        }
    }

    public String getSongByName(String songName) {
        String name = null;

        for (int i = 0; i < songNames.length; i++) {
            if (songNames[i] == songName) {
                name = songNames[i];
                break;
            }
        }

        if (name == null)
            System.out.println(songName + " is not available");

        return name;
    }

    public boolean updateSong(String existingSong, String updatedSong) {
        boolean isUpdated = false;

        for (int i = 0; i < songNames.length; i++) {
            if (songNames[i] == existingSong) {
                songNames[i] = updatedSong;
                isUpdated = true;
            }
        }

        if (isUpdated == false)
            System.out.println(existingSong + " is not updated");

        return isUpdated;
    }

    public boolean deleteSong(String songName) {
        boolean isDeleted = false;

        for (int i = 0; i < songNames.length; i++) {
            if (songNames[i] == songName) {
                songNames[i] = null;
                artistNames[i] = null;
                isDeleted = true;
            }
        }

        if (isDeleted == false)
            System.out.println(songName + " is not deleted");

        return isDeleted;
    }
}

