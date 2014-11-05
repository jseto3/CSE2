//Jeffrey Seto
//November 4, 2014
//CSE 002
//Blocked Again Java Program

//Practice designing a nested sequence of method calls that divide a larger problem into subproblems

import java.util.Scanner;

public class BlockedAgain {
    public static void main(String[] s) {
    //add class and main method
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt();
        allBlocks(m);
    }   //end of main method
    
    public static int getInt () {
        Scanner myScanner=new Scanner (System.in);
        int n;
        n=checkInt(myScanner);
        int y=checkRange(n);
        return y;
    }
    
    
    public static int checkInt (Scanner scan1) {
        System.out.print ("Enter an integer between 1 and 9, inclusive: ");
        while (!scan1.hasNextInt()){
            System.out.print ("You did not enter an int; try again:");
            scan1.next();
        }
        int input=scan1.nextInt();
        return input;
    }
    
    
    public static int checkRange (int input) {
        Scanner scan=new Scanner (System.in);
        int z=input;
        while (!(z>=1 && z<=9)) {
             System.out.print ("You did not enter an int in [1,9]; try again: ");
             z=checkInt(scan);
        }
        return z;
    }
    
    public static void allBlocks (int x) {
        block (x);
    }
    
    public static void block (int stack) {
        for (int i=1; i<=stack; i++) {
            line (stack, i);
        }    
    }
    
    public static void line (int number, int count) {
        for (int j=1; j<=count; j++) {
                    for (int m=number; m>=count; m--) {
                        System.out.print (" ");
                    }
                    for (int k=1; k<=(2*count-1); k++) {
                        System.out.print (count);
                    }
                    System.out.println();
                }
                for (int n=number; n>=count; n--) {
                    System.out.print (" ");
                }
                    for (int l=1; l<=(2*count-1); l++) {
                        System.out.print ("-");
                    }
                System.out.println();
    }
    
}   //end of class
