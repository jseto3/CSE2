//Jeffrey Seto
//September 23, 2014
//CSE 002
//Income Tax Java Program

//Calculates the income tax on the inputted amount of income

import java.util.Scanner;   //import scanner

public class IncomeTax {
    public static void main (String[] args) {
    //add class and main method
    
    Scanner myScanner=new Scanner (System.in);
    System.out.print ("Enter an int giving the number of thousands: ");
    //prompt user for number of thousands
    int nThousands=myScanner.nextInt();
    if (nThousands>0){
        if (nThousands<20){
        System.out.println ("The tax rate on $"+nThousands+",000 is 5%, and the tax is $"+nThousands*1000*.05+".");
        } else if (20<=nThousands && nThousands<40) {
        System.out.println ("The tax rate on $"+nThousands+",000 is 7%, and the tax is $"+nThousands*1000*.07+".");
        } else if (40<=nThousands && nThousands<78) {
        System.out.println ("The tax rate on $"+nThousands+",000 is 12%, and the tax is $"+nThousands*1000*.12+".");
        } else if (nThousands>=78) {
        System.out.println ("The tax rate on $"+nThousands+",000 is 14%, and the tax is $"+nThousands*1000*.14+".");
        }
    } else if (nThousands<=0) {
        System.out.println ("You did not enter a positive int.");
    } else {
        System.out.println ("You did not enter an integer.");
    }
    
    }   //end of main method
}   //end of class