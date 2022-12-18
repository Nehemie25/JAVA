public class Quick
{
     
     public static void swap (int [] data, int pos1, int pos2)
     {
          int temp = data [pos1];
          data [pos1] = data [pos2];
          data [pos2] = temp;
     }
     
     public static void quickSort (int [] data)
     {
          quickSort (data, 0, data.length - 1);
     }
     
     public static void quickSort (int [] data, int min, int max)
     {
          
          if (min < max)
          {
               int pivot = partition (data, min, max);
               
               quickSort (data, min, pivot - 1);
               quickSort (data, pivot + 1, max);
          }
     }
          
          public static int partition (int [] data, int first, int last)
          {
               int pivot;
               int up, down;
               int middle = (first + last ) /2;
               
               pivot = data [middle];
               
               swap (data, middle, first);
               
               up = first; 
               down = last;
               
               while (up < down)
               {
                    
                    while (up < down && data [up] <= pivot)
                    {
                         up++;
                    }
                    
                    while (data [down] > pivot)
                    {
                         down--;
                    }
                    if (up < down)
                    {
                         
                         swap (data, up, down);
                    }
                   
               }
               
               swap (data, first, down);
                return down;
          }
     public static void main (String [] args)
     {
          int [] datas = {44, 75, 23, 43, 55, 12, 64, 77};
          
          quickSort (datas);
          
          for (int i = 0; i < datas.length; i++)
          {
               System.out.println (datas [i]);
          }
     }
}
               
          