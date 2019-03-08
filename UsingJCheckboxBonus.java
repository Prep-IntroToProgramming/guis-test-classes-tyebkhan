import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class UsingJCheckboxBonus implements ItemListener{ 
    JFrame frame;
    JLabel label;
    JCheckBox check1;
    JCheckBox check2;
    JCheckBox check3;
    JCheckBox check4;
    JCheckBox check5;
    ArrayList <JCheckBox> boxes = new ArrayList<JCheckBox>();
    String text = "Numbers Selected:";
    public UsingJCheckboxBonus(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        label = new JLabel("No Numbers Selected");
        
        check1 = new JCheckBox("1");
        check2 = new JCheckBox("2");
        check3 = new JCheckBox("3");
        check4 = new JCheckBox("4");
        check5 = new JCheckBox("5");
        
        boxes.add(check1);
        boxes.add(check2);
        boxes.add(check3);
        boxes.add(check4);
        boxes.add(check5);
        
        for(JCheckBox j: boxes){
            j.addItemListener(this);
        }
        
        frame.setSize(500,500);
        frame.add(label);
        frame.add(check1);
        frame.add(check2);
        frame.add(check3);
        frame.add(check4);
        frame.add(check5);
        frame.setVisible(true);
    }
    
    public static void main(String[] args){
        UsingJCheckboxBonus a = new UsingJCheckboxBonus();
    }
    
    public void itemStateChanged(ItemEvent i){
        int index = boxes.indexOf(i.getItem());
        text = "Numbers Selected: ";
        for(JCheckBox j: boxes){
            if(j.isSelected()){
                j.setSelected(false);
            }
        }
        boxes.get(index).setSelected(true);
        label.setText(text);
    }
}
/*
 * add to array list
 * for loop which checks if boxes are checked and then adds to string
 * update label 
 */
