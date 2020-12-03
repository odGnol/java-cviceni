package src2;

import javax.swing.*;
import java.awt.*;

public class MyFrame2 extends JFrame {

    MyPanel panel;

    MyFrame2() {

        panel = new MyPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null); //setting to middle of a screen
        this.setVisible(true);
    }
}
