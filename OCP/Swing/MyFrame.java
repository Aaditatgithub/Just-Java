import javax.swing.JFrame;
import javax.swing.plaf.ColorUIResource;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // stops the application upon click, by defualt it is hide on close
        this.setTitle("My-First-Frame");
        // this.setResizable(false);      // resize the window
        this.setVisible(true);
        this.setSize(420, 420);


        // ImageIcon image = new ImageIcon("logo.png");
        // this.setIconImage(image.getImage());

        this.getContentPane().setBackground(new ColorUIResource(0x095A80));
    }
}
