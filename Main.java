import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Main{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("ModMap");
        frame.setSize(1280, 720);
        
        //laout
        frame.setLayout(new FlowLayout());

        //lable
        JLabel header = new JLabel();
        header.setText("KMUTT MAP");

        //image
        ImageIcon OriginalMapImage = new ImageIcon("./img/Masterplan-KMUTT-S.jpeg");
        Image scaledImage = OriginalMapImage.getImage().getScaledInstance(854, 480, Image.SCALE_SMOOTH);
        ImageIcon mapImage = new  ImageIcon(scaledImage);
        JLabel imagLabel = new JLabel(mapImage);

        //button
        JButton btn = new JButton();
        btn.setText("Click");
        //event
        btn.addActionListener((ActionEvent e) -> {
            // System.out.println("button pressed");
            JOptionPane.showMessageDialog(null, "Comfirm Your Current Place?", "Alert", JOptionPane.WARNING_MESSAGE);
        });

        //add component
        frame.add(header);
        frame.add(imagLabel);
        frame.add(btn);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);

    }
}