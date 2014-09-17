//Jeffrey Seto
//September 14, 2014
//CSE 002
//Bicycle Java Program

import java.util.Scanner;  //import Scanner

public class Bicycle {
    public static void main (String[] args) {
    //add class and main method
    
    Scanner myScanner=new Scanner (System.in);
    System.out.print ("Enter number of counts on the cyclometer: ");
    //prompt user for number of counts on cyclometer
    int nCounts = myScanner.nextInt();
    System.out.print ("Enter the number of seconds during which the counts occured: ");
    //prompt user for amount of time in seconds
    int nSeconds = myScanner.nextInt();
    
    double wheelDiameter=27.0,  //store diameter of wheel
    PI=3.14159,  //store the value of PI
    feetPerMile=5280,  //store number of feet in a mile
    inchesPerFoot=12,  //store number of inches in a foot
    secondsPerMinute=60,  //store the number of seconds in a minute
    minutesPerHour=60;  //store the number of minutes in an hour
    
    double distance;  //declare distance
    distance=nCounts*wheelDiameter*PI/inchesPerFoot/feetPerMile;  //gives distance in miles
    
    System.out.println ("Distance was "+ (int)(distance *100)/100.0 +" miles and took "+ (int)((nSeconds/secondsPerMinute)*100)/100.0+" minutes.");
    System.out.println ("The average miles per hour was: "+ (int)((distance/(nSeconds/secondsPerMinute/minutesPerHour)*100))/100.0 +".");
    
    
    }  //end of main method
}   //end of class