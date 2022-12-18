/*Tests the compareTo method for the Vehicle class and it child classes.
 * creates an array of 6 vehicles, displays them and compares them using the compareTo method
 */
public class Driver
{
     public static void main (String [] args)
     {
          Vehicle cheaperV = new Vehicle();
          Vehicle expensiveV = new Vehicle();
          
          
          Vehicle v1 = new Vehicle ("Toyota", 2008, 18000);
          Vehicle v2 = new Vehicle ("Toyota", 2008, 20000);
          Vehicle v3 = new Vehicle ("Toyota", 2008, 15000);
          Vehicle v4 = new Vehicle ("Toyota", 2000, 18000);
          
          Bicycle bike1 = new Bicycle ("BMX", 2003, 4000, "one-person");
          Bicycle bike2 = new Bicycle ("BMX", 2003, 5000, "one-person");
          Bicycle bike3 = new Bicycle ("BMX", 2003, 3000, "one-person");
          Bicycle bike4 = new Bicycle ("BMX", 2003, 4000, "one-person");
          
          Motorcycle motor1 = new Motorcycle ("GP", 2011, 15000, 485);
          Motorcycle motor2 = new Motorcycle ("GP", 2011, 19000, 485);
          Motorcycle motor3 = new Motorcycle ("GP", 2011, 12000, 485);
          Motorcycle motor4 = new Motorcycle ("GP", 2011, 15000, 485);
          
          
          System.out.println ("Testing the CompareTo method for the Vehicle objects");
          System.out.println();
          System.out.println ("v1 " + v1);
          System.out.println ("v2 " + v2);
          System.out.println ("v3 " + v3);
          System.out.println ("v4 " + v4);
          System.out.println();
          
          if (v1.compareTo (v2) < 0)
          {
               System.out.println ("v1 is cheaper than v2");
          }
          else if (v1.compareTo (v2) == 0)
          {
               System.out.println ("v1 and v2 have the same price");
          }
          else
          {
               System.out.println ("v1 is more expensive than v2");
          }
          
          if (v1.compareTo (v3) < 0)
          {
               System.out.println ("v1 is cheaper than v3");
          }
          else if (v1.compareTo (v3) == 0)
          {
               System.out.println ("v1 and v3 have the same price");
          }
          else
          {
               System.out.println ("v1 is more expensive than v3");
          }
          
          if (v1.compareTo (v4) < 0)
          {
               System.out.println ("v1 is cheaper than v4");
          }
          else if (v1.compareTo (v4) == 0)
          {
               System.out.println ("v1 and v4 have the same price");
          }
          else
          {
               System.out.println ("v1 is more expensive than v4");
          }
          
          System.out.println(); 
          
          
          
          System.out.println ("Testing the CompareTo method for the Bicycle objects");
          System.out.println();
          System.out.println ("bike1 " + bike1);
          System.out.println ("bike2 " + bike2);
          System.out.println ("bike3 " + bike3);
          System.out.println ("bike4 " + bike4);
          System.out.println();
          if (bike1.compareTo (bike2) < 0)
          {
               System.out.println ("bike1 is cheaper than bike2");
          }
          else if (bike1.compareTo (bike2) == 0)
          {
               System.out.println ("bike1 and bike2 have the same price");
          }
          else
          {
               System.out.println ("bike1 is more expensive than bike2");
          }
          
          
          if (bike1.compareTo (bike3) < 0)
          {
               System.out.println ("bike1 is cheaper than bike3");
          }
          else if (bike1.compareTo (bike3) == 0)
          {
               System.out.println ("bike1 and bike3 have the same price");
          }
          else
          {
               System.out.println ("bike1 is more expensive than bike3");
          }
          
          if (bike1.compareTo (bike4) < 0)
          {
               System.out.println ("bike1 is cheaper than bike4");
          }
          else if (bike1.compareTo (bike4) == 0)
          {
               System.out.println ("bike1 and bike4 have the same price");
          }
          else
          {
               System.out.println ("bike1 is more expensive than bike4");
          }
          
          
          
          
          System.out.println();
          System.out.println ("Testing the CompareTo method for the Motorcycle objects");
          System.out.println();
          System.out.println ("motor1 " + motor1);
          System.out.println ("motor2 " + motor2);
          System.out.println ("motor3 " + motor3);
          System.out.println ("motor4 " + motor4);
          System.out.println();
          
          if (motor1.compareTo (motor2) < 0)
          {
               System.out.println ("motor1 is cheaper than motor2");
          }
          else if (motor1.compareTo (motor2) == 0)
          {
               System.out.println ("motor1 and motor2 have the same price");
          }
          else
          {
               System.out.println ("motor1 is more expensive than motor2");
          }
          
          if (motor1.compareTo (motor3) < 0)
          {
               System.out.println ("motor1 is cheaper than motor3");
          }
          else if (motor1.compareTo (motor3) == 0)
          {
               System.out.println ("motor1 and motor3 have the same price");
          }
          else
          {
               System.out.println ("motor1 is more expensive than motor3");
          }
          
          
          if (motor1.compareTo (motor4) < 0)
          {
               System.out.println ("motor1 is cheaper than motor4");
          }
          else if (motor1.compareTo (motor4) == 0)
          {
               System.out.println ("motor1 and motor4 have the same price");
          }
          else
          {
               System.out.println ("motor1 is more expensive than motor4");
          }
          
          
          
          System.out.println();
          System.out.println ("Displaying the details of each element of the vehicles array by using polymorphism with the toString method");
          System.out.println();
          Vehicle vehicles[] = {
               
               new Car ("Mazda", 2006, 25000, 5),
               new Car ("Toyota", 2010, 15000, 5),
               
               new Motorcycle ("Yamaha", 2010, 8000, 859),
               new Motorcycle ("Mitsubishi", 2014, 11000, 789),
               
               new Bicycle ("BMX", 2005, 2500, "tandem"),
               new Bicycle ("VTT", 2003, 3200, "one-person")
               
               
          };
          
          cheaperV = vehicles[0];
          expensiveV = vehicles[0];
          
          
          
          System.out.println();
          for (int i = 0; i < vehicles.length; i++)
          {
               
               System.out.println ("vehicle" + i + vehicles[i].toString());
               
               
               if (cheaperV.getPrice() > vehicles[i].getPrice())
               {
                    
                    cheaperV = vehicles[i];
               }
               
               if (expensiveV.getPrice() < vehicles[i].getPrice())
               {
                    expensiveV = vehicles[i];
               }
               
          }
          
          System.out.println();
          System.out.println ("The cheapest vehicle between them " + cheaperV.toString());
          System.out.println ("The most expensive vehicle between them" + expensiveV.toString());
          
          
          
     }
     
}