class HungamaRunner {
    public static void main(String[] args) {

        Hungama hungama = new Hungama();

        boolean added = hungama.addShow("Doraemon");
        System.out.println(added);
        added = hungama.addShow("Shinchan");
        System.out.println(added);
        added = hungama.addShow("Pokemon");
        System.out.println(added);
        added = hungama.addShow("Oggy and the Cockroaches");
        System.out.println(added);
        added = hungama.addShow("Chhota Bheem");
        System.out.println(added);
        added = hungama.addShow("Motu Patlu");
        System.out.println(added);
        added = hungama.addShow("Tom and Jerry");
        System.out.println(added);
        added = hungama.addShow("Ben 10");
        System.out.println(added);
        added = hungama.addShow("Ninja Hattori");
        System.out.println(added);
        added = hungama.addShow("Perman");
        System.out.println(added);
        added = hungama.addShow("Kiteretsu");
        System.out.println(added);
        added = hungama.addShow("Power Rangers");
        System.out.println(added);
        added = hungama.addShow("Dragon Ball Z");
        System.out.println(added);
        added = hungama.addShow("Mr Bean");
        System.out.println(added);

        hungama.getShows();

        String name = hungama.getShowByName("Doraemon");
        System.out.println(name + " is available");

        boolean updated = hungama.updateShowName("Pokemon", "Pokemon Ultimate");
        System.out.println(updated);

        hungama.getShows();

        boolean deleted = hungama.deleteShow("Mr Bean");
        System.out.println(deleted);

        hungama.getShows();
    }
}