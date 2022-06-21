/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;


import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLaf;
import com.myapp.themes.MyDarkerLaf;
import java.awt.Color;
import javax.swing.UIManager;
import view.formLogin;

/**
 *
 * @author phamq
 */
public class main {
    public static void main(String[] args) {
//       com.formdev.flatlaf.FlatDarculaLaf.setup();
            try {          
                FlatIntelliJLaf.setup();
                UIManager.put( "Button.arc", 10);
                UIManager.put( "TextComponent.arc", 10 );
            } catch( Exception ex ) {
                System.err.println( "Failed to initialize LaF" );
            }
      formLogin frm = new formLogin();
      frm.setVisible(true);
        
    }
}
