/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author TechCare
 */
public class NhanVien {
    String MANV,TENNV,MATKHAU,DIACHI,EMAIL,SDT,HINHANH,VAITRO;
    Date NGAYSINH,NGAYVAOLAM;
    double LUONG;

    public NhanVien() {
    }

    public NhanVien(String MANV, String TENNV, String MATKHAU, String DIACHI, String EMAIL, String SDT, String HINHANH, String VAITRO, Date NGAYSINH, Date NGAYVAOLAM, double LUONG) {
        this.MANV = MANV;
        this.TENNV = TENNV;
        this.MATKHAU = MATKHAU;
        this.DIACHI = DIACHI;
        this.EMAIL = EMAIL;
        this.SDT = SDT;
        this.HINHANH = HINHANH;
        this.VAITRO = VAITRO;
        this.NGAYSINH = NGAYSINH;
        this.NGAYVAOLAM = NGAYVAOLAM;
        this.LUONG = LUONG;
    }

    public String getMANV() {
        return MANV;
    }

    public void setMANV(String MANV) {
        this.MANV = MANV;
    }

    public String getTENNV() {
        return TENNV;
    }

    public void setTENNV(String TENNV) {
        this.TENNV = TENNV;
    }

    public String getMATKHAU() {
        return MATKHAU;
    }

    public void setMATKHAU(String MATKHAU) {
        this.MATKHAU = MATKHAU;
    }

    public String getDIACHI() {
        return DIACHI;
    }

    public void setDIACHI(String DIACHI) {
        this.DIACHI = DIACHI;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getHINHANH() {
        return HINHANH;
    }

    public void setHINHANH(String HINHANH) {
        this.HINHANH = HINHANH;
    }

    public String getVAITRO() {
        return VAITRO;
    }

    public void setVAITRO(String VAITRO) {
        this.VAITRO = VAITRO;
    }

    public Date getNGAYSINH() {
        return NGAYSINH;
    }

    public void setNGAYSINH(Date NGAYSINH) {
        this.NGAYSINH = NGAYSINH;
    }

    public Date getNGAYVAOLAM() {
        return NGAYVAOLAM;
    }

    public void setNGAYVAOLAM(Date NGAYVAOLAM) {
        this.NGAYVAOLAM = NGAYVAOLAM;
    }

    public double getLUONG() {
        return LUONG;
    }

    public void setLUONG(double LUONG) {
        this.LUONG = LUONG;
    }
    
}
