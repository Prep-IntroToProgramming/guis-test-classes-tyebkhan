import java.util.*;
import java.awt.*;
import javax.swing.*;
public class PaintedPanel extends JPanel{
    @Override
    public void paintComponent(Graphics g){
        g.setColor(Color.blue);
        g.fillRect(20,50,100,100);
    }
}
