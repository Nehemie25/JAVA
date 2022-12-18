// Thrown if we try to remove an element from an empty Bucket

public class EmptyBucketException extends RuntimeException
{
     EmptyBucketException ()
     {
          super("empty stack");
     }
     
     EmptyBucketException (String message)
     {
          super(message);
     }
}