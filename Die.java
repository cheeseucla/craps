/**
 * 
 * @version 1-18-2022
 * @author Hudson Stimmler
 */

public class Die{
    //Fields
    private int DieNum; 

    //constuctor(s)
    public Die(){
        DieNum = (int)(Math.random() * 6 + 1);
    }

    //methods
    public int getDie(){
        return DieNum;
    }
}

    

    