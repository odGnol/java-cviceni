package MockArray.view;

import MockArray.model.Point;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class ScreenCanvas extends JPanel {

  //  private int List<Point> points;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

    }

    public ScreenCanvas() {

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });

        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
            }
        });
    }
}
