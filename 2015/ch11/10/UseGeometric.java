package ch11;

import java.util.Arrays;

/*
 * Creative Commons Attribution-NonCommercial 3.0 Australia license ( CC BY-NC 3.0 AU)
 * http://creativecommons.org/licenses/by-nc/3.0/au/legalcode  * 
 */

/**
 *
 * @author Admin
 */
public class UseGeometric {
    public static void main(String[] args){
        GeometricFigure figures[]=new GeometricFigure[2];
        Square s1=new Square(10,44);
        Triangle t1=new Triangle(14,33);
        figures[0]=s1;
        figures[1]=t1;
    System.out.println(Arrays.toString(figures));
        
    }
    
}
