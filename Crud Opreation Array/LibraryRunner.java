class LibraryRunner {
    public static void main(String[] args) {

        Library library = new Library();

        boolean added = library.addBook("Java Programming");
        System.out.println(added);
        added = library.addBook("Python Programming");
        System.out.println(added);
        added = library.addBook("C Programming");
        System.out.println(added);
        added = library.addBook("C++ Programming");
        System.out.println(added);
        added = library.addBook("Data Structures");
        System.out.println(added);
        added = library.addBook("Algorithms");
        System.out.println(added);
        added = library.addBook("Database Management");
        System.out.println(added);
        added = library.addBook("Operating System");
        System.out.println(added);
        added = library.addBook("Computer Networks");
        System.out.println(added);
        added = library.addBook("Software Engineering");
        System.out.println(added);
        added = library.addBook("Machine Learning");
        System.out.println(added);
        added = library.addBook("Artificial Intelligence");
        System.out.println(added);
        added = library.addBook("Cloud Computing");
        System.out.println(added);

        library.getBooks();

        String name = library.getBookByName("Java Programming");
        System.out.println(name + " is available");

        boolean updated = library.updateBookName("C Programming", "C Language");
        System.out.println(updated);

        library.getBooks();

        boolean deleted = library.deleteBook("Algorithms");
        System.out.println(deleted);

        library.getBooks();
    }
}