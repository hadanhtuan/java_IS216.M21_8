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
public class User {
    private String MaND;
    private String TenND;
    private String TenTK;
    private String Email;
    private String MatKhau;
    private String DiaChi;
    private BufferedImage CMND_T;
    private BufferedImage CMND_S;
    private String SoDT;
    private String NgaySinh;
    private String Role;
    private int Blacklist =0;
    
    public static User Instance = null;

    public User(String MaND, String TenND, String TenTK, String Email, String MatKhau, String DiaChi, BufferedImage CMND_T, BufferedImage CMND_S, String SoDT, String NgaySinh) {
        this.MaND = MaND;
        this.TenND = TenND;
        this.TenTK = TenTK;
        this.Email = Email;
        this.MatKhau = MatKhau;
        this.DiaChi = DiaChi;
        this.CMND_T = CMND_T;
        this.CMND_S = CMND_S;
        this.SoDT = SoDT;
        this.NgaySinh = NgaySinh;
    }

    public User() {
    }

    public User(String MaND, String TenNV, String TenTK, String Email, String MatKhau, String DiaChi, String SoDT, String NgaySinh) {
        this.MaND = MaND;
        this.TenND = TenNV;
        this.TenTK = TenTK;
        this.Email = Email;
        this.MatKhau = MatKhau;
        this.DiaChi = DiaChi;
        this.SoDT = SoDT;
        this.NgaySinh = NgaySinh;
        this.CMND_T=null;
        this.CMND_S=null;
    }

    public String getMaND() {
        return MaND;
    }

    public void setMaND(String MaND) {
        this.MaND = MaND;
    }
    
    public User getInstance() {
        return Instance;
    }

    public void setInstance(User Instance) {
        this.Instance = Instance;
    }
    
    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }

    public String getTenND() {
        return TenND;
    }

    public void setTenND(String TenNV) {
        this.TenND = TenNV;
    }

    public String getTenTK() {
        return TenTK;
    }

    public void setTenTK(String TenTK) {
        this.TenTK = TenTK;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public BufferedImage getCMND_T() {
        return CMND_T;
    }

    public void setCMND_T(BufferedImage CMND_T) {
        this.CMND_T = CMND_T;
    }

    public BufferedImage getCMND_S() {
        return CMND_S;
    }

    public void setCMND_S(BufferedImage CMND_S) {
        this.CMND_S = CMND_S;
    }

    public String getSoDT() {
        return SoDT;
    }

    public void setSoDT(String SoDT) {
        this.SoDT = SoDT;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public int getBlacklist() {
        return Blacklist;
    }

    public void setBlacklist(int Blacklist) {
        this.Blacklist = Blacklist;
    }   
}