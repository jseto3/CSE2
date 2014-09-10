//Jeffrey Seto
//September 5, 2014
//CSE 002
//Cyclometer
//

//
//
public class Cyclometer {
    public static void main (String[] args) {
        
    int secsTrip1=480;  //Store number of seconds for trip 1
    int secsTrip2=3220;   //Store number of seconds for trip 2
    int countsTrip1=1561;   //Store number of tire rotations for trip 1
    int countsTrip2=9037;   //Store number of tire rotations for trip 2
    
    double wheelDiameter=27.0,  //Store diameter of wheel
    PI=3.14159, //Store the value of PI
    feetPerMile=5280,   //Store the number of feet in a mile
    inchesPerFoot=12,   //Store the number of inches in a foot
    secondsPerMinute=60;   //Store the number of seconds in a minute
    double distanceTrip1, distanceTrip2, totalDistance;  //
    
    System.out.println ("Trip 1 took "+(secsTrip1/secondsPerMinute)+"minutes and had "+countsTrip1+" counts.");
    System.out.println ("Trip 2 took "+(secsTrip1/secondsPerMinute)+"minutes and had "+countsTrip2+" counts.");
    
    distanceTrip1=countsTrip1*wheelDiameter*PI;
    //above gives distance in inches
    //(for each count, a rotation of the wheel travels
    //the diameter in inches times PI)
    distanceTrip1/=inchesPerFoot*feetPerMile;   //gives distance in miles
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    totalDistance=distanceTrip1+distanceTrip2;
    
        //print out the output data
    System.out.println ("Trip 1 was "+distanceTrip1+" miles");
    System.out.println ("Trip 2 was "+distanceTrip2+" miles");
    System.out.println ("The total distance was "+totalDistance+" miles");
    
    }   //end of main method
}   //end of class