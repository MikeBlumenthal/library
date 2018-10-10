import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> books;

    public void Borrower(){
        this.books = new ArrayList<>();
    }


    public int bookCount() {
        return books.size();
    }

    public void borrowBook(Library library) {

        books.add(library.takeBook());
    }
}
