//Jeffrey Seto
//September 12, 2014
//CSE 002
//Big Mac Java Program

//Computes the cost of Big Macs using the Scanner class to recieve input from the user
//on the number of Big Macs, cost of Big Macs, and the percentage tax.

import java.util.Scanner;
//import Scanner

//adding class and main method
public class BigMac {
    //main method required for every Java program
    public static void main (String[] args) {
    
    Scanner myScanner;
    myScanner = new Scanner (System.in );
    System.out.print("Enter the number of Big Macs (an integer > 0): ");
    //prompt user for number of Big Macs
    int nBigMacs = myScanner.nextInt();
    System.out.print("Enter the cost per Big Mac as"+" a double (in the form xx.xx): " );
    //prompt user for cost of Big Macs
    double bigMac$ = myScanner.nextDouble();
    System.out.print("Enter the percent tax as a whole number (xx): ");
    //prompt user for tax on Big Macs
    double taxRate = myScanner.nextDouble();
    taxRate/=100;  //user enters percent, but I want proportion
    
    double cost$;   //define double cost$
    int dollars;    //whole dollar amount of cost dimes, pennies; //for storing digits
                    //to the right of the decimal point
                    //for the cost$
    int dimes;      //define int dimes
    int pennies;    //define int pennies
    cost$ = nBigMacs*bigMac$*(1+taxRate);
    //get the whole amount, dropping decimal fraction
    dollars=(int)cost$;
    //get dimes amount, e.g.,
    dimes=(int)(cost$*10)%10;
    pennies=(int)(cost$*100)%10;  //get pennies amount
    System.out.println("The total cost of " +nBigMacs+" BigMacs, at $"+bigMac$ +"per bigMac, with a" +
    " sales tax of "+(int)(taxRate*100) + "%, is $"+dollars+'.'+dimes+pennies);
            
        }  //end of main method
}  //end of class