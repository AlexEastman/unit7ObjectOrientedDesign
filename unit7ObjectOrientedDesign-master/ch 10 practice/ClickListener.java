import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClickListener implements ActionListener
{
    String name;
    
    public ClickListener(String name)
    {
        this.name = name;
    }
    
    public void actionPerformed(ActionEvent event)
    {
        System.out.println(name);
    }
    
}