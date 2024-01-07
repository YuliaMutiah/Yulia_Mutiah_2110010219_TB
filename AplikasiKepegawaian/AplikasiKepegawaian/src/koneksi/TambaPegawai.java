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
public class TambaPegawai {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    
    private String sql;
    
    public String nip;
    public String nama;
    public String jabatan;  //variabel yang dipakai 
    public String jenis_kelamin;
    public String agama;
    public String status;
    public String alamat;
    
    
    public void simpan()throws SQLException{
        conn = koneksidatabase.getKoneksi();
        sql = "INSERT INTO tambahpegawai(nip,nama,jabatan,jenis_kelamin,agama,status,alamat)VALUES(?,?,?,?,?,?,?)";
        ps = conn.prepareStatement(sql);
        ps.setString(1, nip);
        ps.setString(2, nama);
        ps.setString(3, jabatan);  //koding untuk tambah data ke database
        ps.setString(4, jenis_kelamin);
        ps.setString(5, agama);
        ps.setString(6, status);
        ps.setString(7, alamat);
        ps.execute();
        ps.close();
        
    }
    
    public void edit()throws SQLException{
        conn = koneksidatabase.getKoneksi();
        sql = "UPDATE tambahpegawai set nama=?,jabatan=?,jenis_kelamin=?,agama=?,status=?,alamat=? where nip=?";
        ps = conn.prepareStatement(sql);
        ps.setString(1, nama);
        ps.setString(2, jabatan);
        ps.setString(3, jenis_kelamin); //koding untuk edit data ke database
        ps.setString(4, agama);
        ps.setString(5, status);
        ps.setString(6, alamat);
        ps.setString(7, nip);
        ps.executeUpdate();
        ps.close();
        
    }
    
    public void hapus()throws SQLException{
       conn = koneksidatabase.getKoneksi();
       String sql = "DELETE from tambahpegawai where nip=?";
       try{
        ps = conn.prepareStatement(sql);  //koding untuk  hapus data ke database
        ps.setString(1, nip);
        ps.execute();
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
    }
    
    public ResultSet UpdateJTable()throws SQLException {
       conn = koneksidatabase.getKoneksi();
       sql = "select nip,nama,jabatan,jenis_kelamin,agama,status,alamat from tambahpegawai";
       ps = conn.prepareStatement(sql); 
       rs = ps.executeQuery();  //koding untuk menampilkan data dari database ke tabel
       return rs;
    }
}
