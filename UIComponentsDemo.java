package Exam;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UIComponentsDemo extends JFrame {
    public UIComponentsDemo() {
        // Set up the frame
        setTitle("UI Components Demo");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Create a panel to hold the components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 10, 10));
        
        // Command Button
        //he button is created with the label "Click Me!".
        JButton button = new JButton("Click Me!");

        //An ActionListener is added to show a dialog box when the button is clicked.
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Button Clicked!");
            }
        });
        panel.add(new JLabel("Command Button:"));
        panel.add(button);
        
        // Single Line Text Field
        //A JTextField object is created to allow single-line text input.
        JTextField textField = new JTextField();
        panel.add(textField);
        panel.add(new JLabel("Single Line Text Field:"));
        
        // Choice Menu
        //A JComboBox object is created with an array of strings representing the choices.
        String[] choices = {"Option 1", "Option 2", "Option 3"};
        JComboBox<String> choiceMenu = new JComboBox<>(choices);
        panel.add(new JLabel("Choice Menu:"));
        panel.add(choiceMenu);
        
        // Add the panel to the frame
        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UIComponentsDemo().setVisible(true);
            }
        });
    }
}