/**
 * 
 * @version 1-18-2022
 * @author Hudson Stimmler
 */

import java.util.*;
public class Die{
    //Fields
    private int DieNum; 

    //constuctor(s)
    public DieNum(){
        DieNum = (int)(Math.random() * 6 + 1);
    }

    //methods
    public int getDie(){
        return DieNum;
    }
}

    

    