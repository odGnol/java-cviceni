import java.awt.*;
import javax.swing.*;

public class GraphicsDemo extends JPanel {

    public void paintComponent(Graphics g) {


        super.paintComponent(g);
        this.setBackground(Color.BLACK);

        Graphics2D g2D = (Graphics2D) g;

        GradientPaint paint = new GradientPaint(50,50,Color.RED,410,0, Color.BLUE);

//        int[] xPoints = {50, 100, 150, 200, 250, 300, 350};
//        int[] yPoints = {350, 250, 275, 200, 275, 150, 100};
//        int nPoints = xPoints.length;

//        int [] x = {100,200,300};
//        int [] y = {300,127,400};

//        g2D.setColor(Color.RED);
//        g2D.setStroke(new BasicStroke(20));
//        g2D.drawLine(200, 200, 50,50);

//        g2D.setColor(Color.GREEN);
//        g2D.setStroke(new BasicStroke(2));
//        g2D.drawPolyline(xPoints, yPoints, nPoints);
//
//        g2D.setFont(new Font("Comic Sans", Font.ITALIC, 25));
//        g2D.setColor(Color.GREEN);
//        g2D.drawString("STONKS", 100, 100);

//        g2D.setColor(Color.YELLOW);
//        g2D.fillPolygon(x, y, 3);

//        g2D.setStroke(new BasicStroke(2));
//        g2D.setColor(Color.cyan);
//        g2D.drawRect(50,50,300, 300);
//
//        g2D.setStroke(new BasicStroke(5));
//        g2D.drawOval(50,50,300,300);

//        g2D.setPaint(new Color(150,250,150));
//        g2D.fillArc(10,10,100,100,180,270);

        g2D.setPaint(paint);
        g2D.fillArc(60,60,200,200,180,270);




    }
}
