import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.applet.Applet;

/**
 * __program description___ 
 * @author __your name___
 * @version __date__
 */ 
public class Lab04b
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      
      // variables
      BalloonsGamePanel ball = new BalloonsGamePanel();
      JFrame frame = new JFrame("Balloons");
      JLabel label;
      
      // program code
      frame.setSize(500, 500);
      frame.add(ball);
      frame.getContentPane().setBackground(Color.YELLOW);
      frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      
      
      
      frame.setVisible(true);
   }
   
}
