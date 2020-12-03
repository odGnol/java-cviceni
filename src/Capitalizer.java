import javax.swing.*;
import java.awt.*;

public class Capitalizer {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            var initialText = "Co je to za kód?";
            var area = new JTextArea(initialText, 8, 50);

            var lowerCaseButton = new JButton("Zmenši písmo");
            var upperCaseButton = new JButton("Zvětši písmo");
            lowerCaseButton.addActionListener(e -> area.setText(area.getText().toLowerCase()));
            upperCaseButton.addActionListener(e -> area.setText(area.getText().toUpperCase()));

            var buttonPanel = new JPanel();
            buttonPanel.add(lowerCaseButton);
            buttonPanel.add(upperCaseButton);

            var frame = new JFrame("Kapitalizuj.");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(new JScrollPane(area), BorderLayout.CENTER);
            frame.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
            frame.pack();
            frame.setVisible(true);
        });
    }
}
