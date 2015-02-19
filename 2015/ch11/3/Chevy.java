/*
 * Creative Commons Attribution-NonCommercial 3.0 Australia license ( CC BY-NC 3.0 AU)
 * http://creativecommons.org/licenses/by-nc/3.0/au/legalcode  * 
 */

package ch11;

/**
 *
 * @author Admin
 */
public class Chevy extends Auto{

    public Chevy(String make, double price) {
        super(make, price);
    }

    //@Override
    void setPrice() {
        super.carPrice=20000.99;
    }
    
}
