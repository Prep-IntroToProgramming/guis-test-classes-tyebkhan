import javax.swing.*;
import java.awt.*;
public class SimpleGuiTwoComps{
    JFrame frame;
    public SimpleGuiTwoComps(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new RandomPanel());
        frame.setSize(500,500);
        frame.setVisible(true);
    }
    public static void main(String[] args){
        SimpleGuiTwoComps test = new SimpleGuiTwoComps();
    }
}
