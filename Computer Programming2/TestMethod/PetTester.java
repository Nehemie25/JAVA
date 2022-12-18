/* PetTester - a simple application to test the features of the Pet class.
 */

public class PetTester
{
     public static void main (String[] args)
     {
          GuardAnimal butch = new GuardAnimal ("butch", 5, 'd', "home");   // "butch", 5, 'd', home
          System.out.println (butch.toString());
          System.out.println ("-----------------");
          
          
          // create Pet objects, but calling the constructors and return reference (mem. address) 
          Pet generic = new Pet();    // generic pet, with default values: "nameless", 0, 'x'
          
          Pet oscar = new Pet ("oscar", 15, 'b');   // create 'oscar' object: "oscar", 15 yrs, 'b' bird
          Pet oscar2 = new Pet ("oscar", 3, 'b');   // bird clone
          Pet mia = new Pet ("mia", 3, 'd');        // create 'mia' object: "mia", 3 yrs, 'd' dog
          Pet beast = new Pet ("beast", 4, 'c');    // create 'beast' object: "beast", 4 yrs, 'c' cat
          
          //----------------
          System.out.println ( generic );     // display object (auto-calling .toString() ) 
          System.out.println ( oscar );
          // System.out.println ( oscar.toString() );
          System.out.println ( mia );
          System.out.println ( beast );
  
          //----------------
          //   only "public" items in the Pet class are available outside the objects
          //     meaning .name, .age, .type are not available since they are "private"
          // System.out.println ( oscar.name );
          
          //----------------
          generic.speak();           // ask each pet to "speak" ddirectly to the console
          oscar.speak();             // oscar squawk
          mia.speak();               // mia bark
          beast.speak();             // beast meow

          if ( oscar.equals(oscar2) )     // .equals() <--  Object
          {
               System.out.println ("oscar and mia are the 'same'");
          }
          else
          {
               System.out.println ("oscar and mia are not the 'same'");
          }
          
          
     }// end of main()
     
}// end of class
