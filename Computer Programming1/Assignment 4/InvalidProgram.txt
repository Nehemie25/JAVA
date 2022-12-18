//  The InvalidProgramException class is instanciated when the study program character of the student is different from B, C, T and S 

public class InvalidProgramException extends Exception
{
     InvalidProgramException ()
     {
          super ("The program of study is invalid");
     }
     
     
     InvalidProgramException (String message)
     {
          super (message);
     }
}
