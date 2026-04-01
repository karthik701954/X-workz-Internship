class MovieExecutor {

    public static void main(String args[]) {

        Movie ref1 = new Movie();
        ref1.movieId = 1;
        ref1.movieName = "Movie1";
        ref1.genre = "Action";
        ref1.duration = 120;
        ref1.language = "English";

        Actor a1 = new Actor();
        a1.actorId = 101;
        a1.actorName = "Actor1";
        a1.age = 30;
        a1.role = "Hero";
        a1.nationality = "Indian";

        ref1.actor = a1;
        ref1.getMovieDetails();


        Movie ref2 = new Movie();
        ref2.movieId = 2;
        ref2.movieName = "Movie2";
        ref2.genre = "Comedy";
        ref2.duration = 110;
        ref2.language = "Hindi";

        Actor a2 = new Actor();
        a2.actorId = 102;
        a2.actorName = "Actor2";
        a2.age = 35;
        a2.role = "Comedian";
        a2.nationality = "Indian";

        ref2.actor = a2;
        ref2.getMovieDetails();


        Movie ref3 = new Movie();
        ref3.movieId = 3;
        ref3.movieName = "Movie3";
        ref3.genre = "Drama";
        ref3.duration = 140;
        ref3.language = "Telugu";

        Actor a3 = new Actor();
        a3.actorId = 103;
        a3.actorName = "Actor3";
        a3.age = 28;
        a3.role = "Hero";
        a3.nationality = "Indian";

        ref3.actor = a3;
        ref3.getMovieDetails();


        Movie ref4 = new Movie();
        ref4.movieId = 4;
        ref4.movieName = "Movie4";
        ref4.genre = "Thriller";
        ref4.duration = 130;
        ref4.language = "Tamil";

        Actor a4 = new Actor();
        a4.actorId = 104;
        a4.actorName = "Actor4";
        a4.age = 40;
        a4.role = "Villain";
        a4.nationality = "Indian";

        ref4.actor = a4;
        ref4.getMovieDetails();


        Movie ref5 = new Movie();
        ref5.movieId = 5;
        ref5.movieName = "Movie5";
        ref5.genre = "Romance";
        ref5.duration = 125;
        ref5.language = "Kannada";

        Actor a5 = new Actor();
        a5.actorId = 105;
        a5.actorName = "Actor5";
        a5.age = 27;
        a5.role = "Heroine";
        a5.nationality = "Indian";

        ref5.actor = a5;
        ref5.getMovieDetails();
		
		        Movie ref6 = new Movie();
        ref6.movieId = 6;
        ref6.movieName = "Movie6";
        ref6.genre = "Action";
        ref6.duration = 135;
        ref6.language = "Hindi";

        Actor a6 = new Actor();
        a6.actorId = 106;
        a6.actorName = "Actor6";
        a6.age = 32;
        a6.role = "Hero";
        a6.nationality = "Indian";

        ref6.actor = a6;
        ref6.getMovieDetails();


        Movie ref7 = new Movie();
        ref7.movieId = 7;
        ref7.movieName = "Movie7";
        ref7.genre = "Comedy";
        ref7.duration = 115;
        ref7.language = "English";

        Actor a7 = new Actor();
        a7.actorId = 107;
        a7.actorName = "Actor7";
        a7.age = 36;
        a7.role = "Comedian";
        a7.nationality = "Indian";

        ref7.actor = a7;
        ref7.getMovieDetails();


        Movie ref8 = new Movie();
        ref8.movieId = 8;
        ref8.movieName = "Movie8";
        ref8.genre = "Drama";
        ref8.duration = 145;
        ref8.language = "Telugu";

        Actor a8 = new Actor();
        a8.actorId = 108;
        a8.actorName = "Actor8";
        a8.age = 29;
        a8.role = "Hero";
        a8.nationality = "Indian";

        ref8.actor = a8;
        ref8.getMovieDetails();


        Movie ref9 = new Movie();
        ref9.movieId = 9;
        ref9.movieName = "Movie9";
        ref9.genre = "Thriller";
        ref9.duration = 125;
        ref9.language = "Tamil";

        Actor a9 = new Actor();
        a9.actorId = 109;
        a9.actorName = "Actor9";
        a9.age = 41;
        a9.role = "Villain";
        a9.nationality = "Indian";

        ref9.actor = a9;
        ref9.getMovieDetails();


        Movie ref10 = new Movie();
        ref10.movieId = 10;
        ref10.movieName = "Movie10";
        ref10.genre = "Romance";
        ref10.duration = 120;
        ref10.language = "Kannada";

        Actor a10 = new Actor();
        a10.actorId = 110;
        a10.actorName = "Actor10";
        a10.age = 26;
        a10.role = "Heroine";
        a10.nationality = "Indian";

        ref10.actor = a10;
        ref10.getMovieDetails();


        Movie ref11 = new Movie();
        ref11.movieId = 11;
        ref11.movieName = "Movie11";
        ref11.genre = "Action";
        ref11.duration = 140;
        ref11.language = "Hindi";

        Actor a11 = new Actor();
        a11.actorId = 111;
        a11.actorName = "Actor11";
        a11.age = 34;
        a11.role = "Hero";
        a11.nationality = "Indian";

        ref11.actor = a11;
        ref11.getMovieDetails();


        Movie ref12 = new Movie();
        ref12.movieId = 12;
        ref12.movieName = "Movie12";
        ref12.genre = "Comedy";
        ref12.duration = 110;
        ref12.language = "English";

        Actor a12 = new Actor();
        a12.actorId = 112;
        a12.actorName = "Actor12";
        a12.age = 38;
        a12.role = "Comedian";
        a12.nationality = "Indian";

        ref12.actor = a12;
        ref12.getMovieDetails();


        Movie ref13 = new Movie();
        ref13.movieId = 13;
        ref13.movieName = "Movie13";
        ref13.genre = "Drama";
        ref13.duration = 150;
        ref13.language = "Telugu";

        Actor a13 = new Actor();
        a13.actorId = 113;
        a13.actorName = "Actor13";
        a13.age = 30;
        a13.role = "Hero";
        a13.nationality = "Indian";

        ref13.actor = a13;
        ref13.getMovieDetails();


        Movie ref14 = new Movie();
        ref14.movieId = 14;
        ref14.movieName = "Movie14";
        ref14.genre = "Thriller";
        ref14.duration = 130;
        ref14.language = "Tamil";

        Actor a14 = new Actor();
        a14.actorId = 114;
        a14.actorName = "Actor14";
        a14.age = 42;
        a14.role = "Villain";
        a14.nationality = "Indian";

        ref14.actor = a14;
        ref14.getMovieDetails();


        Movie ref15 = new Movie();
        ref15.movieId = 15;
        ref15.movieName = "Movie15";
        ref15.genre = "Romance";
        ref15.duration = 125;
        ref15.language = "Kannada";

        Actor a15 = new Actor();
        a15.actorId = 115;
        a15.actorName = "Actor15";
        a15.age = 27;
        a15.role = "Heroine";
        a15.nationality = "Indian";

        ref15.actor = a15;
        ref15.getMovieDetails();


        Movie ref16 = new Movie();
        ref16.movieId = 16;
        ref16.movieName = "Movie16";
        ref16.genre = "Action";
        ref16.duration = 138;
        ref16.language = "Hindi";

        Actor a16 = new Actor();
        a16.actorId = 116;
        a16.actorName = "Actor16";
        a16.age = 33;
        a16.role = "Hero";
        a16.nationality = "Indian";

        ref16.actor = a16;
        ref16.getMovieDetails();


        Movie ref17 = new Movie();
        ref17.movieId = 17;
        ref17.movieName = "Movie17";
        ref17.genre = "Comedy";
        ref17.duration = 112;
        ref17.language = "English";

        Actor a17 = new Actor();
        a17.actorId = 117;
        a17.actorName = "Actor17";
        a17.age = 37;
        a17.role = "Comedian";
        a17.nationality = "Indian";

        ref17.actor = a17;
        ref17.getMovieDetails();


        Movie ref18 = new Movie();
        ref18.movieId = 18;
        ref18.movieName = "Movie18";
        ref18.genre = "Drama";
        ref18.duration = 148;
        ref18.language = "Telugu";

        Actor a18 = new Actor();
        a18.actorId = 118;
        a18.actorName = "Actor18";
        a18.age = 31;
        a18.role = "Hero";
        a18.nationality = "Indian";

        ref18.actor = a18;
        ref18.getMovieDetails();


        Movie ref19 = new Movie();
        ref19.movieId = 19;
        ref19.movieName = "Movie19";
        ref19.genre = "Thriller";
        ref19.duration = 128;
        ref19.language = "Tamil";

        Actor a19 = new Actor();
        a19.actorId = 119;
        a19.actorName = "Actor19";
        a19.age = 43;
        a19.role = "Villain";
        a19.nationality = "Indian";

        ref19.actor = a19;
        ref19.getMovieDetails();


        Movie ref20 = new Movie();
        ref20.movieId = 20;
        ref20.movieName = "Movie20";
        ref20.genre = "Romance";
        ref20.duration = 122;
        ref20.language = "Kannada";

        Actor a20 = new Actor();
        a20.actorId = 120;
        a20.actorName = "Actor20";
        a20.age = 25;
        a20.role = "Heroine";
        a20.nationality = "Indian";

        ref20.actor = a20;
        ref20.getMovieDetails();


        Movie ref21 = new Movie();
        ref21.movieId = 21;
        ref21.movieName = "Movie21";
        ref21.genre = "Action";
        ref21.duration = 142;
        ref21.language = "Hindi";

        Actor a21 = new Actor();
        a21.actorId = 121;
        a21.actorName = "Actor21";
        a21.age = 35;
        a21.role = "Hero";
        a21.nationality = "Indian";

        ref21.actor = a21;
        ref21.getMovieDetails();


        Movie ref22 = new Movie();
        ref22.movieId = 22;
        ref22.movieName = "Movie22";
        ref22.genre = "Comedy";
        ref22.duration = 118;
        ref22.language = "English";

        Actor a22 = new Actor();
        a22.actorId = 122;
        a22.actorName = "Actor22";
        a22.age = 39;
        a22.role = "Comedian";
        a22.nationality = "Indian";

        ref22.actor = a22;
        ref22.getMovieDetails();


        Movie ref23 = new Movie();
        ref23.movieId = 23;
        ref23.movieName = "Movie23";
        ref23.genre = "Drama";
        ref23.duration = 152;
        ref23.language = "Telugu";

        Actor a23 = new Actor();
        a23.actorId = 123;
        a23.actorName = "Actor23";
        a23.age = 30;
        a23.role = "Hero";
        a23.nationality = "Indian";

        ref23.actor = a23;
        ref23.getMovieDetails();


        Movie ref24 = new Movie();
        ref24.movieId = 24;
        ref24.movieName = "Movie24";
        ref24.genre = "Thriller";
        ref24.duration = 135;
        ref24.language = "Tamil";

        Actor a24 = new Actor();
        a24.actorId = 124;
        a24.actorName = "Actor24";
        a24.age = 44;
        a24.role = "Villain";
        a24.nationality = "Indian";

        ref24.actor = a24;
        ref24.getMovieDetails();


        Movie ref25 = new Movie();
        ref25.movieId = 25;
        ref25.movieName = "Movie25";
        ref25.genre = "Romance";
        ref25.duration = 128;
        ref25.language = "Kannada";

        Actor a25 = new Actor();
        a25.actorId = 125;
        a25.actorName = "Actor25";
        a25.age = 26;
        a25.role = "Heroine";
        a25.nationality = "Indian";

        ref25.actor = a25;
        ref25.getMovieDetails();


        Movie ref26 = new Movie();
        ref26.movieId = 26;
        ref26.movieName = "Movie26";
        ref26.genre = "Action";
        ref26.duration = 145;
        ref26.language = "Hindi";

        Actor a26 = new Actor();
        a26.actorId = 126;
        a26.actorName = "Actor26";
        a26.age = 36;
        a26.role = "Hero";
        a26.nationality = "Indian";

        ref26.actor = a26;
        ref26.getMovieDetails();


        Movie ref27 = new Movie();
        ref27.movieId = 27;
        ref27.movieName = "Movie27";
        ref27.genre = "Comedy";
        ref27.duration = 120;
        ref27.language = "English";

        Actor a27 = new Actor();
        a27.actorId = 127;
        a27.actorName = "Actor27";
        a27.age = 40;
        a27.role = "Comedian";
        a27.nationality = "Indian";

        ref27.actor = a27;
        ref27.getMovieDetails();


        Movie ref28 = new Movie();
        ref28.movieId = 28;
        ref28.movieName = "Movie28";
        ref28.genre = "Drama";
        ref28.duration = 150;
        ref28.language = "Telugu";

        Actor a28 = new Actor();
        a28.actorId = 128;
        a28.actorName = "Actor28";
        a28.age = 32;
        a28.role = "Hero";
        a28.nationality = "Indian";

        ref28.actor = a28;
        ref28.getMovieDetails();


        Movie ref29 = new Movie();
        ref29.movieId = 29;
        ref29.movieName = "Movie29";
        ref29.genre = "Thriller";
        ref29.duration = 132;
        ref29.language = "Tamil";

        Actor a29 = new Actor();
        a29.actorId = 129;
        a29.actorName = "Actor29";
        a29.age = 45;
        a29.role = "Villain";
        a29.nationality = "Indian";

        ref29.actor = a29;
        ref29.getMovieDetails();
    }
}