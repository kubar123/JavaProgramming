/*
 * Creative Commons Attribution-NonCommercial 3.0 Australia license ( CC BY-NC 3.0 AU)
 * http://creativecommons.org/licenses/by-nc/3.0/au/legalcode  * 
 */

package ch11;

/**
 *
 * @author Admin
 */
public class Ford extends Auto{

    public Ford(String make, float price) {
        super(make, price);
    }

    @Override
    public void setPrice() {
       super.carPrice=28000.99;
    }
    
}
