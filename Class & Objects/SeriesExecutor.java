class SeriesExecutor {

    public static void main(String args[]) {

        GuestSeries ref1 = new GuestSeries();
        ref1.seriesId = 1;
        ref1.seriesName = "Series1";
        ref1.genre = "Drama";
        ref1.seasons = 2;
        ref1.platform = "Platform1";

        Episode e1 = new Episode();
        e1.episodeId = 101;
        e1.title = "Episode1";
        e1.duration = 45;
        e1.releaseDate = "2024-01-01";
        e1.rating = "4.5";

        ref1.episode = e1;
        ref1.getSeriesDetails();


        GuestSeries ref2 = new GuestSeries();
        ref2.seriesId = 2;
        ref2.seriesName = "Series2";
        ref2.genre = "Action";
        ref2.seasons = 3;
        ref2.platform = "Platform2";

        Episode e2 = new Episode();
        e2.episodeId = 102;
        e2.title = "Episode2";
        e2.duration = 50;
        e2.releaseDate = "2024-02-01";
        e2.rating = "4.2";

        ref2.episode = e2;
        ref2.getSeriesDetails();


        GuestSeries ref3 = new GuestSeries();
        ref3.seriesId = 3;
        ref3.seriesName = "Series3";
        ref3.genre = "Comedy";
        ref3.seasons = 1;
        ref3.platform = "Platform3";

        Episode e3 = new Episode();
        e3.episodeId = 103;
        e3.title = "Episode3";
        e3.duration = 40;
        e3.releaseDate = "2024-03-01";
        e3.rating = "4.0";

        ref3.episode = e3;
        ref3.getSeriesDetails();


        GuestSeries ref4 = new GuestSeries();
        ref4.seriesId = 4;
        ref4.seriesName = "Series4";
        ref4.genre = "Thriller";
        ref4.seasons = 2;
        ref4.platform = "Platform4";

        Episode e4 = new Episode();
        e4.episodeId = 104;
        e4.title = "Episode4";
        e4.duration = 55;
        e4.releaseDate = "2024-04-01";
        e4.rating = "4.7";

        ref4.episode = e4;
        ref4.getSeriesDetails();


        GuestSeries ref5 = new GuestSeries();
        ref5.seriesId = 5;
        ref5.seriesName = "Series5";
        ref5.genre = "Sci-Fi";
        ref5.seasons = 4;
        ref5.platform = "Platform5";

        Episode e5 = new Episode();
        e5.episodeId = 105;
        e5.title = "Episode5";
        e5.duration = 60;
        e5.releaseDate = "2024-05-01";
        e5.rating = "4.8";

        ref5.episode = e5;
        ref5.getSeriesDetails();
		
		        GuestSeries ref6 = new GuestSeries();
        ref6.seriesId = 6;
        ref6.seriesName = "Series6";
        ref6.genre = "Drama";
        ref6.seasons = 2;
        ref6.platform = "Platform6";

        Episode e6 = new Episode();
        e6.episodeId = 106;
        e6.title = "Episode6";
        e6.duration = 45;
        e6.releaseDate = "2024-06-01";
        e6.rating = "4.1";

        ref6.episode = e6;
        ref6.getSeriesDetails();


        GuestSeries ref7 = new GuestSeries();
        ref7.seriesId = 7;
        ref7.seriesName = "Series7";
        ref7.genre = "Action";
        ref7.seasons = 3;
        ref7.platform = "Platform7";

        Episode e7 = new Episode();
        e7.episodeId = 107;
        e7.title = "Episode7";
        e7.duration = 50;
        e7.releaseDate = "2024-07-01";
        e7.rating = "4.3";

        ref7.episode = e7;
        ref7.getSeriesDetails();


        GuestSeries ref8 = new GuestSeries();
        ref8.seriesId = 8;
        ref8.seriesName = "Series8";
        ref8.genre = "Comedy";
        ref8.seasons = 1;
        ref8.platform = "Platform8";

        Episode e8 = new Episode();
        e8.episodeId = 108;
        e8.title = "Episode8";
        e8.duration = 40;
        e8.releaseDate = "2024-08-01";
        e8.rating = "4.0";

        ref8.episode = e8;
        ref8.getSeriesDetails();


        GuestSeries ref9 = new GuestSeries();
        ref9.seriesId = 9;
        ref9.seriesName = "Series9";
        ref9.genre = "Thriller";
        ref9.seasons = 2;
        ref9.platform = "Platform9";

        Episode e9 = new Episode();
        e9.episodeId = 109;
        e9.title = "Episode9";
        e9.duration = 55;
        e9.releaseDate = "2024-09-01";
        e9.rating = "4.6";

        ref9.episode = e9;
        ref9.getSeriesDetails();


        GuestSeries ref10 = new GuestSeries();
        ref10.seriesId = 10;
        ref10.seriesName = "Series10";
        ref10.genre = "Sci-Fi";
        ref10.seasons = 4;
        ref10.platform = "Platform10";

        Episode e10 = new Episode();
        e10.episodeId = 110;
        e10.title = "Episode10";
        e10.duration = 60;
        e10.releaseDate = "2024-10-01";
        e10.rating = "4.9";

        ref10.episode = e10;
        ref10.getSeriesDetails();


        GuestSeries ref11 = new GuestSeries();
        ref11.seriesId = 11;
        ref11.seriesName = "Series11";
        ref11.genre = "Drama";
        ref11.seasons = 2;
        ref11.platform = "Platform11";

        Episode e11 = new Episode();
        e11.episodeId = 111;
        e11.title = "Episode11";
        e11.duration = 48;
        e11.releaseDate = "2024-11-01";
        e11.rating = "4.2";

        ref11.episode = e11;
        ref11.getSeriesDetails();


        GuestSeries ref12 = new GuestSeries();
        ref12.seriesId = 12;
        ref12.seriesName = "Series12";
        ref12.genre = "Action";
        ref12.seasons = 3;
        ref12.platform = "Platform12";

        Episode e12 = new Episode();
        e12.episodeId = 112;
        e12.title = "Episode12";
        e12.duration = 52;
        e12.releaseDate = "2024-12-01";
        e12.rating = "4.4";

        ref12.episode = e12;
        ref12.getSeriesDetails();


        GuestSeries ref13 = new GuestSeries();
        ref13.seriesId = 13;
        ref13.seriesName = "Series13";
        ref13.genre = "Comedy";
        ref13.seasons = 1;
        ref13.platform = "Platform13";

        Episode e13 = new Episode();
        e13.episodeId = 113;
        e13.title = "Episode13";
        e13.duration = 42;
        e13.releaseDate = "2025-01-01";
        e13.rating = "4.1";

        ref13.episode = e13;
        ref13.getSeriesDetails();


        GuestSeries ref14 = new GuestSeries();
        ref14.seriesId = 14;
        ref14.seriesName = "Series14";
        ref14.genre = "Thriller";
        ref14.seasons = 2;
        ref14.platform = "Platform14";

        Episode e14 = new Episode();
        e14.episodeId = 114;
        e14.title = "Episode14";
        e14.duration = 57;
        e14.releaseDate = "2025-02-01";
        e14.rating = "4.7";

        ref14.episode = e14;
        ref14.getSeriesDetails();


        GuestSeries ref15 = new GuestSeries();
        ref15.seriesId = 15;
        ref15.seriesName = "Series15";
        ref15.genre = "Sci-Fi";
        ref15.seasons = 4;
        ref15.platform = "Platform15";

        Episode e15 = new Episode();
        e15.episodeId = 115;
        e15.title = "Episode15";
        e15.duration = 62;
        e15.releaseDate = "2025-03-01";
        e15.rating = "4.8";

        ref15.episode = e15;
        ref15.getSeriesDetails();


        GuestSeries ref16 = new GuestSeries();
        ref16.seriesId = 16;
        ref16.seriesName = "Series16";
        ref16.genre = "Drama";
        ref16.seasons = 2;
        ref16.platform = "Platform16";

        Episode e16 = new Episode();
        e16.episodeId = 116;
        e16.title = "Episode16";
        e16.duration = 46;
        e16.releaseDate = "2025-04-01";
        e16.rating = "4.3";

        ref16.episode = e16;
        ref16.getSeriesDetails();


        GuestSeries ref17 = new GuestSeries();
        ref17.seriesId = 17;
        ref17.seriesName = "Series17";
        ref17.genre = "Action";
        ref17.seasons = 3;
        ref17.platform = "Platform17";

        Episode e17 = new Episode();
        e17.episodeId = 117;
        e17.title = "Episode17";
        e17.duration = 53;
        e17.releaseDate = "2025-05-01";
        e17.rating = "4.5";

        ref17.episode = e17;
        ref17.getSeriesDetails();


        GuestSeries ref18 = new GuestSeries();
        ref18.seriesId = 18;
        ref18.seriesName = "Series18";
        ref18.genre = "Comedy";
        ref18.seasons = 1;
        ref18.platform = "Platform18";

        Episode e18 = new Episode();
        e18.episodeId = 118;
        e18.title = "Episode18";
        e18.duration = 41;
        e18.releaseDate = "2025-06-01";
        e18.rating = "4.0";

        ref18.episode = e18;
        ref18.getSeriesDetails();


        GuestSeries ref19 = new GuestSeries();
        ref19.seriesId = 19;
        ref19.seriesName = "Series19";
        ref19.genre = "Thriller";
        ref19.seasons = 2;
        ref19.platform = "Platform19";

        Episode e19 = new Episode();
        e19.episodeId = 119;
        e19.title = "Episode19";
        e19.duration = 58;
        e19.releaseDate = "2025-07-01";
        e19.rating = "4.6";

        ref19.episode = e19;
        ref19.getSeriesDetails();


        GuestSeries ref20 = new GuestSeries();
        ref20.seriesId = 20;
        ref20.seriesName = "Series20";
        ref20.genre = "Sci-Fi";
        ref20.seasons = 4;
        ref20.platform = "Platform20";

        Episode e20 = new Episode();
        e20.episodeId = 120;
        e20.title = "Episode20";
        e20.duration = 63;
        e20.releaseDate = "2025-08-01";
        e20.rating = "4.9";

        ref20.episode = e20;
        ref20.getSeriesDetails();


        GuestSeries ref21 = new GuestSeries();
        ref21.seriesId = 21;
        ref21.seriesName = "Series21";
        ref21.genre = "Drama";
        ref21.seasons = 2;
        ref21.platform = "Platform21";

        Episode e21 = new Episode();
        e21.episodeId = 121;
        e21.title = "Episode21";
        e21.duration = 47;
        e21.releaseDate = "2025-09-01";
        e21.rating = "4.2";

        ref21.episode = e21;
        ref21.getSeriesDetails();


        GuestSeries ref22 = new GuestSeries();
        ref22.seriesId = 22;
        ref22.seriesName = "Series22";
        ref22.genre = "Action";
        ref22.seasons = 3;
        ref22.platform = "Platform22";

        Episode e22 = new Episode();
        e22.episodeId = 122;
        e22.title = "Episode22";
        e22.duration = 54;
        e22.releaseDate = "2025-10-01";
        e22.rating = "4.4";

        ref22.episode = e22;
        ref22.getSeriesDetails();


        GuestSeries ref23 = new GuestSeries();
        ref23.seriesId = 23;
        ref23.seriesName = "Series23";
        ref23.genre = "Comedy";
        ref23.seasons = 1;
        ref23.platform = "Platform23";

        Episode e23 = new Episode();
        e23.episodeId = 123;
        e23.title = "Episode23";
        e23.duration = 43;
        e23.releaseDate = "2025-11-01";
        e23.rating = "4.1";

        ref23.episode = e23;
        ref23.getSeriesDetails();


        GuestSeries ref24 = new GuestSeries();
        ref24.seriesId = 24;
        ref24.seriesName = "Series24";
        ref24.genre = "Thriller";
        ref24.seasons = 2;
        ref24.platform = "Platform24";

        Episode e24 = new Episode();
        e24.episodeId = 124;
        e24.title = "Episode24";
        e24.duration = 56;
        e24.releaseDate = "2025-12-01";
        e24.rating = "4.7";

        ref24.episode = e24;
        ref24.getSeriesDetails();


        GuestSeries ref25 = new GuestSeries();
        ref25.seriesId = 25;
        ref25.seriesName = "Series25";
        ref25.genre = "Sci-Fi";
        ref25.seasons = 4;
        ref25.platform = "Platform25";

        Episode e25 = new Episode();
        e25.episodeId = 125;
        e25.title = "Episode25";
        e25.duration = 65;
        e25.releaseDate = "2026-01-01";
        e25.rating = "4.9";

        ref25.episode = e25;
        ref25.getSeriesDetails();


        GuestSeries ref26 = new GuestSeries();
        ref26.seriesId = 26;
        ref26.seriesName = "Series26";
        ref26.genre = "Drama";
        ref26.seasons = 2;
        ref26.platform = "Platform26";

        Episode e26 = new Episode();
        e26.episodeId = 126;
        e26.title = "Episode26";
        e26.duration = 49;
        e26.releaseDate = "2026-02-01";
        e26.rating = "4.3";

        ref26.episode = e26;
        ref26.getSeriesDetails();


        GuestSeries ref27 = new GuestSeries();
        ref27.seriesId = 27;
        ref27.seriesName = "Series27";
        ref27.genre = "Action";
        ref27.seasons = 3;
        ref27.platform = "Platform27";

        Episode e27 = new Episode();
        e27.episodeId = 127;
        e27.title = "Episode27";
        e27.duration = 55;
        e27.releaseDate = "2026-03-01";
        e27.rating = "4.5";

        ref27.episode = e27;
        ref27.getSeriesDetails();


        GuestSeries ref28 = new GuestSeries();
        ref28.seriesId = 28;
        ref28.seriesName = "Series28";
        ref28.genre = "Comedy";
        ref28.seasons = 1;
        ref28.platform = "Platform28";

        Episode e28 = new Episode();
        e28.episodeId = 128;
        e28.title = "Episode28";
        e28.duration = 44;
        e28.releaseDate = "2026-04-01";
        e28.rating = "4.0";

        ref28.episode = e28;
        ref28.getSeriesDetails();


        GuestSeries ref29 = new GuestSeries();
        ref29.seriesId = 29;
        ref29.seriesName = "Series29";
        ref29.genre = "Thriller";
        ref29.seasons = 2;
        ref29.platform = "Platform29";

        Episode e29 = new Episode();
        e29.episodeId = 129;
        e29.title = "Episode29";
        e29.duration = 57;
        e29.releaseDate = "2026-05-01";
        e29.rating = "4.6";

        ref29.episode = e29;
        ref29.getSeriesDetails();
    }
}