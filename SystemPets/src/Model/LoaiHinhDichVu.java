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
public class LoaiHinhDichVu {
    String MALH,TENLH,GHICHU;

    public LoaiHinhDichVu() {
    }

    public LoaiHinhDichVu(String MALH, String TENLH, String GHICHU) {
        this.MALH = MALH;
        this.TENLH = TENLH;
        this.GHICHU = GHICHU;
    }

    public String getMALH() {
        return MALH;
    }

    public void setMALH(String MALH) {
        this.MALH = MALH;
    }

    public String getTENLH() {
        return TENLH;
    }

    public void setTENLH(String TENLH) {
        this.TENLH = TENLH;
    }

    public String getGHICHU() {
        return GHICHU;
    }

    public void setGHICHU(String GHICHU) {
        this.GHICHU = GHICHU;
    }
    
}
