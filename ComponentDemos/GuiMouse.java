package ComponentDemos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GuiMouse implements MouseListener{
    JFrame frame = new JFrame();
    DrawPanel panel = new DrawPanel();

    public GuiMouse() {
        panel.addMouseListener(this );
        frame.add(panel);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
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

    class DrawPanel extends JPanel {
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.orange);
        }
    }
}
