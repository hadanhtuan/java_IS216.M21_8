/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package processes;

import static connectDB.DBO.getOracleConnection;
import java.sql.Connection;
import java.sql.*;
import java.util.Random;

/**
 *
 * @author Tran Bao
 */
public class updateData {

    public static void updateUserByRole(String role, Objects.User u) {
        System.out.println("Getting connection...");
        try {
            Connection conn = getOracleConnection();
            Statement stm = (Statement) conn.createStatement();
            String query = "Update NguoiDung set TenND = '" + u.getTenND() + "',Email='" + u.getEmail() + "',MatKhau='" + u.getMatKhau() + "',DiaChi='" + u.getDiaChi() + "',SoDT='" + u.getSoDT() + "',NgaySinh = To_date('" + u.getNgaySinh() + "','DD/MM/YYYY') where MaND = '" + u.getMaND() + "'";
            stm.execute(query);
            System.out.println("Data updated successfully");
            conn.close();
            stm.close();
        } catch (Exception ex) {
            System.out.println(ex);
            System.out.println("Data updated failed!");
        }
    }
//    public static void updateUserByRole(String role, Objects.User u) {
//        System.out.println("get Connection...");
//        try {
//            Connection conn = getOracleConnection();
//            System.out.println("Start Update..........");
//
//            String query = "update NGUOIDUNG set TenND = ?,Email=?,MatKhau=?,DiaChi=?,SoDT=?,NgaySinh=? where MaND = ?";
//           
//            PreparedStatement stm = conn.prepareStatement(query);
//
//            System.out.println("Success statement");
//
//            stm.setString(1, u.getTenND());
//            stm.setString(2, u.getEmail());
//            stm.setString(3, u.getMatKhau());
//            stm.setString(4, u.getDiaChi());
//            stm.setString(5, u.getSoDT());
//            stm.setString(6, u.getNgaySinh());
//            stm.setString(7, u.getMaND());
//
//            stm.execute();
//
//            stm.close();
//            conn.close();
//            System.out.println("Updated succesfully!");
//
//        } catch (Exception e) {
//            System.out.println("Connection failed! " + e);
//        }
//    }

    public static void UpDateStatusEmployee(String MaND, String Status) {
        System.out.println("Getting connection...");
        try {
            Connection conn = getOracleConnection();
            Statement stm = (Statement) conn.createStatement();
            System.out.println(Status + " is ");
            String query = "Update NHANVIEN set TinhTrangLamViec = '" + Status + "' where MaNV = '" + MaND + "'";
            stm.execute(query);
            System.out.println("Data updated successfully");
            conn.close();
            stm.close();
        } catch (Exception ex) {
            System.out.println(ex);
            System.out.println("Data updated failed!");
        }
    }

    public static void UpDateStatusCustomer(String MaND, String Status) {
        System.out.println("Getting connection...");
        try {
            Connection conn = getOracleConnection();
            Statement stm = (Statement) conn.createStatement();
            System.out.println(Status + " is ");
            String query = "Update KHACHHANG set TinhTrang = '" + Status + "' where MaKH = '" + MaND + "'";
            stm.execute(query);
            System.out.println("Data updated successfully");
            conn.close();
            stm.close();
        } catch (Exception ex) {
            System.out.println(ex);
            System.out.println("Data updated failed!");
        }
    }

    public static void UpdateStatusOrder(String MaDX, String Status) {
        System.out.println("Getting connection...");

        try {
            Connection conn = getOracleConnection();

            String query = "Update DonDatXe set TinhTrang = ? where MaDX = ?";

            PreparedStatement stm = conn.prepareStatement(query);

            stm.setString(1, Status);
            stm.setString(2, MaDX);

            stm.executeUpdate();

            if (Status.equals("XAC NHAN")) {

                CallableStatement stmt = conn.prepareCall("{ call TaoHopDong('" + MaDX + "','" + Objects.User.Instance.getMaND() + "') }");
                stmt.execute();
                System.out.println("Data updated successfully");
               
            }

            conn.close();
            stm.close();
        } catch (Exception ex) {
            System.out.println(ex);
            System.out.println("Data updated failed!");
        }
    }

    public static void UpdateBlackList(String MaKH) {
        System.out.println("get connection...");
        try {

            Connection conn = getOracleConnection();

            String query = "update KhachHang set DanhDau =DanhDau+1 where MaKH='" + MaKH + "'";

            PreparedStatement stm = conn.prepareStatement(query);

            System.out.println("Statements: OK!");

            //stm.setString(1, MaKH);
            stm.executeUpdate();

            System.out.println("Update successfully");

            conn.close();
            stm.close();

        } catch (Exception ex) {
            System.out.println("Update failed" + ex);
        }
    }

    public static void UpdateCarStatus(String MaXe, String Status, String BienSo, String MoTa) {
        System.out.println("get Connection for update");
        try {
            Connection conn = getOracleConnection();
            System.out.println("Mo ta la:" + MoTa);

            String query = "Update Xe set TinhTrang=?,BienSo=?,MoTa=? where MaXe =?";

            PreparedStatement stm = conn.prepareStatement(query);

            stm.setString(1, Status);
            stm.setString(2, BienSo);
            stm.setString(3, MoTa);
            stm.setString(4, MaXe);

            stm.executeUpdate();
            System.out.println("Updated!......");
            stm.close();
            conn.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void UpDateCarType(Objects.Cars c, String MaLX) {
        System.out.println("get connection....");
        try {
            Connection conn = getOracleConnection();
            String query = "update LoaiXe set TenLX=?,SoCho=?,SoLuong=?,Gia=?,NgoaiGio=? where MaLX = ?";
            PreparedStatement stm = conn.prepareStatement(query);
            stm.setString(1, c.getTenLX());
            stm.setString(2, c.getSoCho());
            stm.setString(3, c.getSoLuong());
            stm.setString(4, c.getGia());
            stm.setString(5, c.getNgoaiGio());
            stm.setString(6, MaLX);

            stm.executeUpdate();

            stm.close();
            conn.close();
            System.out.println("Update successfully");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static int resetPassword(String email) {
        try {
            Connection conn = getOracleConnection();

            Statement st = conn.createStatement(java.sql.ResultSet.TYPE_SCROLL_INSENSITIVE,
                    java.sql.ResultSet.CONCUR_READ_ONLY);

            Random rand = new Random();
            int newPass = rand.nextInt(999999) + 100000;
            ResultSet rs = st.executeQuery("UPDATE NGUOIDUNG SET MATKHAU = '" + newPass + "' WHERE EMAIL='" + email + "'");

            return newPass;

        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        return 0;
    }
}
