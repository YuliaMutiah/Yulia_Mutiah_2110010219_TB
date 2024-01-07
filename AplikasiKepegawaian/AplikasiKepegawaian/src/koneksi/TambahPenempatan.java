/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class TambahPenempatan {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    
    private String sql;
    
    public String nip;
    public String nama;   //variabel yang dipakai 
    public String penempatan;
    public String bagian;
    
    public void simpan()throws SQLException{
        conn = koneksidatabase.getKoneksi();
        sql = "INSERT INTO penempatan(nip,nama,penempatan,bagian)VALUES(?,?,?,?)";
        ps = conn.prepareStatement(sql);
        ps.setString(1, nip);
        ps.setString(2, nama);       //koding melakukan tambah data ke database
        ps.setString(3, penempatan);
        ps.setString(4, bagian);
        ps.execute();
        ps.close();
    }
    
     public void edit()throws SQLException{
        conn = koneksidatabase.getKoneksi();
        sql = "UPDATE penempatan set nama=?,penempatan=?,bagian=? where nip=?";
        ps = conn.prepareStatement(sql);
        ps.setString(1, nama);
        ps.setString(2, penempatan);   //koding untuk edit data ke database
        ps.setString(3, bagian);
        ps.setString(4, nip);
        ps.executeUpdate();
        ps.close();
        
    }
     
      public void hapus()throws SQLException{
       conn = koneksidatabase.getKoneksi();
       String sql = "DELETE from penempatan where nip=?";
       try{
        ps = conn.prepareStatement(sql);  //koding untuk hapus data ke database
        ps.setString(1, nip);
        ps.execute();
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
    }
    public ResultSet UpdateJTable()throws SQLException {
       conn = koneksidatabase.getKoneksi();
       sql = "select nip,nama,penempatan,bagian from penempatan";
       ps = conn.prepareStatement(sql);
       rs = ps.executeQuery();   //koding ini untuk menampilkan data dari database ke data tabel
       return rs;
    }
        
}
