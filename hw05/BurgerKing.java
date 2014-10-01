//Jeffrey Seto
//September 27, 2014
//CSE 002
//Burger King Java Program

//Allows user to customize their order

import java.util.Scanner;   //import scanner

public class BurgerKing {
    public static void main (String[] args) {
    //add class and main method
    
    Scanner myScanner=new Scanner (System.in);
    System.out.println ("Enter a letter to indicate a choice of:");
    System.out.println ("   Burger (B or b)");
    System.out.println ("   Soda (S or s)");
    System.out.print ("   Fries (F or f) ");
    //print choices for user
    String choice=myScanner.next(); //declare variable choice
    if (choice.length()==1){
        switch (choice){
            case "B": case "b":
            System.out.println ("Enter A or a for 'all the fixins'");
            System.out.println ("   C or c for cheese");
            System.out.print ("   N or n for none of the above ");
            String burger=myScanner.next();   //declare variable burger
                switch (burger){
                    case "A": case "a":
                        System.out.println ("You ordered a burger with all the fixins'");
                        break;
                    case "C": case "c":
                        System.out.println ("You ordered a burger with cheese");
                        break;
                    case "N": case "n":
                        System.out.println ("You ordered a burger with nothing on it");
                        break;
                }
            break;
            case "S": case "s":
            System.out.print ("Do you want a Pepsi (P or p), Coke (C or c), Sprite (S or s), or Mountain Dew (M or m)? ");
            String soda=myScanner.next();   //declare variable soda
                switch (soda){
                    case "P": case "p":
                        System.out.println ("You ordered a Pepsi");
                        break;
                    case "C": case "c":
                        System.out.println ("You ordered a Coke");
                        break;
                    case "S": case "s":
                        System.out.println ("You ordered a Sprite");
                        break;
                    case "M": case "m":
                        System.out.println ("You ordered a Mountain Dew");
                        break;
                }
            break;
            case "F": case "f":
            System.out.print ("Do you want a large or small order of fries (L, l, S, or s? ");
            String size=myScanner.next();   //declare variable soda
                switch (size){
                    case "L": case "l":
                        System.out.println ("You ordered large fries");
                        break;
                    case "S": case "s":
                        System.out.println ("You ordered small fries");
                        break;
                }
            break;
            default: 
            System.out.println ("You did not enter B, b, S, s, F, or f");
        }
    } else {
        System.out.println ("Single character expected");
        //print error message
    }
    
    }   //end of main method
}   //end of class