import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class SimpleUI {
    static GraphicsConfiguration gc; // Contains the computer's graphics information

    public static void main(String[] args) {
        JFrame frame = new JFrame(gc); // Create a new JFrame
        frame.setSize(500,300);
        frame.setVisible(true);

        // Closes the program when the frame is closed
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}
