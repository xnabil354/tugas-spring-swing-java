package com.example.swing_spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import javax.swing.*;

public class SwingSpringAplication {
    public static void main(String[] args) {

        System.setProperty("java.awt.headless", "false");

        System.out.println("Sedang memuat Konteks Spring...");

        @SuppressWarnings("resource")
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();

        System.out.println("Spring siap! Menampilkan GUI...");

        SimpleGUI gui = context.getBean(SimpleGUI.class);

        SwingUtilities.invokeLater(() -> {
            gui.display();
        });
    }
}