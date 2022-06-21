/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import com.formdev.flatlaf.ui.FlatListCellBorder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author phamq
 */
public class formRentalHistory extends javax.swing.JInternalFrame {

    /**
     * Creates new form temp2
     */
    public formRentalHistory() {
        initComponents();
        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
        bi.setNorthPane(null);
        loadData();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        listHD = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        listXeThue = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        btnHistory = new javax.swing.JButton();

        setBackground(new java.awt.Color(17, 43, 60));
        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(1109, 680));

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1109, 680));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LỊCH SỬ THUÊ XE");

        listHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        listHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listHDMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listHD);

        listXeThue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(listXeThue);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnHistory.setText("In đơn đặt");
        btnHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHistoryMouseClicked(evt);
            }
        });
        btnHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listHDMouseClicked
        int index = listHD.getSelectedRow();
        String value = listHD.getValueAt(index, 1).toString();

        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        model.addColumn("Mã Loại Xe");
        model.addColumn("Số Lượng");

        List<Objects.Cars> listCar = processes.getData.getCarsByMaDX(value);

        for (Objects.Cars c : listCar) {
            model.addRow(new Object[]{
                c.getMaLX(), c.getSoLuong()
            });
        }

        listXeThue.setModel(model);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        listXeThue.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        listXeThue.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);


    }//GEN-LAST:event_listHDMouseClicked

    private void btnHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHistoryMouseClicked
//        String MaKH = Objects.User.Instance.getMaND();
//        String MaDX = "";
//        try {
//            MaDX = listHD.getValueAt(listHD.getSelectedRow(), 1).toString();
//        } catch (Exception ex) {
//            System.out.println("Data was null" + ex);
//        }
//        System.out.println("MaKH la : " + MaKH);
//
//        System.out.println("MaDX la " + MaDX);
//
//        ExportReport(MaDX, MaKH);
    }//GEN-LAST:event_btnHistoryMouseClicked

    private void btnHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoryActionPerformed
        String MaKH = Objects.User.Instance.getMaND();
        String MaDX = "";
        try {
            MaDX = listHD.getValueAt(listHD.getSelectedRow(), 1).toString();
        } catch (Exception ex) {
            System.out.println("Data was null" + ex);
        }
        System.out.println("MaKH la : " + MaKH);

        System.out.println("MaDX la " + MaDX);

        ExportReport(MaDX, MaKH);
    }//GEN-LAST:event_btnHistoryActionPerformed

    public void ExportReport(String MaDX, String MaND) {

        try {
            HashMap<String, Object> map = new HashMap<String, Object>();
            map.put("MaDX", MaDX);
            map.put("MaND", MaND);
            JasperReport rpt = JasperCompileManager.compileReport("src\\Resources\\ReportHoaDonKhachHang.jrxml");
            System.out.println("Report getted!");

            Connection conn = connectDB.DBO.getOracleConnection();
            System.out.println("Connected to database!");

            try {
                JasperPrint p = (JasperPrint) JasperFillManager.fillReport(rpt, map, conn);
                System.out.println("Report mapped!");
                JasperViewer.viewReport(p, false);
            } catch (Exception e) {
                System.out.println("BUG IS" + e);
            }

        } catch (Exception ex) {
            System.out.println("Err is " + ex);
        }
    }

    public void loadData() {
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        model.addColumn("Mã Hợp Đồng");
        model.addColumn("Mã Đặt Xe");
        model.addColumn("Ngày Lập Hợp Đồng");

        List<Objects.HopDong> listHopDong = processes.getData.getHopDong(Objects.User.Instance.getMaND());

        for (Objects.HopDong hd : listHopDong) {
            model.addRow(new Object[]{
                hd.getSoHopDong(), hd.getMaDX(), hd.getNgayHD()
            });
        }
        listHD.setModel(model);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        listHD.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        listHD.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        listHD.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHistory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable listHD;
    private javax.swing.JTable listXeThue;
    // End of variables declaration//GEN-END:variables
}
