import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

public class Triangle
{
    private Coordinate coord1;
    private Coordinate coord2;
    private Coordinate coord3;
        
    public Triangle()
    {
        this.coord1 = new Coordinate(0,0);
        this.coord2 = coord1;
        this.coord3 = coord1;
    }

    public Triangle(Coordinate coord)
    {
        this.coord1 = coord1;
        this.coord2 = coord1;
        this.coord3 = coord1;
    }
    
    public Triangle(Coordinate coord1, Coordinate coord2)
    {
        this.coord1 = coord1;
        this.coord2 = coord2;
        this.coord3 = coord1;
    }
    
    public Triangle(Coordinate coord1, Coordinate coord2, Coordinate coord3)
    {
        this.coord1 = coord1;
        this.coord2 = coord2;
        this.coord3 = coord3;
    }

    public void draw(Graphics2D g2)
    {
        Line2D.Double line1 = new Line2D.Double
        (coord1.getX(),coord1.getY(),coord2.getX(),coord2.getY());
        
        Line2D.Double line2 = new Line2D.Double
        (coord2.getX(),coord2.getY(),coord3.getX(),coord3.getY());
        
        Line2D.Double line3 = new Line2D.Double
        (coord1.getX(),coord1.getY(),coord3.getX(),coord3.getY());
        
        g2.draw(line1);
        g2.draw(line2);
        g2.draw(line3);
        
        Ellipse2D.Double point1 = new Ellipse2D.Double(coord1.getX(),coord1.getY(),5,5);
        Ellipse2D.Double point2 = new Ellipse2D.Double(coord2.getX(),coord2.getY(),5,5);
        Ellipse2D.Double point3 = new Ellipse2D.Double(coord3.getX(),coord3.getY(),5,5);
        
        g2.fill(point1);
        g2.fill(point2);
        g2.fill(point3);
    }
    
}
