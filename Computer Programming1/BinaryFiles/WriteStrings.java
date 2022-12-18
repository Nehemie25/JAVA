import java.io.*;

public class WriteStrings
{
     public static void main (String [] args) throws IOException
     {
          String [] names = {"nke", "nguimbous", "muriel", "serena", "yesous", "steeve"};
          FileOutputStream fstream = new FileOutputStream ("names.dat");
          ObjectOutputStream outputFile = new ObjectOutputStream (fstream);
          
          for (int i = 0; i < names.length; i++)
          {
               outputFile.writeObject (names [i]);
          }
          outputFile.close();
     }
}