import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ButtonViewer
{
   private static final int FRAME_WIDTH = 100;
   private static final int FRAME_HEIGHT = 100;
   
   JFrame frame;
   JButton button1;
   JButton button2;
   JPanel panel;
   public ButtonViewer()
   {
       frame = new JFrame();
       button1 = new JButton("Click me!");
       button2 = new JButton("Click me also!");
       panel = new JPanel();
       panel.add(button1);
       panel.add(button2);
       frame.add(panel);
       
       ActionListener listener1 = new ClickListener("a");
       button2.addActionListener(listener1);
       
       ActionListener listener2 = new ClickListener("b");
       button1.addActionListener(listener2);
       
       frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
       
   }
   
   public static void main(String[] args)
   {
       ButtonViewer gui = new ButtonViewer();
   }

}
