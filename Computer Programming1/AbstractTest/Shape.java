public abstract class Shape
{
     protected double dimension;
     
     public Shape ()
     {
          dimension = 0;
     }
     
     public Shape (double newDimension)
     {
          dimension = newDimension;
     }
     
     public static abstract double perimeter();
     public abstract double area();
}
     