import java.util.Random;
public class StudentId
{
     public static void main (String [] args )
     {
          Random rand = new Random();
          String studentId = "";
          System.out.println ("Student number generator ");
          studentId = "T" + (rand.nextInt (75 -10 + 1 ) + 10) + (rand.nextInt (8 -3 + 1) + 3) + (rand.nextInt (70000 -30001) + 30001);
          System.out.printf ("New Student Number: %s " , studentId);
     }
}