/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buregi.form;

import buregi.model.hapus_transaksi;
import buregi.model.koneksiDataBase;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Resa Yudha
 */
public class Hapus_Perjalanan extends javax.swing.JFrame {

    /**
     * Creates new form Hapus_Perjalanan
     */
    public Connection koneksi;
    hapus_transaksi haptrans = new hapus_transaksi();
    public Hapus_Perjalanan() {
        initComponents();
        tablePerja();
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
        idtrans = new javax.swing.JTextField();
        keluarmenu = new javax.swing.JButton();
        hapustrans = new javax.swing.JButton();
        kemenu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(815, 635));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hapus Data Perjalanan");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 10, 320, 29);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Id Transaksi");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 80, 120, 22);
        getContentPane().add(idtrans);
        idtrans.setBounds(160, 80, 220, 30);

        keluarmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Exit.png"))); // NOI18N
        keluarmenu.setText("jButton1");
        keluarmenu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Exit2.png"))); // NOI18N
        keluarmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarmenuActionPerformed(evt);
            }
        });
        getContentPane().add(keluarmenu);
        keluarmenu.setBounds(460, 550, 110, 40);

        hapustrans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/hapusbutton1.png"))); // NOI18N
        hapustrans.setText("jButton2");
        hapustrans.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/hapusbutton2.png"))); // NOI18N
        hapustrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapustransActionPerformed(evt);
            }
        });
        getContentPane().add(hapustrans);
        hapustrans.setBounds(590, 550, 110, 40);

        kemenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/sub3.jpg"))); // NOI18N
        kemenu.setText("jButton3");
        kemenu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/sub23.jpg"))); // NOI18N
        kemenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kemenuActionPerformed(evt);
            }
        });
        getContentPane().add(kemenu);
        kemenu.setBounds(740, 0, 70, 80);

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
        jScrollPane1.setBounds(10, 130, 690, 402);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/TampilanDefault.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 838, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kemenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kemenuActionPerformed
        this.setVisible(false);
        Menu menu = new Menu();
        menu.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_kemenuActionPerformed

    private void keluarmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarmenuActionPerformed
        this.setVisible(false);
        Menu menu = new Menu();
        menu.setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_keluarmenuActionPerformed

    private void hapustransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapustransActionPerformed
        String idtra = (String) idtrans.getText();
        if(haptrans.hapustransaksi(idtra)){
            JOptionPane.showMessageDialog(rootPane,"Hapus Transaksi Berhasil");
            this.setVisible(false);
            Menu menu = new Menu();
            menu.setVisible(true);
        }// TODO add your handling code here:
    }//GEN-LAST:event_hapustransActionPerformed

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
            java.util.logging.Logger.getLogger(Hapus_Perjalanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hapus_Perjalanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hapus_Perjalanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hapus_Perjalanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hapus_Perjalanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hapustrans;
    private javax.swing.JTextField idtrans;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton keluarmenu;
    private javax.swing.JButton kemenu;
    // End of variables declaration//GEN-END:variables

    public void tablePerja(){
    DefaultTableModel tabel = new DefaultTableModel();
    tabel.addColumn("ID Transaksi");
    tabel.addColumn("ID Pelanggan");
    tabel.addColumn("Nama");
    tabel.addColumn("ID Paket");
    tabel.addColumn("Tgl Berangkat");
    tabel.addColumn("Kendaraan");
    tabel.addColumn("Sopir");
    tabel.addColumn("Biaya");
    
    try{
        koneksi = new koneksiDataBase().condb();
        String sql = "select * from tr_pejalanan order by id_transaksi";
        Statement stat = koneksi.createStatement();
        ResultSet res = stat.executeQuery(sql);
        while(res.next()){
            tabel.addRow(new Object[]{res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8)});
        }
    }catch(Exception ex){
        JOptionPane.showMessageDialog(rootPane, "gagal tampil data"+ex);
    }
    jTable1.setModel(tabel);
}
}