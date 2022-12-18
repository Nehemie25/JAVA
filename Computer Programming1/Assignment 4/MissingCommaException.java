//  The MissingCommaException class is instanciated when the student information does not have 2 commas
public class MissingCommaException extends Exception
{
     MissingCommaException ()
     {
          super ("missing commas in the student information");
     }
     
     MissingCommaException (String message)
     {
          super (message);
     }
}