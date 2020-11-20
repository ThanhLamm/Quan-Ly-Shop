/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import JdbcConnection.JdbcHelper;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import model.NhanVien;

/**
 *
 * @author Thinkpad
 */
public class NhanVienDao {
  public ArrayList<NhanVien> getNhanVien(JdbcHelper connect) {
    ArrayList<NhanVien> list = new ArrayList<>();
    try {
      Statement st = connect.getConnect().createStatement();
      ResultSet rs = st.executeQuery("select * from NHANVIEN");
      while(rs.next()) {
        NhanVien nv = new NhanVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(5), rs.getString(6), rs.getString(7),
                rs.getString(10), rs.getBoolean(11), rs.getDate(4), rs.getDate(8), rs.getDouble(9));
        list.add(nv);
      }
      st.close();
      rs.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return list;
  }

  public NhanVien findByMaNV(String MaNV, JdbcHelper connect) {
    NhanVien nv = new NhanVien();
    nv = null;
    try {
      PreparedStatement ps = connect.getConnect().prepareStatement("select * from NHANVIEN where MANV = ?");
      ps.setString(1, MaNV);
      ResultSet rs = ps.executeQuery();
      while(rs.next()) {
        nv = new NhanVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(5), rs.getString(6), rs.getString(7),
                rs.getString(10), rs.getBoolean(11), rs.getDate(4), rs.getDate(8), rs.getDouble(9));
      }
      ps.close();
      rs.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return nv;
  }
  
}
