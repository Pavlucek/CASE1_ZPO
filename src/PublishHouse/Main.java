package PublishHouse;
import Books.Book;

public class Main {
    public static void main(String[] args) {
        // Tworzenie wydawnictwa dla autora "Adam Mickiewicz"
        Wydawnictwo w = Wydawnictwo.getWydawnictwo("Adam Mickiewicz");

        // Tworzenie książki "Dziady" o 130 stronach
        Book k = w.createBook("Dziady", 130);

        // Wyświetlanie informacji o książce
        System.out.println(k);

        // Tworzenie wydawnictwa dla autora "Stephen King"
        Wydawnictwo w2 = Wydawnictwo.getWydawnictwo("Stephen King");

        // Tworzenie książki "Carrie" o 200 stronach
        Book k2 = w2.createBook("Carrie", 200);

        // Wyświetlanie informacji o książce
        System.out.println(k2);

        // Tworzenie wydawnictwa dla autora "Henryk Sienkiewicz"
        Wydawnictwo w3 = Wydawnictwo.getWydawnictwo("Henryk Sienkiewicz");

        // Tworzenie książki "Krzyżacy" o 500 stronach
        Book k3 = w3.createBook("Krzyżacy", 500);

        // Wyświetlanie informacji o książce
        System.out.println(k3);
    }
}
