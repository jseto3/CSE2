//Jeffrey Seto
//November 12th, 2014
//CSE 002
//Poker Odds Java Program

//Simulates poker hands

import java.util.Random;
import java.util.Scanner; //import scanner

public class PokerOdds {
    public static void main(String[] arg) {
            //add class and main method
            showHands(); //call method showOneHand
            //simulateOdds();     //call method simulateOdds
        } //end of main method

    public static void showHands() {
        String one;
        String two;
        String three;
        String four;
        String royal;
        for (int i = 0; i < 5; i++) {
            int n = (int)(Math.random() * 4); //declare n
            if (n == 0) {
                String suit = "Clubs: ";
                int c = (int)(Math.random() * 13 + 1); //declare c
                if (c == 1) {
                    royal = "A";
                    suit=suit+royal;
                    System.out.println(suit);
                }
                else if (c == 13) {
                    royal = "K";
                    suit=suit+royal;
                    System.out.println(suit);
                }
                else if (c == 12) {
                    royal = "Q";
                    suit=suit+royal;
                    System.out.println(suit);
                }
                else if (c == 11) {
                    royal = "J";
                    suit=suit+royal;
                    System.out.println(suit);
                }
                else {
                    suit=suit+c;
                    System.out.println(suit);
                }
            }
            else if (n == 1) {
                String suit = "Diamonds: ";
                int c = (int)(Math.random() * 13 + 1); //declare c
               if (c == 1) {
                    royal = "A";
                    suit=suit+royal;
                    System.out.println(suit);
                }
                else if (c == 13) {
                    royal = "K";
                    suit=suit+royal;
                    System.out.println(suit);
                }
                else if (c == 12) {
                    royal = "Q";
                    suit=suit+royal;
                    System.out.println(suit);
                }
                else if (c == 11) {
                    royal = "J";
                    suit=suit+royal;
                    System.out.println(suit);
                }
                else {
                    suit=suit+c;
                    System.out.println(suit);
                }
            }
            else if (n == 2) {
                String suit = "Hearts: ";
                int c = (int)(Math.random() * 13 + 1); //declare c
               if (c == 1) {
                    royal = "A";
                    suit=suit+royal;
                    System.out.println(suit);
                }
                else if (c == 13) {
                    royal = "K";
                    suit=suit+royal;
                    System.out.println(suit);
                }
                else if (c == 12) {
                    royal = "Q";
                    suit=suit+royal;
                    System.out.println(suit);
                }
                else if (c == 11) {
                    royal = "J";
                    suit=suit+royal;
                    System.out.println(suit);
                }
                else {
                    suit=suit+c;
                    System.out.println(suit);
                }
            }
            else if (n == 3) {
                String suit = "Spades: ";
                int c = (int)(Math.random() * 13 + 1); //declare c
               if (c == 1) {
                    royal = "A";
                    suit=suit+royal;
                    System.out.println(suit);
                }
                else if (c == 13) {
                    royal = "K";
                    suit=suit+royal;
                    System.out.println(suit);
                }
                else if (c == 12) {
                    royal = "Q";
                    suit=suit+royal;
                    System.out.println(suit);
                }
                else if (c == 11) {
                    royal = "J";
                    suit=suit+royal;
                    System.out.println(suit);
                }
                else {
                    suit=suit+c;
                    System.out.println(suit);
                }
            }
        }   //end of for loop

    }   //end of method showHands

    /*public static void simulateOdds() {
        for (int q=0; q<1000; q++){
            int cards[] = new int [52];
            String ace;
            for (int i=0; i<52; i++) {
                cards[i]=i;
                switch(i%13){
                    case 0: ace="A";
                    break;
                    case 1: "K"
                    break;
                    case 2: "Q"
                    break;
                    case 3: "J"
                    break;
                    case 4: "10"
                    break;
                    case 5: "9"
                    break;
                    case 6: "8"
                    break;
                    case 7: "7"
                    break;
                    case 8: "6"
                    break;
                    case 9: "5"
                    break;
                    case 10: "4"
                    break;
                    case 11: "3"
                    break;
                    case 12: "2"
                    break;
                }   //end of switch
            }   //end of for loop
            int hand[] = new int [5];
            for (int j=0; j<5; j++) {
                hand[j]=-1;
            }   //end of for loop
        }    //end of for loop
        
        System.out.println ("Clubs: ");
        System.out.println ("Diamonds: ");
        System.out.println ("Hearts: ");
        System.out.println ("Spades: ");
        
    }*/

} //end of class