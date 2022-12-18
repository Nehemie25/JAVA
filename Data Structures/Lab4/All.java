import java.util.*;

public class All
{
     public static void main (String [] args)
     {
          Integer[] arr1 = {10, 15, 4, 6, 78, 14};
          Integer [] arr2 = {13, 8, 23, 6, 78, 24};
          Integer [] arr3 = {1, 5, 41, 62, 8, 14};
          Integer [] arr4 ={13, 8, 23, 6, 78, 24};
          
          Set <Integer> set1 = new HashSet <>(Arrays.asList(arr1));
          Set <Integer> set2 = new HashSet <> (Arrays.asList(arr2));
          Set <Integer> set3 = new HashSet <>(Arrays.asList(arr3));
          Set <Integer> set4 = new HashSet <>(Arrays.asList(arr4));
          
          
          System.out.println ("set1 = "+ set1);
          System.out.println ("set2 = "+ set2);
          System.out.println ("set3 = "+ set3);
          System.out.println ("set4 = "+ set4);
          set1.addAll(set2);
          set2.retainAll(set3);
          set3.containsAll(set4);
          System.out.println("The union of  set1  and set2  is " + set1);
          System.out.println("The interrsection of set2 and set3 is " + set2);
          System.out.println("is set3 fully contained in set4  ? " + set3.containsAll(set4));
     }
}
          
         