package Polygon3D.src.renderer;

import BasicPoly.Polygon;
import Polygon3D.src.point.MyPoint;
import Polygon3D.src.shapes.MyPolygon;
import Polygon3D.src.shapes.Tetrahedron;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;

public class Display extends Canvas implements Runnable {

    private static final long serialVersionUID = 1L;

    private Thread thread;
    private final JFrame frame;
    private final static String title = "Renderer";
    public static final int WIDTH = 800, HEIGHT = 600;
    private static boolean running = false;

//    private MyPolygon poly;
    private Tetrahedron tetra;

    public Display() {
        this.frame = new JFrame();

        Dimension size = new Dimension(WIDTH, HEIGHT);
        this.setPreferredSize(size);
    }

    public static void main(String[] args) {
        Display display = new Display();
        display.frame.setTitle(title);
        display.frame.add(display);
        display.frame.pack();
        display.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        display.frame.setLocationRelativeTo(null);
        display.frame.setResizable(false);
        display.frame.setVisible(true);

        display.start();
    }

    public synchronized void start() {
        running = true;
        this.thread = new Thread(this, "Display");
        this.thread.start();
    };

    public synchronized  void stop() {
        running = false;
        try{
            this.thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    };


    @Override
    public void run() {

        long lastTime = System.nanoTime();
        long timer = System.currentTimeMillis();
        final double ns = 1000000000.0 / 60;
        double delta = 0;
        int frames = 0;


        init();

        while(running) {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            while(delta >= 1) {
                update();
                delta--;
                render();
                frames++;
            }


            if(System.currentTimeMillis() - timer > 1000) {
                timer += 1000;
                this.frame.setTitle(title + " | " + frames + " fps");
            }
        }

        stop();

    }

    private void init() {

        int s = 100;
        MyPoint p1 = new MyPoint(s/2, -s/2, -s/2);
        MyPoint p2 = new MyPoint(s/2, s/2, -s/2);
        MyPoint p3 = new MyPoint(s/2, s/2, s/2);
        MyPoint p4 = new MyPoint(s/2, -s/2, s/2);
        MyPoint p5 = new MyPoint(-s/2, -s/2,-s/2);
        MyPoint p6 = new MyPoint(-s/2,s/2, -s/2);
        MyPoint p7 = new MyPoint(-s/2, s/2, s/2);
        MyPoint p8 = new MyPoint(-s/2, -s/2, s/2);
        this.tetra = new Tetrahedron(
//                Color.CYAN,
                new MyPolygon(Color.RED, p1, p2, p3, p4),
                new MyPolygon(Color.GREEN, p5, p6, p7, p8),
                new MyPolygon(Color.BLUE, p1, p2, p6, p5),
                new MyPolygon(Color.YELLOW, p1, p5, p4, p8),
                new MyPolygon(Color.PINK, p2, p6, p7, p3),
                new MyPolygon(Color.GRAY, p4, p3, p7, p8));




//                poly = new MyPolygon(
//                Color.PINK,
//                new MyPoint(0, 100, 0),
//                new MyPoint(0, 0, 0),
//                new MyPoint(0, 50, 50));



    };

    private void render(){
        BufferStrategy bs = this.getBufferStrategy();
        if(bs == null) {
            this.createBufferStrategy(3);
            return;
        }

        Graphics g = bs.getDrawGraphics();

        g.setColor(Color.BLACK);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        tetra.render(g);

//        g.setColor(Color.RED);
//        g.fillRect(50, 100, 200, 200);

        g.dispose();
        bs.show();
    }

    private void update() {
        this.tetra.rotate(true, 2,1,0);

    }
}
