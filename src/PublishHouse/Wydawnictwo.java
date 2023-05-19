package PublishHouse;

import Books.Book;

public abstract class Wydawnictwo {
    protected String author;

    public Wydawnictwo(String author) {
        this.author = author;
    }

    public abstract Book createBook(String title, int pages);

    public static Wydawnictwo getWydawnictwo(String author) {
        if (author.equals("Adam Mickiewicz")) {
            return new WydawnictwoPoematow(author);
        } else if (author.equals("Stephen King")) {
            return new WydawnictwoThrillerow(author);
        } else if (author.equals("Henryk Sienkiewicz")) {
            return new WydawnictwoPowiesciHistorycznych(author);
        } else {
            throw new IllegalArgumentException("Nieznany autor");
        }
    }
}