// Thrown if we tried to add to much element in the Bucket

public class FullBucketException extends RuntimeException
{
     FullBucketException ()
     {
          super("full bucket");
     }
     
     FullBucketException (String message)
     {
          super(message);
     }
}