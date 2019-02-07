package ComponentDemos;

import javax.swing.*;  
import javax.swing.event.*; 
import java.awt.*; 
import java.awt.event.*; 

class ListDemo {  

    JList<String> list; 
    JLabel label; 
    JScrollPane scroller; 

    String names[] = {"David", "Isabella", "Matt", "Ty", "Kim", "Lawrence", "Sean"}; 

    ListDemo() {  
        JFrame frame = new JFrame("JList Demo");  
        frame.setLayout(new FlowLayout());  
        frame.setSize(200, 160);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  

        list = new JList<String>(names); 
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 
        list.addListSelectionListener(new ListListener()); 
        
        scroller = new JScrollPane(list); 
        scroller.setPreferredSize(new Dimension(120, 90)); 

        label = new JLabel("Please choose a name"); 

        frame.add(scroller); 
        frame.add(label); 
        frame.setVisible(true);  
    }  

    public static void main(String args[]) {  
       ListDemo ld = new ListDemo();    
    }  

    class ListListener implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent le) {  
            int index = list.getSelectedIndex(); 

            if(index != -1) 
                label.setText("Current selection: " + names[index]); 
            else  
                label.setText("Please choose an name"); 
        }
    }
}