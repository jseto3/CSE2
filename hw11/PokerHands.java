//Jeffrey Seto
//December 1st, 2014
//CSE 002
//Poker Hands Java Program

//Gives hand rank for a given 5-card hand

import java.util.Scanner;   //import scanner

public class PokerHands {
    public static void main (String[] args) {
        //add class and main method
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
        
    }   //end of main method
    
    public static void showOneHand(int hand[]) {
        
        System.out.print ("Enter 'y' or 'Y' to enter a(nother) hand- ");
        /*do{
            if (a.hasNext()){
                String i=a.next();
            }
        } while (true) {
            continue;
        }*/
        
        String suit[] = {
            "Clubs:	", "Diamonds: ", "Hearts:   ", "Spades:   "
        };
        String face[] = {
            "A ", "K ", "Q ", "J ", "10 ", "9 ", "8 ", "7 ", "6 ", "5 ",
            "4 ", "3 ", "2 "
        };
        String out = "";
        for (int s = 0; s < 4; s++) {
            out += suit[s];
            for (int rank = 0; rank < 13; rank++)
                for (int card = 0; card < 5; card++)
                    if (hand[card] / 13 == s && hand[card] % 13 == rank)
                        out += face[rank];
            out += '\n';
        }
        System.out.println(out);
    }   //end of method
}   //end of class