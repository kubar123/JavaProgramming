/*
 * Creative Commons Attribution-NonCommercial 3.0 Australia license ( CC BY-NC 3.0 AU)
 * http://creativecommons.org/licenses/by-nc/3.0/au/legalcode  * 
 */

package ch11;

import LibraryCollection.Books;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class BookArray {
    static List<Book> booksList = new ArrayList<Book>();
    public static void main(String[] args){
        Book books;
        books=new Fiction("Harry Potter");
        booksList.add(books);
        books=new NonFiction("Once upon a time");
        booksList.add(books);
        books=new Fiction("FuictionBook2");
        booksList.add(books);
        books=new Fiction("FuictionBook3");
        booksList.add(books);
        books=new Fiction("FuictionBook4");
        
        
    }
    
}
