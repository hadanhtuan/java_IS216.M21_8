/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

import java.awt.image.BufferedImage;

/**
 *
 * @author Tran Bao
 */
public class Cars {
    public static Cars Instance;
    private String MaLX;
    private String TenLX;
    private String SoCho;
    private String SoLuong;
    private String Gia;
    private String NgoaiGio;
    private BufferedImage ImageNgoai;
    private BufferedImage ImageNoiThat;
    private float DoanhThu;

    public Cars(String MaLX, String SoLuong) {
        this.MaLX = MaLX;
        this.SoLuong = SoLuong;
    }

    
    
    public Cars(String TenLX, String SoCho, String SoLuong, String Gia, String NgoaiGio, float DoanhThu) {
        this.MaLX="";
        this.TenLX = TenLX;
        this.SoCho = SoCho;
        this.SoLuong = SoLuong;
        this.Gia = Gia;
        this.NgoaiGio = NgoaiGio;
        this.ImageNgoai=null;
        this.ImageNoiThat=null;
        this.DoanhThu = DoanhThu;
    }   
    
    

    public Cars(String MaLX, String TenLX, String SoCho, String SoLuong, String Gia, String NgoaiGio, BufferedImage ImageNgoai, BufferedImage ImageNoiThat, float DoanhThu) {
        this.MaLX = MaLX;
        this.TenLX = TenLX;
        this.SoCho = SoCho;
        this.SoLuong = SoLuong;
        this.Gia = Gia;
        this.NgoaiGio = NgoaiGio;
        this.ImageNgoai = ImageNgoai;
        this.ImageNoiThat = ImageNoiThat;
        this.DoanhThu = DoanhThu;
    }

    public Cars(String MaLX, String TenLX, String SoCho, String SoLuong, String Gia, String NgoaiGio,float DoanhThu) {
        this.MaLX = MaLX;
        this.TenLX = TenLX;
        this.SoCho = SoCho;
        this.SoLuong = SoLuong;
        this.Gia = Gia;
        this.NgoaiGio = NgoaiGio;
        this.ImageNgoai=null;
        this.ImageNoiThat=null;
        this.DoanhThu = DoanhThu;
    }
    
    
    

    public Cars(String TenLX, String SoCho, String SoLuong, String Gia, String NgoaiGio, BufferedImage ImageNgoai,BufferedImage ImageNoiThat, float DoanhThu) {

        this.TenLX = TenLX;
        this.SoCho = SoCho;
        this.SoLuong = SoLuong;
        this.Gia = Gia;
        this.NgoaiGio = NgoaiGio;
        this.ImageNgoai = ImageNgoai;
        this.ImageNoiThat=ImageNoiThat;
        this.DoanhThu = DoanhThu;
    }

    public Cars() {
        
    }

    public String getMaLX() {
        return MaLX;
    }

    public void setMaLX(String MaLX) {
        this.MaLX = MaLX;
    }

    public String getTenLX() {
        return TenLX;
    }

    public void setTenLX(String TenLX) {
        this.TenLX = TenLX;
    }

    public String getSoCho() {
        return SoCho;
    }

    public void setSoCho(String SoCho) {
        this.SoCho = SoCho;
    }

    public String getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(String SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getGia() {
        return Gia;
    }

    public void setGia(String Gia) {
        this.Gia = Gia;
    }

    public String getNgoaiGio() {
        return NgoaiGio;
    }

    public void setNgoaiGio(String NgoaiGio) {
        this.NgoaiGio = NgoaiGio;
    }

    public BufferedImage getImageNgoai() {
        return ImageNgoai;
    }

    public void setImageNgoai(BufferedImage ImageNgoai) {
        this.ImageNgoai = ImageNgoai;
    }

    public BufferedImage getImageNoiThat() {
        return ImageNoiThat;
    }

    public void setImageNoiThat(BufferedImage ImageNoiThat) {
        this.ImageNoiThat = ImageNoiThat;
    }
    
    public float getDoanhThu(){
        return this.DoanhThu;
    }
}