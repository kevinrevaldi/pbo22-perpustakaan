package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;

public class GUI {

    JFrame LogReg = new JFrame();
    JLabel login, daftar, top;
    JTextField textidkursus, textnama, textnotelp, textnpmdaftar, textkelas, textalamat;
    JLabel labelidkursus, labelnama, labelpasswordlogin, labelnotelp, labelnpmdaftar, labelpassworddaftar, kelaslabel, labelalamat;
    JButton check, reg;
    JPasswordField passwordlogin, passworddaftar;

    private boolean ceklogin = false;

    public GUI() {
        LogReg.setSize(900, 900);
        LogReg.setLayout(null);
        LogReg.getContentPane().setBackground(Color.RED);
        top = new JLabel("KURSUS INTENSI");
        top.setBounds(280, 10, 600, 50);
        top.setFont(new Font("Times New Roman", Font.BOLD, 40));
        LogReg.add(top);

        login = new JLabel("login");
        login.setBounds(100, 100, 100, 100);
        login.setFont(new Font("Times New Roman", Font.BOLD, 30));
        LogReg.add(login);

        labelidkursus = new JLabel("ID");
        labelidkursus.setBounds(39, 188, 30, 30);
        LogReg.add(labelidkursus);
        textidkursus = new JTextField();
        textidkursus.setBounds(30, 210, 200, 30);
        LogReg.add(textidkursus);

        labelpasswordlogin = new JLabel("Password");
        labelpasswordlogin.setBounds(39, 255, 100, 30);
        LogReg.add(labelpasswordlogin);
        passwordlogin = new JPasswordField();
        passwordlogin.setBounds(30, 280, 200, 30);
        LogReg.add(passwordlogin);

        check = new JButton("LOGIN");
        check.setBounds(50, 320, 150, 40);
        check.setBackground(Color.GREEN);
        LogReg.add(check);

        daftar = new JLabel("Buat Akun");
        daftar.setFont(new Font("Times New Roman", Font.BOLD, 30));
        daftar.setBounds(600, 100, 150, 100);
        LogReg.add(daftar);

        labelnpmdaftar = new JLabel("ID Akun");
        labelnpmdaftar.setBounds(600, 150, 100, 50);
        LogReg.add(labelnpmdaftar);
        textnpmdaftar = new JTextField();
        textnpmdaftar.setBounds(600, 180, 200, 30);
        LogReg.add(textnpmdaftar);

        labelnama = new JLabel("Nama");
        labelnama.setBounds(600, 210, 100, 30);
        LogReg.add(labelnama);
        textnama = new JTextField();
        textnama.setBounds(600, 240, 200, 30);
        LogReg.add(textnama);

        labelalamat = new JLabel("Alamat");
        labelalamat.setBounds(600,270,100,50);
        LogReg.add(labelalamat);
        textalamat = new JTextField();
        textalamat.setBounds(600,300,200,30);
        LogReg.add(textalamat);

        labelpassworddaftar = new JLabel("Password");
        labelpassworddaftar.setBounds(600, 330, 100, 30);
        LogReg.add(labelpassworddaftar);
        passworddaftar = new JPasswordField();
        passworddaftar.setBounds(600, 360, 200, 30);
        LogReg.add(passworddaftar);

        labelnotelp = new JLabel("No Telepon");
        labelnotelp.setBounds(600, 390, 100, 30);
        LogReg.add(labelnotelp);
        textnotelp = new JTextField();
        textnotelp.setBounds(600, 420, 200, 30);
        LogReg.add(textnotelp);

        kelaslabel = new JLabel("Kelas");
        kelaslabel.setBounds(600, 450, 200, 30);
        LogReg.add(kelaslabel);
        textkelas = new JTextField();
        textkelas.setBounds(600, 480, 200, 30);
        LogReg.add(textkelas);

        reg = new JButton("Daftar");
        reg.setBounds(650, 510, 100, 40);
        reg.setBackground(Color.GREEN);
        LogReg.add(reg);
        LogReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LogReg.setVisible(true);
        LogReg.setLocationRelativeTo(null);
//        radioaslab.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent ae) {
//                if (radioaslab.isSelected()) {
//                    radiopraktikan.setSelected(false);
//                    ceklogin = true;
//                }
//            }
//        });
//        radiopraktikan.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent ae) {
//                if (radiopraktikan.isSelected()) {
//                    radioaslab.setSelected(false);
//                    ceklogin = false;
//                }
//            }
//        });
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                    try {
                        AllObjectController.akunController.login(textidkursus.getText(), passwordlogin.getText());
                        String nama = AllObjectController.akunController.getData().getNama();
                        JOptionPane.showMessageDialog(null, "Selamat Datang " + nama, "information", JOptionPane.INFORMATION_MESSAGE);
                        KursusGUI kugui = new KursusGUI();
                        LogReg.dispose();
                    } catch (Exception exception) {
                        JOptionPane.showMessageDialog(null, "ID atau password salah", " information", JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                    }
            }
        });
        reg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    String idakun = textnpmdaftar.getText();
                    String nama = textnama.getText();
                    String alamat = textalamat.getText();
                    String notelp = textnotelp.getText();
                    String pw = passworddaftar.getText();
                    String kursus = textkelas.getText();
                    AllObjectController.akunController.daftarKursus(idakun,nama,alamat,notelp,pw,kursus);
                    JOptionPane.showMessageDialog(null, "Registrasi Sukses", "information", JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Format Penulisan Salah", "Registrasi Gagal", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }

    void kosong() {
        textidkursus.setText(null);
        passworddaftar.setText(null);
        textnama.setText(null);
        textnotelp.setText(null);
        textalamat.setText(null);
        textidkursus.setText(null);
        passwordlogin.setText(null);
        textkelas.setText(null);

    }
}
