public class Insertion {
     
     
     
      public  static void insertionSort (int [] data)
          {
               for (int i = 0; i < data.length; i++)
               {
                    int key = data [i];
                    int position = i;
                    
                    while (position >0 && data [position - 1] > key)
                    {
                         data [position] = data [position -1];
                         position --;
                    }
                    data [position] = key;
               }
          }
     
     public static void main (String [] args) 
     {
          
          int [] datas = {6, 3, 4, 2, 7};
          
          
         
          
          insertionSort (datas);
          
          for (int j = 0; j < datas.length; j++)
          {
               System.out.println (datas [j]);
          }
     }
}
