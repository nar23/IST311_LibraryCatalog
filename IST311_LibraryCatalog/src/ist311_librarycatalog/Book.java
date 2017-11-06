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
 * @authot Nadia A Rahim <nar23@psu.edu>
 */
public class Book {
    // Declare private fields needed when creating a book object
    private String _ISBN;
    private String _title;
    private String _author;
    private String _genre;

    // Constructor for easily creating new book objects
    Book (String ISBN, String title, String author, String genre) {
        _ISBN = ISBN;
        _title = title;
        _author = author;
        _genre = genre;
        
    }
    
    /*
    ===========GETTERS AND SETTERS==================
    */
    Book () {
        
    }


    public String getISBN() {
        return _ISBN;
    }

    public void setISBN(String ISBN) {
        _ISBN = ISBN;
    }

    public String getTitle() {
        return _title;
    }

    public void setTitle(String title) {
        _title = title;
    }

    public String getAuthor() {
        return this._author;
    }

    public void setAuthor(String author) {
        _author = author;
    }

    public String getGenre() {
        return _genre;
    }

    public void setGenre(String genre) {
        _genre = genre;
    } 
    
    //=================METHODS==============
    // will mark a book as borrowed
    public void borrowed( String title){
        int search= 'a';
        for (Book book= books){
            if (book.getTitle().equals(title)){
                if (search=='a'){
                    search = 'b'
                }
              if (!book.isBorrowed()) {
                    book.borrowed();
                    search = 'c';
                    break; 
                  
              };
            }
         if (search == 'a') {
            System.out.println("This book is not available.");
        } else if (search== 'b') {
            System.out.println("This book is already borrowed.");
        } else if (search == 'c') {
            System.out.println("You have successfully borrowed " + title);
        }
    }   
        
        
        
    }
    // will mark a book as returned
    public void returned(){
        //implemented method here
    }
    // will check if a book has been borrowed
    // true if yes, false if it is not
    private boolean isBorrowed(){
        //implemented method here
        
        
        // Return 'true' for now so that code will compile (return type required)
        return true;
    }
    
    
}
