//Jeffrey Seto
//September 23, 2014
//CSE 002
//Time Padding Java Program

//Converts the number of seconds that has passed during the day to display time in its conventional form

import java.util.Scanner;   //import scanner

public class TimePadding {
    public static void main (String[] args) {
    //add class and main method
    
    Scanner myScanner=new Scanner (System.in);
    System.out.print ("Enter the time in seconds: ");
    //prompt user for seconds
    int nSeconds=myScanner.nextInt();
    int nHours=nSeconds/3600;
    int nMinutes=nSeconds%3600/60;
    int Seconds=nSeconds%3600%60;
    
    System.out.println ("The time is "+nHours+":"+nMinutes+":"+Seconds+".");
    
    
    }   //end of main method
}   //end of class