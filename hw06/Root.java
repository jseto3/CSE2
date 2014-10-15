//Jeffrey Seto
//October 11, 2014
//CSE 002
//Root Java Program

//Finds the square root of a number using the bisection method

import java.util.Scanner;   //import scanner

public class Root {
    public static void main (String[] args) {
    //add class and main method
    
    Scanner myScanner=new Scanner (System.in);
    System.out.print ("Enter a double greater than 0: ");
    double x=myScanner.nextDouble();
    double low=0, high=1+x, middle = 0;
    
    if (x>0) {
        while ((high-low)>(.0000001*(1+x))) {
            middle=(low+high)/2;
                    
            if ((middle*middle)>x) {
                high=middle;
            } else {
                low=middle;
               }
        }
        System.out.println ("The square root of "+x+" is "+middle);
    } else {
        System.out.println ("You did not enter a double greater than 0.");
    }
    
    }   //end of main method
}   //end of class