//Jeffrey Seto
//September 8, 2014
//CSE 002
//Arithmetic Java Program
//

public class Arithmetic {
    public static void main (String[] args) {
        
    int nSocks=3;   //Store number of pairs of socks
    //Cost per pair of socks
    double sockCost$=2.58;
    
    //Number of drinking glasses
    int nGlasses=6;
    //Cost per glass
    double glassCost$=2.29;
    
    //Number of boxes of envelopes
    int nEnvelopes=1;
    //Cost per box of envelopes
    double envelopesCost$=3.25;
    double taxPercent=0.06;
    
    double totalSockCost$;  //total cost of socks
    double totalGlassCost$;  //total cost of glasses
    double totalEnvelopeCost$;  //total cost of envelopes
    double totalCost$;  //total cost of purchases before tax
    double salesTax$;   //sales tax for total cost
    double SockTax$;    //sales tax on socks
    double GlassTax$;   //sales tax on glasses
    double EnvelopeTax$;    //sales tax on envelopes
    
    totalSockCost$=nSocks*sockCost$; //calculate total cost of socks
    SockTax$=totalSockCost$*taxPercent; //calculate sales tax on socks
    totalGlassCost$=nGlasses*glassCost$; //calculate total cost of glasses
    GlassTax$=totalGlassCost$*taxPercent; //calculate sales tax on glasses
    totalEnvelopeCost$=nEnvelopes*envelopesCost$; //calculate total cost of envelopes
    EnvelopeTax$=totalEnvelopeCost$*taxPercent; ////calculate sales tax on envelopes
    totalCost$=totalSockCost$+totalGlassCost$+totalEnvelopeCost$; //calculate total cost of purchases
    salesTax$=totalCost$*taxPercent; //calculate sales tax for total cost
    
    double totalPaid$; //total paid for transaction, including sales tax
    totalPaid$=totalCost$+salesTax$;
    
    //print out output data
    System.out.println ("Socks");
    System.out.println ("Number bought: "+nSocks);
    System.out.println ("Cost per pair: $"+sockCost$);
    System.out.println ("Total cost of item: $"+totalSockCost$);
    System.out.println ("Sales tax on socks: $"+SockTax$);
    System.out.println (" ");
    System.out.println ("Glasses");
    System.out.println ("Number bought: "+nGlasses);
    System.out.println ("Cost per glass: $"+glassCost$);
    System.out.println ("Total cost of item: $"+totalGlassCost$);
    System.out.println ("Sales tax on glasses: $"+GlassTax$);
    System.out.println (" ");
    System.out.println ("Envelopes");
    System.out.println ("Number bought: "+nEnvelopes);
    System.out.println ("Cost per box: $"+envelopesCost$);
    System.out.println ("Total cost of item: $"+totalEnvelopeCost$);
    System.out.println ("Sales tax on envelopes: $"+EnvelopeTax$);
    System.out.println (" ");
    System.out.println ("Total cost of purchases (before tax): $"+totalCost$);
    System.out.println ("Total sales tax: $"+salesTax$);
    System.out.println ("Total cost of purchases, including sales tax: $"+totalPaid$);
    
    
    }
}