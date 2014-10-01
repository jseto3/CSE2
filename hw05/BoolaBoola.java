//Jeffrey Seto
//September 27, 2014
//CSE 002
//Boola Boola Java Program

//

import java.util.Scanner;   //import scanner

public class BoolaBoola {
    public static void main (String[] args) {
    //add class and main method
    
    Scanner myScanner=new Scanner (System.in);
    int one;
    int two;
    int three;  //declare integers one two and three
    one=(int)(Math.random()*2);
    boolean random=one==1;
    two=(int)(Math.random()*2);
    boolean random1=two==1;
    three=(int)(Math.random()*2);
    boolean random2=three==1;
    
    System.out.print ("Does "+random+" && "+random1+" || "+random2+" have the value true (T/t) or false (F/f)? ");
    //Ask user for result of expression
    String choice=myScanner.next(); //declare variable choice
    if (choice.length()==1){
        if (choice.equals("T") || choice.equals("t")){
            boolean answer=random&&random1||random2;
            if (answer==true){
                System.out.println ("Correct");
            } else {
                System.out.println ("Wrong; try again");
            }
        } else if (choice.equals("F") || choice.equals("f")){
            boolean answer=random&&random1||random2;
            if (answer==false){
                System.out.println ("Correct");
            } else {
                System.out.println ("Wrong; try again");
            }
        }    
    } else {
        System.out.println ("Single character expected");
        //print error message
    }
    
    }   //end of main method
}   //end of class