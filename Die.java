/**
 * 
 * @version 1-18-2022
 * @author Hudson Stimmler
 */

public class Die{
    //Fields
    private int DieNum; 

    //constuctor(s)
    
    //returns a number 1-6
    public Die(){
        DieNum = (int)(Math.random() * 6 + 1);
    }

    //methods

    //Returns the number rolled with the Die
    public int getDie(){
        return DieNum;
    }
}

    

    