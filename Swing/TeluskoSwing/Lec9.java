import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Addition extends JFrame{
 
    JTextField  textField1;
    JTextField textField2;
    JLabel label;
    JButton btn;

    public Addition(){
        // Using BorderLayout for the JFrame
        super("Addition Calculator");
        setLayout(new BorderLayout());
        
        textField1 = new JTextField(10);
        textField2 = new JTextField(10);
        label =  new JLabel("Result");
        btn = new JButton("Get Addition");

        btn.addActionListener((ae) -> {
            int num1 = Integer.parseInt(textField1.getText());
            int num2 = Integer.parseInt(textField1.getText());
            int value = num1 + num2;
            label.setText(value + "");
        });     

        // Panel for text fields
        JPanel inputPanel = new JPanel();
        inputPanel.add(textField1);
        inputPanel.add(textField2);
        add(inputPanel, BorderLayout.NORTH);
        
        // Panel for button and label
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btn);
        buttonPanel.add(label);
        add(buttonPanel, BorderLayout.CENTER);
        
        // Setting properties of JFrame
        pack(); // Sizes the frame based on preferred sizes of added components
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}

public class Lec9 {
    public static void main(String[] args) {
        Addition obj = new Addition();  
    }
}
