public class EmptyBucketException extends RuntimeException
{
     EmptyCollectionException ()
     {
          super("empty stack");
     }
     
      EmptyCollectionException (String message)
     {
          super(message);
     }
}