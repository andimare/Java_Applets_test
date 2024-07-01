package Exam;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonDemo extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg = "";
    JButton yes, no, undecided;
    JLabel messageLabel;

    public ButtonDemo() {
        // Set up the frame
        setTitle("ButtonDemo");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create buttons
        yes = new JButton("Yes");
        no = new JButton("No");
        undecided = new JButton("Undecided");

        // Add buttons to the frame
        add(yes);
        add(no);
        add(undecided);

        // Register to receive action events
        yes.addActionListener(this);
        no.addActionListener(this);
        undecided.addActionListener(this);

        // Create a label to display messages
        messageLabel = new JLabel("Applet started.");
        add(messageLabel);
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();

        if (str.equals("Yes")) {
            msg = "You pressed Yes.";
        } else if (str.equals("No")) {
            msg = "You pressed No.";
        } else if (str.equals("Undecided")) {
            msg = "You pressed Undecided.";
        }

        // Update the message label
        messageLabel.setText(msg);
    }

    public static void main(String[] args) {
        // Create and display the frame
        SwingUtilities.invokeLater(() -> {
            ButtonDemo frame = new ButtonDemo();
            frame.setVisible(true);
        });
    }
}
