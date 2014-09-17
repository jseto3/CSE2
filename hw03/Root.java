//Jeffrey Seto
//September 14, 2014
//CSE 002
//Cube Root Java Program

import java.util.Scanner;   //import Scanner

public class Root {
    public static void main (String [] args) {
    //add class and main method
    
    Scanner myScanner=new Scanner (System.in);
    System.out.print ("Enter a number: ");
    double guess = myScanner.nextDouble();
    double start; //declare starting guess
    start=guess/3;
    double improve; //declare improvement 1
    improve=(start*start*start+guess)/(3*start*start);
    double improve2;    //declare improvement 2
    improve2=(2*improve*improve*improve+guess)/(3*improve*improve);
    double i3;  //declare improvement 3
    i3=(2*improve2*improve2*improve2+guess)/(3*improve2*improve2);
    double i4;  //declare improvement 4
    i4=(2*i3*i3*i3+guess)/(3*i3*i3);
    double i5;  //declare improvement 5
    i5=(2*i4*i4*i4+guess)/(3*i4*i4);
    
    System.out.println ("The cube root is: "+i5+".");
    double check;   //declare check
    check=i5*i5*i5;
    System.out.println ("Check: "+i5+"*"+i5+"*"+i5+"="+check+".");
    
    }   //end of main method
}   //end of class