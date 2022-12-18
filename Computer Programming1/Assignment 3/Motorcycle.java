public class Motorcycle extends Vehicle
{
     private int size;
     
     public Motorcycle ()
     {
          super();
          size = 0;
     }
     
     public Motorcycle (String newModel, int newYear, double newPrice, int newSize)
     {
          super (newModel, newYear, newPrice);
          size = newSize;
     }
     public int getSize ()
     {
          return size;
     }
     public void setSize (int newSize)
     {
          size = newSize;
     }
     
     public String toString ()
     {
          
          return super.toString() + " and has a size of " + size;
     }
     
     public boolean equals (Object o)
     {
          boolean res = super.equals (o); // Firstly we test if they are the same vehicle
          
          // Then we test if they are the same bicycle;
          if (res)
          {
               if (!(o instanceof Motorcycle))
               {
                    return false;
               }
               
               Motorcycle motorcycle1 = (Motorcycle)o;
               
               return  ((motorcycle1.size) == (this.size));
          }
          else
          {
               return false;
          }
     }
     
}