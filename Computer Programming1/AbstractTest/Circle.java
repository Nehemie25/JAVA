public class Circle extends Shape
{
     
     public Circle ()
     {
     }
     public Circle (double newRadius)
     {
          super (newRadius);
     }
     
     public  double perimeter ()
     {
          return (2 * Math.PI * dimension) ;
     }
     
     public double area ()
     {
          return Math.PI * dimension * dimension;
     }
}