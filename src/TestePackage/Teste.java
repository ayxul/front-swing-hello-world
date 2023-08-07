package TestePackage;

import javax.swing.*;

public class Teste extends JFrame {

    public Teste() {
        super("My Window");

        // Add a label to the window.
        JLabel label = new JLabel("Hello, world!");

        // Add the label to the window.
        add(label);

        // Set the window's size.
        setSize(300, 200);

        // Set the window's default close operation.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Display the window.
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Teste();
            }
        });
    }
}