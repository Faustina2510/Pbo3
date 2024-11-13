/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Maria Ceunfin
 */
import basicForm.Spotlight;
import java.awt.EventQueue;
import javax.swing.*;

public class SpotlightDemo extends JFrame {
    public SpotlightDemo() {
        initComponents();
    }

    private void initComponents() {
        add(new Spotlight());  // Menambahkan panel Spotlight ke frame
        setTitle("Spotlight Demo");  // Mengatur judul frame
        setSize(350, 300);  // Mengatur ukuran frame
        setLocationRelativeTo(null);  // Menempatkan frame di tengah layar
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Mengatur operasi close
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                SpotlightDemo spotlightDemo = new SpotlightDemo();
                spotlightDemo.setVisible(true);  // Menampilkan frame SpotlightDemo
            }
        });
    }
}
