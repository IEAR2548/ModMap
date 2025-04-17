import java.awt.FlowLayout;
import javax.swing.*;

public class Main{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("ModMap");
        frame.setSize(600, 400);
        
        //laout
        frame.setLayout(new FlowLayout());

        //lable
        JLabel header = new JLabel();
        header.setText("KMUTT MAP");

        //button
        JButton btn = new JButton();
        btn.setText("Here");

        //add component
        frame.add(header);
        frame.add(new JLabel("Hello World!"));
        frame.add(btn);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

    }
}