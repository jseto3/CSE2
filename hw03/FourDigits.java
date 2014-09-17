//Jeffrey Seto
//September 15, 2014
//CSE 002
//Four Digits Java Program

import java.util.Scanner;   //import Scanner

public class FourDigits {
    public static void main (String[] args) {
    //add class and main method
    
    Scanner myScanner=new Scanner (System.in);
    System.out.print ("Enter a double and I display the four digits to the right of the decimal point: ");
    //prompt user for double
    double input = myScanner.nextDouble();
    
    double cast;    //declare variable case
    double c2;  //declare variable c2
    double four;    //declare variable four
    cast=(int)(input*10000);    //convert input into an integer
    c2=(int)(cast/10000);   //isolate the number to the left of the decimal point
    four=(input-c2)*10000;  
    //isolate four digits to the right of the decimal point by subtracting
    //the number to the left of the decimal point from the input, and multiplying by 10000

    
    System.out.println ("The four digits are "+(int)(four)+".");
    //print output
        
    }   //end of main method
}   //end of class