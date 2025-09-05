/*This calculates and displays the (int) surface area
 * and (int) volume of a cube based on its side length.
 */

public class Main {
    public static void main(String[] args)
    {
        //declares the side length of a cube      
        double sideLength = 21;
          
        //Formula for the volume of a cube: a^3
        double volumeValue = sideLength * sideLength * sideLength;
          
        //Formula for the surface area of a cube: 6a^2
        double surfaceArea = 6 * sideLength * sideLength;
         
        //prints out the calculated value of the Surface Area and the Volume of a cube. 
        System.out.println("If the side length of a cube is equal to " + sideLength + ", the surface area of the cube is " + (int) surfaceArea + "cm^2");
        System.out.println("");
        System.out.println("If the side length of a cube is equal to " + sideLength + ", the volume of the cube is " + (int) volumeValue + "cm^3");
    }
}
