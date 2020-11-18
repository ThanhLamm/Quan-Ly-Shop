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
public class HoaDonChiTiet {
    int MAHDCT,SOLUONGMUA;
    String MAHD,MADV,MASP;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(int MAHDCT, int SOLUONGMUA, String MAHD, String MADV, String MASP) {
        this.MAHDCT = MAHDCT;
        this.SOLUONGMUA = SOLUONGMUA;
        this.MAHD = MAHD;
        this.MADV = MADV;
        this.MASP = MASP;
    }

    public int getMAHDCT() {
        return MAHDCT;
    }

    public void setMAHDCT(int MAHDCT) {
        this.MAHDCT = MAHDCT;
    }

    public int getSOLUONGMUA() {
        return SOLUONGMUA;
    }

    public void setSOLUONGMUA(int SOLUONGMUA) {
        this.SOLUONGMUA = SOLUONGMUA;
    }

    public String getMAHD() {
        return MAHD;
    }

    public void setMAHD(String MAHD) {
        this.MAHD = MAHD;
    }

    public String getMADV() {
        return MADV;
    }

    public void setMADV(String MADV) {
        this.MADV = MADV;
    }

    public String getMASP() {
        return MASP;
    }

    public void setMASP(String MASP) {
        this.MASP = MASP;
    }
    
}
