import java.util.Scanner; // we import a class of input purposes
public class SquareCalcs
{
     public static void main (String [] args)
     {
         Scanner scan = new Scanner (System.in);
         double length, perimeter, area;
          System.out.println("please enter the length of the square");
          length = scan.nextDouble(); // store the user input in length
          perimeter = length * 4; // calculate the perimeter and stored it in the variable length
          area = length * length; // calculate the area and saved it in the variable area 
          
          //display the value of the perimeter and the area 
          System.out.println("The perimeter of your square is " + perimeter + " and the area is " + area ); // 
     }
}
          