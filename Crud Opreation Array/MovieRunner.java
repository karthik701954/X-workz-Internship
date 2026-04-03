class MovieRunner {
    public static void main(String[] args) {

        Movie movie = new Movie();

        movie.addCast("Actor 1");
        movie.addCast("Actor 2");
        movie.addCast("Actor 3");
        movie.addCast("Actor 4");
        movie.addCast("Actor 5");
        movie.addCast("Actor 6");
        movie.addCast("Actor 7");
        movie.addCast("Actor 8");
        movie.addCast("Actor 9");

        movie.getCasts();
    }
}