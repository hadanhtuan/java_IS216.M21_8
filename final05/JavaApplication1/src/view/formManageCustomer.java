/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import java.awt.Component;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.plaf.synth.Region;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author phamq
 */
public class formManageCustomer extends javax.swing.JInternalFrame {

    /**
     * Creates new form temp2
     */
    public static void setSize(JFrame x) {

    }

    public formManageCustomer() {
        initComponents();

        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
        bi.setNorthPane(null);
        loadDefaultData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        input_Field = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listCustomer = new javax.swing.JTable();
        statusBox = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(17, 43, 60));
        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(1109, 680));

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1109, 680));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setBackground(new java.awt.Color(0, 0, 51));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/search_45px.png"))); // NOI18N
        jButton4.setBorder(null);
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 55, -1, 35));

        input_Field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                input_FieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                input_FieldKeyReleased(evt);
            }
        });
        jPanel1.add(input_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 68, 216, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nhập Tên Khách Hàng");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 68, -1, -1));

        jButton3.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Yellow"));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/maintenance_45px.png"))); // NOI18N
        jButton3.setText("Sửa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(978, 37, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("QUẢN LÝ KHÁCH HÀNG");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        listCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        listCustomer.setGridColor(new java.awt.Color(0, 0, 0));
        listCustomer.setRowHeight(140);
        listCustomer.setShowGrid(true);
        listCustomer.setShowVerticalLines(false);
        jScrollPane1.setViewportView(listCustomer);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 101, 1073, 538));

        statusBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TINH TRANG", "KICH HOAT", "CHUA KICH HOAT" }));
        statusBox.setAlignmentX(1.0F);
        statusBox.setAlignmentY(1.0F);
        statusBox.setBorder(new javax.swing.border.MatteBorder(null));
        statusBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(statusBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 40, 132, 50));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void input_FieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_FieldKeyPressed
        loadData();
    }//GEN-LAST:event_input_FieldKeyPressed

    private void input_FieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_FieldKeyReleased
        loadData();
    }//GEN-LAST:event_input_FieldKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            int indexRow = listCustomer.getSelectedRow();

            System.out.println(indexRow);

            String MaKH = (String) listCustomer.getValueAt(indexRow, 0);
            String TenKH = (String) listCustomer.getValueAt(indexRow, 1);
            String TenDangNhap = (String) listCustomer.getValueAt(indexRow, 2);
            String Email = (String) listCustomer.getValueAt(indexRow, 3);
            String MatKhau = (String) listCustomer.getValueAt(indexRow, 4);
            String DiaChi = (String) listCustomer.getValueAt(indexRow, 5);
            String SoDT = (String) listCustomer.getValueAt(indexRow, 6);
            String NgaySinh = (String) listCustomer.getValueAt(indexRow, 7);
            String TinhTrang = statusBox.getItemAt(statusBox.getSelectedIndex()).toString();
            System.out.println(MaKH);
            System.out.println(TenKH);
            

            MaKH = MaKH.replace(" ", "");

            Objects.User u = new Objects.User(MaKH, TenKH, TenDangNhap, Email, MatKhau, DiaChi, SoDT, NgaySinh);
            System.out.println("Data is+ "+u.getTenND());
            processes.updateData.updateUserByRole("KHACHHANG", u);
            if(statusBox.getSelectedIndex()!=0)
            {
                processes.updateData.UpDateStatusCustomer(MaKH, TinhTrang);
            }

            JOptionPane.showMessageDialog(null, "Cập nhật thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Cập nhật thất bại!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        loadDefaultData();
    }//GEN-LAST:event_jButton3ActionPerformed

    public void loadData() {
        String text = input_Field.getText();

        DefaultTableModel dm = (DefaultTableModel) listCustomer.getModel();

        while (dm.getRowCount() > 0) {
            dm.removeRow(0);
        }

        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column != 0 && column != 2;
            }

        };

        model.addColumn("Mã khách hàng");
        model.addColumn("Tên khách hàng");
        model.addColumn("Tên đăng nhập");
        model.addColumn("Email");
       // model.addColumn("Mật khẩu");

        model.addColumn("Địa chỉ");
        model.addColumn("Số điện thoại");
        model.addColumn("Ngày sinh");
        model.addColumn("Trạng thái");
        model.addColumn("CCCD_T");
        model.addColumn("CCCD_S");

        try {
            List<Objects.User> customers = new ArrayList<Objects.User>();

            customers = processes.getData.getUserContainChar(text, "KHACHHANG");
            if (customers != null) {
                for (Objects.User c : customers) {
                    model.addRow(new Object[]{
                        c.getMaND(), c.getTenND(), c.getTenTK(), c.getEmail(), c.getDiaChi(), c.getSoDT(), c.getNgaySinh(),processes.getData.getCustomerStatus(c.getMaND()), c.getCMND_T(), c.getCMND_S()
                    });
                }
                System.out.println("Added all row!");
            } else {
                System.out.println("List is null");
            }

        } catch (Exception e) {
            System.out.println("List is null! " + e);
        }
        listCustomer.setModel(model);
        listCustomer.getColumnModel().getColumn(8).setCellRenderer(new ImageRender());
        listCustomer.getColumnModel().getColumn(9).setCellRenderer(new ImageRender());
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        listCustomer.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        listCustomer.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        listCustomer.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        listCustomer.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        listCustomer.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
        listCustomer.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
        listCustomer.getColumnModel().getColumn(6).setCellRenderer(centerRenderer);
        listCustomer.getColumnModel().getColumn(7).setCellRenderer(centerRenderer);
