class MovieExecutor {

    public static void main(String args[]) {

        Movie movies[] = new Movie[15];

        Movie movie1 = new Movie();
        movie1.movieId = 1;
        movie1.movieName = "KGF 2";
        movie1.theatreName = "PVR";
        movie1.ticketPrice = 250;
        movie1.showTime = "10:00 AM";
        movies[0] = movie1;

        Movie movie2 = new Movie();
        movie2.movieId = 2;
        movie2.movieName = "RRR";
        movie2.theatreName = "INOX";
        movie2.ticketPrice = 300;
        movie2.showTime = "1:00 PM";
        movies[1] = movie2;

        Movie movie3 = new Movie();
        movie3.movieId = 3;
        movie3.movieName = "Pushpa";
        movie3.theatreName = "Cinepolis";
        movie3.ticketPrice = 220;
        movie3.showTime = "4:00 PM";
        movies[2] = movie3;

        Movie movie4 = new Movie();
        movie4.movieId = 4;
        movie4.movieName = "Jailer";
        movie4.theatreName = "PVR";
        movie4.ticketPrice = 280;
        movie4.showTime = "7:00 PM";
        movies[3] = movie4;

        Movie movie5 = new Movie();
        movie5.movieId = 5;
        movie5.movieName = "Leo";
        movie5.theatreName = "INOX";
        movie5.ticketPrice = 320;
        movie5.showTime = "9:00 PM";
        movies[4] = movie5;

        Movie movie6 = new Movie();
        movie6.movieId = 6;
        movie6.movieName = "Bahubali";
        movie6.theatreName = "Cinepolis";
        movie6.ticketPrice = 250;
        movie6.showTime = "11:00 AM";
        movies[5] = movie6;

        Movie movie7 = new Movie();
        movie7.movieId = 7;
        movie7.movieName = "Salaar";
        movie7.theatreName = "PVR";
        movie7.ticketPrice = 350;
        movie7.showTime = "2:00 PM";
        movies[6] = movie7;

        Movie movie8 = new Movie();
        movie8.movieId = 8;
        movie8.movieName = "Animal";
        movie8.theatreName = "INOX";
        movie8.ticketPrice = 330;
        movie8.showTime = "5:00 PM";
        movies[7] = movie8;

        Movie movie9 = new Movie();
        movie9.movieId = 9;
        movie9.movieName = "Dunki";
        movie9.theatreName = "Cinepolis";
        movie9.ticketPrice = 300;
        movie9.showTime = "8:00 PM";
        movies[8] = movie9;

        Movie movie10 = new Movie();
        movie10.movieId = 10;
        movie10.movieName = "Pathaan";
        movie10.theatreName = "PVR";
        movie10.ticketPrice = 280;
        movie10.showTime = "10:30 AM";
        movies[9] = movie10;

        Movie movie11 = new Movie();
        movie11.movieId = 11;
        movie11.movieName = "Jawan";
        movie11.theatreName = "INOX";
        movie11.ticketPrice = 310;
        movie11.showTime = "1:30 PM";
        movies[10] = movie11;

        Movie movie12 = new Movie();
        movie12.movieId = 12;
        movie12.movieName = "War";
        movie12.theatreName = "Cinepolis";
        movie12.ticketPrice = 260;
        movie12.showTime = "4:30 PM";
        movies[11] = movie12;

        Movie movie13 = new Movie();
        movie13.movieId = 13;
        movie13.movieName = "Tiger 3";
        movie13.theatreName = "PVR";
        movie13.ticketPrice = 340;
        movie13.showTime = "7:30 PM";
        movies[12] = movie13;

        Movie movie14 = new Movie();
        movie14.movieId = 14;
        movie14.movieName = "Avengers";
        movie14.theatreName = "INOX";
        movie14.ticketPrice = 400;
        movie14.showTime = "9:30 PM";
        movies[13] = movie14;

        Movie movie15 = new Movie();
        movie15.movieId = 15;
        movie15.movieName = "Spider-Man";
        movie15.theatreName = "Cinepolis";
        movie15.ticketPrice = 380;
        movie15.showTime = "6:00 PM";
        movies[14] = movie15;


        for (Movie ref : movies) {

            System.out.println("Movie Id is :" + ref.movieId);
            System.out.println("Movie Name is :" + ref.movieName);
            System.out.println("Theatre Name is :" + ref.theatreName);
            System.out.println("Ticket Price is :" + ref.ticketPrice);
            System.out.println("Show Time is :" + ref.showTime);
            System.out.println("----------------------------------");
        }
    }
}