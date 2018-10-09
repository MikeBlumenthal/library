import java.util.ArrayList;

public class Library {
    private ArrayList<Book> stock;
    private int capacity;

    public Library(int capacity){
        this.capacity = capacity;
        this.stock = new ArrayList<>();
    }

    public int bookCount() {
        return stock.size();
    }

    public void addBook(Book book) {
        if (!checkIsFull()) stock.add(book);
    }

    public boolean checkIsFull(){
        return bookCount()>=capacity;
    }

}
