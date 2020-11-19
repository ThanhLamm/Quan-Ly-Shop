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
public class SanPham {
    String MASP,TENSP,GHICHU;
    int SOLUONG;
    double GIATIENSP;
    Date NGAYNHAPKHO;

    public SanPham() {
    }

    public SanPham(String MASP, String TENSP, String GHICHU, int SOLUONG, double GIATIENSP, Date NGAYNHAPKHO) {
        this.MASP = MASP;
        this.TENSP = TENSP;
        this.GHICHU = GHICHU;
        this.SOLUONG = SOLUONG;
        this.GIATIENSP = GIATIENSP;
        this.NGAYNHAPKHO = NGAYNHAPKHO;
    }

    public String getMASP() {
        return MASP;
    }

    public void setMASP(String MASP) {
        this.MASP = MASP;
    }

    public String getTENSP() {
        return TENSP;
    }

    public void setTENSP(String TENSP) {
        this.TENSP = TENSP;
    }

    public String getGHICHU() {
        return GHICHU;
    }

    public void setGHICHU(String GHICHU) {
        this.GHICHU = GHICHU;
    }

    public int getSOLUONG() {
        return SOLUONG;
    }

    public void setSOLUONG(int SOLUONG) {
        this.SOLUONG = SOLUONG;
    }

    public double getGIATIENSP() {
        return GIATIENSP;
    }

    public void setGIATIENSP(double GIATIENSP) {
        this.GIATIENSP = GIATIENSP;
    }

    public Date getNGAYNHAPKHO() {
        return NGAYNHAPKHO;
    }

    public void setNGAYNHAPKHO(Date NGAYNHAPKHO) {
        this.NGAYNHAPKHO = NGAYNHAPKHO;
    }    
}
