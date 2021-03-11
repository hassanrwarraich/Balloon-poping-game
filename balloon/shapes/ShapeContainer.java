package shapes;

import java.util.*;

/**
 * @Java class making an arraylist of shapes
 * @Hassan raza
 * @12/3/18
 */
public class ShapeContainer implements Iterable
{
   // properties
   private ArrayList<Shape> shapes;
   
   // constructors
   public ShapeContainer()
   {
      shapes = new ArrayList<Shape>();
   }
   
   
   // methods
   /**
    * @adds shape to array list
    */
   public void add(Shape s)
   {
      shapes.add(s);
   }
   
   /**
    * @remove shape from array list
    */
   public void remove(int i)
   {
      shapes.remove(i);
   }
   
   /**
    * @returns total area
    */
   public double getArea()
   {
      double area = 0;
      for (int i = 0; i < shapes.size(); i++)
      {
         area = area + shapes.get(i).getArea();
      }   
      return area;
   }
   
   /**
    * @returns toString
    */
   public String toString()
   {  
      return shapes.toString();
   }
   
   public Shape getShape(int i)
   {
      return shapes.get(i);
   }
   
   
   /**
    * @returns size of array list
    */
   public int size()
   {
      return shapes.size();
   }
   
   /**
    * @removes all selected shapes from array lıst
    */
   public void removing()
   {
      for (int i = 0; i < shapes.size(); i++)
      {
         if (((Selectable)(shapes.get(i))).getSelected())
            shapes.remove(i);
      }
   }
   
   /**
    * @return shape with given coordinates
    */
   public Shape contains(int x, int y)
   {
      for (int i = 0; i < shapes.size(); i++)
      {
         if (((Selectable)(shapes.get(i))).contains(x, y) != null)
         {
            return shapes.get(i);
         }
      }
      return null;
   }
   
   /**
    * @return number of shapes with given coordinates
    */
   public int selectAllAt( int x, int y)
   {
      int noOfShapes = 0;
      for (int i = 0; i < shapes.size(); i++)
      {
         if (((Selectable)(shapes.get(i))).contains(x, y) != null)
         {
            ((Selectable)(shapes.get(i))).setSelected(true);
            noOfShapes++;
         }
      }
      return noOfShapes;
   }
   
   /**
    * @return if has next
    */
   public Iterator iterator() 
   {
      return shapes.iterator();
   }
   int index = 0;
   /**
    * @return if has next
    */
   public boolean hasNext()
   {
      if(shapes.size() > index)
         return true;
      return false;
   }
   /**
    * @return next object
    */
   public Object next()
   {
      index++;
      return shapes.get(index);
   }
   
   
}

