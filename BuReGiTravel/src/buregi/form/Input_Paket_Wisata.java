/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buregi.form;

import buregi.model.Input_Pkg_Wisata;
import buregi.model.TempatWisataForm;
import buregi.model.koneksiDataBase;
import java.awt.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Resa Yudha
 */
public class Input_Paket_Wisata extends javax.swing.JFrame {

    /**
     * Creates new form Input_Paket_Wisata
     */
    public Connection koneksi;
    DefaultListModel list = new DefaultListModel();
    ArrayList<String> tamp = new ArrayList<>();
    Input_Pkg_Wisata inpt = new Input_Pkg_Wisata();
    String data;
    public Input_Paket_Wisata() {
        initComponents();
        tampilidpengguna();
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
        idPaket = new javax.swing.JTextField();
        namaPaket = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listwisata = new javax.swing.JList<>();
        namawisata = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        selesai = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(815, 635));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Input Paket Perjalanan");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 10, 270, 29);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama Paket Perjalanan");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 100, 200, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Id Paket Perjalanan");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 60, 153, 22);

        idPaket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idPaketActionPerformed(evt);
            }
        });
        getContentPane().add(idPaket);
        idPaket.setBounds(290, 60, 230, 30);
        getContentPane().add(namaPaket);
        namaPaket.setBounds(290, 100, 230, 30);

        jScrollPane1.setViewportView(listwisata);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(300, 250, 220, 130);

        namawisata.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Wisata -" }));
        namawisata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namawisataActionPerformed(evt);
            }
        });
        getContentPane().add(namawisata);
        namawisata.setBounds(290, 150, 230, 30);

        jButton1.setText("Masukan Ke List");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(393, 200, 120, 23);

        jButton2.setText("Cek List");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(450, 390, 69, 23);

        selesai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Selesai1.png"))); // NOI18N
        selesai.setText("jButton3");
        selesai.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Selesai2.png"))); // NOI18N
        selesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selesaiActionPerformed(evt);
            }
        });
        getContentPane().add(selesai);
        selesai.setBounds(590, 560, 110, 30);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Exit.png"))); // NOI18N
        jButton3.setText("jButton3");
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Exit2.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(430, 560, 110, 30);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/sub3.jpg"))); // NOI18N
        jButton4.setText("jButton4");
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/sub23.jpg"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(740, 0, 70, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/TampilanDefault.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 838, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idPaketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idPaketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idPaketActionPerformed

    private void namawisataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namawisataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namawisataActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        data = (String) namawisata.getSelectedItem();
        list.addElement(data);
        tamp.add(data);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        listwisata.setModel(list);
        listwisata.getSelectedValue();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void selesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selesaiActionPerformed
        String idpkw =  idPaket.getText();
        String namapkg = namaPaket.getText();
        if((inpt.input_Wisatas(idpkw, tamp))){
            if(inpt.input_PW(idpkw, namapkg)){
            JOptionPane.showMessageDialog(rootPane,"Hapus Petugas Berhasil");
            this.setVisible(false);
            Menu menu = new Menu();
            menu.setVisible(true);
            }
        }
        else{
            System.out.println("Salah Pada View");
        }
    }//GEN-LAST:event_selesaiActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
        Menu menu = new Menu();
        menu.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
        Menu menu = new Menu();
        menu.setVisible(true);   // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Input_Paket_Wisata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Input_Paket_Wisata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Input_Paket_Wisata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Input_Paket_Wisata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Input_Paket_Wisata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField idPaket;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listwisata;
    private javax.swing.JTextField namaPaket;
    private javax.swing.JComboBox<String> namawisata;
    private javax.swing.JButton selesai;
    // End of variables declaration//GEN-END:variables

    private void tampilidpengguna(){
        koneksi = new koneksiDataBase().condb();
        try{
            String sql = "select * from tb_wisata";
            Statement stat = (Statement) koneksi.createStatement();
            ResultSet res = stat.executeQuery(sql);
            while (res.next()){
                namawisata.addItem(res.getString("nama"));
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Terjadi Kesalahahan"+e);
        }
    }
}
