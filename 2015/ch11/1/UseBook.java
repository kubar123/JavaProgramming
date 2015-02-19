/*
 * Creative Commons Attribution-NonCommercial 3.0 Australia license ( CC BY-NC 3.0 AU)
 * http://creativecommons.org/licenses/by-nc/3.0/au/legalcode  * 
 */

package ch11;

/**
 *
 * @author Admin
 */
public class UseBook {
    
   
    public static void main(String[] args){
        Book books;
        books=new Fiction("harry potter");
        System.out.println(books.gettitle());
        books=new NonFiction("Once upon a time...");
        System.out.println(books);
        
        
    }
}
