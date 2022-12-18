import java.util.*;
public class BFS
{
     public static void main (String [] args)
     {
 
          
          int v = 1; 
          int [][] adj = new int [6][6];
          
           adj[1][1] =0;
           adj[1][2] =12;
           adj[1][3] =13;
           adj[1][4] =18;
           adj[1][5] =0;
           adj[2][1] =12;
           adj[2][2] =0;
           adj[2][3] =20;
           adj[2][4] =18;
           adj[2][5] =0;
           adj[3][1] =13;
           adj[3][2] =20;
           adj[3][3] =0;
           adj[3][4] =0;
           adj[3][5] =14;
           adj[4][1] =0;
           adj[4][2] =18;
           adj[4][3] =0;
           adj[4][4] =0;
           adj[4][5] =19;
           adj[5][1] =0;
           adj[5][2] =0;
           adj[5][3] =14;
           adj[5][4] =19;
           adj[5][5] =0;
          
          boolean visited[] = new boolean[6];
		  
		  for (int i = 0; i < 6; i++)
		  {
			  visited[i] = false;
		  }
          
          Queue <Integer> queue = new LinkedList<Integer>();
 
  
        visited[v]=true;
        queue.add(v);
        
        
        while (queue.size() != 0)
        {
           
            v = queue.poll();
            System.out.print(v+" ");
 
            
            
            for (int i=1; i <=5 ; i++)
            {
                
                if (!visited[i] && adj[v][i] !=0)
                {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
     
     
     }
             