/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author Tran Bao
 */
public class childCars {
    private String MaXE;
    private String MaLX;
    private String BienSo;
    private String MoTa;
    private String TinhTrang;

    public childCars(String MaXE, String MaLX, String BienSo, String MoTa, String TinhTrang) {
        this.MaXE = MaXE;
        this.MaLX = MaLX;
        this.BienSo = BienSo;
        this.MoTa = MoTa;
        this.TinhTrang = TinhTrang;
    }
    public childCars() {
    }
    
    public childCars(String MaLX, String BienSo, String TinhTrang, String MoTa)
    {
        this.MaLX=MaLX;
        this.BienSo = BienSo;
        this.TinhTrang=TinhTrang;
        this.MoTa=MoTa;
        this.MaXE="";
    }    

    public String getMaXE() {
        return MaXE;
    }

    public void setMaXE(String MaXE) {
        this.MaXE = MaXE;
    }

    public String getMaLX() {
        return MaLX;
    }

    public void setMaLX(String MaLX) {
        this.MaLX = MaLX;
    }

    public String getBienSo() {
        return BienSo;
    }

    public void setBienSo(String BienSo) {
        this.BienSo = BienSo;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }
    
    
    
    
}
