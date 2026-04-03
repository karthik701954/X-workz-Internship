class SpotifyRunner {
    public static void main(String[] args) {

        Spotify sp = new Spotify();

        sp.addSong("Arijit Singh", "Tum Hi Ho");
        sp.addSong("Shreya Ghoshal", "Sun Raha Hai");
        sp.addSong("Sid Sriram", "Srivalli");
        sp.addSong("Anirudh", "Why This Kolaveri Di");
        sp.addSong("Neha Kakkar", "Dilbar");
        sp.addSong("Atif Aslam", "Jeene Laga Hoon");
        sp.addSong("Darshan Raval", "Chogada");
        sp.addSong("Badshah", "DJ Waley Babu");
        sp.addSong("Armaan Malik", "Bol Do Na Zara");
        sp.addSong("KK", "Zara Sa");

        sp.getSongs();
    }
}