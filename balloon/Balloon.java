import shapes.*;
import java.awt.*;
/**
 * A simple Java class!
 */
public class Balloon extends Circle implements Drawable 
{
   // properties
   private int radius;
   
   // constructors
   public Balloon(int r)
   {
      super( r);
      radius = 25;
   }
   
   // methods
   /**
    * @draws circle with radius 25
    */
   public void draw( Graphics g)
   {
      int x, y;
      
      x = getX() - radius;
      y = getY() - radius;
      
      g.drawOval( x, y, radius * 2, radius * 2);
   }
   
   /**
    * @grows circle by
    */
   public void grow()
   {
      radius = radius + 1;
      
      if (radius >= 100)
      
      {
         radius = 0;
         ((Selectable)this).setSelected(true);
      }
   }
   
}
