public class Bicycle extends Vehicle
{
     private String type;
     
     public Bicycle ()
     {
          super();
          type = "none";
     }
     
     public Bicycle (String newModel, int newYear, double newPrice, String newType)
     {
          super(newModel, newYear, newPrice);
          type = newType;
     }
     
     public String getType ()
     {
          return type;
     }
     public void setType (String newType)
     {
          type = newType;
     }
     public String toString()
     {
          String res = super.toString() + " and the type is " + type;
          return res;
     }
     
     public boolean equals (Object o)
     {
          boolean res = super.equals (o); // Firstly we test if they are the same vehicle
          
          // Then we test if they are the same bicycle;
          if (res)
          {
               if (!(o instanceof Bicycle))
               {
                    return false;
               }
               
               Bicycle bicycle1 = (Bicycle)o;
               
               return  ((bicycle1.type).equals (this.type));
          }
          else
          {
               return false;
          }
     }
     
     
}