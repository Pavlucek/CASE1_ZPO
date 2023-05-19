package table;

import Books.Book;
import Books.DecorativeCoverBook;

public class Main
{
    public static void main(String[] args)
    {
        try {
            LibraryFacade libraryFacade = new LibraryFacade();
        } catch (TableException e) {
            throw new RuntimeException(e);
        }
    }
}
