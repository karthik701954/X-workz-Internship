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
        for (int i = 0; i < index; i++) {
            System.out.println("Artist: " + artistNames[i] + " | Song: " + songNames[i]);
        }
    }
}