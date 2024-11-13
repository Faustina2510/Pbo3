/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicForm;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author Maria Ceunfin
 */
public class FrameDemo extends JFrame {
    public FrameDemo() {
        //mengatur judul form
        setTitle("Frame Demo");
        //mengatur tombol close di jendela akan menutup program
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //mengatur ukuran form
        setSize(300, 200);
    }
    
    public static void main(String[] args) {
        //menjalankan dan menampilkan form
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrameDemo(). setVisible(true);
            }
        });
    }
}
