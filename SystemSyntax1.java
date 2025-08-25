public class Main {
  public static void main(String[] args) {
//prints out NATHAN using the letter "O" in ASCII art
    System.out.println("O   O     O   OOOOOO  O   O     O     O   O");
    System.out.println("OO  O    O O    O     O   O    O O    OO  O");
    System.out.println("O O O   OOOOO   O     OOOOO   OOOOO   O O O");
    System.out.println("O  OO  O     O  O     O   O  O     O  O  OO");
    System.out.println("O   O O       O O     O   O O       O O   O");
//Computes the following math problem
    System.out.println("");
    System.out.println("The answer to (6.0*(3.5-1.5*5))/(55.6-30.2) is " + (6.0*(3.5-1.5*5))/(55.6-30.2));
//Finds the circumference and area of a circle 
    System.out.println("");
 final double pi = 3.14;
    double radius = 4.0; 
    double area = ((radius * radius) * pi);
    double circumference = (2.0*pi*radius);
    System.out.println("If the radius of a circle = 4.0, the area of the circle is " + area);
    System.out.println("If the radius of a circle = 4.0, circumference of the circle is " + circumference);
  }
}
