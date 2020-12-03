package Listeners.Key;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements KeyListener{

    JLabel label;
    ImageIcon icon;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 800);
        this.setLayout(null);
        this.addKeyListener(this);

        icon = new ImageIcon("./src/Listeners/Key/acat.png");

        label = new JLabel();
        label.setBounds(0,0,128,128);
        label.setIcon(icon);
//        label.setBackground(Color.red);
//        label.setOpaque(true);
        //to show a color background
        this.getContentPane().setBackground(Color.BLACK);
        this.add(label);
        this.setVisible(true);

    }


    // keyTyped: uses KeyChar, char output
    @Override
    public void keyTyped(KeyEvent e) {

        switch(e.getKeyChar()) {
            case 'a': label.setLocation(label.getX() - 10, label.getY());
                break;
            case 'w': label.setLocation(label.getX(), label.getY()-10);
                break;
            case 's': label.setLocation(label.getX(), label.getY()+10);
                break;
            case 'd': label.setLocation(label.getX() + 10, label.getY());
                break;
        }

    }

    //keyPressed, uses KeyCode, int output
    @Override
    public void keyPressed(KeyEvent e) {

        switch(e.getKeyCode()) {
            case 37: label.setLocation(label.getX() - 10, label.getY());
                break;
            case 38: label.setLocation(label.getX(), label.getY()-10);
                break;
            case 39: label.setLocation(label.getX()+10, label.getY());
                break;
            case 40: label.setLocation(label.getX(), label.getY()+10);
                break;
        }

    }


    //whenever a button is released
    @Override
    public void keyReleased(KeyEvent e) {

        System.out.println("You released key char: " + e.getKeyChar() + " " + e.getKeyCode());

    }
}
