/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buregi.form;

import buregi.model.input_perjalanan;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import buregi.model.koneksiDataBase;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Resa Yudha
 */
public class Input_Perjalanan extends javax.swing.JFrame {

    /**
     * Creates new form Input_Perjalanan
     */
    public Connection koneksi;
    input_perjalanan jalan = new input_perjalanan();
    public int hargawisata;

    public Input_Perjalanan() {
        initComponents();
        tampilidpengguna();
        tampilpaket();
        tampilkendaraan();
        tampilsopir();
        tampilid();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        idtransaksi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        idpengguna = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        namapemesan = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        paketperjalanan = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        tanggalberangkat = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        seelsaiinputperjalanan = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        tipekendaraan = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        sopir = new javax.swing.JComboBox<>();
        dashboardbutton = new javax.swing.JButton();
        hargatravel = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(815, 635));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Input Data Perjalanan");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 10, 240, 29);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Informasi Pelanggan");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(330, 70, 140, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Id Transaksi");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 120, 80, 17);
        getContentPane().add(idtransaksi);
        idtransaksi.setBounds(170, 110, 170, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ID Pengguna");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 160, 80, 17);

        idpengguna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id Pelanggan" }));
        idpengguna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idpenggunaActionPerformed(evt);
            }
        });
        getContentPane().add(idpengguna);
        idpengguna.setBounds(170, 150, 170, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nama");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 200, 50, 14);

        namapemesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namapemesanActionPerformed(evt);
            }
        });
        getContentPane().add(namapemesan);
        namapemesan.setBounds(170, 190, 170, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Informasi Perjalanan");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(330, 240, 120, 15);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Paket");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(60, 280, 50, 17);

        paketperjalanan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Paket Wisata" }));
        paketperjalanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paketperjalananActionPerformed(evt);
            }
        });
        getContentPane().add(paketperjalanan);
        paketperjalanan.setBounds(170, 270, 170, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tanggal ");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(60, 330, 60, 17);

        tanggalberangkat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanggalberangkatActionPerformed(evt);
            }
        });
        getContentPane().add(tanggalberangkat);
        tanggalberangkat.setBounds(170, 320, 170, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(160, 390, 220, 180);

        seelsaiinputperjalanan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Selesai1.png"))); // NOI18N
        seelsaiinputperjalanan.setText("Selesai");
        seelsaiinputperjalanan.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Selesai2.png"))); // NOI18N
        seelsaiinputperjalanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seelsaiinputperjalananActionPerformed(evt);
            }
        });
        getContentPane().add(seelsaiinputperjalanan);
        seelsaiinputperjalanan.setBounds(590, 560, 110, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Kendaraan");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(410, 280, 80, 17);

        tipekendaraan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kendaraan" }));
        tipekendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipekendaraanActionPerformed(evt);
            }
        });
        getContentPane().add(tipekendaraan);
        tipekendaraan.setBounds(510, 270, 180, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Sopir");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(410, 330, 40, 14);

        sopir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nama Sopir" }));
        sopir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sopirActionPerformed(evt);
            }
        });
        getContentPane().add(sopir);
        sopir.setBounds(510, 320, 180, 30);

        dashboardbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/sub3.jpg"))); // NOI18N
        dashboardbutton.setText("jButton1");
        dashboardbutton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/sub23.jpg"))); // NOI18N
        dashboardbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(dashboardbutton);
        dashboardbutton.setBounds(730, 0, 80, 70);

        hargatravel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargatravelActionPerformed(evt);
            }
        });
        getContentPane().add(hargatravel);
        hargatravel.setBounds(510, 360, 180, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Harga");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(410, 370, 36, 17);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/TampilanDefault.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 838, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namapemesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namapemesanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namapemesanActionPerformed

    private void tanggalberangkatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanggalberangkatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tanggalberangkatActionPerformed

    private void dashboardbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardbuttonActionPerformed
        this.setVisible(false);
        Menu menu = new Menu();
        menu.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_dashboardbuttonActionPerformed

    private void idpenggunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idpenggunaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idpenggunaActionPerformed

    private void tipekendaraanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipekendaraanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipekendaraanActionPerformed

    private void seelsaiinputperjalananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seelsaiinputperjalananActionPerformed
        String trans = (String) idtransaksi.getText();
        String pguna = (String) idpengguna.getSelectedItem();
        String nam = (String) namapemesan.getText();
        String pkg = (String) paketperjalanan.getSelectedItem();
        String tgl = tanggalberangkat.getText();
        String knd = (String) tipekendaraan.getSelectedItem();
        String ptg = (String) sopir.getSelectedItem();
        int tot = Integer.parseInt(hargatravel.getText());
        if(jalan.input_jalan(trans, pguna, nam, pkg, tgl, knd, ptg, tot)){
            JOptionPane.showMessageDialog(rootPane,"Berhasil Memasukan Data Perjalanan");
            this.setVisible(false);
            Menu menu = new Menu();
            menu.setVisible(true);
        }
        
    }//GEN-LAST:event_seelsaiinputperjalananActionPerformed

    private void paketperjalananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paketperjalananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paketperjalananActionPerformed

    private void sopirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sopirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sopirActionPerformed

    private void hargatravelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargatravelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hargatravelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Input_Perjalanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Input_Perjalanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Input_Perjalanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Input_Perjalanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Input_Perjalanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dashboardbutton;
    private javax.swing.JTextField hargatravel;
    private javax.swing.JComboBox<String> idpengguna;
    private javax.swing.JTextField idtransaksi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField namapemesan;
    private javax.swing.JComboBox<String> paketperjalanan;
    private javax.swing.JButton seelsaiinputperjalanan;
    private javax.swing.JComboBox<String> sopir;
    private javax.swing.JTextField tanggalberangkat;
    private javax.swing.JComboBox<String> tipekendaraan;
    // End of variables declaration//GEN-END:variables

    private void tampilidpengguna(){
        koneksi = new koneksiDataBase().condb();
        try{
            String sql = "select * from pelanggan";
            Statement stat = (Statement) koneksi.createStatement();
            ResultSet res = stat.executeQuery(sql);
            while (res.next()){
                idpengguna.addItem(res.getString("idpelanggan"));
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Terjadi Kesalahahan"+e);
        }
    }
    
    private void tampilpaket(){
        try{
            String sql1 = "select * from paket";
            Statement stat = (Statement) koneksi.createStatement();
            ResultSet res = stat.executeQuery(sql1);
            while (res.next()){
                paketperjalanan.addItem(res.getString("nama_paket"));
                hargawisata = Integer.parseInt(res.getString("harga"));
            }
        }catch (SQLException | NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Terjadi Kesalahan"+ e);
        }
    }
    
    private void tampilkendaraan(){
        try{
            String sql1 = "select * from kendaraan";
            Statement stat = (Statement) koneksi.createStatement();
            ResultSet res = stat.executeQuery(sql1);
            while (res.next()){
                tipekendaraan.addItem(res.getString("Nama"));
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Terjadi Kesalahan"+ e);
        }
    }
    
    private void tampilsopir(){
        try{
            String sql2 = "select * from karyawan where jabatan='sopir'";
            Statement stat = (Statement) koneksi.createStatement();
            ResultSet res = stat.executeQuery(sql2);
            while (res.next()){
                sopir.addItem(res.getString("nick"));
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Terjadi Kesalahan"+ e);
        }
    }
    public void tampilid(){
        DefaultTableModel tabel = new DefaultTableModel();
        tabel.addColumn("ID Transaksi");

        try{
            koneksi = new koneksiDataBase().condb();
            String sql = "select id_transaksi from tr_pejalanan order by id_transaksi";
            Statement stat = koneksi.createStatement();
            ResultSet res = stat.executeQuery(sql);
            while(res.next()){
                tabel.addRow(new Object[]{res.getString(1)});
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane, "gagal tampil data"+ex);
        }
        jTable1.setModel(tabel);
    }
}
