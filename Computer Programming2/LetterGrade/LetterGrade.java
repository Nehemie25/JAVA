import java.util.Scanner;
public class LetterGrade
{
     public static void main (String [] args)
     {
          
          Scanner scan = new Scanner (System.in);
          double grade = 0.0, gpa = 0.0, roundedGrade = 0.0;
          String letterGrade = "";
          System.out.print ("Grade in %: \n");
          grade = scan.nextDouble();
          roundedGrade = Math.round (grade);
           if (roundedGrade >= 90 && roundedGrade <= 100)
           {
                letterGrade = "A+";
                gpa = 4.33;
           }
           else if (roundedGrade >= 85 && roundedGrade < 90)
           {
                letterGrade = "A";
                gpa = 4.0;
           }
            else if (roundedGrade >= 80 && roundedGrade < 85)
           {
                letterGrade = "A-";
                gpa = 3.67;
           }
            else if (roundedGrade >= 77 && roundedGrade <= 79 )
           {
                letterGrade = "B+";
                gpa =3.33 ;
           }
            else if (roundedGrade >= 73 && roundedGrade < 77)
           {
                letterGrade = "B";
                gpa = 3.0;
           }
            else if (roundedGrade >= 70 && roundedGrade <= 72)
           {
                letterGrade = "B-";
                gpa = 2.67;
           }
            else if (roundedGrade >= 65 && roundedGrade < 70)
           {
                letterGrade = "C+";
                gpa = 2.33;
           }
            else if (roundedGrade >= 60 && roundedGrade < 65)
           {
                letterGrade = "C";
                gpa = 2.0;
           }
            else if (roundedGrade >= 55 && roundedGrade < 60)
           {
                letterGrade = "C-";
                gpa = 1.67;
           }
            
            else if (roundedGrade >= 50 && roundedGrade < 55)
           {
                letterGrade = "D";
                gpa = 1.0;
           }
            
            else if (roundedGrade >= 0 && roundedGrade < 50)
           {
                letterGrade = "F";
                gpa = 0.0;
           }
           else
           {
                System.out.println ("Your grade is incorrect");
           }
           System.out.printf ("LG : %s, GP: %.2f", letterGrade, gpa);
           
     }
}
            
            
            
            
            
            
           