import java.awt.*;

public class Regex {
    public int calculateOverlap(int[] data) {
        if (data.length != 8) throw new IndexOutOfBoundsException("Wrong amount of parameters!");

        Point x1 = new Point(data[0], data[1]);
        Point x2 = new Point(data[2], data[3]);
        Point y1 = new Point(data[4], data[5]);
        Point y2 = new Point(data[6], data[7]);

        Rectangle a = new Rectangle(x1, new Dimension(Math.abs(x2.x - x1.x), Math.abs(x2.y - x1.y)));
        Rectangle b = new Rectangle(y1, new Dimension(Math.abs(y2.x - y1.x), Math.abs(y2.y - y1.y)));
        Rectangle c = a.intersection(b);

        return c.isEmpty()? 0 : c.width * c.height;
    }


}
