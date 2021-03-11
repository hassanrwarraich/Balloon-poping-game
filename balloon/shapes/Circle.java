package shapes;

import java.awt.*;
/**
 * @Java class for circle
 * @Hassan raza
 * @12/3/18
 */
public class Circle extends Shape implements Selectable
{
   // properties
   int radius;
   private boolean select;
   
   // constructors
   public Circle(int radius)
   {
      this.radius = radius;
      select = false;
   }
   
   // methods
   /**
    * @returns Area
    */
   public double getArea()
   {
      return 1.0 * Math.PI * radius * radius;
   }
   
   /**
    * @returns toString
    */
   public String toString()
   {
      return "circle " + getArea() + " selected:  " + select;
   }
   
   /**
    * @sets selected to true or false
    */
   public void setSelected(boolean bool)
   {
      select = bool;
   }
   
   /**
    * @returns whether selected is true or false
    */
   public boolean getSelected()
   {
      return select;
   }
   
   /**
    * @returns whether shape contains points or not
    */
   public Shape contains(int x, int y)
   {
      if( (Math.sqrt( (getX() - x) * (getX() - x)) +   (getY() - y) * (getY() - y) )  <= radius) 
      {
         return this;
      }
      return null;
   }
   
   
   
   
}
