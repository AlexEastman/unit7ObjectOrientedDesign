import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JComponent;


/**
 * Write a description of class TriangleComponent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TriangleComponent extends JComponent
{
    private int progress;
    
    private Coordinate coord1;
    private Coordinate coord2;
    private Coordinate coord3;
    
    private int x;
    private int y;
    
    
    public void paintComponent(Graphics g)
    {
         Graphics2D g2 = (Graphics2D) g;
         Triangle triangle;
         Coordinate coord = new Coordinate(x,y);
        
         if(progress%4==0)
         {
             triangle = new Triangle();
         }
         else if (progress%4 == 1)
         {
             coord1 = coord;
             triangle = new Triangle(coord1);
         }
         else if(progress%4 == 2)
         {
             coord2 = coord;
             triangle = new Triangle(coord1,coord2);
         }
         else
         {
             coord3=coord;
             triangle = new Triangle(coord1,coord2,coord3);
         }
         
         triangle.draw(g2);
        
    }
    
    class TriangleMouseListener implements MouseListener
    {
        public void mouseClicked(MouseEvent event)
        {
            progress++;
            y = event.getY();
            x = event.getX();
            
        }
        
        public void mouseEntered(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}
        public void mousePressed(MouseEvent e) {}
        public void mouseReleased(MouseEvent e) {}
        
    }
}
