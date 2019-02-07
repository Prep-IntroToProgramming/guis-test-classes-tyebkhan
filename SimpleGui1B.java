import javax.swing.*;
import java.awt.event.*;

public class SimpleGui1B implements ActionListener{ 
    JFrame frame;
    JButton button;
    int clicks;
    public SimpleGui1B() {
        button = new JButton("don't click me");
        frame = new JFrame();
        clicks = 0;
        //JLabel label = new JLabel("Swing is pretty cool");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button);
        //frame.add(label);
        frame.setSize(300, 300);
        frame.setVisible(true);

        button.addActionListener(this);//waits for the button to be interacted with

    }

    public void actionPerformed(ActionEvent event) {
        clicks++;

        if(clicks%5 == 0){
            button.setText(clicks + " is a multiple of 5");
        }else{
            button.setText(clicks+"");
        }
    }

    public static void main(String[] args) {
        SimpleGui1B gui = new SimpleGui1B();
    }

} 
