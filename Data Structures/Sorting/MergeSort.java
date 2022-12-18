public class MergeSort
{
     public static void mergeSort (int [] data)
     {
          mergeSort (data, 0, data.length -1);
     }
     
     private static void mergeSort (int [] data, int min, int max)
     {
          if (min < max)
          {
               int mid = (min + max)/ 2;
               
               mergeSort (data, min, mid);
               mergeSort (data, mid + 1, max);
               merge (data, min, mid, max);
          }
     }
     private static void merge (int [] data, int first, int mid, int last)
     {
          int [] temp = new int [data.length];
          int first1 = first, last1 = mid;  // first subarray
          int first2 = mid + 1, last2 = last;  // second subarray
          
          int index = first1;
          
          // copy smaller item from each subarray into a temporary array  
          // until one of the subarray is exhausted
          
          while (first1 <= last1 && first2 <= last2)
          {
               if (data [first1] < data [first2])
               {
                   temp [index] = data [first1];
                   first1++;
               }
               
               else
               {
                    temp [index] = data [first2];
                    first2++;
               }
               
               index++;
          }
          // copy the remaining elements from first subarray if any
          
          while (first1 <= last1)
          {
               temp [index] = data [first1];
               
               first1++;
               
               index++;
          }
          
          while (first2 <= last2)
          {
               temp [index] = data [first2];
               
               first2++;
               
               index++;
          }
          
          // copy the merged data into the original array
          
          for (index = first; index <= last; index++)
          {
               data [index] = temp [index];
          }
     }
          
          
          
          
          
          
     
     
     public static void main (String [] args)
     {
          
          
          int [] data = {2, 4, 1, 6, 8, 5, 3, 7};
          mergeSort (data);
          
          for (int i = 0; i < data.length; i++)
          {
               System.out.println (data [i]);
          }
     
     }
}