//        listCustomer.getColumnModel().getColumn(8).setCellRenderer(centerRenderer);
//        listCustomer.getColumnModel().getColumn(9).setCellRenderer(centerRenderer);
        listCustomer.getColumnModel().getColumn(8).setPreferredWidth(200);
        listCustomer.getColumnModel().getColumn(9).setPreferredWidth(200);
      
        
    }

    public void loadDefaultData() {
        String text = "";

        DefaultTableModel dm = (DefaultTableModel) listCustomer.getModel();

        while (dm.getRowCount() > 0) {
            dm.removeRow(0);
        }

        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column != 0 && column != 2;
            }
        };

        model.addColumn("Mã khách hàng");
        model.addColumn("Tên khách hàng");
        model.addColumn("Tên đăng nhập");
        model.addColumn("Email");
        //model.addColumn("Mật khẩu");

        model.addColumn("Địa chỉ");
        model.addColumn("Số điện thoại");
        model.addColumn("Ngày sinh");
        model.addColumn("Trạng thái");
        model.addColumn("CCCD_T");
        model.addColumn("CCCD_S");

        try {
            List<Objects.User> customers = new ArrayList<>();

            customers = processes.getData.getUserContainChar(text, "KHACHHANG");
            if (customers != null) {
                for (Objects.User c : customers) {
                    model.addRow(new Object[]{
                        c.getMaND(), c.getTenND(), c.getTenTK(), c.getEmail(), c.getDiaChi(), c.getSoDT(), c.getNgaySinh(),processes.getData.getCustomerStatus(c.getMaND()), c.getCMND_T(), c.getCMND_S()
                    });
                    System.out.println(c.getCMND_S().toString());
                }
                System.out.println("Added all row!");
            } else {
                System.out.println("List is null");
            }

        } catch (Exception e) {
            System.out.println("List is null! " + e);
        }
        listCustomer.setModel(model);
        listCustomer.getColumnModel().getColumn(8).setCellRenderer(new ImageRender());
        listCustomer.getColumnModel().getColumn(9).setCellRenderer(new ImageRender());
        listCustomer.getColumnModel().getColumn(8).setPreferredWidth(200);
        listCustomer.getColumnModel().getColumn(9).setPreferredWidth(200);
    }

    private class ImageRender extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

            try {
                //String photoName = value.toString();
                BufferedImage img = (BufferedImage) value;
                ImageIcon imgIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(200, 180, Image.SCALE_DEFAULT));
                
                return new JLabel(imgIcon);
            } catch (Exception ex) {
                Logger.getLogger(formOrder.class.getName()).log(Level.SEVERE, null, ex);
            }
            return null;

        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField input_Field;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listCustomer;
    private javax.swing.JComboBox<String> statusBox;
    // End of variables declaration//GEN-END:variables
}
