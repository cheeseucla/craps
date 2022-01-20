/**
 * 
 * 
 * @version 1-18-2022
 * @author Hudson Stimmler
 */
import java.util.*;
public class Craps {
    //executes the program with the methods
    public static void main(String[] args){
        boolean response = playGame();
        giveInstructions();
        //Makes the game re-playable
        while(response){
            rollDie();
            int ret = keepPlaying();
            //if agreed, this keeps the boolean true so the user can play again
            if(ret == 1){
                response = true;
            }
            //if disagreed, this keeps the boolean false so the game ends
            else{
                response = false;
                System.out.println("Thank you for playing");
            }
        }
    }
    //determines whether the user wants to play the game or not
    public static boolean playGame(){
        boolean response = false;
        System.out.println("Would you like to play craps? (yes/no): ");
        Scanner input = new Scanner(System.in);
        String answer = input.next();
        if(answer.toUpperCase().equals("YES")){
            response = true;
        }
        else{
            response = false;
        }
        return response;
    }
    //gives instructions or not depending on how the user responds
    public static void giveInstructions(){
        System.out.println("Do you know how to play craps? (yes/no): ");
        Scanner input = new Scanner(System.in);
        String answer = input.next();
        if(answer.toUpperCase().equals("NO")){
            System.out.println("1. A player rolls two six-sided dice and adds the numbers rolled together.");
            System.out.println("2. On this first roll, a 7 or an 11 automatically wins, and a 2, 3, or 12 automatically loses, and play is over. If a 4, 5, 6, 8, 9, or 10 are rolled on this first roll, that number becomes the point.");
            System.out.println("3. The player continues to roll the two dice again until one of two things happens: either they roll the point from that first roll again, in which case they win; or they roll a 7, in which case they lose.");
        }
        else{}
    }
    //the game 
    public static void rollDie(){
        //the users first roll
        Die a = new Die();
        Die b = new Die();
        //the total from the roll
        int total = a.getDie() + b.getDie();
        System.out.println("Press <Enter> to roll: ");
        Scanner in = new Scanner(System.in);
        String low = in.nextLine();
        if(low.equals("")){
            System.out.println("You rolled a " + total);
            //determines winner
            if(total == 7 || total == 11){
                System.out.println("You Win!");
            }
            //determines loser
            else if(total == 2 || total == 3 || total == 12){
                System.out.println("You Lose :(");
            }
            //determines the point system if the user plays again
            else if(total == 1 || total == 4 || total == 5 || total == 6 || total == 8 || total == 9 || total == 10){
                boolean alpha = true;
                //keeps the reroll infinite until you win or lose
                while(alpha){
                    System.out.println("Your point is: " + total);
                    System.out.println("Press <Enter> to roll again: ");
                    Scanner on = new Scanner(System.in);
                    String hehe = on.nextLine();
                    if(hehe.equals("")){}
                        //the reroll
                        Die c = new Die();
                        Die d = new Die();
                        int total1 = c.getDie() + d.getDie();
                        System.out.println("You rolled a " + total1);
                        //determines winner
                        if(total1 == total){
                            System.out.println("You Win!");
                            alpha = false;
                        }
                        //determines loser
                        else if(total1 == 7){
                            System.out.println("You Lose :(");
                            alpha = false;
                        }
                        //determines if the user must roll again
                        else{
                            System.out.println("Keep on rolling!");
                        }
                    }
                }
            }
        }
    //determines is the user wants to play again
    public static int keepPlaying(){
        System.out.println("Would you like to play again (yes/no): ");
        Scanner bu = new Scanner(System.in);
        String again = bu.next();
        int ret = 0;
        if(again.toUpperCase().equals("YES")){
            ret = 1;
        }
        else{
            ret = 2;
        }
        return ret;
    }
}