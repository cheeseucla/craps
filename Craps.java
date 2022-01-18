/**
 * 
 * 
 * @version 1-18-2022
 * @author Hudson Stimmler
 */

public class Craps {
    public static void main(String[] args){
        Die a = new Die();
        Die b = new Die();
        int total = a.getDie() + b.getDie();
        System.out.println("The first die is: " + a.getDie() + " The second die is: " + b.getDie() + " the total is: " + total); 
    }
}