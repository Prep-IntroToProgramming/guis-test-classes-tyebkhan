import javax.swing.*;

public class SimpleGui1{ 
    public SimpleGui1() {
        JFrame frame = new JFrame();
        JButton button = new JButton("click me");
        //JLabel label = new JLabel("Swing is pretty cool");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button);
        //frame.add(label);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SimpleGui1 gui = new SimpleGui1();
    }
} 
