package Listeners.Mouse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {

    JLabel label;
    ImageIcon duffy1;
    ImageIcon duffy2;
    ImageIcon duffy3;
    ImageIcon duffy4;

    MyFrame() {


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        label = new JLabel();
        label.addMouseListener(this);

        duffy1 = new ImageIcon("./src/Listeners/Mouse/daffy01.jpg");
        duffy2 = new ImageIcon("./src/Listeners/Mouse/daffy02.png");
        duffy3 = new ImageIcon("./src/Listeners/Mouse/daffy03.png");
        duffy4 = new ImageIcon("./src/Listeners/Mouse/daffy04.jpg");

        label.setIcon(duffy1);

        this.add(label);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

//        label = new JLabel();
//        label.setBounds(0,0,100,100);
//        label.setBackground(Color.red);
//        label.setOpaque(true);
//        label.addMouseListener(this);
//
//        this.add(label);


    }

    //pressed and released on a component
    @Override
    public void mouseClicked(MouseEvent e) {

        System.out.println("You clicked the mouse.");
        System.out.println("----------------------");
        label.setIcon(duffy2);

    }

    //mouse pressed on a component
    @Override
    public void mousePressed(MouseEvent e) {

        System.out.println("Your pressed the mouse.");
        System.out.println("----------------------");
//        label.setBackground(Color.YELLOW);
        label.setIcon(duffy3);

    }

    //has been released on a component
    @Override
    public void mouseReleased(MouseEvent e) {

        System.out.println("Your released the mouse.");
        System.out.println("----------------------");
//        label.setBackground(Color.GREEN);
        label.setIcon(duffy4);

    }

    //enters a component
    @Override
    public void mouseEntered(MouseEvent e) {

        System.out.println("Your entered the component.");
        System.out.println("----------------------");
//        label.setSize(200, 200);
//        label.setBackground(Color.PINK);
        label.setIcon(duffy2);

    }

    //exited a component
    @Override
    public void mouseExited(MouseEvent e) {

        System.out.println("Your exited the component.");
        System.out.println("----------------------");
//        label.setSize(100, 100);
//        label.setBackground(Color.RED);
        label.setIcon(duffy4);

    }
}
