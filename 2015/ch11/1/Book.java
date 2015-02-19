/*
 * Creative Commons Attribution-NonCommercial 3.0 Australia license ( CC BY-NC 3.0 AU)
 * http://creativecommons.org/licenses/by-nc/3.0/au/legalcode  * 
 *
 Create an abstract class named Book. Include a String field for the book’s title
and a double field for the book’s price. Within the class, include a constructor
that requires the book title, and add two get methods—one that returns the title
and one that returns the price. Include an abstract method named setPrice().
Create two child classes of Book: Fiction and NonFiction. Each must include a
setPrice() method that sets the price for all Fiction Books to $24.99 and for
all NonFiction Books to $37.99. Write a constructor for each subclass, and
include a call to setPrice() within each. Write an application demonstrating
that you can create both a Fiction and a NonFiction Book and display their
fields. Save the files as Book.java, Fiction.java, NonFiction.java, and
UseBook.java.
 */

package ch11;

/**
 *
 * @author Admin
 */
public abstract class Book {
    String mBookTitle; //title of the book
    double mPrice;      //price of the book
    
    public Book(String title ){
        mBookTitle=title;
    }
    
    public String gettitle(){
        return mBookTitle;
    }
    
    public double getPrice(){
        return mPrice;
    }
    
    public abstract void setPrice();
}
