import javax.swing.*;
import java.awt.event.*;

public class SimpleGui1B implements ActionListener{ 
    JFrame frame;
    JButton button;
    
    public SimpleGui1B() {
        button = new JButton("click me");
        frame = new JFrame();

        //JLabel label = new JLabel("Swing is pretty cool");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button);
        //frame.add(label);
        
        button.addActionListener(this);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        button.setText("I've been clicked!");
    }
    
    public static void main(String[] args) {
        SimpleGui1B gui = new SimpleGui1B();
    }
} 
