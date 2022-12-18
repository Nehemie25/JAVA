/* The GuardAnimal class, extending the Pet class to encapsulates a "guard animal" pet
	  GuardAnimals are the same as pets, but guard a location.
	  
	  By "extending" the Pet class, GuardAnimal "inherits" all the attributes and 
	  methods, and then adds extra (location, custom constructor, custom toString)
 */

public class GuardAnimal extends Pet    // Pet is the parent (or super) class
{
	 String location = "";          // location to guard (house, business, school)

     // default constructor 
	 public GuardAnimal ()
	 {
	      super();                        // call parent constructor
	 }
	 
     // alternate constructor - populate object with a name, age, and char
     public GuardAnimal (String name, int age, char type, String location)
     {
          super (name, age, type);    // call constructor and pass name, age, type
		  this.location = location;   // set location
     }// end of Pet()

     // override toString() from parent, but still call it for the old toString() layout
     public String toString ()
     {
	      String ret = "";
          String oldtoString = super.toString();  // get toString() from Pet class
		  
          ret = oldtoString + " Guarding " + this.location + ".";   // concat the location detail
          
          return (ret);
     }// end of toString()
     
}
