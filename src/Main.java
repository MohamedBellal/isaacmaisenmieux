import javax.swing.*;

public class Main extends JFrame {
    public Main() {
        super("isaac mais en mieux");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null); // Center the window
        JPanel panel = new JPanel();
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }
}
