import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.plaf.ColorUIResource;

public class Main{
    public static void main(String[] args) {

        //Adding an image
        ImageIcon image = new ImageIcon("./2218159.png");
        Border border = BorderFactory.createLineBorder(Color.green, 5);

        // MyFrame frame = new MyFrame();
        JLabel label = new JLabel();
        label.setText("Do you code?");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        label.setForeground(new ColorUIResource(255,255,255));
        // label.setFont(null);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);



        JFrame frame = new JFrame();    // creates an instance of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // stops the application upon click, by defualt it is hide on close
        frame.setTitle("My-First-Frame");
        // frame.setResizable(false);      // resize the window
        frame.setVisible(true);
        frame.setSize(420, 420);
        frame.getContentPane().setBackground(new ColorUIResource(0x095A80));
        frame.add(label);
        ImageIcon logo_image = new ImageIcon("Picture1.png");
        frame.setIconImage(logo_image.getImage());

    }
}