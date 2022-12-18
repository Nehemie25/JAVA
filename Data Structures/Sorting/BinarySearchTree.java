public class BinarySearchTree
{
     public class Node
     {
          int key;
          Node left, right;
          
          public Node (int value)
          {
               key = value;
               left = null;
               right = null;
          }
     }
     
     Node root;
     
     public BinarySearchTree ()
     {
          root = null;
     }
     
     public BinarySearchTree (int value)
     {
          root = new Node (value);
     }
  
  public void insert (int value)
  {
   root = insertion (root, value);
  }
     
      public Node insertion (Node root, int key)
     {
          
          if (root == null)
          {
               
               root = new Node (key);
               
               return root;
          }
          
          if (root.key < key)
          {
               root.right = insertion (root.right, key);
          }
          
          if (root.key > key)
          {
               root.left = insertion (root.left, key);
          }
          
          return root;
     }
      
      public int search (int value)
      {
           return searching (root, value);
      }
     
     
     public static int searching (Node root, int key)
     {
          if (root == null || root.key == key)
          {
               return root.key;
          }
          else if (root.key < key)
          {
               return searching (root.right, key);
          }
          else
          {
               return searching (root.left, key);
          }
     }
     
     public static void main (String [] args)
     {
   
   BinarySearchTree tree1 = new BinarySearchTree (5);
   
    tree1.insert (5);
    tree1.insert (6);
    tree1.insert (7);
    
    System.out.println (tree1.search (6));
    
  
   
     }
     
}


