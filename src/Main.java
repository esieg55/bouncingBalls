import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(450, 450);

        MyPanel panel = new MyPanel();
     // panel.setBackground(Color.RED);

        frame.add(panel);
        frame.setVisible(true);
    }

}
