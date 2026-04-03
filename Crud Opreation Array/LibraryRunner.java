class LibraryRunner {
    public static void main(String[] args) {

        Library lib = new Library();

        lib.addBook("Java Programming");
        lib.addBook("Python Basics");
        lib.addBook("Data Structures");
        lib.addBook("Operating Systems");
        lib.addBook("Computer Networks");
        lib.addBook("DBMS");
        lib.addBook("Software Engineering");
        lib.addBook("Artificial Intelligence");
        lib.addBook("Machine Learning");
        lib.addBook("Cloud Computing");
        lib.addBook("Cyber Security");
        lib.addBook("Web Development");
        lib.addBook("C Programming");

        lib.getBooks();
    }
}