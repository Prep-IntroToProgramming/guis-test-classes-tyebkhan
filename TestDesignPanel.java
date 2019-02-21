import javax.swing.*;
import java.awt.*;
public class TestDesignPanel{
    JFrame frame;
    Boolean move = true;
    Boolean forward = true;
    DrawDesignPanel ball = new DrawDesignPanel();
    public TestDesignPanel(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(ball);
        frame.setSize(500,500);
        frame.setVisible(true);
        while(move == true){ 
            if(ball.x==frame.getWidth()&&ball.y==frame.getHeight()){
                forward = false;
            }
            if(ball.x==0&&ball.y==0){
                forward = true;
            }
            if(forward==true){
                ball.x++;
                ball.y++;
            }else{
                ball.x--;
                ball.y--;
            }
            
            frame.repaint();
            //System.out.println(ball.x + "," + ball.y);
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){

            }
        }
    }

    public static void main(String[] args){
        TestDesignPanel test = new TestDesignPanel();
    }
}

