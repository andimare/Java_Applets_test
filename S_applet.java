package Exam;
import javax.swing.*;
import java.awt.*;

public class S_applet extends JPanel {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Draw the head
        g2d.setColor(Color.BLUE);
        g2d.fillOval(50, 50, 200, 200);

        // Draw the eyes
        g2d.setColor(Color.WHITE);
        g2d.fillOval(100, 100, 30, 50);
        g2d.fillOval(170, 100, 30, 50);

        // Draw the nose
        g2d.setColor(Color.RED);
        int[] xPoints = {150, 130, 170};
        int[] yPoints = {130, 170, 170};
        g2d.fillPolygon(xPoints, yPoints, 3);

        // Draw the mouth
        g2d.setColor(Color.WHITE);
        g2d.fillRect(110, 180, 80, 20);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Face Drawing");
        S_applet face = new S_applet();
        frame.add(face);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
