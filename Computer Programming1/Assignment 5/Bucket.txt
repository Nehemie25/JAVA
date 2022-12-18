/* generic stack used to implement an array stack
 * simulates the behavior of adding and removing elements from a bucket
 * methods: 
 * add() adds a new element on top of the Bucket and throws an Exception if the Bucket is full
 * drawItem() removes an element from the Bucket at a  random position and throws an Exception if the Bucket is empty
 * size() returns the number of elements of the Bucket
 * isEmpty() check if the Bucket has no elements
 * toString() prints the contents of the Bucket
 */




import java.util.Arrays;
import java.util.Random;

public class Bucket<T> 
{
     private final static int DEFAULT_CAPACITY = 10;
     
     private int count;  
     private T[] contents;
     
     
     public Bucket()
     {
          this(DEFAULT_CAPACITY);
     }
     
     
     public Bucket (int initialCapacity)
     {
          count = 0;
          
          contents = (T[])(new Object[initialCapacity]);
     }
     
     
     public void add(T element) throws FullBucketException
     {
          if (size() == contents.length) 
          {
               throw new FullBucketException ("the bucket is full " + element + " cannot be added");
          }
          else
          {
               
               
               contents[count] = element;
               count++;
          }
     }
     
     
     
     public T drawItem() throws EmptyBucketException
     {
          if (isEmpty())
          {
               throw new EmptyBucketException("Your bucket is empty can't draw anaything more from it");
          }
          else
          {
               
               Random rand = new Random();
               int deletedIndex = rand.nextInt (count);
               
               count--; 
               
               
               
               T result = contents[deletedIndex];
               contents[deletedIndex] = contents [count];
               contents [count] = null;
               
               
               return result;
          }
     }
     
     
     
     public boolean isEmpty()
     {
          if (count == 0)
          {
               return true;
          }
          else
          {
               return false;
          }
     }
     
     
     public int size()
     {
          
          return count;  
     }
     
     
     public String toString()
     {
          String res = " \n";
          if (isEmpty())
          {
               res = "The bucket is empty";
          }
          else
          {
               
               
               
               
               for (int i = 0; i < count; i++)
               {
                    res += "element " + i + ": " + contents [i] + "\n";
               }
               
               
          }
          
          
          return res;
     }
}

