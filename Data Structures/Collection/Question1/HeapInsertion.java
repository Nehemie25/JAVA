public class HeapInsertion {
 
    static void heapify(int[] tab, int n, int i)
    {
     
        int parent = (i - 1) / 2;
     
        if (tab[parent] > 0) {
           
            if (tab[i] > tab[parent]) {
                 
                 
                int temp = tab[i];
                tab[i] = tab[parent];
                tab[parent] = temp;
               
                heapify(tab, n, parent);
            }
        }
    }
 
    static int insert(int[] tab, int n, int value)
    {
        n = n + 1;
     
        tab[n - 1] = value;
     
        
        heapify(tab, n, n - 1);
         
 
        return n;
    }
 
 
    static void showTab(int[] tab, int n)
    {
        for (int i = 0; i < n; ++i)
            System.out.println(tab[i] + " ");
 
        System.out.println();
    }
 
   
    public static void main(String args[])
    {
        
       
        int[] tab = new int[10];
         
       
        tab[0] = 4;
        tab[1] = 8;
        tab[2] = 10;
        tab[3] = 1;
        tab[4] = 5;
         
        int n = 5;
 
        int value = 15;
     
        n = insert(tab, n, value);
 
        showTab(tab, n);
        
    }
}