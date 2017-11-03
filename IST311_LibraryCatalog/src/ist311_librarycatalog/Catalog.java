/**
 * IST 311 - Professor Soby Chacko -- Fall 2017
 * Team Members: Jennifer A'Harrah, Eric Liang, Sachin Patel, Nadia Rahim
 * Scrum Master: Sachin Patel --- Product Owner: Jennifer A'Harrah
 * Problem #2: Library Catalog
 */
package ist311_librarycatalog;

import java.util.ArrayList;
import java.util.List;

/**
 * This class will contain methods for adding books to the catalog, displaying
 * the catalog, etc.
 *
 * @author Jennifer A'Harrah <jka5240@psu.edu>
 */
public class Catalog {

    Book book1 = new Book("978-0-44845-714-7", "The Little Engine That Could", "Watty Piper", "Children's Literature");
    Book book2 = new Book("978-1-41699-644-6", "Sent", "Margaret Peterson Haddix", "Historical Fiction");
    Book book3 = new Book("ISBN", "Book 3", "Author", "Genre");
    Book book4 = new Book("ISBN", "Book 4", "Author", "Genre");

    List<Book> books = new ArrayList<Book>() {
        {
            books.add(book1);
            books.add(book2);
            books.add(book3);
            books.add(book4);

        }
    };

    public static void main(String[] args) {

    }

}
