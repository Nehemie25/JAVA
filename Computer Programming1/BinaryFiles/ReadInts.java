import java.io.*;
public class ReadInts
{
     public static void main (String [] args) throws IOException
     {
          FileInputStream fstream = new FileInputStream ("numbers.dat");
          ObjectInputStream inputFile = new ObjectInputStream (fstream);
          boolean endOfFile = false;
          int number = 0;
          
          while (!endOfFile)
          {
              try
              {
               
               number = inputFile.readInt ();
               System.out.println ("number :" + number);
              }
              catch (EOFException e)
              {
                   endOfFile = true;
              }
          }
          
          inputFile.close();
     }
}
               
          