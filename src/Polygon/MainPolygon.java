package Polygon;

import javax.swing.*;
import java.awt.Toolkit;

public class MainPolygon extends JFrame {


    static JFrame F = new MainPolygon();
    ScreenPolygon ScreenObject = new ScreenPolygon();

    MainPolygon(){

        add(ScreenObject);
        setUndecorated(true);
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        setVisible(true);
    }

    public static void main(String[] args) {

    }
}
