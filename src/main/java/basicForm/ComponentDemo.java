/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicForm;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Maria Ceunfin
 */
public class ComponentDemo extends JFrame {
    public ComponentDemo() {
        // mengatur judul form
        setTitle("Component Demo");
        // tombol close pada jendela diatur menutup program jika diklik
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // mengatur ukuran form
        setSize(300, 200);
        // memanggil fungsi menambahkan komponen ke form
        initComponents();
    }
    
    private void initComponents() {
        // membuat label dari JLabel
        JLabel lblPesan = new JLabel();
        // variabel untuk menampung pesan
        String pesan = "<html><font color=\"blue\"><big>Java</big></font>" +
                "<sup>TM</sup> &copy; <em>Oracle Corporation</em>.<br>" +
                "<font color=\"red\">Hak Cipta Dilindungi oleh UU.</font></html>";
        // label menampilkan pesan
        lblPesan.setText(pesan);
        
        // membuat tombol Quit dari JButton
        JButton btnKeluar = new JButton("Keluar");
        // menambahkan fungsi menutup program pada tombol Quit
        btnKeluar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        // mengatur letak label dan button pada form
        Container pane = getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout((LayoutManager) gl);
        gl.setAutoCreateContainerGaps(true);
        gl. setHorizontalGroup(gl.createSequentialGroup().addComponent(lblPesan)
            .addComponent (btnKeluar));
        gl.setVerticalGroup(gl.createSequentialGroup().addComponent(lblPesan)
            .addComponent(btnKeluar));
    }
    
    public static void main (String[] args) {
        // menjalankan dan menampilkan form
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ComponentDemo(). setVisible(true);
            }
        });
    }
}
