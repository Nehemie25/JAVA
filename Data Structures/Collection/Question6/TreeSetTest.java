import java.util.*;
public class TreeSetTest
{
     
     public static void main (String [] args)
     {
          Set <Integer> treeSet1 = new TreeSet <Integer>();
          treeSet1.add(1);
          treeSet1.add(2);
          treeSet1.add(3);
          treeSet1.add(4);
          treeSet1.add(5);
          treeSet1.add(6);
          treeSet1.add(7);
          treeSet1.add(8);
          treeSet1.add(9);
          treeSet1.add(10);
          treeSet1.add(11);
          
          Iterator <Integer> it = treeSet1.iterator();
          
          while (it.hasNext())
          {
               Integer i = it.next();
               if (i == 7)
               {
                    break;
               }
               System.out.println (i);
          }
     }
}
          
          
