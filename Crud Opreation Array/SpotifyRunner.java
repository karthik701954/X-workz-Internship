class SpotifyRunner {
    public static void main(String[] args) {

        Spotify sp = new Spotify();

        boolean added = sp.addSong("Arijit Singh", "Tum Hi Ho");
        System.out.println(added);
        added = sp.addSong("Shreya Ghoshal", "Sun Raha Hai");
        System.out.println(added);
        added = sp.addSong("Sid Sriram", "Srivalli");
        System.out.println(added);
        added = sp.addSong("Anirudh", "Why This Kolaveri Di");
        System.out.println(added);
        added = sp.addSong("Neha Kakkar", "Dilbar");
        System.out.println(added);
        added = sp.addSong("Atif Aslam", "Jeene Laga Hoon");
        System.out.println(added);
        added = sp.addSong("Darshan Raval", "Chogada");
        System.out.println(added);
        added = sp.addSong("Badshah", "DJ Waley Babu");
        System.out.println(added);
        added = sp.addSong("Armaan Malik", "Bol Do Na Zara");
        System.out.println(added);
        added = sp.addSong("KK", "Zara Sa");
        System.out.println(added);

        sp.getSongs();

        String name = sp.getSongByName("Srivalli");
        System.out.println(name + " is available");

        boolean updated = sp.updateSong("Dilbar", "Dilbar Remix");
        System.out.println(updated);

        sp.getSongs();

        boolean deleted = sp.deleteSong("Zara Sa");
        System.out.println(deleted);

        sp.getSongs();
    }
}