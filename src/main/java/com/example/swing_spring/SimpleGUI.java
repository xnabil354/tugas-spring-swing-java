package com.example.swing_spring;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SimpleGUI {

    private final JButton button;
    private final JTextField textField;
    private final JLabel label;

    private final EventHandler eventHandler;

    @Autowired
    public SimpleGUI(JButton button, JTextField textField, JLabel label, EventHandler eventHandler) {
        this.button = button;
        this.textField = textField;
        this.label = label;
        this.eventHandler = eventHandler;

        this.button.addActionListener(this.eventHandler);
    }

    public void display() {
        JFrame frame = new JFrame("Tugas Spring Framework (Package: swing_spring)");

        JPanel panel = new JPanel();
        panel.add(new JLabel("Input Kata: "));
        panel.add(textField);
        panel.add(button);
        panel.add(label);

        frame.add(panel);
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}