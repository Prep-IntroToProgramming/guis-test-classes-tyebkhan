import javax.swing.*;
import java.awt.*;
public class DrawDesignPanel extends JButton{
    public int x = 1;
    public int y = 1;
    @Override
    public void paintComponent(Graphics g){
        g.setColor(Color.black);
        g.fillRect(0,0,this.getWidth(),this.getHeight());
        g.setColor(Color.green);
        g.fillOval(x,y,100,100);
    }
}