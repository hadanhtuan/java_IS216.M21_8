/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package connectDB;

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

/**
 *
 * @author Tran Bao
 */
public class DBO {

    protected static String hostName = "localhost";
    protected static String sid = "orcl";
    protected static String userName = "doan26";
    protected static String password = "123456";

    /**
     * //@param args the command line arguments
     */
    public static Connection getOracleConnection() throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");

        //Xóa chữ g chỗ thing nếu mà code không chạy được ha. <đã xóa, nếu k chạy thì thêm vào>
        String connectionURL = "jdbc:oracle:thin:@" + hostName + ":1521:" + sid;

        Connection conn = (Connection) DriverManager.getConnection(connectionURL, userName, password);

        return conn;
    }

}