/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temp;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author phamq
 */
public class EditImage {
     public static void scaleImage(JLabel x){
        ImageIcon icon = (ImageIcon)x.getIcon();
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(x.getWidth(), x.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaleIcon = new ImageIcon(imgScale);
        x.setIcon(scaleIcon);
        
    }
}
