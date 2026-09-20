package Collection;
import java.util.HashSet;

public class Problem5 {

    public static void main(String[] args) {
        HashSet<Book> setBook = new HashSet<>();

        setBook.add(new Book(1, "Shyam chi aai", "Sane Guruji", 599));
        setBook.add(new Book(2, "Chava", "Shivaji Savant", 999));
        setBook.add(new Book(3, "Amrutvel", "V.S.Khandekar", 499));

        System.out.println("All Books");
        for(Book b:setBook)
            b.getBook();

        System.out.println("Before Removed");
        int removeId = 1;
        setBook.removeIf(b -> b.id==removeId);
        for(Book b:setBook)
            b.getBook();

        System.out.println("Search Result:");
        int searchId = 1;
        boolean flag = false;
        for(Book b:setBook)
        {
            if(b.id == searchId)
            {
                System.out.println("Book Found");
                b.getBook();
                flag = true;
            }
        }
        if(flag == false)
            System.out.println("Book not Found");
    }
}
