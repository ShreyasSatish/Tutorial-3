import java.awt.*;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius, Point position, Color colour) {
        super(position, colour);
        this.radius = radius;
    }

    @Override
    public void Draw(Graphics graphic) {
        graphic.setColor(this.colour);
        graphic.fillOval(position.x, position.y, radius * 2, radius * 2);
    }
}
