package ch11;

/*
 * Creative Commons Attribution-NonCommercial 3.0 Australia license ( CC BY-NC 3.0 AU)
 * http://creativecommons.org/licenses/by-nc/3.0/au/legalcode  * 
 */

/**
 *
 * @author Admin
 */
public class Triangle extends GeometricFigure{

    Triangle(int a, int b){
        this.height=a;
        this.width=b;
        getArea(a,b);
    }
    @Override
    public void getArea(int h, int w) {
        area=(h*w)/2;
    }
    
}
