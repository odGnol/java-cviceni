package MockArray.view;

import javax.swing.*;

public class MyScreen extends JFrame {

    ScreenCanvas panel = new ScreenCanvas();

    public MyScreen() {

        this.setSize(420, 420);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setTitle("Testing testing, Houston!");
    }
}
