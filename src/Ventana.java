import javax.swing.*;

public class Ventana {
    public JPanel panel;

    public static void main(String[] args) {
        new conexion();
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
