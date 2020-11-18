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
public class DichVu {
    String MADV,TENDV,GHICHU;
    double GIATIEN;

    public DichVu() {
    }

    public DichVu(String MADV, String TENDV, String GHICHU, double GIATIEN) {
        this.MADV = MADV;
        this.TENDV = TENDV;
        this.GHICHU = GHICHU;
        this.GIATIEN = GIATIEN;
    }

    public String getMADV() {
        return MADV;
    }

    public void setMADV(String MADV) {
        this.MADV = MADV;
    }

    public String getTENDV() {
        return TENDV;
    }

    public void setTENDV(String TENDV) {
        this.TENDV = TENDV;
    }

    public String getGHICHU() {
        return GHICHU;
    }

    public void setGHICHU(String GHICHU) {
        this.GHICHU = GHICHU;
    }

    public double getGIATIEN() {
        return GIATIEN;
    }

    public void setGIATIEN(double GIATIEN) {
        this.GIATIEN = GIATIEN;
    }
    
}
