import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Rect extends Shape {

    private int wid;
    private int hei;

    public Rect(Point initPos, Color col, int width, int height) {
        super(initPos, col);
        wid = width;
        hei=height;

    }

    @Override
    public void draw(Graphics g) {
        g.setColor(col);
        g.fillRect(pos.x, pos.y, wid, hei);
    }


}

