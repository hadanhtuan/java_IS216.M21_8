/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author 20522
 */
public class HoaDon {

    private String SoHoaDon;
    private String SoHopDong;
    private String MaNV;
    private String NgayHoaDon;
    private String TraTruoc;
    private String TraSau;
    private String PhiPS;
    private String LyDo;
    private String TriGia;
    private String NgayNhanXe;
    private String NgayTraXe;

    public HoaDon(String SoHoaDon, String SoHopDong, String MaNV, String NgayHoaDon, String TraTruoc, String TraSau, String PhiPS, String LyDo, String TriGia, String NgayNhanXe, String NgayTraXe) {
        this.SoHoaDon = SoHoaDon;
        this.SoHopDong = SoHopDong;
        this.MaNV = MaNV;
        this.NgayHoaDon = NgayHoaDon;
        this.TraTruoc = TraTruoc;
        this.TraSau = TraSau;
        this.PhiPS = PhiPS;
        this.LyDo = LyDo;
        this.TriGia = TriGia;
        this.NgayNhanXe = NgayNhanXe;
        this.NgayTraXe = NgayTraXe;
    }

    public HoaDon(String SoHopDong, String MaNV, String TraSau, String PhiPS, String LyDo, String NgayNhanXe, String NgayTraXe) {
        this.SoHopDong = SoHopDong;
        this.MaNV = MaNV;
        this.TraSau = TraSau;
        this.PhiPS = PhiPS;
        this.LyDo = LyDo;
        this.NgayNhanXe = NgayNhanXe;
        this.NgayTraXe = NgayTraXe;
    }
    
    
    
    public HoaDon() {
    }

    public String getSoHoaDon() {
        return SoHoaDon;
    }

    public void setSoHoaDon(String SoHoaDon) {
        this.SoHoaDon = SoHoaDon;
    }

    public String getSoHopDong() {
        return SoHopDong;
    }

    public void setSoHopDong(String SoHopDong) {
        this.SoHopDong = SoHopDong;
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

    public String getTraTruoc() {
        return TraTruoc;
    }

    public void setTraTruoc(String TraTruoc) {
        this.TraTruoc = TraTruoc;
    }

    public String getTraSau() {
        return TraSau;
    }

    public void setTraSau(String TraSau) {
        this.TraSau = TraSau;
    }

    public String getPhiPS() {
        return PhiPS;
    }

    public void setPhiPS(String PhiPS) {
        this.PhiPS = PhiPS;
    }

    public String getLyDo() {
        return LyDo;
    }

    public void setLyDo(String LyDo) {
        this.LyDo = LyDo;
    }

    public String getTriGia() {
        return TriGia;
    }

    public void setTriGia(String TriGia) {
        this.TriGia = TriGia;
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
    
    

}
