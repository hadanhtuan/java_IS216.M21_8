/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package processes;

import static connectDB.DBO.getOracleConnection;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 *
 * @author Tran Bao
 */
public class insertData {

    public static void InsertLoaiXe(Objects.Cars c, String pathNoiThat, String pathBenNgoai) {
        System.out.println("get Connection....");
        try {
            Connection conn = getOracleConnection();

            //TenLx,SoCho,SoLuong,Gia,NgoaiGio,AnhNgoai,AnhnoiThatb
            String query = "insert into LOAIXE values ('LX'||LOAIXE_SEQ.NEXTVAL, ?,?,?,?,?,?,?, 0)";

            InputStream anh1 = new FileInputStream(pathNoiThat);
            InputStream anh2 = new FileInputStream(pathBenNgoai);

            PreparedStatement st = conn.prepareStatement(query);

            st.setString(1, c.getTenLX());
            st.setInt(2, Integer.parseInt(c.getSoCho()));
            st.setInt(3, Integer.parseInt(c.getSoLuong()));
            st.setFloat(4, Float.parseFloat(c.getGia()));
            st.setFloat(5, Float.parseFloat(c.getNgoaiGio()));
            st.setBlob(6, anh2);
            st.setBlob(7, anh1);

            st.execute();

            conn.close();
            st.close();
            JOptionPane.showMessageDialog(null, "Added Successfully!", "Information", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Insert data successfully!");
        } catch (Exception ex) {
            System.out.println("Insert data failed!");
            System.out.println(ex);
        }
    }

    public static void InsertXe(Objects.childCars c) {
        System.out.println("get Connection ....");
        try {
            Connection conn = getOracleConnection();
            String query = "insert into XE values ('XE'||XE_SEQ.NEXTVAL,?,?, ?, ?)";
            PreparedStatement st = conn.prepareStatement(query);

            st.setString(1, c.getMaLX());
            st.setString(2, c.getBienSo());
            st.setString(3, c.getMoTa());
            st.setString(4, c.getTinhTrang());
            st.execute();

            conn.close();
            st.close();
            JOptionPane.showMessageDialog(null, "Added Successfully!", "Information", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Insert data completed!");

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void SignUp(String HoTen, String TenTK, String Email, String Pass, String Address, String CMND_T, String CMND_S, String SDT, String DoB, String Role) {
        System.out.println("get Connection...");
        try {
            Connection conn = getOracleConnection();

            Statement st = conn.createStatement(java.sql.ResultSet.TYPE_SCROLL_INSENSITIVE,
                    java.sql.ResultSet.CONCUR_READ_ONLY);

            ResultSet rs = st.executeQuery("SELECT 'ND'||TO_CHAR(NGUOIDUNG_SEQ.NEXTVAL) FROM DUAL");
            rs.next();
            System.out.println(rs.getString(1));
            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO NGUOIDUNG VALUES(?,?,?,?,?,?,?,?,?,?,TO_DATE('" + DoB + "','DD/MM/YYYY'))");
            

            InputStream anh1 = new FileInputStream(CMND_T);
            InputStream anh2 = new FileInputStream(CMND_S);
            
            pstmt.setString(1, rs.getString(1));
            pstmt.setString(2, HoTen);
            pstmt.setString(3, TenTK);
            pstmt.setString(4, Email);
            pstmt.setString(5, Objects.Crypt.encrypt(Pass));
            pstmt.setString(6, Role);
            pstmt.setString(7, Address);
            pstmt.setBlob(8, anh1);
            pstmt.setBlob(9, anh2);
            pstmt.setString(10, SDT);
            
            PreparedStatement pstmt2 = conn.prepareStatement("INSERT INTO KHACHHANG VALUES(?,0,?)");
            pstmt2.setString(1, rs.getString(1));
            pstmt2.setString(2, "CHUA KICH HOAT");

            
            pstmt.execute();
            pstmt2.execute();

            
            conn.close();
            JOptionPane.showMessageDialog(null, "Sign Up Successfully!", "Information" , JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
             JOptionPane.showMessageDialog(null, e, "Information" , JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public static void SignUpEmployee(String HoTen, String TenTK, String Email, String Pass, String Address, String CMND_T, String CMND_S, String SDT, String DoB, String Role) {
        System.out.println("get Connection...");
        try {
            Connection conn = getOracleConnection();

            Statement st = conn.createStatement(java.sql.ResultSet.TYPE_SCROLL_INSENSITIVE,
                    java.sql.ResultSet.CONCUR_READ_ONLY);

            ResultSet rs = st.executeQuery("SELECT 'ND'||TO_CHAR(NGUOIDUNG_SEQ.NEXTVAL) FROM DUAL");
            rs.next();
            System.out.println(rs.getString(1));
            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO NGUOIDUNG VALUES(?,?,?,?,?,?,?,?,?,?,TO_DATE('" + DoB + "','DD/MM/YYYY'))");
            

            InputStream anh1 = new FileInputStream(CMND_T);
            InputStream anh2 = new FileInputStream(CMND_S);
            
            pstmt.setString(1, rs.getString(1));
            pstmt.setString(2, HoTen);
            pstmt.setString(3, TenTK);
            pstmt.setString(4, Email);
            pstmt.setString(5, Objects.Crypt.encrypt(Pass));
            pstmt.setString(6, Role);
            pstmt.setString(7, Address);
            pstmt.setBlob(8, anh1);
            pstmt.setBlob(9, anh2);
            pstmt.setString(10, SDT);
            
            PreparedStatement pstmt2 = conn.prepareStatement("INSERT INTO NHANVIEN VALUES(?,?)");
            pstmt2.setString(1, rs.getString(1));
            pstmt2.setString(2, "DANG LAM");

            
            pstmt.execute();
            pstmt2.execute();

            
            conn.close();
            JOptionPane.showMessageDialog(null, "Sign Up Successfully!", "Information" , JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
             JOptionPane.showMessageDialog(null, e, "Information" , JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void RentCars(String MaND, String NgayBD, String NgayKT, String listMaLX, String listSL) {
        System.out.println("get Connection...");
        String MaKH = MaND.replace(" ", "");
        try {
            Connection conn = getOracleConnection();
            System.out.println("Success connected!");
            try {
                CallableStatement stmt = conn.prepareCall("{ call thuexe('" + MaKH + "','"+NgayBD +"','"+NgayKT+"','"+ listMaLX+"','"+listSL+"') }");
                stmt.execute();
                System.out.println("Rent car successfully!");
                stmt.close();
                conn.close();
                JOptionPane.showMessageDialog(null, "Thuê xe thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Thuê xe thất bại!" +e, "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            System.out.println("Rent car failed!  " + e);
        }
        
    }
    
    public static void insertBills(Objects.HoaDon hd)
    {
        System.out.println("Inserted bill....");
        try{
            Connection conn = getOracleConnection();
            System.out.println("Succecced connect");
            String query = "{ call LapHoaDon('"+hd.getSoHopDong()+"','"+hd.getMaNV()+"','"+hd.getPhiPS()+"','"+hd.getPhiPS()+"','"+hd.getLyDo()+"','"+hd.getNgayNhanXe()+"','"+hd.getNgayTraXe()+"') }";
            CallableStatement proc = conn.prepareCall(query);
            
            proc.execute();
            
            
            
            conn.close();
            proc.close();
            
            JOptionPane.showMessageDialog(null, "Thêm thông tin thành công!", "Information", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception ex)
        {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Thêm thông tin thất bại!", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
