//Jeffrey Seto
//September 23, 2014
//CSE 002
//Month Java Program

//Prompts user to enter the month, then displays the number of days in that month

import java.util.Scanner;   //import scanner

public class Month {
    public static void main (String[] args) {
    //add class and main method
    
    Scanner myScanner=new Scanner (System.in);
    System.out.print ("Enter an int giving the number of the month (1-12): ");
    //prompt user for number of month
    int nMonth=myScanner.nextInt();
        if (nMonth==1) {
            System.out.println ("The month has 31 days.");
        } else if (nMonth==2) {
            System.out.println ("The month has 28 days.");
        } else if (nMonth==3) {
            System.out.println ("The month has 31 days.");    
        } else if (nMonth==4) {
            System.out.println ("The month has 30 days.");   
        } else if (nMonth==5) {
            System.out.println ("The month has 31 days.");
        } else if (nMonth==6) {
            System.out.println ("The month has 30 days.");
        } else if (nMonth==7) {
            System.out.println ("The month has 31 days.");
        } else if (nMonth==8) {
            System.out.println ("The month has 31 days.");
        } else if (nMonth==9) {
            System.out.println ("The month has 30 days.");
        } else if (nMonth==10) {
            System.out.println ("The month has 31 days.");
        } else if (nMonth==11) {
            System.out.println ("The month has 30 days.");
        } else if (nMonth==12) {
            System.out.println ("The month has 31 days.");    
        } else {
            System.out.println ("You did not enter an int between 1 and 12.");
        }
    
    }   //end of main method
}   //end of class