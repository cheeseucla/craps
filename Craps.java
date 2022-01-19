/**
 * 
 * 
 * @version 1-18-2022
 * @author Hudson Stimmler
 */
import java.util.*;
public class Craps {
    public static void main(String[] args){
        boolean response = playGame();
        if(response){
            giveInstructions();
            rollDie();
        }
        if(!response){

        }
    }

    public static boolean playGame(){
        boolean response = false;
        System.out.println("Would you like to play craps? (yes/no): ");
        Scanner input = new Scanner(System.in);
        String answer = input.next();
        if(answer.equals("yes")){
            response = true;
        }
        else{
            response = false;
        }
        return response;
    }

    public static void giveInstructions(){
        System.out.println("Do you know how to play craps? (yes/no): ");
        Scanner input = new Scanner(System.in);
        String answer = input.next();
        if(answer.equals("no")){
            System.out.println("1. A player rolls two six-sided dice and adds the numbers rolled together.");
            System.out.println("2. On this first roll, a 7 or an 11 automatically wins, and a 2, 3, or 12 automatically loses, and play is over. If a 4, 5, 6, 8, 9, or 10 are rolled on this first roll, that number becomes the point.");
            System.out.println("3. The player continues to roll the two dice again until one of two things happens: either they roll the point from that first roll again, in which case they win; or they roll a 7, in which case they lose.");
        }
        else{}
    }

    public static void rollDie(){
        Die a = new Die();
        Die b = new Die();
        int total = a.getDie() + b.getDie();
        System.out.println("Press <Enter> to roll: ");
        Scanner in = new Scanner(System.in);
        String low = in.nextLine();
        if(low.equals("")){
            System.out.println("You rolled a " + total);
            if(total == 7 || total == 11){
                System.out.println("You Win!");
            }
            if(total == 2 || total == 3 || total == 12){
                System.out.println("You Lose :(");
            }
            else{
                boolean alpha = true;
                while(alpha){
                    System.out.println("Your point is: " + total);
                    System.out.println("Press <Enter> to roll again: ");
                    Scanner on = new Scanner(System.in);
                    String hehe = on.nextLine();
                    if(hehe.equals("")){}
                        Die c = new Die();
                        Die d = new Die();
                        int total1 = c.getDie() + d.getDie();
                        System.out.println("You rolled a " + total1);
                        if(total1 == total){
                            System.out.println("You Win!");
                            alpha = false;
                        }
                        else if(total1 == 7){
                            System.out.println("You Lose :(");
                            alpha = false;
                        }
                        else{
                            System.out.println("Keep on rolling!");
                        }
                    }
                }
            }
        }
}