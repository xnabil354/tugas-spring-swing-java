package com.example.swing_spring;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.swing_spring")
public class AppConfig {

    @Bean
    public JTextField textField() {
        return new JTextField(20);
    }

    @Bean
    public JButton button() {
        return new JButton("Klik Saya (Spring)");
    }

    @Bean
    public JLabel label() {
        return new JLabel("Hasil: Menunggu input...");
    }
}