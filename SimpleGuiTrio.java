import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class SimpleGuiTrio extends JPanel implements ActionListener{
    JFrame frame;
    JButton button1;
    JButton button2;
    JLabel label;
    
    public SimpleGuiTrio(){
        frame = new JFrame();
        button1 = new JButton("  Circle  ");
        button2 = new JButton("Background");
        label = new JLabel("Button Change");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(BorderLayout.EAST, button1);
        frame.add(BorderLayout.WEST, button2);
        frame.add(BorderLayout.CENTER, new TrioPanel());
        frame.setSize(500,500);
        frame.setVisible(true);
        button1.addActionListener(new ButtonOneListener());
        button2.addActionListener(new ButtonTwoListener());
    }
    class ButtonOneListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            frame.repaint();
        }
    }
    class ButtonTwoListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            int red = (int) (Math.random()*255);
            int blue = (int) (Math.random()*255);
            int green = (int) (Math.random()*255);
            Color backgroundc = new Color(red, green, blue);
            frame.getContentPane().setBackground(backgroundc);
        }
    }
    public static void main(String[] args){
        SimpleGuiTrio x = new SimpleGuiTrio();
        x.repaint();
    }

    public void actionPerformed(ActionEvent e){
        button1.setText("hi");
    }

}
