import java.awt.*;
import javax.swing.*;

public class ImagePanel extends JPanel
{

    @Override
    public void paintComponent(Graphics g) {

        Image image = new ImageIcon("Prep.jpg").getImage();
        g.drawImage(image, 3, 4, this);
        
        g.setColor(Color.blue);
        g.fillRect(20, 50,100,100);



    }
}
