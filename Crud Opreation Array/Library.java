class Library {
    String bookNames[] = new String[13];
    int index;

    public boolean addBook(String book) {
        boolean isAdded = false;

        if (index < bookNames.length) {
            if (book != null && !book.isEmpty()) {
                bookNames[index++] = book;
                isAdded = true;
                System.out.println("Total books added: " + index);
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

    public String getBookByName(String bookName) {
        String name = null;
        for (String book : bookNames) {
            if (book == bookName) {
                name = book;
                break;
            }
        }
        if (name == null)
            System.out.println(bookName + " is not available");

        return name;
    }

    public boolean updateBookName(String existingBookName, String updatedBookName) {
        boolean isUpdated = false;
        for (int i = 0; i < bookNames.length; i++) {
            if (existingBookName == bookNames[i]) {
                bookNames[i] = updatedBookName;
                isUpdated = true;
            }
        }
        if (isUpdated == false)
            System.out.println(existingBookName + " is not updated");

        return isUpdated;
    }

    public boolean deleteBook(String bookName) {
        boolean isDeleted = false;
        for (int i = 0; i < bookNames.length; i++) {
            if (bookName == bookNames[i]) {
                bookNames[i] = null;
                isDeleted = true;
            }
        }
        if (isDeleted == false)
            System.out.println(bookName + " is not deleted");

        return isDeleted;
    }
}