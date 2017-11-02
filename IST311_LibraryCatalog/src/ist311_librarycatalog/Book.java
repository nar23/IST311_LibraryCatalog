/**
 * IST 311 - Professor Soby Chacko -- Fall 2017 Team Members: Jennifer A'Harrah,
 * Eric Liang, Sachin Patel, Nadia Rahim Scrum Master: Sachin Patel --- Product
 * Owner: Jennifer A'Harrah Problem #2: Library Catalog
 */
package ist311_librarycatalog;

/**
 * This class will contain fields and methods for book objects that will go in
 * the catalog.
 * 
 * @author Eric Liang <eql5121@psu.edu>
 * @author Jennifer A'Harrah <jka5240@psu.edu>
 */
public class Book {

    private static String _ISBN;
    private static String _title;
    private static String _author;
    private static String _genre;
    /*
    ===========GETTERS AND SETTERS==================
    */
    public static String getISBN() {
        return _ISBN;
    }

    public static void setISBN(String _ISBN) {
        Book._ISBN = _ISBN;
    }

    public static String getTitle() {
        return _title;
    }

    public static void setTitle(String _title) {
        Book._title = _title;
    }

    public static String getAuthor() {
        return _author;
    }

    public static void setAuthor(String _author) {
        Book._author = _author;
    }

    public static String getGenre() {
        return _genre;
    }

    public static void setGenre(String _genre) {
        Book._genre = _genre;
    } 
    
    //=================METHODS==============
    // will mark a book as borrowed
    public void borrowed(){
        //implemented method here
    }
    // will mark a book as returned
    public void  returned(){
        //implemented method here
    }
    // will check if a book has been borrowed
    // true if yes, false if it is not
    private boolean isBorrowed(){
        //implemented method here
    }
}
