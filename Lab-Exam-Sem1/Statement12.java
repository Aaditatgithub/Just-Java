import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Statement12 extends JFrame implements ActionListener{
    
    JLabel wordLabel, counLabel;
    JTextArea textArea;
    JButton countButton;

    Statement12(){
        setTitle("Word Counter");
        setSize(700,500);
        setLayout(null);
    
        wordLabel = new JLabel("Total words: ");
        wordLabel.setBounds(50,50,100,30);
        add(wordLabel);

        counLabel = new JLabel("Total characters: ");
        counLabel.setBounds(50,100,100,30);
        add(counLabel);

        textArea = new JTextArea();
        textArea.setBounds(50,150,300,80);
        add(textArea);

        countButton = new JButton();
        countButton.setBounds(50, 250, 40, 20);
        countButton.addActionListener(this);
        add(countButton);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == countButton){
            String text = textArea.getText();
            String[] words = text.split("\\s+");
            int wordscount = words.length;
            int charCount = text.length();
            wordLabel.setText("" + wordscount);
            counLabel.setText("" + charCount);
        }
    }

    public static void main(String[] args) {
        new Statement12();
    }
}