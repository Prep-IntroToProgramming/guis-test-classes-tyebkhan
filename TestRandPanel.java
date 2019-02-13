import javax.swing.*;
import java.awt.*;
public class TestRandPanel{
    JFrame frame;
    public TestRandPanel(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new RandomPanel());
        frame.setSize(500,500);
        frame.setVisible(true);
    }
    public static void main(String[] args){
        TestRandPanel test = new TestRandPanel();
    }
}