//Jeffrey Seto
//September 23, 2014
//CSE 002
//Course Number Java Program

//Displays semester and year a course ran based on its course number

import java.util.Scanner;   //import scanner

public class CourseNumber {
    public static void main (String[] args) {
    //add class and main method
    
    Scanner myScanner=new Scanner (System.in);
    System.out.print ("Enter a six digit number giving the course semester: ");
    //prompt user for course semester
    int nCourseNumber=myScanner.nextInt();
    if (nCourseNumber>=186510 && nCourseNumber<=201440) {
        if ((nCourseNumber-((int)(nCourseNumber/100)*100))==10) {
            System.out.println ("The course was offered in the Spring semester of "+(int)(nCourseNumber/100)+".");
        } else if ((nCourseNumber-((int)(nCourseNumber/100)*100))==20) {
            System.out.println ("The course was offered in the Summer 1 semester of "+(int)(nCourseNumber/100)+".");
        } else if ((nCourseNumber-((int)(nCourseNumber/100)*100))==30) {
            System.out.println ("The course was offered in the Summer 2 semester of "+(int)(nCourseNumber/100)+".");
        } else if ((nCourseNumber-((int)(nCourseNumber/100)*100))==40) {
            System.out.println ("The course was offered in the Fall semester of "+(int)(nCourseNumber/100)+".");
        } else {
            System.out.println ("Not a legitimate semester.");
        }
    } else {
        System.out.println ("The number was outside the range [186510, 201440].");
    }
    
    }   //end of main method
}   //end of class