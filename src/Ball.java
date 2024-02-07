import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Ball {
   private int width;

   private int height;
    private Color color;
    private int speed;
    private int x,y;
    int xLoc = 300; // where the ball is located
    int xVel = 6;

  //  int ran = (int)Math.random()*20;




public Ball(){

    this.x = x;
    this.y = y;
    x = (int)(Math.random()*400); // creating random location for the balls
    y = (int)(Math.random()*400);
    this.width = (int)(Math.random()*30); // initilize
    this.height = 10; // initilize
    this.speed = 6; // initilize
    this.color = Color.RED; // initilize
}


    public Ball(int x, int y) {

        if (xLoc >= getWidth() - 20) { // making the ball bounce
            xVel = xVel * -1;
        }
    }


    public int getWidth(){

    return width;
    }

    public int setHeight(int height) {
    int tall = setHeight(10);
    return tall;
    }
    public int setWidth(int width){
   int wide =  width;
   return wide;
    }

public void draw(Graphics g2){
    g2.setColor(color);
    g2.fillOval(x,y, height, width);
}

public void move() {

    setWidth(width);
    setHeight(height);

    if(width>=500);
}


}
