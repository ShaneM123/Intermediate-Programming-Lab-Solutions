
/**
 * Write a description of class DiceGame3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DiceGame3
{
    // instance variables - replace the example below with your own
    

    /**
     * 
     */
    public static void main(String[] args)
    {
        int firstRoll=0;
        int secondRoll=0;
        
        // initialise instance variables
        DiceV2 Dice1 = new DiceV2();
  
        Dice1.rollDice();
        firstRoll=Dice1.reportDice();
        
        Dice1.rollDice();
        secondRoll=Dice1.reportDice();
        
        System.out.println("Value of 1st roll is: "+firstRoll);
        System.out.println("Value of 2nd roll is: "+secondRoll);
        
        if(firstRoll==secondRoll) {
                System.out.println("You're a winner");
            }
        
        while(firstRoll!=secondRoll){
            Dice1.rollDice();
            firstRoll=Dice1.reportDice();
            
            Dice1.rollDice();
            secondRoll=Dice1.reportDice();
            
            System.out.println("Value of 1st roll is: "+firstRoll);
            System.out.println("Value of 2nd roll is: "+secondRoll);
        
            if(firstRoll==secondRoll) {
                System.out.println("You're a winner");
            }
            
        }

    }
}
