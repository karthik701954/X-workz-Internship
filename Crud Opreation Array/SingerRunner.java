class SingerRunner {
    public static void main(String[] args) {

        Singer singer = new Singer();

        boolean added = singer.addSinger("Arijit Singh");
        System.out.println(added);

        added = singer.addSinger("Shreya Ghoshal");
        System.out.println(added);

        added = singer.addSinger("Sonu Nigam");
        System.out.println(added);

        added = singer.addSinger("Lata Mangeshkar");
        System.out.println(added);

        added = singer.addSinger("Kishore Kumar");
        System.out.println(added);

        added = singer.addSinger("Neha Kakkar");
        System.out.println(added);

        added = singer.addSinger("Armaan Malik");
        System.out.println(added);

        added = singer.addSinger("Sid Sriram");
        System.out.println(added);

        added = singer.addSinger("SP Balasubrahmanyam");
        System.out.println(added);

        added = singer.addSinger("KK");
        System.out.println(added);

        singer.getSingers();

        String name = singer.getSingerByName("Sonu Nigam");
        System.out.println(name + " is available");

        boolean updated = singer.updateSinger("Neha Kakkar", "Neha Sharma");
        System.out.println(updated);

        singer.getSingers();

        boolean deleted = singer.deleteSinger("Arijit Singh");
        System.out.println(deleted);

        singer.getSingers();
    }
}