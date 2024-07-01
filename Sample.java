package Exam;

import javax.swing.*;
import java.awt.*;

public class Sample extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg;

    public Sample() {
        // Set up the frame
        setTitle("Sample");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.cyan);

        // Set the initial message
        msg = "Inside init( ) --";
    }

    // Initialize the string to be displayed.
    public void start() {
        msg += " Inside start( ) --";
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); // Ensure the frame is properly painted
        g.setColor(Color.red);
        msg += " Inside paint( ).";
        g.drawString(msg, 10, 50);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Sample frame = new Sample();
            frame.start();
            frame.setVisible(true);
        });
    }
}
