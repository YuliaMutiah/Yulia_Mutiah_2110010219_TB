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
public class TambahGaji {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    
    private String sql;
    
    public String nip;
    public String nama;   //variabel yang dipakai 
    public String jabatan;
    public String lama_kerja;
    public String gaji;
    
      public void simpan()throws SQLException{
        conn = koneksidatabase.getKoneksi();
        sql = "INSERT INTO gajipegawai(nip,nama,jabatan,lama_kerja,gaji)VALUES(?,?,?,?,?)";
        ps = conn.prepareStatement(sql);
        ps.setString(1, nip);
        ps.setString(2, nama);       //koding melakukan tambah data ke database
        ps.setString(3, jabatan);
        ps.setString(4, lama_kerja);
        ps.setString(5, gaji);
        ps.execute();
        ps.close();
    }
      
      public void edit()throws SQLException{
        conn = koneksidatabase.getKoneksi();
        sql = "UPDATE gajipegawai set nama=?,jabatan=?,lama_kerja=?,gaji=? where nip=?";
        ps = conn.prepareStatement(sql);
        ps.setString(1, nama);
        ps.setString(2, jabatan);   //koding untuk edit data ke database
        ps.setString(3, lama_kerja);
        ps.setString(4,gaji);
        ps.setString(5, nip);
        ps.executeUpdate();
        ps.close();
        
    }
      public void hapus()throws SQLException{
       conn = koneksidatabase.getKoneksi();
       String sql = "DELETE from gajipegawai where nip=?";
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
       sql = "select nip,nama,jabatan,lama_kerja,gaji from gajipegawai";
       ps = conn.prepareStatement(sql);
       rs = ps.executeQuery();   //koding ini untuk menampilkan data dari database ke data tabel
       return rs;
    }
    
}
