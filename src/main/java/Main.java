import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Drawing drawing = new Drawing(40, 100, 100,
                new Point(100, 100), new Point(400, 400),
                Color.pink, Color.orange);

        // Adding the Drawing object to the Frame object
        // (a Frame object can have a Canvas object added to it,
        // our Drawing object extends the Canvas object
        frame.add(drawing);

        // Setting some parameters of the drawing using
        // the inherited methods from the Canvas class
        drawing.setSize(800, 800);
        drawing.setBackground(Color.darkGray);

        // Setting some parameters of the frame using
        // the Frame methods
        frame.setLayout(null);
        frame.setSize(800, 800);
        frame.setVisible(true);

        // Adding a 'listener' so the window will
        // close when the close button is pressed
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}
