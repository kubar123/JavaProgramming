package ch11;

/*
 * Creative Commons Attribution-NonCommercial 3.0 Australia license ( CC BY-NC 3.0 AU)
 * http://creativecommons.org/licenses/by-nc/3.0/au/legalcode  * 
 */

/**
 *
 * @author Admin
 */
public abstract class GeometricFigure {
    public int height, width;
    public String figureType;
    public int area;
    abstract void getArea(int h, int w);
    
    public String toString(){
        return("h: "+height+" w: "+width+" area: "+area);
    }
    
}
