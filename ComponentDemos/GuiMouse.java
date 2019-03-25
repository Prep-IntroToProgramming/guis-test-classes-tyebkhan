package ComponentDemos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class GuiMouse implements MouseListener, MouseMotionListener{
    JFrame frame = new JFrame();
    DrawPanel panel = new DrawPanel();
    long starttime = 0;
    boolean a = true;
    int x;
    int y;
    public GuiMouse() {
        panel.addMouseListener(this);
        panel.addMouseMotionListener(this);
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void mouseMoved(MouseEvent e){
        x = e.getX()-50;
        y = e.getY()-50;
        frame.repaint();
        frame.revalidate();
    }

    @Override
    public void mouseDragged(MouseEvent e){
        x = e.getX()-50;
        y = e.getY()-50;
        frame.repaint();
        frame.revalidate();
    }

    public static void main(String[] args) {
        GuiMouse gui = new GuiMouse();
    }

    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse is in");
    }

    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse is out");
    }

    public void mousePressed(MouseEvent e) {
        System.out.println(e.getClickCount() + " clicks!");
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("Up with " + e.getButton());
    }

    @Override
    public void mouseClicked(MouseEvent m){ 
        System.out.println((m.getWhen()-starttime)/1000 + " seconds");
        starttime = m.getWhen();
        System.out.println("(" + m.getX() + ", " + m.getY() + ")");
    }

    class DrawPanel extends JPanel {
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.orange);
            g.fillRect(x,y,100,100);
        }
    }
}
