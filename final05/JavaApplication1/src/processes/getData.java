/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package processes;

import static connectDB.DBO.getOracleConnection;
import java.awt.image.BufferedImage;
import java.io.InputStream;
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
import java.time.LocalDate;
import java.util.Calendar;
import javax.swing.JOptionPane;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Tran Bao
 */
public class getData {

    public static Objects.User getUserByID(String Id) {
        System.out.println("get Connection...");
        Objects.User user = new Objects.User();
        try {
            Connection conn = getOracleConnection();
            System.out.println("Success");

            Statement st = conn.createStatement();

            System.out.println("Success statement");

            ResultSet rs = st.executeQuery("select * from NguoiDung where MAND = '" + Id + "'");

            System.out.println("Success resultset");

            while (rs.next()) {
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getString(4));
                System.out.println(rs.getString(5));
                System.out.println(rs.getString(6));
                user = new Objects.User(rs.getString(0), rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(6), rs.getString(9), rs.getString(10));
            }
            rs.close();
            st.close();
            conn.close();
            return user;

        } catch (Exception e) {
            System.out.println("Connection failed! " + e);
        }
        return user;
    }
    
    public static int getCountMaXe(String MaLX) {
        int count = 0;

        try {
            Connection conn = connectDB.DBO.getOracleConnection();
            Statement st = conn.createStatement();
            String query = "select count(*) from Xe where MaLX ='" + MaLX + "' and TinhTrang = 'SAN SANG'";
            ResultSet rs = st.executeQuery(query);
            rs.next();
            count = Integer.parseInt(rs.getString(1));
            rs.close();
            conn.close();
            rs.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return count;
    }
    
    public static List<String> getMaLX() {
        List<String> dsMaLX = new ArrayList<>();

        System.out.println("get Connection....");
        try {
            Connection conn = getOracleConnection();

            Statement st = conn.createStatement();
            String query = "select distinct MaLX from LoaiXe";

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                dsMaLX.add(rs.getString(1));
            }
            System.out.println("Get MaLX successfully!");
            conn.close();
            st.close();
            rs.close();
        } catch (Exception ex) {
            System.out.println("Can't get MaLX" + ex);
        }

        return dsMaLX;
    }

    public static List<Objects.childCars> getChildCar() {
        List<Objects.childCars> Cars = new ArrayList<>();

        System.out.println("get Connection...");
        try {
            Connection conn = getOracleConnection();

            Statement st = conn.createStatement();

            String query = "select * from Xe";

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                String MaXe = rs.getString(1);
                String MaLX = rs.getString(2);
                String BienSo = rs.getString(3);
                String MoTa = rs.getString(4);
                String TinhTrang = rs.getString(5);
                System.out.println(TinhTrang);

                Objects.childCars c = new Objects.childCars(MaXe, MaLX, BienSo, MoTa, TinhTrang);

                Cars.add(c);
            }

            conn.close();
            rs.close();
            st.close();
            System.out.println("get Cars successfully!");
        } catch (Exception ex) {
            System.out.println("get Cars failed!" + ex);
        }
        return Cars;
    }

    public static List<Objects.DonDatXe> getDonDatNotCommit() {
        List<Objects.DonDatXe> listDonDats = new ArrayList<>();

        System.out.println("get Connection.....");

        try {
            Connection conn = getOracleConnection();

            System.out.println("get Connection successfully");

            Statement st = conn.createStatement();

            System.out.println("get statement successfully");

            String query = "SELECT MaDX,MaKH,TinhTrang,NgayDatXe,NgayNhanXe,NgayTraXe  FROM DONDATXE where TinhTrang = 'CHUA XAC NHAN'";

            ResultSet rs = st.executeQuery(query);

            System.out.println("get result successfully");

            while (rs.next()) {
                Objects.DonDatXe d = new Objects.DonDatXe(rs.getString(1), rs.getString(2),rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));

                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getString(4));
                System.out.println(rs.getString(5));
                System.out.println(rs.getString(6));
                listDonDats.add(d);
            }
            conn.close();
            st.close();
            rs.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }

        return listDonDats;
    }

    public static List<Objects.Cars> getCars() {
        List<Objects.Cars> listCars = new ArrayList<Objects.Cars>();

        System.out.println("get Connection...");
        try {
            Connection conn = getOracleConnection();
            System.out.println("Success");

            Statement st = conn.createStatement();

            System.out.println("Success statement");

            ResultSet rs = st.executeQuery("select * from LoaiXe");

            System.out.println("Success resultset");

            while (rs.next()) {

                String MaLX = rs.getString(1);
                String TenLx = rs.getString(2);
                String SoCho = rs.getString(3);
                String SoLuong = String.valueOf(getCountMaXe(MaLX));
                String Gia = rs.getString(5);
                String NgoaiGio = rs.getString(6);
                Blob ImgNoiThat = rs.getBlob(7);
                Blob ImgNgoai = rs.getBlob(8);
                Float DoanhThu = rs.getFloat(9);

                try {
                    InputStream in1 = ImgNoiThat.getBinaryStream();

                    BufferedImage NoiThat = ImageIO.read(in1);

                    InputStream in2 = ImgNgoai.getBinaryStream();

                    BufferedImage Ngoai = ImageIO.read(in2);

                    Objects.Cars c = new Objects.Cars(MaLX, TenLx, SoCho, SoLuong, Gia, NgoaiGio, NoiThat, Ngoai,DoanhThu);
                    //Import two more image to list.

                    listCars.add(c);
                } catch (Exception ex) {
                    System.out.println("Catch image threws exception!");
                }
            }

            rs.close();
            st.close();
            conn.close();

            System.out.println("Get cars successfully!");

            return listCars;

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connection failed! " + e);

        }
        System.out.print("get cars data failed");
        return null;

    }
    
    public static int getBlacklistById(String MaND)
    {
        int result = -1;
        System.out.println("Get connection...");
        try {
            Connection conn = getOracleConnection();

            Statement st = conn.createStatement();

            String query = "SELECT DANHDAU from KHACHHANG where MaKH = '" + MaND + "'";

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                result = rs.getInt(1);
            }
            conn.close();
            st.close();
            rs.close();
        } catch (Exception ex) {
            System.out.println(ex);
            System.out.println("get DanhDau failed");
        }
        return result;
    }
    
    public static List<Objects.DonDatXe> getListBlackList() {
        List<Objects.DonDatXe> listDonDat = new ArrayList<>();
        System.out.println("Get connection...");
        try {
            Connection conn = getOracleConnection();

            Statement st = conn.createStatement();
            
            System.out.println("Get statement: OK!");
             
            ResultSet rs1 = st.executeQuery(" SELECT CURRENT_DATE FROM DUAL ");
            rs1.next();
            

            String curDate = rs1.getDate(1).toString();
            String dateStr = "";
            dateStr+=curDate.substring(8,10)+"-"+curDate.substring(5,7)+"-"+curDate.substring(0,4);
            System.out.println(dateStr);

            
            String query = "SELECT d.MaDX, k.MaKH, d.TinhTrang,d.NgayDatXe,d.NgayNhanXe,d.NgayTraXe FROM KHACHHANG k join DONDATXE d on k.MaKH = d.MaKH "
                    + "where d.TinhTrang = 'CHUA XAC NHAN' AND d.NgayDatXe <TO_DATE('"+dateStr+"', 'DD-MM-YYYY')-2";

            ResultSet rs = st.executeQuery(query);
            
            System.out.println("Get result: OK!");

            while (rs.next()) {
                Objects.DonDatXe d = new Objects.DonDatXe(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getString(5));
                
                listDonDat.add(d);
            }
       
            conn.close();
            st.close();
            rs.close();
        } catch (Exception ex) {
            System.out.println(ex);
            System.out.println("get DonDat that bai");
        }
        return listDonDat;
    }
    
    public static String getCustomerStatus(String MaKH)
    {
        String status ="";
        try{
             Connection conn = getOracleConnection();
            
            Statement st = conn.createStatement();
            
            ResultSet rs = st.executeQuery("Select TinhTrang from KhachHang where MaKH ='"+MaKH+"'");
            
            rs.next();
            
            status=rs.getString(1);
        }catch(Exception ex)
        {
           System.out.println("Get status failed");
        }
        return status;
        
    }
    
    public static String getEmployeeStatus(String MaNV)
    {
        String status ="";
        try{
             Connection conn = getOracleConnection();
            
            Statement st = conn.createStatement();
            
            ResultSet rs = st.executeQuery("Select TinhTrangLamViec from NhanVien where MaNV ='"+MaNV+"'");
            
            rs.next();
            
            status=rs.getString(1);
        }catch(Exception ex)
        {
           System.out.println("Get status failed");
        }
        return status;
        
    }

    public static List<Objects.User> getUserByRolel(String role) {
        List<Objects.User> customers = new ArrayList<>();
        System.out.println("get Connection...");
        String MaND = "";
        String TenND = "";
        String TenTK = "";
        String Email = "";
        String MatKhau = "";
        String DiaChi = "";
        String SoDT = "";
        String NgaySinh = "";
        try {
            Connection conn = getOracleConnection();

            System.out.println("Success connected");

            Statement st = conn.createStatement();

            System.out.println("Success statement");

            ResultSet rs = st.executeQuery("select * from NguoiDung where Role='" + role + "'");

            System.out.println("Success resultset");

            while (rs.next()) {
                MaND = rs.getString(1);
                TenND = rs.getString(2);
                TenTK = rs.getString(3);
                Email = rs.getString(4);
                MatKhau = rs.getString(5);
                DiaChi = rs.getString(7);
                Blob CMND_T = rs.getBlob(8);
                Blob CMND_S = rs.getBlob(9);
                SoDT = rs.getString(10);
                NgaySinh = rs.getString(11);
                System.out.println(rs.getString(1));

                InputStream in1 = CMND_T.getBinaryStream();
                BufferedImage img1 = ImageIO.read(in1);

                InputStream in2 = CMND_S.getBinaryStream();
                BufferedImage img2 = ImageIO.read(in2);

//                 public Customer(String MaKH, String TenNV, String TenTK, String Email, String MatKhau,
//                         String DiaChi, String CMND_T, String CMND_S, String SoDT, String NgaySinh) {
                Objects.User c = new Objects.User(MaND, TenND, TenTK, Email, MatKhau, DiaChi, img1, img2, SoDT, NgaySinh);

                customers.add(c);

            }
            rs.close();
            st.close();
            conn.close();
            System.out.println("Set customers successfully!");
            return customers;

        } catch (Exception e) {
            System.out.print("Get customers failed!");
        }

        System.out.println("Get customers failed!");

        return null;
    }

    public static List<Objects.childCars> getCarStatus(String MaXe) {
        List<Objects.childCars> cars = new ArrayList<>();
        String text = MaXe.toLowerCase();
        try {
            Connection conn = getOracleConnection();

            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery("select * from xe where Lower(MaXe) like'%" + text + "%'");

            while (rs.next()) {
                Objects.childCars c = new Objects.childCars(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                cars.add(c);
            }

            conn.close();
            st.close();
            rs.close();

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Get car status failed!");
        }

        return cars;
    }

    public static List<Objects.User> getUserContainChar(String value, String role) {
        String checkValue = value.toLowerCase();
        List<Objects.User> customers = new ArrayList<>();
        System.out.println("get Connection...");
        String MaND = "";
        String TenND = "";
        String TenTK = "";
        String Email = "";
        String MatKhau = "";
        String DiaChi = "";
        String SoDT = "";
        String NgaySinh = "";
        int i = 0;
        try {
            Connection conn = getOracleConnection();

            System.out.println("Success connected");

            Statement st = conn.createStatement();

            System.out.println("Success statement");

            ResultSet rs = st.executeQuery("select * from NguoiDung where Role='" + role + "' and Lower(TenND) like '%" + checkValue + "%'");

            System.out.println("Success resultset");
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            while (rs.next()) {
                MaND = rs.getString(1);
                TenND = rs.getString(2);
                TenTK = rs.getString(3);
                Email = rs.getString(4);
                MatKhau = rs.getString(5);
                DiaChi = rs.getString(7);
                Blob CMND_T = rs.getBlob(8);
                Blob CMND_S = rs.getBlob(9);
                InputStream in1 = CMND_T.getBinaryStream();
                BufferedImage img1 = ImageIO.read(in1);
                InputStream in2 = CMND_S.getBinaryStream();
                BufferedImage img2 = ImageIO.read(in2);
                SoDT = rs.getString(10);
                if (rs.getDate(11) != null) {
                    Date date = rs.getDate(11);
                    NgaySinh = dateFormat.format(date);
                    System.out.println(NgaySinh);
                } else {
                    System.out.println("Date is null");
                    NgaySinh = "";
                }

                Objects.User c = new Objects.User(MaND, TenND, TenTK, Email, MatKhau, DiaChi, img1, img2, SoDT, NgaySinh);

                customers.add(c);

                System.out.println("Added" + String.valueOf(i) + " row");

            }
            rs.close();
            st.close();
            conn.close();
            System.out.println("Set customers successfully!");
            return customers;

        } catch (Exception e) {
            System.out.println("Bug is!" + e);
        }
        return null;
    }

    public static Objects.Cars getCarFromID(String Id) {
        Objects.Cars c = new Objects.Cars();

        System.out.println("get Connection...");
        try {
            Connection conn = getOracleConnection();
            System.out.println("Success");

            Statement st = conn.createStatement();

            System.out.println("Success statement");

            ResultSet rs = st.executeQuery("select * from LoaiXe where MaLX='" + Id + "'");

            System.out.println("Success resultset");

            while (rs.next()) {
                String MaLX = rs.getString(1);
                String TenLx = rs.getString(2);
                String SoCho = rs.getString(3);
                String SoLuong = rs.getString(4);
                String Gia = rs.getString(5);
                String NgoaiGio = rs.getString(6);
                BufferedImage ImgNoiThat = (BufferedImage) rs.getBlob(7);
                BufferedImage ImgNgoai = (BufferedImage) rs.getBlob(8);
                Float DoanhThu = rs.getFloat(9);
                c = new Objects.Cars(MaLX, TenLx, SoCho, SoLuong, Gia, NgoaiGio, ImgNoiThat, ImgNgoai,DoanhThu);
            }

            rs.close();
            st.close();
            conn.close();

            System.out.println("Get cars successfully!");

            return c;

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connection failed! " + e);
            System.out.print("get cars data failed");
        }

        return null;
    }

    public static void SignIn(String username, String password) {
        try {
            Connection conn = getOracleConnection();
            System.out.println("Success connected!");

            Statement st = conn.createStatement(java.sql.ResultSet.TYPE_SCROLL_INSENSITIVE,
                    java.sql.ResultSet.CONCUR_READ_ONLY);
            System.out.println(password);
            
            System.out.println(Objects.Crypt.encrypt(password));
            ResultSet rs = st.executeQuery("select mand, role,tennd from nguoidung where TENTK = '" + username + "' and MATKHAU = '" + Objects.Crypt.encrypt(password) + "'");

            
            if (rs.isBeforeFirst() == false) {
                JOptionPane.showMessageDialog(null, "Username or Password wrong!", "Warning", JOptionPane.ERROR_MESSAGE);
                return;
            }
            while (rs.next()) {
                Objects.User.Instance = new Objects.User();
                Objects.User.Instance.setMaND(rs.getString(1));
                Objects.User.Instance.setRole(rs.getString(2));
                Objects.User.Instance.setTenND(rs.getString(3));
            }

            st.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("Add data failed!  " + e);
        }

    }

    public static List<Objects.HopDong> getHopDong(String MaKH) {
        
        List<Objects.HopDong> listHD = new ArrayList<>();
        
        System.out.println("get Connection.....");
        
        try{
            Connection conn = getOracleConnection();
            Statement st = conn.createStatement();
            String query ="Select SoHopDong, MaDX, NGAYHD from HopDong where MaKH='"+MaKH+"'";
            
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next())
            {
                Objects.HopDong hd = new Objects.HopDong(rs.getString(1),rs.getString(2),rs.getString(3));
                listHD.add(hd);
            }
            conn.close();
            rs.close();
            st.close();
        }catch(Exception ex)
        {
            System.out.println("Err: "+ex);
        }
        return listHD;
    }
    
    public static List<Objects.Cars> getCarsByMaDX(String MaDX)
    {
        List<Objects.Cars> listCars = new ArrayList<>();
        
        System.out.println("get Connection.....");
        
        try{
            Connection conn = getOracleConnection();
            Statement st = conn.createStatement();
            String query = "Select MaLX,SoLuong from ChiTietDatXe where MaDX='"+MaDX+"'";
            
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next())
            {
                Objects.Cars c = new Objects.Cars(rs.getString(1),rs.getString(2));
                listCars.add(c);
            }
            
            conn.close();
            st.close();
            rs.close();
            
        }catch(Exception ex)
        {
            System.out.println("Bug is "+ex);
        }
        
        return listCars;
    }
    
    public static Boolean findMail(String email)
    {
        try {
            Connection conn = getOracleConnection();

            Statement st = conn.createStatement(java.sql.ResultSet.TYPE_SCROLL_INSENSITIVE,
			              java.sql.ResultSet.CONCUR_READ_ONLY);

            ResultSet rs = st.executeQuery("SELECT * FROM NGUOIDUNG WHERE EMAIL='"+email+"'");
      
            
            if(rs.isBeforeFirst() == false)
                return false;
            return true;

        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        return false;
    }   
    
    public static List<Objects.Revenue> getRevenue(String Thang, String NamHD)
    {
        List<Objects.Revenue> listRevenue = new ArrayList<>();
        System.out.println("get Revenue....");
        try{
            Connection conn = connectDB.DBO.getOracleConnection();
            
            Statement st = conn.createStatement();
            
            String query = "Select SoHoaDon, SoHopDong, MaNV, NgayHoaDon, TriGia, extract(month from NgayHoaDon) as ThangHD,extract(year from NgayHoaDon) as NamHD from HoaDon where extract(month from NgayHoaDon) ="+Thang+"and extract(year from NgayHoaDon) ="+NamHD;
            
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next())
            {
                Objects.Revenue r = new Objects.Revenue(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
                listRevenue.add(r);
            }
            
            conn.close();
            st.close();
            rs.close();
            
        }catch(Exception ex)
        {
            System.out.println("Err: "+ex);
        }
        return listRevenue;
    }

    
    public static List<Objects.HoaDon> getHoaDon()
    {
        List<Objects.HoaDon> listHoaDon = new ArrayList<>();
        System.out.println("get HoaDon....");
        try{
            Connection conn = connectDB.DBO.getOracleConnection();
            
            Statement st = conn.createStatement();
            
            ResultSet rs = st.executeQuery("select * from HoaDon");
            
            while(rs.next())
            {
                Objects.HoaDon hd = new Objects.HoaDon(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(10));
                listHoaDon.add(hd);
            }
            
            conn.close();
            st.close();
            rs.close();
            
        }catch(Exception ex)
        {
            System.out.println(ex);
        }
        return listHoaDon;
    }
    
}
