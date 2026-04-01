class RailwayStationExecutor {

    public static void main(String args[]) {

        RailwayStation ref1 = new RailwayStation();
        ref1.stationId = 1;
        ref1.stationName = "Station1";
        ref1.location = "City1";
        ref1.totalPlatforms = 5;
        ref1.zone = "Zone1";

        Platform p1 = new Platform();
        p1.platformId = 101;
        p1.platformNumber = 1;
        p1.trainName = "Train1";
        p1.arrivalTime = "10:00";
        p1.departureTime = "10:10";

        ref1.platform = p1;
        ref1.getRailwayStationDetails();


        RailwayStation ref2 = new RailwayStation();
        ref2.stationId = 2;
        ref2.stationName = "Station2";
        ref2.location = "City2";
        ref2.totalPlatforms = 6;
        ref2.zone = "Zone2";

        Platform p2 = new Platform();
        p2.platformId = 102;
        p2.platformNumber = 2;
        p2.trainName = "Train2";
        p2.arrivalTime = "11:00";
        p2.departureTime = "11:15";

        ref2.platform = p2;
        ref2.getRailwayStationDetails();


        RailwayStation ref3 = new RailwayStation();
        ref3.stationId = 3;
        ref3.stationName = "Station3";
        ref3.location = "City3";
        ref3.totalPlatforms = 4;
        ref3.zone = "Zone3";

        Platform p3 = new Platform();
        p3.platformId = 103;
        p3.platformNumber = 3;
        p3.trainName = "Train3";
        p3.arrivalTime = "12:00";
        p3.departureTime = "12:20";

        ref3.platform = p3;
        ref3.getRailwayStationDetails();


        RailwayStation ref4 = new RailwayStation();
        ref4.stationId = 4;
        ref4.stationName = "Station4";
        ref4.location = "City4";
        ref4.totalPlatforms = 7;
        ref4.zone = "Zone4";

        Platform p4 = new Platform();
        p4.platformId = 104;
        p4.platformNumber = 4;
        p4.trainName = "Train4";
        p4.arrivalTime = "13:00";
        p4.departureTime = "13:25";

        ref4.platform = p4;
        ref4.getRailwayStationDetails();


        RailwayStation ref5 = new RailwayStation();
        ref5.stationId = 5;
        ref5.stationName = "Station5";
        ref5.location = "City5";
        ref5.totalPlatforms = 8;
        ref5.zone = "Zone5";

        Platform p5 = new Platform();
        p5.platformId = 105;
        p5.platformNumber = 5;
        p5.trainName = "Train5";
        p5.arrivalTime = "14:00";
        p5.departureTime = "14:30";

        ref5.platform = p5;
        ref5.getRailwayStationDetails();
		
		        RailwayStation ref6 = new RailwayStation();
        ref6.stationId = 6;
        ref6.stationName = "Station6";
        ref6.location = "City6";
        ref6.totalPlatforms = 5;
        ref6.zone = "Zone6";

        Platform p6 = new Platform();
        p6.platformId = 106;
        p6.platformNumber = 6;
        p6.trainName = "Train6";
        p6.arrivalTime = "15:00";
        p6.departureTime = "15:10";

        ref6.platform = p6;
        ref6.getRailwayStationDetails();


        RailwayStation ref7 = new RailwayStation();
        ref7.stationId = 7;
        ref7.stationName = "Station7";
        ref7.location = "City7";
        ref7.totalPlatforms = 6;
        ref7.zone = "Zone7";

        Platform p7 = new Platform();
        p7.platformId = 107;
        p7.platformNumber = 7;
        p7.trainName = "Train7";
        p7.arrivalTime = "16:00";
        p7.departureTime = "16:15";

        ref7.platform = p7;
        ref7.getRailwayStationDetails();


        RailwayStation ref8 = new RailwayStation();
        ref8.stationId = 8;
        ref8.stationName = "Station8";
        ref8.location = "City8";
        ref8.totalPlatforms = 4;
        ref8.zone = "Zone8";

        Platform p8 = new Platform();
        p8.platformId = 108;
        p8.platformNumber = 8;
        p8.trainName = "Train8";
        p8.arrivalTime = "17:00";
        p8.departureTime = "17:20";

        ref8.platform = p8;
        ref8.getRailwayStationDetails();


        RailwayStation ref9 = new RailwayStation();
        ref9.stationId = 9;
        ref9.stationName = "Station9";
        ref9.location = "City9";
        ref9.totalPlatforms = 7;
        ref9.zone = "Zone9";

        Platform p9 = new Platform();
        p9.platformId = 109;
        p9.platformNumber = 9;
        p9.trainName = "Train9";
        p9.arrivalTime = "18:00";
        p9.departureTime = "18:25";

        ref9.platform = p9;
        ref9.getRailwayStationDetails();


        RailwayStation ref10 = new RailwayStation();
        ref10.stationId = 10;
        ref10.stationName = "Station10";
        ref10.location = "City10";
        ref10.totalPlatforms = 5;
        ref10.zone = "Zone10";

        Platform p10 = new Platform();
        p10.platformId = 110;
        p10.platformNumber = 10;
        p10.trainName = "Train10";
        p10.arrivalTime = "19:00";
        p10.departureTime = "19:30";

        ref10.platform = p10;
        ref10.getRailwayStationDetails();


        RailwayStation ref11 = new RailwayStation();
        ref11.stationId = 11;
        ref11.stationName = "Station11";
        ref11.location = "City11";
        ref11.totalPlatforms = 6;
        ref11.zone = "Zone11";

        Platform p11 = new Platform();
        p11.platformId = 111;
        p11.platformNumber = 11;
        p11.trainName = "Train11";
        p11.arrivalTime = "20:00";
        p11.departureTime = "20:10";

        ref11.platform = p11;
        ref11.getRailwayStationDetails();


        RailwayStation ref12 = new RailwayStation();
        ref12.stationId = 12;
        ref12.stationName = "Station12";
        ref12.location = "City12";
        ref12.totalPlatforms = 4;
        ref12.zone = "Zone12";

        Platform p12 = new Platform();
        p12.platformId = 112;
        p12.platformNumber = 12;
        p12.trainName = "Train12";
        p12.arrivalTime = "21:00";
        p12.departureTime = "21:20";

        ref12.platform = p12;
        ref12.getRailwayStationDetails();


        RailwayStation ref13 = new RailwayStation();
        ref13.stationId = 13;
        ref13.stationName = "Station13";
        ref13.location = "City13";
        ref13.totalPlatforms = 7;
        ref13.zone = "Zone13";

        Platform p13 = new Platform();
        p13.platformId = 113;
        p13.platformNumber = 13;
        p13.trainName = "Train13";
        p13.arrivalTime = "22:00";
        p13.departureTime = "22:25";

        ref13.platform = p13;
        ref13.getRailwayStationDetails();


        RailwayStation ref14 = new RailwayStation();
        ref14.stationId = 14;
        ref14.stationName = "Station14";
        ref14.location = "City14";
        ref14.totalPlatforms = 5;
        ref14.zone = "Zone14";

        Platform p14 = new Platform();
        p14.platformId = 114;
        p14.platformNumber = 14;
        p14.trainName = "Train14";
        p14.arrivalTime = "23:00";
        p14.departureTime = "23:30";

        ref14.platform = p14;
        ref14.getRailwayStationDetails();


        RailwayStation ref15 = new RailwayStation();
        ref15.stationId = 15;
        ref15.stationName = "Station15";
        ref15.location = "City15";
        ref15.totalPlatforms = 6;
        ref15.zone = "Zone15";

        Platform p15 = new Platform();
        p15.platformId = 115;
        p15.platformNumber = 15;
        p15.trainName = "Train15";
        p15.arrivalTime = "06:00";
        p15.departureTime = "06:10";

        ref15.platform = p15;
        ref15.getRailwayStationDetails();


        RailwayStation ref16 = new RailwayStation();
        ref16.stationId = 16;
        ref16.stationName = "Station16";
        ref16.location = "City16";
        ref16.totalPlatforms = 4;
        ref16.zone = "Zone16";

        Platform p16 = new Platform();
        p16.platformId = 116;
        p16.platformNumber = 16;
        p16.trainName = "Train16";
        p16.arrivalTime = "07:00";
        p16.departureTime = "07:20";

        ref16.platform = p16;
        ref16.getRailwayStationDetails();


        RailwayStation ref17 = new RailwayStation();
        ref17.stationId = 17;
        ref17.stationName = "Station17";
        ref17.location = "City17";
        ref17.totalPlatforms = 7;
        ref17.zone = "Zone17";

        Platform p17 = new Platform();
        p17.platformId = 117;
        p17.platformNumber = 17;
        p17.trainName = "Train17";
        p17.arrivalTime = "08:00";
        p17.departureTime = "08:25";

        ref17.platform = p17;
        ref17.getRailwayStationDetails();


        RailwayStation ref18 = new RailwayStation();
        ref18.stationId = 18;
        ref18.stationName = "Station18";
        ref18.location = "City18";
        ref18.totalPlatforms = 5;
        ref18.zone = "Zone18";

        Platform p18 = new Platform();
        p18.platformId = 118;
        p18.platformNumber = 18;
        p18.trainName = "Train18";
        p18.arrivalTime = "09:00";
        p18.departureTime = "09:30";

        ref18.platform = p18;
        ref18.getRailwayStationDetails();


        RailwayStation ref19 = new RailwayStation();
        ref19.stationId = 19;
        ref19.stationName = "Station19";
        ref19.location = "City19";
        ref19.totalPlatforms = 6;
        ref19.zone = "Zone19";

        Platform p19 = new Platform();
        p19.platformId = 119;
        p19.platformNumber = 19;
        p19.trainName = "Train19";
        p19.arrivalTime = "10:00";
        p19.departureTime = "10:10";

        ref19.platform = p19;
        ref19.getRailwayStationDetails();


        RailwayStation ref20 = new RailwayStation();
        ref20.stationId = 20;
        ref20.stationName = "Station20";
        ref20.location = "City20";
        ref20.totalPlatforms = 4;
        ref20.zone = "Zone20";

        Platform p20 = new Platform();
        p20.platformId = 120;
        p20.platformNumber = 20;
        p20.trainName = "Train20";
        p20.arrivalTime = "11:00";
        p20.departureTime = "11:20";

        ref20.platform = p20;
        ref20.getRailwayStationDetails();


        RailwayStation ref21 = new RailwayStation();
        ref21.stationId = 21;
        ref21.stationName = "Station21";
        ref21.location = "City21";
        ref21.totalPlatforms = 7;
        ref21.zone = "Zone21";

        Platform p21 = new Platform();
        p21.platformId = 121;
        p21.platformNumber = 21;
        p21.trainName = "Train21";
        p21.arrivalTime = "12:00";
        p21.departureTime = "12:25";

        ref21.platform = p21;
        ref21.getRailwayStationDetails();


        RailwayStation ref22 = new RailwayStation();
        ref22.stationId = 22;
        ref22.stationName = "Station22";
        ref22.location = "City22";
        ref22.totalPlatforms = 5;
        ref22.zone = "Zone22";

        Platform p22 = new Platform();
        p22.platformId = 122;
        p22.platformNumber = 22;
        p22.trainName = "Train22";
        p22.arrivalTime = "13:00";
        p22.departureTime = "13:30";

        ref22.platform = p22;
        ref22.getRailwayStationDetails();


        RailwayStation ref23 = new RailwayStation();
        ref23.stationId = 23;
        ref23.stationName = "Station23";
        ref23.location = "City23";
        ref23.totalPlatforms = 6;
        ref23.zone = "Zone23";

        Platform p23 = new Platform();
        p23.platformId = 123;
        p23.platformNumber = 23;
        p23.trainName = "Train23";
        p23.arrivalTime = "14:00";
        p23.departureTime = "14:10";

        ref23.platform = p23;
        ref23.getRailwayStationDetails();


        RailwayStation ref24 = new RailwayStation();
        ref24.stationId = 24;
        ref24.stationName = "Station24";
        ref24.location = "City24";
        ref24.totalPlatforms = 4;
        ref24.zone = "Zone24";

        Platform p24 = new Platform();
        p24.platformId = 124;
        p24.platformNumber = 24;
        p24.trainName = "Train24";
        p24.arrivalTime = "15:00";
        p24.departureTime = "15:20";

        ref24.platform = p24;
        ref24.getRailwayStationDetails();


        RailwayStation ref25 = new RailwayStation();
        ref25.stationId = 25;
        ref25.stationName = "Station25";
        ref25.location = "City25";
        ref25.totalPlatforms = 7;
        ref25.zone = "Zone25";

        Platform p25 = new Platform();
        p25.platformId = 125;
        p25.platformNumber = 25;
        p25.trainName = "Train25";
        p25.arrivalTime = "16:00";
        p25.departureTime = "16:25";

        ref25.platform = p25;
        ref25.getRailwayStationDetails();


        RailwayStation ref26 = new RailwayStation();
        ref26.stationId = 26;
        ref26.stationName = "Station26";
        ref26.location = "City26";
        ref26.totalPlatforms = 5;
        ref26.zone = "Zone26";

        Platform p26 = new Platform();
        p26.platformId = 126;
        p26.platformNumber = 26;
        p26.trainName = "Train26";
        p26.arrivalTime = "17:00";
        p26.departureTime = "17:30";

        ref26.platform = p26;
        ref26.getRailwayStationDetails();


        RailwayStation ref27 = new RailwayStation();
        ref27.stationId = 27;
        ref27.stationName = "Station27";
        ref27.location = "City27";
        ref27.totalPlatforms = 6;
        ref27.zone = "Zone27";

        Platform p27 = new Platform();
        p27.platformId = 127;
        p27.platformNumber = 27;
        p27.trainName = "Train27";
        p27.arrivalTime = "18:00";
        p27.departureTime = "18:10";

        ref27.platform = p27;
        ref27.getRailwayStationDetails();


        RailwayStation ref28 = new RailwayStation();
        ref28.stationId = 28;
        ref28.stationName = "Station28";
        ref28.location = "City28";
        ref28.totalPlatforms = 4;
        ref28.zone = "Zone28";

        Platform p28 = new Platform();
        p28.platformId = 128;
        p28.platformNumber = 28;
        p28.trainName = "Train28";
        p28.arrivalTime = "19:00";
        p28.departureTime = "19:20";

        ref28.platform = p28;
        ref28.getRailwayStationDetails();


        RailwayStation ref29 = new RailwayStation();
        ref29.stationId = 29;
        ref29.stationName = "Station29";
        ref29.location = "City29";
        ref29.totalPlatforms = 7;
        ref29.zone = "Zone29";

        Platform p29 = new Platform();
        p29.platformId = 129;
        p29.platformNumber = 29;
        p29.trainName = "Train29";
        p29.arrivalTime = "20:00";
        p29.departureTime = "20:30";

        ref29.platform = p29;
        ref29.getRailwayStationDetails();
    }
}