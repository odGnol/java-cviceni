import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import javax.swing.text.Document;

public class Changer extends JFrame {

    private final JTextField amountField = new JTextField(12);
    private final Document amountText = amountField.getDocument();
    private final JTextArea report = new JTextArea(8, 40);

    public Changer() {
        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("Počet"));
        topPanel.add(amountField);
        getContentPane().add(topPanel, BorderLayout.NORTH);
        getContentPane().add(new JScrollPane(report), BorderLayout.CENTER);

        setBackground(Color.LIGHT_GRAY);
        report.setEditable(false);

        amountText.addDocumentListener(new DocumentListener() {

            public void changedUpdate(DocumentEvent e) {
                updateReport();
            }

            public void insertUpdate(DocumentEvent e) {
                updateReport();
            }

            public void removeUpdate(DocumentEvent e) {
                updateReport();
            }
        });
    }

    void updateReport() {
        try {
            var amount = Integer.parseInt(amountText.getText(0, amountText.getLength()));
            report.setText("To make" + amount + " cents, use\n");
            report.append(amount / 25 + " quarter\n");
            amount %= 25;
            report.append(amount / 10 + " dimes\n");
            amount %= 10;
            report.append(amount / 5 + " pennies\n");
        } catch (NumberFormatException e) {
            report.setText("Not an integer or out of range");
        } catch (Exception e) {
            report.setText(e.toString());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new Changer();
            frame.setTitle("Změna");
            frame.pack();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
