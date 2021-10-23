import shapes.Circle;
import shapes.Rect;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Drawing extends Canvas{
    Point p = new Point(230, 200);
    Point p_2= new Point(100, 100);
    int wid = 50;
    int hei = 70;
    Color c = new Color(0x992266);
    private Circle circle_1 = new Circle( p ,c,100);

    private Rect rect_1= new Rect(p_2, c, wid, hei);

    private Frame f;
    public Drawing(){
        setupFrame();
        setupCanvas();

    }

    private void setupCanvas() {
        setBackground(Color.WHITE);
        setSize(400, 400);
    }

    private void setupFrame() {
        f= new Frame("My window");
        f.add(this);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                f.dispose();
            }
        });
    }

    public void paint(Graphics g){

        circle_1.draw(g);
        rect_1.draw(g);
    }
}

