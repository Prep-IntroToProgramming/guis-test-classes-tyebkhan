 
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class SimpleGuiTrio implements ActionListener{
    JFrame frame;
    JButton button1;
    JButton button2;
    JLabel label;
    public SimpleGuiTrio(){
        frame = new JFrame();
        button1 = new JButton("1");
        button2 = new JButton("2");
        label = new JLabel("Button Change");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(BorderLayout.EAST, button1);
        frame.add(BorderLayout.WEST, button2);
        frame.add(BorderLayout.CENTER, label);
        frame.setSize(500,500);
        frame.setVisible(true);
        button1.addActionListener(new ButtonOneListener());
        button2.addActionListener(new ButtonTwoListener());
    }
    class ButtonOneListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String text = label.getText();
            String[] array = text.split(" ");
            array[0] = "button ";
            label.setText(array[0]+array[1]);
        }
    }
    class ButtonTwoListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String text = label.getText();
            String[] array = text.split(" ");
            array[1] = " changed";
            label.setText(array[0]+array[1]);
        }
    }
    public static void main(String[] args){
        SimpleGuiTrio x = new SimpleGuiTrio();
    }

    public void actionPerformed(ActionEvent e){
        button1.setText("hi");
    }
}
