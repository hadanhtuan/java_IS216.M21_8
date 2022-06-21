/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author 20522
 */
public class Revenue {
    String SoHopDong;
    String SoHoaDon;
    String MaNV;
    String NgayHoaDon;
    String TriGia;

    public Revenue(String SoHopDong, String SoHoaDon, String MaNV, String NgayHoaDon, String TriGia) {
        this.SoHopDong = SoHopDong;
        this.SoHoaDon = SoHoaDon;
        this.MaNV = MaNV;
        this.NgayHoaDon = NgayHoaDon;
        this.TriGia = TriGia;
    }

    public Revenue() {
    }

    public String getSoHopDong() {
        return SoHopDong;
    }

    public void setSoHopDong(String SoHopDong) {
        this.SoHopDong = SoHopDong;
    }

    public String getSoHoaDon() {
        return SoHoaDon;
    }

    public void setSoHoaDon(String SoHoaDon) {
        this.SoHoaDon = SoHoaDon;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getNgayHoaDon() {
        return NgayHoaDon;
    }

    public void setNgayHoaDon(String NgayHoaDon) {
        this.NgayHoaDon = NgayHoaDon;
    }

    public String getTriGia() {
        return TriGia;
    }

    public void setTriGia(String TriGia) {
        this.TriGia = TriGia;
    }
    
    
    
}
