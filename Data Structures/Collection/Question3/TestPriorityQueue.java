import java.util.*;

public class TestPriorityQueue
{
     public static void main (String [] args)
     {
          PriorityQueue<Integer> numbers = new PriorityQueue<Integer>();
          
          numbers.add (5);
          numbers.add (4);
          numbers.add (15);
          numbers.add (2);
          numbers.add (0);
          numbers.add (23);
          
          System.out.println (numbers.poll());
     }
}
          
          