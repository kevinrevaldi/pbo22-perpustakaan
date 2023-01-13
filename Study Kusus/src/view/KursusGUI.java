package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KursusGUI {
    JFrame LogReg = new JFrame();
    JLabel tambahbuku, top, admin;

    JLabel login, daftar;
    JTextField textidkursus,textnomor,textnomorr,textpilih,textdataba, textnama, textnotelp, textnpmdaftar, textkelas, textalamat;
    JLabel labelidkursus,labelpilih,labeldataba,labelnomor,labelnomorr,Labeldaftarm, labelnama, labelpasswordlogin, labelnotelp, labelnpmdaftar, labelpassworddaftar, kelaslabel, labelalamat;
    JButton tambah, hapus, edit, exit;
    JPasswordField passwordlogin, passworddaftar;

    JTable tabelakun = new JTable();
    JScrollPane scrollstaff = new JScrollPane(tabelakun);

    public KursusGUI() {

        LogReg.setSize(1000, 600);
        LogReg.setLayout(null);
        LogReg.getContentPane().setBackground(Color.RED);
        top = new JLabel("KURSUS INTENSI");
        top.setBounds(290, 30, 500, 50);
        top.setFont(new Font("Times New Roman", Font.BOLD, 40));
        LogReg.add(top);

        scrollstaff.setBounds(470, 180, 500, 200);

//Daftar Buku
        tabelakun.setModel(AllObjectController.akunController.daftarkursus());
        LogReg.add(scrollstaff);

        tambahbuku = new JLabel("Daftar Akun");
        tambahbuku.setFont(new Font("Times New Roman", Font.BOLD, 20));
        tambahbuku.setBounds(470, 60, 210, 100);
        LogReg.add(tambahbuku);

//Edit Buku
        tambahbuku = new JLabel("Edit Akun");
        tambahbuku.setFont(new Font("Times New Roman", Font.BOLD, 20));
        tambahbuku.setBounds(250, 60, 210, 100);
        LogReg.add(tambahbuku);

        labelpilih = new JLabel("Masukkan Pilihan : ");
        labelpilih.setBounds(250, 170, 150, 50);
        LogReg.add(labelpilih);
        textpilih = new JTextField();
        textpilih.setBounds(250, 200, 200, 30);
        LogReg.add(textpilih);

        labelnpmdaftar = new JLabel("Menu edit : ");
        labelnpmdaftar.setBounds(250, 110, 100, 50);
        LogReg.add(labelnpmdaftar);
        Labeldaftarm = new JLabel("1.Id Kursus || 2. Nama");
        Labeldaftarm.setBounds(250, 125, 150, 50);
        LogReg.add(Labeldaftarm);
        Labeldaftarm = new JLabel("3.Alamat || 4. No.Tlp");
        Labeldaftarm.setBounds(250, 140, 150, 50);
        LogReg.add(Labeldaftarm);
        Labeldaftarm = new JLabel("5.Kelas ");
        Labeldaftarm.setBounds(250, 155, 150, 50);
        LogReg.add(Labeldaftarm);

        labelnomorr = new JLabel("Masukkan No Data :");
        labelnomorr.setBounds(250, 230, 170, 30);
        LogReg.add(labelnomorr);
        textnomorr = new JTextField();
        textnomorr.setBounds(250, 260, 200, 30);
        LogReg.add(textnomorr);

        labeldataba = new JLabel("Masukkan Data Baru :");
        labeldataba.setBounds(250, 290, 170, 30);
        LogReg.add(labeldataba);
        textdataba = new JTextField();
        textdataba.setBounds(250, 315, 200, 30);
        LogReg.add(textdataba);

        edit = new JButton("Edit");
        edit.setBounds(250, 350, 100, 30);
        edit.setBackground(Color.GREEN);
        LogReg.add(edit);

//Hapus Buku
        tambahbuku = new JLabel("Hapus Akun");
        tambahbuku.setFont(new Font("Times New Roman", Font.BOLD, 20));
        tambahbuku.setBounds(250, 350, 210, 100);
        LogReg.add(tambahbuku);

        labelnomor = new JLabel("Masukkan No : ");
        labelnomor.setBounds(250, 410, 200, 30);
        LogReg.add(labelnomor);
        textnomor = new JTextField();
        textnomor.setBounds(250, 440, 200, 30);
        LogReg.add(textnomor);

        hapus = new JButton("Hapus");
        hapus.setBounds(250, 480, 100, 30);
        hapus.setBackground(Color.GREEN);
        LogReg.add(hapus);

        exit = new JButton("Keluar");
        exit.setBounds(500, 480, 100, 30);
        exit.setBackground(Color.GREEN);
        LogReg.add(exit);

//Tambah Buku
        tambahbuku = new JLabel("Tambah Akun");
        tambahbuku.setFont(new Font("Times New Roman", Font.BOLD, 20));
        tambahbuku.setBounds(30, 60, 210, 100);
        LogReg.add(tambahbuku);

        labelnpmdaftar = new JLabel("ID Akun");
        labelnpmdaftar.setBounds(30, 110, 100, 50);
        LogReg.add(labelnpmdaftar);
        textnpmdaftar = new JTextField();
        textnpmdaftar.setBounds(30, 140, 200, 30);
        LogReg.add(textnpmdaftar);

        labelnama = new JLabel("Nama");
        labelnama.setBounds(30, 170, 100, 30);
        LogReg.add(labelnama);
        textnama = new JTextField();
        textnama.setBounds(30, 200, 200, 30);
        LogReg.add(textnama);

        labelalamat = new JLabel("Alamat");
        labelalamat.setBounds(30,230,100,50);
        LogReg.add(labelalamat);
        textalamat = new JTextField();
        textalamat.setBounds(30,260,200,30);
        LogReg.add(textalamat);

        labelpassworddaftar = new JLabel("Password");
        labelpassworddaftar.setBounds(30, 290, 100, 30);
        LogReg.add(labelpassworddaftar);
        passworddaftar = new JPasswordField();
        passworddaftar.setBounds(30, 320, 200, 30);
        LogReg.add(passworddaftar);

        labelnotelp = new JLabel("No Telepon");
        labelnotelp.setBounds(30, 350, 100, 30);
        LogReg.add(labelnotelp);
        textnotelp = new JTextField();
        textnotelp.setBounds(30, 380, 200, 30);
        LogReg.add(textnotelp);

        kelaslabel = new JLabel("Kelas");
        kelaslabel.setBounds(30, 410, 200, 30);
        LogReg.add(kelaslabel);
        textkelas = new JTextField();
        textkelas.setBounds(30, 440, 200, 30);
        LogReg.add(textkelas);

        tambah = new JButton("Tambah");
        tambah.setBounds(30, 480, 100, 30);
        tambah.setBackground(Color.GREEN);
        LogReg.add(tambah);

        LogReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LogReg.setVisible(true);
        LogReg.setLocationRelativeTo(null);

        tambah.addActionListener(new ActionListener() {
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
                    tabelakun.setModel(AllObjectController.akunController.daftarkursus());
                    JOptionPane.showMessageDialog(null, "Tambah Sukses", "information", JOptionPane.INFORMATION_MESSAGE);
                    //kosong();
                    KursusGUI kugui = new KursusGUI();
                    LogReg.dispose();
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Format Penulisan Salah", "Registrasi Gagal", JOptionPane.INFORMATION_MESSAGE);
                    //kosong();
                }
            }
        });

        edit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    String idakun = textdataba.getText();
                    String nama = textdataba.getText();
                    String alamat = textdataba.getText();
                    String notelp = textdataba.getText();
                    String pw = textdataba.getText();
                    String kursus = textdataba.getText();
                    int nomorr = Integer.parseInt(textnomorr.getText());
                    String data = textdataba.getText();
                    int pilih = Integer.parseInt(textpilih.getText());
                    switch (pilih) {
                        case 1:
                            AllObjectController.akunController.editakun(nomorr,1, data);
                            break;
                        case 2:
                            AllObjectController.akunController.editakun(nomorr,2, data);
                            break;
                        case 3:
                            AllObjectController.akunController.editakun(nomorr,3, data);
                            break;
                        case 4:
                            AllObjectController.akunController.editakun(nomorr,4, data);
                            break;
                        case 5:
                            AllObjectController.akunController.editakun(nomorr,5, data);
                            break;
                        case 6:
                            AllObjectController.akunController.editakun(nomorr,6, data);
                            break;
                        default:
                    }
                    JOptionPane.showMessageDialog(null, " Data Berhasil Diedit ", "information", JOptionPane.INFORMATION_MESSAGE);
                    KursusGUI kugui = new KursusGUI();
                    LogReg.dispose();
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(
                            null, "Nomor Tidak Ada", "information", JOptionPane.INFORMATION_MESSAGE);
                    //kosong();
                }
            }

        });

        hapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int nomor = Integer.parseInt(textnomor.getText());
                    AllObjectController.akunController.hapusakun(nomor);

                    JOptionPane.showMessageDialog(null, " Data Berhasil Dihapus ", "information", JOptionPane.INFORMATION_MESSAGE);
                    KursusGUI kugui = new KursusGUI();
                    LogReg.dispose();
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(
                            null, "Nomor Tidak Ada", "information", JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                }
            }

        });

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                LogReg.dispose();
            }
        });
    }
    void kosong() {
        textidkursus.setText(null);
        passworddaftar.setText(null);
        textnama.setText(null);
        textnotelp.setText(null);
        textalamat.setText(null);
        textkelas.setText(null);
    }


}
