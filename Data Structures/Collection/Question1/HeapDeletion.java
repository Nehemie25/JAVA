
public class HeapDeletion {
 
    
    static void heapify(int [] tab, int n, int i)
    {
        int highest = i; 
        int left = 2 * i + 1; 
        int right = 2 * i + 2; 
 
        
        if (left < n && tab[left] > tab[highest])
            highest = left;
 
        
        if (right < n && tab[right] > tab[highest])
            highest = right;
 
        
        if (highest != i) {
            int temp = tab[i];
            tab[i] = tab[highest];
            tab[highest] = temp;
 
            
            heapify(tab, n, highest);
        }
    }
 
   
    static int deleteRoot(int [] tab, int n)
    {
        
        int last = tab[n - 1];
 
      
        tab[0] = last;
 
      
        n = n - 1;
 
       
        heapify(tab, n, 0);
 
      
        return n;
    }
 
    static void showTab(int [] tab, int n)
    {
        for (int i = 0; i < n; ++i)
            System.out.print(tab[i] + " ");
 
        System.out.println();
    }
 
 
    public static void main(String [] args)
    {
        
        int tab[] = { 17, 14, 25, 2, 36, 7,0 };
 
       
 
        int n = deleteRoot(tab, tab.length);
 
        showTab(tab, n);
    }
}