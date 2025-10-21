import java.awt.*;

public class Drawing extends Canvas {
    private Circle circle;
    private Rect rectangle;

    public Drawing(int radius, int width, int height, Point position1,
                   Point position2, Color colour1, Color colour2) {
        circle = new Circle(radius, position1, colour1);
        rectangle = new Rect(width, height, position2, colour2);
    }

    public void paint(Graphics g) {
        g.setColor(Color.cyan);
        g.drawLine(300, 300 ,200, 100);
        circle.Draw(g);
        rectangle.Draw(g);
    }
}
