//********************************************************************
//  OutOfRangeException.java       Java Foundations p. 436
//
//  Represents an exceptional condition in which a value is out of
//  some particular range.
//********************************************************************

public class OutOfRangeException extends RuntimeException
{
     //-----------------------------------------------------------------
     //  creates exception object with a default message.
     //-----------------------------------------------------------------
     OutOfRangeException ( )
     {
          super ("integer was out of range");
     }
     
     //-----------------------------------------------------------------
     //  creates exception object with a particular message.
     //-----------------------------------------------------------------
     OutOfRangeException (String message)
     {
          super (message);
     }
     
}

