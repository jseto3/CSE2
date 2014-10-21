//Jeffrey Seto
//October 17, 2014
//CSE 002
//Number Stack Java Program

//Prints stacks of numbers using for, while, and do while loops depending on the value entered

import java.util.Scanner;   //import scanner

public class NumberStack {
    public static void main (String[] args) {
        //add class and main method
        
        Scanner myScanner=new Scanner (System.in);
        System.out.print ("Enter a number between 1 and 9: ");
        int stack=myScanner.nextInt();
        if (1<=stack && stack<=9) {
            for (int i=1; i<=stack; i++) {
                for (int j=1; j<=i; j++) {
                    for (int m=stack; m>=i; m--) {
                        System.out.print (" ");
                    }
                    for (int k=1; k<=(2*i-1); k++) {
                        System.out.print (i);
                    }
                    System.out.println();
                }
                for (int n=stack; n>=i; n--) {
                    System.out.print (" ");
                }
                    for (int l=1; l<=(2*i-1); l++) {
                        System.out.print ("-");
                    }
                System.out.println();
            }
            
            int i=1;
            while (i<=stack) {
                int j=1;
                while (j<=i) {
                    int m=stack;
                    while (m>=i) {
                        System.out.print (" ");
                        m--;
                    }
                    int k=1;
                    while (k<=2*i-1) {
                        System.out.print (i);
                        k++;
                    }
                    System.out.println();
                    j++;
                }
                    int n=stack;
                    while (n>=i) {
                        System.out.print (" ");
                        n--;
                    }
                    int l=1;
                    while (l<=2*i-1) {
                        System.out.print ("-");
                        l++;
                    }
                System.out.println ();
                i++;
            }
            
            i=1;
            do {
                int j=1;
                do {
                    int m=stack;
                    do {
                        System.out.print (" ");
                        m--;
                    } while (m>=i);
                        int k=1;
                        do {
                            System.out.print (i);
                            k++;
                        } while (k<=2*i-1);
                        System.out.println();
                        j++;
                } while (j<=i);
                    int n=stack;
                    do {
                        System.out.print (" ");
                        n--;
                    } while (n>=i);
                    int l=1;
                    do {
                        System.out.print ("-");
                        l++;
                    } while (l<=2*i-1);
                    System.out.println ();
                    i++;
                } while (i<=stack);
            
        } else {
            System.out.println ("You did not enter a number between 1 and 9.");
        }
        
    }   //end of main method
}   //end of class