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
public class KhachHang {
    String MAKH,TENKH,DIACHI,SDT;
    Date NGAYSINH;

    public KhachHang() {
    }

    public KhachHang(String MAKH, String TENKH, String DIACHI, String SDT, Date NGAYSINH) {
        this.MAKH = MAKH;
        this.TENKH = TENKH;
        this.DIACHI = DIACHI;
        this.SDT = SDT;
        this.NGAYSINH = NGAYSINH;
    }

    public String getMAKH() {
        return MAKH;
    }

    public void setMAKH(String MAKH) {
        this.MAKH = MAKH;
    }

    public String getTENKH() {
        return TENKH;
    }

    public void setTENKH(String TENKH) {
        this.TENKH = TENKH;
    }

    public String getDIACHI() {
        return DIACHI;
    }

    public void setDIACHI(String DIACHI) {
        this.DIACHI = DIACHI;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public Date getNGAYSINH() {
        return NGAYSINH;
    }

    public void setNGAYSINH(Date NGAYSINH) {
        this.NGAYSINH = NGAYSINH;
    }
    
}
