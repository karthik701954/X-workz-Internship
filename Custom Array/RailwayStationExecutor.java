class RailwayStationExecutor {

    public static void main(String args[]) {

        RailwayStation trains[] = new RailwayStation[15];

        RailwayStation station1 = new RailwayStation();
        station1.trainId = 1;
        station1.trainName = "Shatabdi Express";
        station1.source = "Bangalore";
        station1.destination = "Chennai";
        station1.ticketPrice = 750;
        trains[0] = station1;

        RailwayStation station2 = new RailwayStation();
        station2.trainId = 2;
        station2.trainName = "Rajdhani Express";
        station2.source = "Delhi";
        station2.destination = "Mumbai";
        station2.ticketPrice = 1500;
        trains[1] = station2;

        RailwayStation station3 = new RailwayStation();
        station3.trainId = 3;
        station3.trainName = "Duronto Express";
        station3.source = "Kolkata";
        station3.destination = "Delhi";
        station3.ticketPrice = 1300;
        trains[2] = station3;

        RailwayStation station4 = new RailwayStation();
        station4.trainId = 4;
        station4.trainName = "Garib Rath";
        station4.source = "Hyderabad";
        station4.destination = "Bangalore";
        station4.ticketPrice = 600;
        trains[3] = station4;

        RailwayStation station5 = new RailwayStation();
        station5.trainId = 5;
        station5.trainName = "Intercity Express";
        station5.source = "Mysore";
        station5.destination = "Bangalore";
        station5.ticketPrice = 150;
        trains[4] = station5;

        RailwayStation station6 = new RailwayStation();
        station6.trainId = 6;
        station6.trainName = "Uday Express";
        station6.source = "Coimbatore";
        station6.destination = "Chennai";
        station6.ticketPrice = 700;
        trains[5] = station6;

        RailwayStation station7 = new RailwayStation();
        station7.trainId = 7;
        station7.trainName = "Vande Bharat";
        station7.source = "Delhi";
        station7.destination = "Varanasi";
        station7.ticketPrice = 1800;
        trains[6] = station7;

        RailwayStation station8 = new RailwayStation();
        station8.trainId = 8;
        station8.trainName = "Jan Shatabdi";
        station8.source = "Pune";
        station8.destination = "Mumbai";
        station8.ticketPrice = 300;
        trains[7] = station8;

        RailwayStation station9 = new RailwayStation();
        station9.trainId = 9;
        station9.trainName = "Tejas Express";
        station9.source = "Lucknow";
        station9.destination = "Delhi";
        station9.ticketPrice = 1200;
        trains[8] = station9;

        RailwayStation station10 = new RailwayStation();
        station10.trainId = 10;
        station10.trainName = "Humsafar Express";
        station10.source = "Ahmedabad";
        station10.destination = "Mumbai";
        station10.ticketPrice = 900;
        trains[9] = station10;

        RailwayStation station11 = new RailwayStation();
        station11.trainId = 11;
        station11.trainName = "Sampark Kranti";
        station11.source = "Bhopal";
        station11.destination = "Delhi";
        station11.ticketPrice = 800;
        trains[10] = station11;

        RailwayStation station12 = new RailwayStation();
        station12.trainId = 12;
        station12.trainName = "Netravati Express";
        station12.source = "Mumbai";
        station12.destination = "Mangalore";
        station12.ticketPrice = 1100;
        trains[11] = station12;

        RailwayStation station13 = new RailwayStation();
        station13.trainId = 13;
        station13.trainName = "Kanyakumari Express";
        station13.source = "Chennai";
        station13.destination = "Kanyakumari";
        station13.ticketPrice = 950;
        trains[12] = station13;

        RailwayStation station14 = new RailwayStation();
        station14.trainId = 14;
        station14.trainName = "Gatimaan Express";
        station14.source = "Delhi";
        station14.destination = "Agra";
        station14.ticketPrice = 1600;
        trains[13] = station14;

        RailwayStation station15 = new RailwayStation();
        station15.trainId = 15;
        station15.trainName = "Konkan Kanya Express";
        station15.source = "Mumbai";
        station15.destination = "Goa";
        station15.ticketPrice = 850;
        trains[14] = station15;


        for (RailwayStation ref : trains) {

            System.out.println("Train Id is :" + ref.trainId);
            System.out.println("Train Name is :" + ref.trainName);
            System.out.println("Source is :" + ref.source);
            System.out.println("Destination is :" + ref.destination);
            System.out.println("Ticket Price is :" + ref.ticketPrice);
            System.out.println("----------------------------------");
        }
    }
}