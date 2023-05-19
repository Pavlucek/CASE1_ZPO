package PublishHouse;
import Books.Book;


public class WydawnictwoPowiesciHistorycznych extends Wydawnictwo {
    public WydawnictwoPowiesciHistorycznych(String author) {
        super(author);
    }

    @Override
    public Book createBook(String title, int pages) {
        return new PowiescHistoryczna(author, title, pages);
    }
}