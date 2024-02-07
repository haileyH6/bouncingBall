import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MyPanel extends JPanel {
    int xLoc = 300; // where the ball is located
    int xVel = 6;
    Ball myBall;

    ArrayList<Ball> cappy = new ArrayList<Ball>();

    public MyPanel(){
        setBackground(Color.pink);
        myBall = new Ball(200,300); // where the ball spawns
        for(int i = 0; i<20; i++){
            cappy.add(new Ball());
        }
    }
@Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
   //System.out.println("hi");
//    g.setColor(Color.cyan);
//    g.fillOval(xLoc,80,10,10);
    myBall.draw(g); // creating a ball
    myBall.move();
//   xLoc+=xVel;


   //if(xLoc>=getWidth()-20){
    //   xVel = xVel*-1;
 //  }
   // g.fillOval(150,120,10,10);
   g.setColor(Color.yellow);
//    g.drawString("Hello world", 60,60);
//    g.drawRect(60,80,30,15);
//    g.drawRect(73,95,8,15);
//    g.drawRect(73,110,50,25);
//    g.drawRect(73,138,4,30);

    try {
        Thread.sleep(20); // speed of the ball
    }
    catch(Exception e) {
        System.out.println(e);
    }
    repaint();

    }







}
