package ComponentDemos;

import javax.swing.*;  
import javax.swing.event.*; 
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.plaf.basic.BasicLabelUI;
import javax.swing.plaf.basic.BasicGraphicsUtils;
class ListDemo2 {  

    JList<String> list; 
    JLabel label; 
    JScrollPane scroller; 

    String names[] = {"David", "Isabella", "Matt", "Ty", "Kim", "Lawrence", "Sean"}; 

    ListDemo2() {  
        JFrame frame = new JFrame("JList Demo");  
        frame.setLayout(new FlowLayout());  
        frame.setSize(200, 160);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  

        list = new JList<String>(names); 
        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); //new
        list.addListSelectionListener(new ListListener()); 

        scroller = new JScrollPane(list); //new
        scroller.setPreferredSize(new Dimension(120, 90)); //new

        label = new JLabel("Please choose a name"); 
        frame.add(label); 
        frame.add(scroller); 
 
        frame.setVisible(true);  
    }  

    public static void main(String args[]) {  
        ListDemo2 ld = new ListDemo2();    
    }  

    class ListListener implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent le) {  
            int[] index = list.getSelectedIndices(); 
            String labelval = " ";
            for(int i: index){
                labelval = labelval + " " + names[i];
            }
            if(!le.getValueIsAdjusting()){
                //if(index != -1){ 
                label.setText("Current selection(s): " + labelval);
                //}
                //else  
                //label.setText("Please choose an name"); 

                if(index.length==7){
                    JFrame frameimage = new JFrame();
                    ImagePanel panel = new ImagePanel();
                    frameimage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frameimage.add(panel);
                    frameimage.setSize(panel.rebels.getIconWidth()+30, panel.rebels.getIconHeight()+50);
                    frameimage.setVisible(true);
                }
            }
        }
    }
}

//1 element can be selected
//program changes label with the selection
