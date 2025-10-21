import java.awt.*;

public class Rect extends Shape{
    private int width;
    private int height;

    public Rect(int width, int height, Point position, Color colour) {
        super(position, colour);
        this.width = width;
        this.height = height;
    }

    public void Draw(Graphics graphic) {
        graphic.setColor(colour);
        graphic.fillRect(position.x, position.y, width, height);
    }
}
