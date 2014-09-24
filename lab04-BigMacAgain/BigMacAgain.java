//Jeffrey Seto
//September 19, 2014
//CSE 002
//Big Mac Again Java Program

//Prompts user for the number of Big Macs they want, then asks if they want fries, and finally computes the total price of the meal

import java.util.Scanner; //import scanner 

public class BigMacAgain {
    public static void main (String [] args) {
    //add class and main method
    
    Scanner myScanner=new Scanner (System.in);
    System.out.print ("Enter the number of Big Macs: ");
    //prompt user for number of Big Macs
    int nBigMacs=0;
    if (myScanner.hasNextInt()){
    nBigMacs=myScanner.nextInt();
        if (nBigMacs<0) {
            System.out.println ("You did not enter a positive integer.");
            return; //ends program
        }
    System.out.println ("You ordered "+nBigMacs+" Big Macs for a total of "+nBigMacs+"*$2.22="+(nBigMacs*2.22)+".");
        
    } else {
        System.out.println ("You did not enter an int.");
        return; //leaves the program
    }   //end of else statement
    
    System.out.print ("Do you want an order of fries (Y/y/N/n)?");
    //prompt user for additional input
    String fries=myScanner.next();
    if (fries.equals("Y") || fries.equals("y")){
        System.out.println ("You ordered fries at a cost of $2.15");
        System.out.println ("The total cost of the meal is "+((nBigMacs*2.22)+2.15)+".");
    } else if (fries.equals("N") || fries.equals("n")){
        System.out.println ("The total cost of the meal is $"+nBigMacs*2.22+".");
    } else {
        System.out.println ("You did not enter one of 'Y', 'y', 'N', 'n'.");
    }
    
    
    }   //end of main method
}   //end of class


