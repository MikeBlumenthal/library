import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book> stock;
    private int capacity;
    private HashMap<String,Integer> genreCount;

    public Library(int capacity){
        this.capacity = capacity;
        this.stock = new ArrayList<>();
        this.genreCount = new HashMap<>();
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

    public void genreCount(){
        for (Book book:stock) {
            String genre = book.getGenre();
            if (!genreCount.containsKey(genre) ){
                genreCount.put(genre, 1);
            }else{
                genreCount.put(genre, genreCount.get(genre)+1);
            }
        }
    }

    public HashMap<String, Integer> getGenreCount() {
        return genreCount;
    }
}
