package shapes;

/**
 * @Java class containg all shapes
 * @Hassan raza
 * @12/3/18
 */
public abstract class Shape implements Locatable
{
   // properties
   private int x, y;
   
   // constructors
   public Shape()
   {
      x = 0;
      y = 0;
   }
   
   // methods
   public abstract double getArea();
   
   /**
    * @sets location of shape
    */
   public void setLocation(int x, int y)
   {
      this.x = x;
      this.y = y;
   }
   
   /**
    * @returns value of x
    */
   public int getX()
   {
      return x;
   }
   
   /**
    * @returns value of y
    */
   public int getY()
   {
      return y;
   }
}
