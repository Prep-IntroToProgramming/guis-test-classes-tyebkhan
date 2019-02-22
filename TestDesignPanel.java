import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TestDesignPanel{
    JFrame frame;
    Boolean move = true;
    Boolean xdirection = true;
    Boolean ydirection = true;
    DrawDesignPanel ball = new DrawDesignPanel();
    Timer myTimer;
    public TestDesignPanel(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(ball);
        frame.setSize(500,500);
        frame.setVisible(true);
        myTimer = new Timer(4, new TimerListener()); 
        myTimer.start();
    }
    public class TimerListener implements ActionListener{
        public void actionPerformed(ActionEvent a){

            if(ball.x==frame.getWidth()-120){
                xdirection = false;
            }
            if(ball.x==0){
                xdirection = true;
            }
            if(xdirection==true){
                ball.x++;
            }else{
                ball.x--;
            }
            if(ball.y==frame.getHeight()-125){
                ydirection = false;
            }
            if(ball.y==0){
                ydirection = true;
            }
            if(ydirection==true){
                ball.y++;
            }else{
                ball.y--;
            }

            frame.repaint();
            //System.out.println(ball.x + "," + ball.y);

        }

    }

    public static void main(String[] args){
        TestDesignPanel test = new TestDesignPanel();
    }
}

