/*
 * Creative Commons Attribution-NonCommercial 3.0 Australia license ( CC BY-NC 3.0 AU)
 * http://creativecommons.org/licenses/by-nc/3.0/au/legalcode  * 
 */

package ch11;

/**
 *
 * @author Admin
 */
public class Fiction extends Book{

    public Fiction(String title) {
        super(title);
        setPrice();
    }
    
    public void setPrice(){
        super.mPrice=24.99;
    }
}
    

