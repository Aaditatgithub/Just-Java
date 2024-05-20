import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Statement13 extends JFrame implements ActionListener{
    JLabel base, height, output;
    JButton calculateArea;
    JTextArea enterBase, enterHeight;

    Statement13(){
        setTitle("Area Calculator");
        setSize(400, 400);
        setLayout(null);

        base = new JLabel("Enter base: ");
        base.setBounds(50, 50, 90, 20);
        add(base);

        height = new JLabel("Enter height: ");
        height.setBounds(50, 90, 90, 20);
        add(height);

        output = new JLabel("Output: ");
        output.setBounds(110, 120, 90, 20);
        add(output);
        
        enterBase = new JTextArea();
        enterBase.setBounds(150, 50, 30, 20);
        add(enterBase);
    
        enterHeight = new JTextArea();
        enterHeight.setBounds(150, 90, 30, 20);
        add(enterHeight);

        calculateArea = new JButton();
        calculateArea.setBounds(90,140,90,30);
        calculateArea.addActionListener(this);
        calculateArea.setText("Area");
        add(calculateArea);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == calculateArea){
            int base = Integer.parseInt(enterBase.getText());
            int height = Integer.parseInt(enterHeight.getText());

            int area = (base*height)/2;
            output.setText("Area:: " + area);
        }
    }

    public static void main(String[] args) {
      new Statement13();  
    }
}
