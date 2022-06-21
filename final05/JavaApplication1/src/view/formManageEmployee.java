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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author phamq
 */
public class formManageEmployee extends javax.swing.JInternalFrame {

    /**
     * Creates new form form
     */
    public formManageEmployee() {
        initComponents();
        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
        bi.setNorthPane(null);
        loadData("");
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        text_Field = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listEmployee = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        statusBox = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(17, 43, 60));
        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(1109, 680));

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1097, 644));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("QUẢN LÝ NHÂN VIÊN");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nhập Tên Nhân Viên:");

        text_Field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text_FieldKeyPressed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 102, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ok_45px.png"))); // NOI18N
        jButton1.setText("Thêm");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1080, 680));

        listEmployee.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        listEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        listEmployee.setRowHeight(160);
        jScrollPane1.setViewportView(listEmployee);

        jButton4.setBackground(new java.awt.Color(0, 0, 51));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/search_45px.png"))); // NOI18N
        jButton4.setBorder(null);

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

        statusBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        statusBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TINH TRANG", "DANG LAM", "DA NGHI", " " }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1085, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12)
                        .addComponent(text_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(statusBox, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(text_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(jButton3))))
                        .addComponent(statusBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        formAddEmployee frm = new formAddEmployee();
        frm.setVisible(true);
        loadData("");
    }//GEN-LAST:event_jButton1MouseClicked

    public void loadData(String text) {

        DefaultTableModel dm = (DefaultTableModel) listEmployee.getModel();

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
        model.addColumn("Mật khẩu");

        model.addColumn("Địa chỉ");
        model.addColumn("Số điện thoại");
        model.addColumn("Ngày sinh");
        model.addColumn("Tình Trạng Làm Việc");
        model.addColumn("CCCD_T");
        model.addColumn("CCCD_S");

        try {
            List<Objects.User> customers = new ArrayList<Objects.User>();

            customers = processes.getData.getUserContainChar("", "NHANVIEN");
            if (customers != null) {
                for (Objects.User c : customers) {
                    model.addRow(new Object[]{
                        c.getMaND(), c.getTenND(), c.getTenTK(), c.getEmail(), c.getMatKhau(), c.getDiaChi(), c.getSoDT(), c.getNgaySinh(), processes.getData.getEmployeeStatus(c.getMaND()), c.getCMND_T(), c.getCMND_S()
                    });
                    System.out.println(c.getMaND());
                }
                System.out.println("Added all row!");
            } else {
                System.out.println("List is null");
            }

        } catch (Exception e) {
            System.out.println("List is null! " + e);
        }
        listEmployee.setModel(model);
        listEmployee.getColumnModel().getColumn(9).setCellRenderer(new ImageRender());
        listEmployee.getColumnModel().getColumn(10).setCellRenderer(new ImageRender());

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        listEmployee.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        listEmployee.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        listEmployee.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        listEmployee.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        listEmployee.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
        listEmployee.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
        listEmployee.getColumnModel().getColumn(6).setCellRenderer(centerRenderer);
        listEmployee.getColumnModel().getColumn(7).setCellRenderer(centerRenderer);
        listEmployee.getColumnModel().getColumn(8).setCellRenderer(centerRenderer);
//        listEmployee.getColumnModel().getColumn(9).setCellRenderer(centerRenderer);
//        listEmployee.getColumnModel().getColumn(10).setCellRenderer(centerRenderer);

        listEmployee.getColumnModel().getColumn(9).setPreferredWidth(200);
        listEmployee.getColumnModel().getColumn(10).setPreferredWidth(200);

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

    private void text_FieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_FieldKeyPressed

        loadData(text_Field.getText());

    }//GEN-LAST:event_text_FieldKeyPressed


    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            int indexRow = listEmployee.getSelectedRow();

            System.out.println(indexRow);

            String MaKH = (String) listEmployee.getValueAt(indexRow, 0);
            String TenKH = (String) listEmployee.getValueAt(indexRow, 1);
            String TenDangNhap = (String) listEmployee.getValueAt(indexRow, 2);
            String Email = (String) listEmployee.getValueAt(indexRow, 3);
            String MatKhau = (String) listEmployee.getValueAt(indexRow, 4);
            String DiaChi = (String) listEmployee.getValueAt(indexRow, 5);
            String SoDT = (String) listEmployee.getValueAt(indexRow, 6);
            String NgaySinh = (String) listEmployee.getValueAt(indexRow, 7);
            System.out.println(MaKH);
            System.out.println(TenKH);

            MaKH = MaKH.replace(" ", "");

            Objects.User u = new Objects.User(MaKH, TenKH, TenDangNhap, Email, MatKhau, DiaChi, SoDT, NgaySinh);
            System.out.println("Data is+ " + u.getTenND());
            processes.updateData.updateUserByRole("NHANVIEN", u);
            String status_Value = statusBox.getItemAt(statusBox.getSelectedIndex());

            if (statusBox.getSelectedIndex() != 0) {
                processes.updateData.UpDateStatusEmployee(MaKH, status_Value);
            }

            JOptionPane.showMessageDialog(null, "Cập nhật thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Cập nhật thất bại!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        loadData("");
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listEmployee;
    private javax.swing.JComboBox<String> statusBox;
    private javax.swing.JTextField text_Field;
    // End of variables declaration//GEN-END:variables
}