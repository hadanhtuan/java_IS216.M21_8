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

/**
 *
 * @author Tran Bao
 */
public class deleteData {
     public static void DeleteUser(String MaND)
    {
        System.out.println("get Connection.....");
        try{
            Connection conn = getOracleConnection();

            String query = "delete from NguoiDung where MaND=?";
            
            PreparedStatement stm = conn.prepareStatement(query);
            stm.setString(0, MaND);
            stm.executeQuery();
            
            stm.close();
            conn.close();
            System.out.println("Delete successfully!");
            
        }
        catch(Exception ex)
        {
            System.out.println("An err orcurs, Can't delete "+ex);
        }
    }
}
