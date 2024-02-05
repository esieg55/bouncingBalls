import javax.swing.*;
import java.awt.*;


public class MyPanel extends JPanel {


    int xLoc = 200;
int yLoc = 300;
int xVel = 15;

    Ball myBall;
    Ball[] ballArea = new Ball[5];

    Ball mySecondBall;
    public MyPanel(){
        setBackground(Color.MAGENTA);
for(int i = 0; i<5; i++){
    ballArea[i] = new Ball();
    ///xLoc+=7;
    // yLoc+=2;
}
         myBall = new Ball(200,300);
        mySecondBall = new Ball(320, 450);

// setBackground(new Color(200,1,99));
    }

@Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
    System.out.println("hi");

   /* g.setColor(Color.blue);
g.fillOval(xLoc,300,20,20);*/
    myBall.draw(g);
    myBall.move();
    mySecondBall.draw(g);
    mySecondBall.move();
    for (int i = 0; i < 5; i++) {
    ballArea[i].draw(g);
    ballArea[i].move();
        ballArea[i].setSize();
        //ballArea[i].random(color);
    //lefft wall                    right
        //ballArea[i].getX() <= 0 || ballArea[i].getX() > getWidth() - 20

        if (ballArea[i].getX() <= 0 || ballArea[i].getX() > getWidth()) {
        ballArea[i].xChageSpeed();
            ballArea[i].draw(g);
//ballArea[i].yChangeSpeed();
        System.out.println("Cheese!");
    }
        if (ballArea[i].getY() <= 0 || ballArea[i].getY() > getHeight()) {
            ballArea[i].yChangeSpeed();
        }
    }
//xLoc+=xVel;
//yLoc-=5;
//doesn't work right





g.setColor(Color.CYAN);
g.fillOval(20,400,12,12);
g.setColor(Color.red);
   g.drawString("Hello World", 235,240);

g.drawLine(80, 95,300, 440);

try {
    Thread.sleep(10);
}
catch(Exception e){
    System.out.println(e);
}
    repaint();


}
}



