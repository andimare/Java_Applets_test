package Exam;
import javax.swing.*;
import java.awt.*;

public class CheckboxTest extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg = "Applet started.";
    private JCheckBox shoes, socks, pants, vest, shirt;
    private JLabel messageLabel;

    public CheckboxTest() {
        // Set up the frame
        setTitle("CheckboxTest");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create checkboxes
        shoes = new JCheckBox("Shoes");
        socks = new JCheckBox("Socks");
        pants = new JCheckBox("Pants");
        vest = new JCheckBox("Vest");
        shirt = new JCheckBox("Shirt");

        // Add checkboxes to the frame
        add(shoes);
        add(socks);
        add(pants);
        add(vest);
        add(shirt);

        // Create a label to display messages
        messageLabel = new JLabel(msg);
        add(messageLabel);
    }

    public static void main(String[] args) {
        // Create and display the frame
        SwingUtilities.invokeLater(() -> {
            CheckboxTest frame = new CheckboxTest();
            frame.setVisible(true);
        });
    }
}