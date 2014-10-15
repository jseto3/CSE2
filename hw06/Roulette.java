//Jeffrey Seto
//October 11, 2014
//CSE 002
//Roulette Java Program

//Simulates a roulette game

public class Roulette {
    public static void main (String [] args) {
    //add class and main method
    
    int pick=(int)(Math.random()*38);  //declare pick
    System.out.println ("You picked "+pick);
    int spin;  //declare spin
    int winnings=0;   //declare winnings
    int nSpins=0;   //declare nSpins
    int wins=0;   //declare wins
    int losses=0;   //declare losses
    int games=0;  //declare games
    int profit=0;   //declare profit
    int totalwinnings=0;   //declare total winnings

            while (nSpins<100) {
                nSpins=nSpins+1;
                spin=(int)(Math.random()*100);
                    if (pick==spin) {
                        winnings=winnings+36;
                        wins=wins+1;
                    } else {
                        losses=losses+1;
                    }
            }
    
    System.out.println ("You won $"+winnings);
    System.out.println ("You won "+wins+" time(s)");
    System.out.println ("You lost "+losses+" times");
    
    if (wins>3) {
        System.out.println ("You walked away with a profit");
    } else if (wins==0) {
        System.out.println ("You lost all the money you bet");
    } else {
        System.out.println ("You made back some of the money you bet");
    }
    
    }   //end of main method
}   //end of class