/* Vehicle class implements the Comparable interface
 * implements the compareTo method 
 */

public class Vehicle implements Comparable <Vehicle>
{ 
     protected String model;
     protected int year;
     protected double price;
     
     public Vehicle ()
     {
          model = "not defined";
          year = 0;
          price = 0.0;
     }
     
     public Vehicle (String newModel, int newYear, double newPrice)
     {
          model = newModel;
          year = newYear;
          price = newPrice;
     }
     
     
     public String getModel ()
     {
          return model;
     }
     
     public int getYear ()
     {
          return year;
     }
     
     public double getPrice ()
     {
          return price;
     }
     
     public void setModel (String newModel)
     {
          model = newModel;
     }
     public void setYear (int newYear)
     {
          year = newYear;
     }
     public void setPrice (double newPrice)
     {
          price = newPrice;
     }
     
     
     public String toString ()
     {
          String res = String.format (" is a %s, built in %d and cost %.2f$", model, year, price);
          return res;
     }
     
     public boolean equals (Object o)
     {
          if (o == null)
          {
               return false;
          }
          if (o == this)
          {
               return true;
          }
          if (!(o instanceof Vehicle))
          {
               return false;
          }
          Vehicle vehicle1 = (Vehicle)o;
          
          return ( 
                  ((vehicle1.model).equals(this.model)) && 
                  ((vehicle1.year) == (this.year)) &&
                  ((vehicle1.price) == (this.price))
                 );
     }
     
     public int compareTo (Vehicle v)
     {
          if (this.price < v.price)
          {
               return -1;
          }
          else if (this.price == v.price)
          {
               return 0;
          }
          else
          {
               return 1;
          }
     }
}