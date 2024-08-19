package OOP_EXAM;

class Book {
    String title;
    boolean isBorrowed;

    Book(String title) {
        this.title = title;
        this.isBorrowed = false;
    }

    public void borrowBook() {
        if (!isBorrowed) {
            isBorrowed = true;
        } else {
            System.out.println("Book is already borrowed");
        }
    }

    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
        } else {
            System.out.println("Book was not borrowed");
        }
    }

    @Override
    public String toString() {
        return title + " (" + (isBorrowed ? "borrowed" : "available") + ")";
    }
}

