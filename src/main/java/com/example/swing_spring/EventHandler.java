package com.example.swing_spring;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EventHandler implements ActionListener {

    private final JLabel label;
    private final JTextField textField;

    @Autowired
    public EventHandler(JLabel label, JTextField textField) {
        this.label = label;
        this.textField = textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String teksInput = textField.getText();

        if (teksInput.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Input tidak boleh kosong!");
        } else {
            label.setText("Hasil: " + teksInput);
            System.out.println("Log Spring: Memproses teks -> " + teksInput);
        }
    }
}