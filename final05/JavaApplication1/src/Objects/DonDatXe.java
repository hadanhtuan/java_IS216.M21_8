/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author Tran Bao
 */
public class DonDatXe {
    private String MaDX;
    private String MaND;
    private String TinhTrang;
    private String NgayDatDon;
    private String NgayNhanXe;
    private String NgayTraXe;

    public DonDatXe(String MaDX, String MaND, String TinhTrang, String NgayDatDon, String NgayNhanXe) {
        this.MaDX = MaDX;
        this.MaND = MaND;
        this.TinhTrang = TinhTrang;
        this.NgayDatDon = NgayDatDon;        
        this.NgayNhanXe = NgayNhanXe;
   
    }

    public DonDatXe(String MaDX, String MaND, String TinhTrang, String NgayDatDon, String NgayNhanXe, String NgayTraXe) {
        this.MaDX = MaDX;
        this.MaND = MaND;
        this.TinhTrang = TinhTrang;
        this.NgayDatDon = NgayDatDon;
        this.NgayNhanXe = NgayNhanXe;
        this.NgayTraXe = NgayTraXe;
    }
    
    

    public DonDatXe() {
    }

    public String getMaDX() {
        return MaDX;
    }

    public void setMaDX(String MaDX) {
        this.MaDX = MaDX;
    }

    public String getMaND() {
        return MaND;
    }

    public void setMaND(String MaND) {
        this.MaND = MaND;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    public String getNgayNhanXe() {
        return NgayNhanXe;
    }

    public void setNgayNhanXe(String NgayNhanXe) {
        this.NgayNhanXe = NgayNhanXe;
    }

    public String getNgayTraXe() {
        return NgayTraXe;
    }

    public void setNgayTraXe(String NgayTraXe) {
        this.NgayTraXe = NgayTraXe;
    }

    public String getNgayDatDon() {
        return NgayDatDon;
    }

    public void setNgayDatDon(String NgayDatDon) {
        this.NgayDatDon = NgayDatDon;
    }
}
