class TouristPlaceExecutor {

    public static void main(String args[]) {

        TouristPlace places[] = new TouristPlace[15];

        TouristPlace place1 = new TouristPlace();
        place1.placeId = 1;
        place1.placeName = "Taj Mahal";
        place1.location = "Agra";
        place1.type = "Historical";
        place1.entryFee = 50;
        places[0] = place1;

        TouristPlace place2 = new TouristPlace();
        place2.placeId = 2;
        place2.placeName = "Mysore Palace";
        place2.location = "Mysore";
        place2.type = "Historical";
        place2.entryFee = 100;
        places[1] = place2;

        TouristPlace place3 = new TouristPlace();
        place3.placeId = 3;
        place3.placeName = "Goa Beach";
        place3.location = "Goa";
        place3.type = "Beach";
        place3.entryFee = 0;
        places[2] = place3;

        TouristPlace place4 = new TouristPlace();
        place4.placeId = 4;
        place4.placeName = "Charminar";
        place4.location = "Hyderabad";
        place4.type = "Historical";
        place4.entryFee = 25;
        places[3] = place4;

        TouristPlace place5 = new TouristPlace();
        place5.placeId = 5;
        place5.placeName = "India Gate";
        place5.location = "Delhi";
        place5.type = "Monument";
        place5.entryFee = 0;
        places[4] = place5;

        TouristPlace place6 = new TouristPlace();
        place6.placeId = 6;
        place6.placeName = "Ooty Hills";
        place6.location = "Ooty";
        place6.type = "Hill Station";
        place6.entryFee = 20;
        places[5] = place6;

        TouristPlace place7 = new TouristPlace();
        place7.placeId = 7;
        place7.placeName = "Coorg";
        place7.location = "Karnataka";
        place7.type = "Hill Station";
        place7.entryFee = 0;
        places[6] = place7;

        TouristPlace place8 = new TouristPlace();
        place8.placeId = 8;
        place8.placeName = "Hampi";
        place8.location = "Karnataka";
        place8.type = "Historical";
        place8.entryFee = 40;
        places[7] = place8;

        TouristPlace place9 = new TouristPlace();
        place9.placeId = 9;
        place9.placeName = "Kerala Backwaters";
        place9.location = "Kerala";
        place9.type = "Nature";
        place9.entryFee = 100;
        places[8] = place9;

        TouristPlace place10 = new TouristPlace();
        place10.placeId = 10;
        place10.placeName = "Golden Temple";
        place10.location = "Amritsar";
        place10.type = "Religious";
        place10.entryFee = 0;
        places[9] = place10;

        TouristPlace place11 = new TouristPlace();
        place11.placeId = 11;
        place11.placeName = "Red Fort";
        place11.location = "Delhi";
        place11.type = "Historical";
        place11.entryFee = 35;
        places[10] = place11;

        TouristPlace place12 = new TouristPlace();
        place12.placeId = 12;
        place12.placeName = "Ladakh";
        place12.location = "Jammu & Kashmir";
        place12.type = "Adventure";
        place12.entryFee = 0;
        places[11] = place12;

        TouristPlace place13 = new TouristPlace();
        place13.placeId = 13;
        place13.placeName = "Ajanta Caves";
        place13.location = "Maharashtra";
        place13.type = "Historical";
        place13.entryFee = 30;
        places[12] = place13;

        TouristPlace place14 = new TouristPlace();
        place14.placeId = 14;
        place14.placeName = "Meenakshi Temple";
        place14.location = "Madurai";
        place14.type = "Religious";
        place14.entryFee = 0;
        places[13] = place14;

        TouristPlace place15 = new TouristPlace();
        place15.placeId = 15;
        place15.placeName = "Statue of Unity";
        place15.location = "Gujarat";
        place15.type = "Monument";
        place15.entryFee = 150;
        places[14] = place15;


        for (TouristPlace ref : places) {

            System.out.println("Place Id is :" + ref.placeId);
            System.out.println("Place Name is :" + ref.placeName);
            System.out.println("Location is :" + ref.location);
            System.out.println("Type is :" + ref.type);
            System.out.println("Entry Fee is :" + ref.entryFee);
            System.out.println("----------------------------------");
        }
    }
}