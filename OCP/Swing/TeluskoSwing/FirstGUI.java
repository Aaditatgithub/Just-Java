
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Addition extends JFrame implements ActionListener{
 
    JTextField  textField1;
    JTextField textField2;
    JLabel label;
    JButton btn;

    public Addition(){
        
        textField1 = new JTextField(50);
        textField2 = new JTextField(50);
        label =  new JLabel("Result");
        btn = new JButton("Get Addition");
        btn.addActionListener(this);            //ActionListener is an interface

        //     //Many layouts:: flow, grid, Null...
        setLayout(new FlowLayout());

        //     //Uses card approach, thus only 1 card at the top is visible
        //     JLabel label = new JLabel("This is my code");
        //     JLabel label1 = new JLabel("Hello bitches");
        
        this.setVisible(true);
        this.setSize(400, 400);
        this.add(label);
        // this.add(label1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(btn);
        add(textField1);
        add(textField2);
    }

    public void actionPerformed(ActionEvent ae){
        int num1 = Integer.parseInt(textField1.getText());
        int num2 = Integer.parseInt(textField2.getText());

        int value = num1 + num2;
        label.setText(value + "");
    }
}

public class FirstGUI {
    public static void main(String[] args) {
        Addition obj = new Addition();

    }
}
