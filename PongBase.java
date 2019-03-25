import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PongBase{
    JFrame frame = new JFrame();
    // Declare a Swing Timer that fires ~60 times per second
    
    PaddlePanel panel = new PaddlePanel();
    int x;
    int y;
    Timer timer;
    public PongBase() {
        frame.add(panel);
        timer = new Timer(6, new TListener());
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x = frame.getWidth()/2;
        y = frame.getHeight() - 50;
        frame.setVisible(true);
        timer.start();
        // start the timer
    }
    
    public static void main(String[] args) {
        PongBase pb = new PongBase();
    }

    class TListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            Point xy = panel.getMousePosition();
            if(xy==null){
                return;
            }else{
                x = (int) xy.getX();
                frame.repaint();
                frame.revalidate();
            }
        }
        // override the necessary method.
        // Inside, use getMousePosition() with the appropriate Swing component.
        // Make sure that the object returned is not null
        // Set the new x value, then repaint the frame.
    }

    class PaddlePanel extends JPanel {
        @Override
        public void paintComponent(Graphics g) {
            g.setColor(Color.BLACK);
            g.fillRect(x, y, 30, 10);
            System.out.println(x);
        }
    }
}
