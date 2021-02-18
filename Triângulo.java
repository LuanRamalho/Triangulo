import java.awt.*;
import javax.swing.*;

public class Triângulo extends JPanel 
{
    public void paintComponent(Graphics g) 
    {
        int [] x = {100,200,0};
        int [] y = {0,200,200};
        g.setColor(Color.BLUE);
        g.fillPolygon(x, y, 3);      
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Triângulo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.LIGHT_GRAY);
        frame.setSize(700, 700);
      
        Triângulo panel = new Triângulo();
        frame.add(panel);
        frame.setVisible(true);
    }
}
