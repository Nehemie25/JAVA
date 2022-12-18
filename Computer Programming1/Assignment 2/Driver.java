public class Driver
{
     public static void main (String [] args)
     {
          
          Bicycle bicycle = new Bicycle ();
          Bicycle bmx = new Bicycle ("BMX", 2001, 2500, "one person");
          
          System.out.println ("Showing initial Bicycle values set by default and parameterized constructors");
          System.out.println ();
          System.out.println (bicycle);
          System.out.println (bmx.toString());
          System.out.println ();
          
          System.out.println ("values for bmx from get methods:\nModel: " + bmx.getModel() + "\nYear: " + bmx.getYear() + "\nPrice: " +
                              bmx.getPrice() + "\nType: " + bmx.getType());
          System.out.println();
          
          System.out.println ("Testing setModel, setYear, setPrice and setType for a Bicycle object");
          System.out.println ();
          bmx.setModel ("VTT");
          bmx.setYear (2008);
          bmx.setPrice (15000);
          bmx.setType ("tandem bike");
          
          System.out.println ("Showing update Bicycle values");
          System.out.println ();
          System.out.println (bmx.toString());
          System.out.println ();
          
          System.out.println ("-----------------------------------------------------------------------------------");
          
          
          System.out.println ("Testing the equals method for Vehicles objects");
          System.out.println ();
          
          
          Vehicle vec1 = new Vehicle ("car", 1901, 25000);
          Vehicle vec2 = new Vehicle ("bike", 1901, 25000);
          Vehicle vec3 = new Vehicle ("car", 1968, 25000);
          Vehicle vec4 = new Vehicle ("car", 1901, 24000);
          Vehicle vec5 = new Vehicle ("car", 1901, 25000);
          
          System.out.println ("vec1 description : " + vec1);
          System.out.println ("vec2 description : " + vec2);
          System.out.println ("vec3 description : " + vec3);
          System.out.println ("vec4 description : " + vec4);
          System.out.println ("vec5 description : " + vec5);
          System.out.println();
          System.out.println ("vec1 equals vec2 : " + vec1.equals (vec2));
          System.out.println ("vec1 equals vec3 : " + vec1.equals (vec3));
          System.out.println ("vec1 equals vec4 : " + vec1.equals (vec4));
          System.out.println ("vec1 equals vec5 : " + vec1.equals (vec5));
          
          System.out.println();
          
          System.out.println ("---------------------------------------------------------------------------------------");
          
          System.out.println ("Testing the equals method for Car objects");
          System.out.println ();
          
          
          Car car1 = new Car ("Mazda", 2006, 15000, 5);
          Car car2 = new Car ("Toyota", 2006, 15000, 5);
          Car  car3 = new Car ("Mazda", 2008, 15000, 5);
          Car  car4 = new Car ("Mazda", 2006, 12000, 5);
          Car  car5 = new Car ("Mazda", 2006, 15000, 4);
          Car  car6 = new Car ("Mazda", 2006, 15000, 5);
          
          System.out.println ("car1 description : " + car1);
          System.out.println ("car2 description : " + car2);
          System.out.println ("car3 description : " + car3);
          System.out.println ("car4 description : " + car4);
          System.out.println ("car5 description : " + car5);
          System.out.println ("car6 description : " + car6);
          System.out.println();
          System.out.println ("car1 equals car2 : " + car1.equals (car2));
          System.out.println ("car1 equals car3 : " + car1.equals (car3));
          System.out.println ("car1 equals car4 : " + car1.equals (car4));
          System.out.println ("car1 equals car5 : " + car1.equals (car5));
          System.out.println ("car1 equals car6 : " + car1.equals (car6));
          
          System.out.println();
          
          System.out.println ("---------------------------------------------------------------------------------------");
          
          
          System.out.println ("Testing the equals method for Motorcycle objects");
          System.out.println ();
          
          
          Motorcycle motor1 = new Motorcycle ("Yamaha", 2010, 45000, 859);
          Motorcycle motor2 = new Motorcycle ("GP", 2010, 45000, 859);
          Motorcycle motor3 = new Motorcycle ("Yamaha", 2011, 45000, 859);
          Motorcycle motor4 = new Motorcycle ("Yamaha", 2010, 54000, 859);
          Motorcycle motor5 = new Motorcycle ("Yamaha", 2010, 45000, 549);
          Motorcycle motor6 = new Motorcycle ("Yamaha", 2010, 45000, 859);
          
          
          System.out.println ("motor1 description : " + motor1);
          System.out.println ("motor2 description : " + motor2);
          System.out.println ("motor3 description : " + motor3);
          System.out.println ("motor4 description : " + motor4);
          System.out.println ("motor5 description : " + motor5);
          System.out.println ("motor6 description : " + motor6);
          System.out.println();
          System.out.println ("motor1 equals motor2 : " + motor1.equals (motor2));
          System.out.println ("motor1 equals motor3 : " + motor1.equals (motor3));
          System.out.println ("motor1 equals motor4 : " + motor1.equals (motor4));
          System.out.println ("motor1 equals motor5 : " + motor1.equals (motor5));
          System.out.println ("motor1 equals motor6 : " + motor1.equals (motor6));
          
          System.out.println();
          
          System.out.println ("---------------------------------------------------------------------------------------");
          
          System.out.println ("Testing the equals method for Bicycle objects");
          System.out.println ();
          
          
          Bicycle bike1 = new Bicycle ("BMX", 2005, 2500, "tandem");
          Bicycle bike2 = new Bicycle ("VTT", 2005, 2500, "tandem");
          Bicycle bike3 = new Bicycle ("BMX", 2010, 2500, "tandem");
          Bicycle bike4 = new Bicycle ("BMX", 2005, 3200, "tandem");
          Bicycle bike5 = new Bicycle ("BMX", 2005, 2500, "one-person");
          Bicycle bike6 = new Bicycle ("BMX", 2005, 2500, "tandem");
          
          
          System.out.println ("bike1 description : " + bike1);
          System.out.println ("bike2 description : " + bike2);
          System.out.println ("bike3 description : " + bike3);
          System.out.println ("bike4 description : " + bike4);
          System.out.println ("bike5 description : " + bike5);
          System.out.println ("bike6 description : " + bike6);
          System.out.println();
          System.out.println ("bike1 equals bike2 : " + bike1.equals (bike2));
          System.out.println ("bike1 equals bike3 : " + bike1.equals (bike3));
          System.out.println ("bike1 equals bike4 : " + bike1.equals (bike4));
          System.out.println ("bike1 equals bike5 : " + bike1.equals (bike5));
          System.out.println ("bike1 equals bike6 : " + bike1.equals (bike6));
          
          System.out.println();
          
          System.out.println ("---------------------------------------------------------------------------------------");
          
          
          
          
          
          System.out.println ("Displaying the details of each element of the vehicles array by using polymorphism with the toString method");
          System.out.println();
          Vehicle vehicles[] = {
               
               new Car ("Mazda", 2006, 15000, 6),
               new Car ("Toyota", 2010, 1500, 5),
               
               new Motorcycle ("Yamaha", 2010, 45000, 859),
               new Motorcycle ("Mitsubishi", 2014, 15000, 789),
               
               new Bicycle ("BMX", 2005, 2500, "tandem"),
               new Bicycle ("Electric", 2017, 3500, "one person")
               
          };
          
          for (int i = 0; i < vehicles.length; i++)
          {
               System.out.println (vehicles[i].toString());
          }
     }
}