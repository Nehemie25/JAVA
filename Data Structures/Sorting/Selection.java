public class Selection 
{
     public static void selectionSort (int [] data)
     {
          
          int temp = 0;
          
          for (int i = 0; i < data.length - 1; i++)
          {
               int min = i;
               for (int j = i + 1; j < data.length; j++)
               {
                    if (data [j] < data [min])
                    {
                         min = j;
                    }
               }
               temp = data [i];
               data [i] = data [min];
               data [min] = temp;
          }
     }
     public static void main (String [] args)
     {
          int [] data = {6, 3, 4, 2, 7};
          selectionSort (data);
          
          for (int i = 0; i < data.length; i++)
          {
               System.out.println (data [i]);
          }
     }
}

