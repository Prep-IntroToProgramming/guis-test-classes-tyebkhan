import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class TestRandPanel implements ActionListener{
    JFrame frame;
    JButton button;
    public boolean check;
    //RandomPanel r;
    public TestRandPanel(){
        frame = new JFrame();
        button = new JButton("Change the Color");
        //r = new RandomPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(BorderLayout.NORTH, button);
        frame.add(BorderLayout.CENTER, new RandomPanel());
        button.addActionListener(this);
        frame.setSize(500,500);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent a){
        frame.repaint();
    }

    public static void main(String[] args) throws InterruptedException{
        TestRandPanel test = new TestRandPanel();
        test.repainting();
    }
    
    public void repainting() throws InterruptedException{
        while(check == true){
            frame.repaint();
            Thread.sleep(100);
        }
    }
}