//  The InvalidStudentNumberException class is instanciated when the student number is out of the interval [1 6000]

public class InvalidStudentNumberException extends Exception
{
     InvalidStudentNumberException()
     {
          super ("Your student number is invalid");
     }
     
     InvalidStudentNumberException(String message)
     {
          super (message);
     }
}