import javax.swing.JFrame;

public class Main{
    public static void main(String[] args) {
        JFrame frame = new JFrame();    // creates an instance of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // stops the application upon click, by defualt it is hide on close
        frame.setTitle("My-First-Frame");
        frame.setVisible(true);
        frame.setSize(420, 420);
    }
}