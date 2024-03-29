/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasikepegawaian;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.TambaPegawai;
import koneksi.TambahPenempatan;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author ASUS
 */
public class PenempatanFrom extends javax.swing.JFrame {
      private void ViewData(){
       TambahPenempatan tp = new TambahPenempatan();
       try{
       jTable1.setModel(DbUtils.resultSetToTableModel(tp.UpdateJTable()));
       
       
       }catch(Exception e){
       JOptionPane.showMessageDialog(null, e);
       
       }
      }
    /**
     * Creates new form PenempatanFrom
     */
    public PenempatanFrom() {
        initComponents();
    }
    
    private void Bagian(String bagian){
      String[] bg ={"Gudang","Kasir","Pramuniaga"};
      cbbagian.removeAllItems();
      cbbagian.addItem(bagian);
      for(int i = 0;i <bg.length;i++){
          if(!bg[1].equals(bagian)){
          cbbagian.addItem(bg[1]);
          }
      }
      }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jNip = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jNama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPenempatan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbbagian = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("INFORMASI PENEMPATAN PEGAWAI");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 450, -1));

        jLabel2.setText("Nomor Induk Pegawai");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));
        jPanel1.add(jNip, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 220, -1));

        jLabel3.setText("Nama");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, -1));
        jPanel1.add(jNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 180, -1));

        jLabel4.setText("Penempatan");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, -1, -1));
        jPanel1.add(jPenempatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 190, -1));

        jLabel5.setText("Bagian");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 90, -1, -1));

        cbbagian.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gudang", "Kasir", "Pramuniaga" }));
        jPanel1.add(cbbagian, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, 120, -1));

        jButton1.setText("Tambah");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 120, 50));

        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 120, 50));

        jButton3.setText("Hapus");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 110, 50));

        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 110, 50));

        jButton5.setText("Kembali");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 220, -1, -1));

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 940, 150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       new MenuPegawai().show();
       this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         TambahPenempatan tp = new TambahPenempatan();
         tp.nip = jNip.getText();
         tp.nama = jNama.getText();
         tp.penempatan = jPenempatan.getText();
         tp.bagian = (String) cbbagian.getSelectedItem();
         try{
           tp.simpan();
           JOptionPane.showMessageDialog(null,"Berhasil Tambah Data");
         
         }catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
         
         }ViewData();
         // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TambahPenempatan tp = new TambahPenempatan();
         tp.nip = jNip.getText();
         tp.nama = jNama.getText();
         tp.penempatan = jPenempatan.getText();
         tp.bagian = (String) cbbagian.getSelectedItem();
         try{
           tp.edit();
           JOptionPane.showMessageDialog(null,"Berhasil edit Data");
         
         }catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
         
         }ViewData();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         String hapus[] = {"yes","No"};
           int PromptResult  = JOptionPane.showOptionDialog(null, "Yakin mau hapus?", "Pesan",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null, hapus, hapus[1]);
           if(PromptResult == 0 ){
           TambahPenempatan tp = new TambahPenempatan();
           tp.nip= jNip.getText();
           try{
             tp.hapus();
             JOptionPane.showMessageDialog(null,"Berhasil dihapus"); //untuk hapus data pada tabel 
             ViewData();
           }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
           }
           }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         jNip.setText("");
         jNama.setText("");
         jPenempatan.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
          DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
          jNip.setText(model.getValueAt(jTable1.getSelectedRow(), 0).toString());
          jNama.setText(model.getValueAt(jTable1.getSelectedRow(), 1).toString());
          jPenempatan.setText(model.getValueAt(jTable1.getSelectedRow(), 2).toString());// TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(PenempatanFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenempatanFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenempatanFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenempatanFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PenempatanFrom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbbagian;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jNama;
    private javax.swing.JTextField jNip;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jPenempatan;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
