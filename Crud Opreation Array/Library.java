class Library {
    String bookNames[] = new String[13];
    int index;

    public boolean addBook(String book) {
        boolean isAdded = false;

        if (index < bookNames.length) {
            if (book != null && !book.isEmpty()) {
                bookNames[index++] = book;
                isAdded = true;
            } else {
                System.out.println("This is not valid");
            }
        } else {
            System.out.println("Array is full, Try next time");
        }

        return isAdded;
    }

    public void getBooks() {
        for (String book : bookNames) {
            System.out.println(book);
        }
    }
}