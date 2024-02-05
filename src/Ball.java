import java.awt.*;

public class Ball {
    //felid, constructer, methods
private int size;
   private int xSpeed;
   private int ySpeed;
    private final Color color;
    private int speed;
    private int x, y;

public Ball(int x, int y){
    this.x = x;
    this.y = y;
    size = 10;
    xSpeed = 3;
    ySpeed = 1;
    color = Color.BLUE;
}

    public Ball() {
        x = (int) (Math.random() * 400);
        y = (int) (Math.random() * 400);
        size = 10;
        xSpeed = 3;
        ySpeed = 1;
        color = Color.GREEN;

    }
public void draw(Graphics g2){
    g2.setColor(color);
    g2.fillOval(x,y,size,size);

}

public int getX(){
    return x;
}

    public int getY(){
        return y;
    }

    public void xChageSpeed(){
     xSpeed = -1*xSpeed;
    }

    public int setSize() {
        size = (int) (Math.random() * 10);
        return size;
    }
//public Color setColor(){
//}

public void yChangeSpeed(){
    ySpeed = -1*ySpeed;

}
public void move(){
    x += xSpeed;
    y+= ySpeed;
//    if(x>=size){
//        speed = speed*-1;
//    }
//    if(y < size){
//        speed = speed*-1;
//    }

}



}
