import java.util.Scanner;
import java.io.*;
public class BinaryTest
{
     public static void main (String [] args) throws IOException, ClassNotFoundException
     {
          Pet pet1 = new Pet ("Rex", 5);
          Pet pet2;
          FileOutputStream fstream = new FileOutputStream ("Mypet.dat", true);
          String text = "";
          String  text1 = "Hello world";
          ObjectOutputStream outputFile = new ObjectOutputStream (fstream);
          outputFile.writeObject (text1);
          
          FileInputStream gstream = new FileInputStream ("Mypet.dat");
          ObjectInputStream inputFile = new ObjectInputStream (gstream);
          
          pet2 = (Pet)inputFile.readObject();
          text = (String)inputFile.readObject();
          
          System.out.println (pet2);
          System.out.println (text);
          
          
          
          
          
          outputFile.close();
          inputFile.close();
     }
}