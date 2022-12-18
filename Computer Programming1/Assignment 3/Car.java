public class Car extends Vehicle
{
     private int doors;
     
     public Car ()
     {
          super ();
          doors = 0;
     }
     
     public Car (String newModel, int newYear, double newPrice, int newDoors)
     {
          super (newModel, newYear, newPrice);
          doors = newDoors;
     }
     public int getDoors()
     {
          return doors;
     }
     public void setDoors (int newDoors)
     {
          doors = newDoors;
     }
     public String toString()
     {
          return super.toString() + " and has " + doors + " doors";
     }
     
     public boolean equals (Object o)
     {
          boolean res = super.equals (o); // Firstly we test if they are the same vehicle
          
          // Then we test if they are the same bicycle;
          if (res)
          {
               if (!(o instanceof Car))
               {
                    return false;
               }
               
               Car car1 = (Car)o;
               
               return  ((car1.doors) == (this.doors));
          }
          else
          {
               return false;
          }
     }
     
}
