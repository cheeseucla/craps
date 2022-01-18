/**
 * 
 * 
 * @version 10-17-2021
 * @author Hudson Stimmler
 */

public class NewClass {
    //fields
    private double xcoord; 
    private double ycoord;
    private double radius; 


    //constuctor(s)
    public Circle(double myXcoord, double myYcoord, double myRadius){
        xcoord = myXcoord;
        ycoord = myYcoord;
        radius = myRadius;

    }

    //methods
    public boolean isOnCircle(double x, double y){
        System.out.println("The points (" + x + ", " + y + ") are on the circle");
        if (((xcoord - x) * (xcoord - x)) + ((ycoord - y) * (ycoord - y)) ==  (radius) * (radius)){
            return true;
        }
        else{
            return false;
        }
    }

    public double getRadius(){
        return radius;
    }

    public void changeCenter(double a, double b){
        xcoord = a;
        ycoord = b;
    }

    public String getCenter(){
        return ("" + xcoord + ", " + ycoord);
    }
}