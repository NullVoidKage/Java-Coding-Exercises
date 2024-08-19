package OOP_EXAM.EXAM;

public class Book {
    String title;
    String author;
    boolean isBorrowed;


    public void willBorrow() {
        if(!isBorrowed) {
            isBorrowed = true;
        }
    }

    public void returnBook() {
        if(isBorrowed) {
            isBorrowed = false;
        }
    }
}


//Book
//String title
//String author
//boolean isBorrowed

//void borrowBook
    //check if isBorrowed is true
    //cannot borrow if isBorrowed true
//void returnBook
    //check if book isBorrowed
    //if true make the isBorrowed as false










