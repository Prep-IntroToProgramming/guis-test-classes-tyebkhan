package ComponentDemos;

import java.util.*;
import javax.swing.*;  
import javax.swing.event.*; 
import java.awt.*; 
import java.awt.event.*; 

public class BoxDemo1 implements ItemListener{
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel label = new JLabel("Pick em");
    String labelString = "";
    
    public BoxDemo1() {
        for (int i = 1; i <= 5; i++) {
            JCheckBox box = new JCheckBox("Box " + i);
            box.addItemListener(this);
            panel.add(box);
        }
        frame.add(panel);
        frame.add(label, BorderLayout.SOUTH);
        frame.setSize(160, 160);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);  
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        JCheckBox selectBox = (JCheckBox) ie.getItem();
        String newText = selectBox.getText();
        if (ie.getStateChange()== ItemEvent.SELECTED) {
            labelString += newText;
        } else {
            labelString = labelString.replace(newText, "");
        }
        label.setText(labelString);
    }

    public static void main(String[] args) {
        BoxDemo1 gui = new BoxDemo1();
    }
}
