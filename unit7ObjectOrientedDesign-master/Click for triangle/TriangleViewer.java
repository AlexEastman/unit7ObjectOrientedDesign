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
 * Write a description of class TriangleViewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TriangleViewer
{
     public static void main(String[] args)
     {
        JFrame frame = new JFrame();
        
        frame.setSize(400,400);
        frame.setTitle("Triangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        TriangleComponent component = new TriangleComponent();
        frame.add(component);
                
        frame.setVisible(true);
     }
}
