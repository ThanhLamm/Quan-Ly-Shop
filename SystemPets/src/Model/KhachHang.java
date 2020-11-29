/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author TechCare
 */
public class KhachHang {

    String TenKH, DiaChi, SDT, Email;
    boolean GioiTinh;
    double KhuyenMai;

    public KhachHang() {
    }

    public KhachHang(String TenKH, String DiaChi, String SDT, String Email, boolean GioiTinh, double KhuyenMai) {
        this.TenKH = TenKH;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
        this.Email = Email;
        this.GioiTinh = GioiTinh;
        this.KhuyenMai = KhuyenMai;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public double getKhuyenMai() {
        return KhuyenMai;
    }

    public void setKhuyenMai(double KhuyenMai) {
        this.KhuyenMai = KhuyenMai;
    }

}
