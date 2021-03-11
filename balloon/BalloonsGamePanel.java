import shapes.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import javax.swing.Timer;
/**
 * __program description___ 
 * @author __your name___
 * @version __date__
 */ 
public class BalloonsGamePanel extends JComponent 
{
   // properties
   private ShapeContainer balloons;
   private MyMouseListener mouse;
   private MyTimer timeListener;
   private Timer timer;
   private int points;
   private JLabel label;
   static final int TOTAL = 10000;
   private int current;
   
   
   // constructors
   public BalloonsGamePanel()
   {
      current = 0;
      points = 0;
      balloons = new ShapeContainer();
      mouse = new MyMouseListener();
      timeListener = new MyTimer();
      timer = new Timer(18, timeListener );
      timer.start();
      this.addMouseListener(mouse);
      this.setLayout( new BorderLayout() );
      label = new JLabel("score: " + this.getPoints());
      this.add(label, BorderLayout.NORTH);
      for (int i = 0; i < 25; i++ )
      {
         Balloon loon = new Balloon(25);
         loon.setLocation((int)Math.round(Math.random() * 500), (int)Math.round(Math.random() * 500));
         balloons.add(loon);
      }
   }
   
   // methods
   /**
    * @paints all components of panel 
    */
   public void paintComponent(Graphics g)
   {
      Iterator itr;
      itr = balloons.iterator();
      
      while( itr.hasNext() ) {
         ( (Balloon)itr.next() ).draw( g );
      }
      
   }
   
   
   /**
    * @returns points 
    */
   
   public int getPoints()
   {
      return points;
   }
   
   
   
   
   
   
   //inner class
   public class MyMouseListener implements MouseListener
   {
      public void mousePressed(MouseEvent e)
      {
         int g = 0;
         g = balloons.selectAllAt(e.getX(), e.getY());
         balloons.removing();
         
         if(g >= 1)
         {
            points++;
            label.setText("score " + points);
         }
         
         repaint();
      }
      public void mouseReleased(MouseEvent e)
      {}
      public void mouseEntered(MouseEvent e)
      {}
      public void mouseExited(MouseEvent e)
      {}
      public void mouseClicked(MouseEvent e)
      {}
   }
   
   
   
   //inner class
   public class MyTimer implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         Iterator itr;
         itr = balloons.iterator();
         while( itr.hasNext() ) {
            ((Balloon)(itr.next())).grow();
         }
         
         if (balloons.size() < 15)
         {
            for (int i = 0; i < 5; i++)
            {
               Balloon loon = new Balloon(25);
               loon.setLocation((int)Math.round(Math.random() * 500), (int)Math.round(Math.random() * 500));
               balloons.add(loon);
            }
         }
         
         BalloonsGamePanel.this.balloons.removing();
         repaint();
         current = current + 18;
         if (current >= TOTAL)
         {
            JOptionPane.showConfirmDialog(null,
                "Press ok to exit.",
                "Game Over!",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE);
            System.exit( 0 );
         }
      }
   }
   
   
}

