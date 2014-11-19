//Jeffrey Seto
//November 12th, 2014
//CSE 002
//Find Duplicates Java Program

//Finds duplicates in an array

import java.util.Scanner;

public class FindDuplicates {
    public static void main(String[] args) {
        //add class and main method
        
        Scanner scan = new Scanner(System.in);
        int num[] = new int[10];
        String answer = "";
        do {
            System.out.print("Enter 10 ints- ");
            for (int j = 0; j < 10; j++) {
                num[j] = scan.nextInt();
            }
            String out = "The array ";
            out += listArray(num); //return a string of the form "{2, 3, -9}"   
            if (hasDups(num)) {
                out += "has ";
            }
            else {
                out += "does not have ";
            }
            out += "duplicates.";
            System.out.println(out);
            out = "The array ";
            out += listArray(num);
            if (exactlyOneDup(num)) {
                out += "has ";
            }
            else {
                out += "does not have ";
            }
            out += "exactly one duplicate.";
            System.out.println(out);
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            answer = scan.next();
        } while (answer.equals("Y") || answer.equals("y"));
    }   //end of main method

    public static String listArray(int num[]) {
        String out = "{";
        for (int j = 0; j < num.length; j++) {
            if (j > 0) {
                out += ", ";
            }
            out += num[j];
        }
        out += "} ";
        return out;
    }
    
    public static boolean hasDups(int []x){
        if (numDuplicates(x)>=1) {
            return true;
        } else {
            return false;
        }
    }   //method returns true if there are duplicates
    
    public static int numDuplicates(int []x){
        int dupes=0;
        for (int k=0; k<10; k++) {
            for (int l=k+1; l<10; l++) {
                if (x[k]==x[l]){
                    dupes++;
                }
            }
        }
        return dupes;
    }   //method returns the number of duplicates
    
    public static boolean exactlyOneDup(int []x){
        if (numDuplicates(x)==1) {
            return true;
        } else {
            return false;
        }
    }   //method returns true if there is exactly one duplicate
    
}   //end of class
