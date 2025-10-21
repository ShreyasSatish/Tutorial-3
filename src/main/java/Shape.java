import java.awt.*;

public abstract class Shape {
    protected Point position;
    protected Color colour;

    public Shape(Point position, Color colour) {
        this.position = position;
        this.colour = colour;
    }

    public abstract void Draw(Graphics graphic);
}
