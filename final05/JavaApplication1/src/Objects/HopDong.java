/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author Tran Bao
 */
public class HopDong {
    private String SoHopDong;
    private String MaDX;
    private String NgayHD;

    public HopDong() {
    }

    public HopDong(String SoHopDong, String MaDX, String NgayHD) {
        this.SoHopDong = SoHopDong;
        this.MaDX = MaDX;
        this.NgayHD = NgayHD;
    }

    public String getSoHopDong() {
        return SoHopDong;
    }

    public void setSoHopDong(String SoHopDong) {
        this.SoHopDong = SoHopDong;
    }

    public String getMaDX() {
        return MaDX;
    }

    public void setMaDX(String MaDX) {
        this.MaDX = MaDX;
    }

    public String getNgayHD() {
        return NgayHD;
    }

    public void setNgayHD(String NgayHD) {
        this.NgayHD = NgayHD;
    }
}
