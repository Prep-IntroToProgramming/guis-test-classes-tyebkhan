import javax.swing.*;

public class SimpleGui1{ 
    public SimpleGui1() {
        JFrame frame = new JFrame();//creates a new frame
        JButton button = new JButton("click me");//creates a button that says click me
        //JLabel label = new JLabel("Swing is pretty cool");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button);//puts the button in the frame object
        //frame.add(label);
        frame.setSize(300, 300);
        frame.setVisible(true);//makes the window visible
    }

    public static void main(String[] args) {
        SimpleGui1 gui = new SimpleGui1();
    }
} 
