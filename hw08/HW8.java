//Jeffrey Seto
//October 28, 2014
//CSE 002
//HW 8 Java Program

//Practice writing methods, overloading methods, and in forcing user to enter good input

import java.util.Scanner;

public class HW8 {
		public static void main(String[] args) {
		//add class and main method
			
		char input;	//declare variable char
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
		input = getInput(scan, "Cc");
		System.out.println("You entered '" + input + "'");
		System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
		input = getInput(scan, "yYnN", 5); //give up after 5 attempts
		if (input != ' ') {
				System.out.println("You entered '" + input + "'");
		}
		input = getInput(scan, "Choose a digit.", "0123456789");
		System.out.println("You entered '" + input + "'");
		
		}		//end of main method
		
		public static char getInput (Scanner a, String one) {
			while (true) {
				if (a.hasNext()){
					String i=a.next();
					if (i.length()==1){
						if(i.charAt(0)==one.charAt(0)||i.charAt(0)==one.charAt(1)){
							return i.charAt(0);
						} else {
						System.out.print ("You did not enter a character from the list 'Cc'; try again-");
						continue;
						}
					} else {
						System.out.print ("You should enter exactly one character-");
						continue;
					}
				} else {
					System.out.println ("You did not enter a character from the list 'Cc'");
					continue;
				}
			}
		}		//end of method
		
		public static char getInput (Scanner b, String two, int tries) {
			String userInput;
			for (int i=0; i<tries; i++) {
				userInput=b.next();
				if (userInput.charAt(0)==two.charAt(0)||userInput.charAt(0)==two.charAt(1)||userInput.charAt(0)==two.charAt(2)||userInput.charAt(0)==two.charAt(3)){
					return userInput.charAt(0);
				} else {
					System.out.print ("You did not enter a character from the list 'yYnN'; try again-");
				}
			}
			System.out.println ("You failed after 5 tries");
			return 'b';
		}		//end of method
		
		public static char getInput (Scanner c, String three, String four) {
			String j;
			System.out.println ("Choose a digit.");
			System.out.print ("Enter one of: "+four+"-");
			while (true) {
				j=c.next();
				if (j.length()==1){
					if (j.charAt(0)==four.charAt(0)||j.charAt(0)==four.charAt(1)||
					j.charAt(0)==four.charAt(2)||j.charAt(0)==four.charAt(3)||
					j.charAt(0)==four.charAt(4)||j.charAt(0)==four.charAt(5)||
					j.charAt(0)==four.charAt(6)||j.charAt(0)==four.charAt(7)||
					j.charAt(0)==four.charAt(8)||j.charAt(0)==four.charAt(9)){
						return j.charAt(0);
					} else {
						System.out.print ("You did not enter an acceptable character");
					}
				} else {
				System.out.print ("Enter exactly one character");
				}
			}
		}		//end of method
		
}		//end of class