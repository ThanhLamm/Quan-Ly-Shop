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
public class HoaDon {
    String MAHD,MANV,MAKH;
    Date NGAYTHANHTOAN;
    double TONGTIEN;

    public HoaDon() {
    }

    public HoaDon(String MAHD, String MANV, String MAKH, Date NGAYTHANHTOAN, double TONGTIEN) {
        this.MAHD = MAHD;
        this.MANV = MANV;
        this.MAKH = MAKH;
        this.NGAYTHANHTOAN = NGAYTHANHTOAN;
        this.TONGTIEN = TONGTIEN;
    }

    public String getMAHD() {
        return MAHD;
    }

    public void setMAHD(String MAHD) {
        this.MAHD = MAHD;
    }

    public String getMANV() {
        return MANV;
    }

    public void setMANV(String MANV) {
        this.MANV = MANV;
    }

    public String getMAKH() {
        return MAKH;
    }

    public void setMAKH(String MAKH) {
        this.MAKH = MAKH;
    }

    public Date getNGAYTHANHTOAN() {
        return NGAYTHANHTOAN;
    }

    public void setNGAYTHANHTOAN(Date NGAYTHANHTOAN) {
        this.NGAYTHANHTOAN = NGAYTHANHTOAN;
    }

    public double getTONGTIEN() {
        return TONGTIEN;
    }

    public void setTONGTIEN(double TONGTIEN) {
        this.TONGTIEN = TONGTIEN;
    }
    
}
