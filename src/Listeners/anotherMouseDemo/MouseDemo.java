package Listeners.anotherMouseDemo;

import java.awt.event.*;
import javax.swing.*;

public class MouseDemo implements MouseListener {

    JLabel label;
    JFrame frame;

    MouseDemo() {

        label = new JLabel();
        frame = new JFrame();
        frame.setSize(840,840);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
