import java.awt.*;
import java.util.ArrayList;

public class Drawing extends Canvas {
    private Circle circle;
    private Rect rectangle;
    private Square square;
    private ArrayList<Shape> shapes;

    public Drawing(int radius, int width, int height, Point position1,
                   Point position2, Color colour1, Color colour2,
                   int width2, Point position3, Color colour3) {
        circle = new Circle(radius, position1, colour1);
        rectangle = new Rect(width, height, position2, colour2);
        square = new Square(width2, position3, colour3);
        shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(square);
    }

    public void paint(Graphics g) {
        g.setColor(Color.cyan);
        g.drawLine(300, 300 ,200, 100);
        for(Shape s : shapes) {
            s.draw(g);
        }
    }
}
