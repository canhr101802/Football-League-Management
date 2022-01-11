/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.BXHController;
import controller.CauThuConTroller;
import controller.ClLBController;
import controller.KQTDcontroller;
import controller.UserController;
import controller.VongDaucontroller;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.BXH;
import model.CLB;
import model.CauThu;
import model.KQTD;
import model.User;
import model.VongDau;

/**
 *
 * @author Dell
 */
public class HomeFrm extends javax.swing.JFrame {

    /**
     * Creates new form HomeFrm
     */
    DefaultTableModel tableCLBModel;
    DefaultTableModel tableCauThuModel;
    DefaultTableModel tableKQTDModel;
    DefaultTableModel tableBXHModel;
    DefaultTableModel tableUserModel;

    List<CLB> ClbList = new ArrayList<>();
    List<CauThu> CauthuList = new ArrayList<>();
    List<KQTD> KQTDList = new ArrayList<>();
    List<BXH> BXHList = new ArrayList<>();
    List<User> UserList = new ArrayList<>();
    List<VongDau> VongDauList = new ArrayList<>();

    EditCLBFrm editCLBFrm;
    EditCauThuFrm editCauThuFrm;
    EditKQTDFrm editKQTDFrm;
    EditUserFrm editUserFrm;
    
    int vong = 0 ;

    public HomeFrm() {
        initComponents();

        this.setLocationRelativeTo(null);

        tableCLBModel = (DefaultTableModel) jtbCLB.getModel();
        tableCauThuModel = (DefaultTableModel) jtbCauThu.getModel();
        tableKQTDModel = (DefaultTableModel) jtbKQTranDau.getModel();
        tableBXHModel = (DefaultTableModel) jtbBXH.getModel();
        tableUserModel = (DefaultTableModel) jtbUser.getModel();
        
        ShowCLB();

        //ShowCauThu();
        
        showConboCLBData();
        ShowKQTD();
        ShowComboTDData();
        showConboCLB1Data();
        showConboCLB2Data();
        
        ShowComboVD();
        ShowBXH();
        
        ShowUser();

    }

    // Hiển thị danh sách CLB
    public void ShowCLB() {
        ClbList = ClLBController.findAll();
        
        // Đưa số Row của table về 0
        tableCLBModel.setRowCount(0);

        ClbList.forEach(clb -> {
            tableCLBModel.addRow(new Object[]{tableCLBModel.getRowCount() + 1, clb.getTendoi(),
                clb.getDoitruong(), clb.getHLV(),
                clb.getSocauthu()});
        });
    }

    // Hiển thị danh sách cầu thủ
    public void ShowCauThu() {
        
        CauthuList = CauThuConTroller.findAll();
        
        // Đưa số Row của table về 0
       tableCauThuModel.setRowCount(0);
       
       
//            for (CLB clb : ClbList) {
//                
//                }
           
        CauthuList.forEach(cauthu -> {
            
          
                
            tableCauThuModel.addRow(new Object[]{tableCauThuModel.getRowCount() + 1, cauthu.getTendoi(),
                cauthu.getTencauthu(), cauthu.getNgaysinh(), cauthu.getSoao(), cauthu.getVitri()});
   
            
        });
       
       
    }

    public void ShowKQTD() {
        KQTDList = KQTDcontroller.findAll();

        // Đưa số Row của table về 0
        tableKQTDModel.setRowCount(0);

        KQTDList.forEach(kqtd -> {
            tableKQTDModel.addRow(new Object[]{tableKQTDModel.getRowCount() + 1, kqtd.getTenvong(),
                kqtd.getTentran(), kqtd.getTendoi1(), kqtd.getTendoi2(), kqtd.getSVD(),
                kqtd.getThoigianthidau(), kqtd.getSobanthang1(), kqtd.getSobanthang2()});
        });
    }
    
    public void ShowBXH() {
        BXHList = BXHController.findAll();

        // Đưa số Row của table về 0
        tableBXHModel.setRowCount(0);
        
        BXHList.forEach(bxh -> {
            System.out.println(bxh.getTenvong());
            if(bxh.getTenvong().equals(cbVong.getSelectedItem().toString()))
                {
         
            tableBXHModel.addRow(new Object[]{bxh.getTenvong(), bxh.getVitri(), bxh.getTendoi(),
                bxh.getSotran(), bxh.getSotrangthang(), bxh.getSobanthua(), 
                bxh.getSotranhoa(), bxh.getSobanthang(), bxh.getSobanthua(), bxh.getHieuso(), bxh.getDiem()});
                }
        });
        
    }
    
    public void ShowUser() {
        UserList = UserController.findAll();

        // Đưa số Row của table về 0
        tableUserModel.setRowCount(0);

        UserList.forEach(user -> {
            tableUserModel.addRow(new Object[]{tableUserModel.getRowCount() + 1, user.getTK(),
                user.getEmail(), user.getMK(), user.getTinhtrang()});
        });
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jlbTitleCLB = new javax.swing.JLabel();
        jtfFindCLB = new javax.swing.JTextField();
        jlbFindCLB = new javax.swing.JLabel();
        jlbTitleInput = new javax.swing.JLabel();
        jlbCLBInput = new javax.swing.JLabel();
        jlbDoiTruongInput = new javax.swing.JLabel();
        jlbHLVInput = new javax.swing.JLabel();
        jtfCLBInput = new javax.swing.JTextField();
        jtfDoiTruongInput = new javax.swing.JTextField();
        jtfHLVInput = new javax.swing.JTextField();
        btnSaveCLB = new javax.swing.JButton();
        btnEditCLB = new javax.swing.JButton();
        btnDeleteCLB = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbCLB = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jlbTitleCauThu = new javax.swing.JLabel();
        jtfCauThuFind = new javax.swing.JTextField();
        jlbCauThuFind = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jtfTenCauThu = new javax.swing.JTextField();
        jtfNgaySinh = new javax.swing.JTextField();
        jtfSoAo = new javax.swing.JTextField();
        btnSaveCauThu = new javax.swing.JButton();
        btnEditCauThu = new javax.swing.JButton();
        btnDeleteCauThu = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jtfViTri = new javax.swing.JTextField();
        cbTenCLB = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbCauThu = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jtfVongFind = new javax.swing.JTextField();
        jlbVongFind = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jlbCLB1 = new javax.swing.JLabel();
        jlbCLB2 = new javax.swing.JLabel();
        btnSaveTranDau = new javax.swing.JButton();
        btnEditTranDau = new javax.swing.JButton();
        btnDeleteTranDau = new javax.swing.JButton();
        cbCLB2 = new javax.swing.JComboBox<>();
        cbCLB1 = new javax.swing.JComboBox<>();
        jtfSobanthang1 = new javax.swing.JTextField();
        jtfSobanthang2 = new javax.swing.JTextField();
        jtfSVD = new javax.swing.JTextField();
        jtfThoiGianThiDau = new javax.swing.JTextField();
        jlbSVD = new javax.swing.JLabel();
        jlbTGThiDau = new javax.swing.JLabel();
        cbTranDau = new javax.swing.JComboBox<>();
        jlbTGThiDau1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbCTCLB1 = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtbKQTranDau = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtbBXH = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtfBXHFind = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cbVong = new javax.swing.JComboBox<>();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jlbTitleCLB1 = new javax.swing.JLabel();
        jtfFindUser = new javax.swing.JTextField();
        jlbFindUser = new javax.swing.JLabel();
        jlbTitleInput1 = new javax.swing.JLabel();
        jlbTK = new javax.swing.JLabel();
        jlbEmail = new javax.swing.JLabel();
        jlbMK = new javax.swing.JLabel();
        jtfTK = new javax.swing.JTextField();
        jtfEmail = new javax.swing.JTextField();
        btnSaveUser = new javax.swing.JButton();
        btnEditUser = new javax.swing.JButton();
        btnDeleteUser = new javax.swing.JButton();
        jlbConfirmMK = new javax.swing.JLabel();
        jlbTinhTrang = new javax.swing.JLabel();
        cbTinhTrang = new javax.swing.JComboBox<>();
        jwfMK = new javax.swing.JPasswordField();
        jwfConfirmMK = new javax.swing.JPasswordField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtbUser = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HỆ THỐNG QUẢN LÝ GIẢI ĐẤU BÓNG ĐÁ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N
        jTabbedPane1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jPanel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jlbTitleCLB.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jlbTitleCLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTitleCLB.setText("THÔNG TIN CÂU LẠC BỘ");

        jtfFindCLB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfFindCLBActionPerformed(evt);
            }
        });

        jlbFindCLB.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbFindCLB.setText("Nhập CLB cần tìm kiếm:");

        jlbTitleInput.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlbTitleInput.setText("NHẬP THÔNG TIN CÂU LẠC BỘ");

        jlbCLBInput.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbCLBInput.setText("Tên CLB:");

        jlbDoiTruongInput.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbDoiTruongInput.setText("Đội trưởng:");

        jlbHLVInput.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbHLVInput.setText("HLV:");

        jtfCLBInput.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jtfDoiTruongInput.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtfDoiTruongInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDoiTruongInputActionPerformed(evt);
            }
        });

        jtfHLVInput.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtfHLVInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfHLVInputActionPerformed(evt);
            }
        });

        btnSaveCLB.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSaveCLB.setText("SAVE");
        btnSaveCLB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveCLBActionPerformed(evt);
            }
        });

        btnEditCLB.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEditCLB.setText("EDIT");
        btnEditCLB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditCLBActionPerformed(evt);
            }
        });

        btnDeleteCLB.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDeleteCLB.setText("DELETE");
        btnDeleteCLB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCLBActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("HƯỚNG DẪN SỬ DỤNG\n- Tìm kiếm: Nhập tên đội cần tìm kiếm -> Enter\n- Thêm thông tin đội: Nhập thông tin câu lạc bộ -> nút SAVE\n(số cầu thủ tự cập nhật khi thêm/sửa/xóa cầu thủ)\n- Xóa đội: Chọn đội trong bảng -> nút DELETE\n- Sửa đội: Chọn đội trong bảng -> nút EDIT -> Sửa thông tin đội\n-> nút SAVE\n- Hiển thị tất cả các đội bóng: nút SHOW ALL\n- Xem danh sách cầu thủ của đội: Chọn đội trong bảng -> nút \nSHOW LIST MEMBER CLUB\n");
        jScrollPane6.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnSaveCLB)
                        .addGap(90, 90, 90)
                        .addComponent(btnEditCLB)
                        .addGap(88, 88, 88)
                        .addComponent(btnDeleteCLB))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jlbHLVInput, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(jtfHLVInput))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbDoiTruongInput, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlbCLBInput, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 61, 61)
                                .addComponent(jtfDoiTruongInput, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jtfCLBInput, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jlbTitleInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlbFindCLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtfFindCLB)
                                .addComponent(jlbTitleCLB, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)))))
                .addGap(58, 58, 58)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlbTitleCLB, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfFindCLB, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbFindCLB, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jlbTitleInput, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbCLBInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfCLBInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbDoiTruongInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfDoiTruongInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbHLVInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfHLVInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveCLB)
                    .addComponent(btnEditCLB)
                    .addComponent(btnDeleteCLB))
                .addContainerGap())
        );

        jtbCLB.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtbCLB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Tên CLB", "Đội trưởng", "Huấn luyện viên", "Số cầu thủ"
            }
        ));
        jtbCLB.setRowHeight(20);
        jScrollPane1.setViewportView(jtbCLB);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Câu lạc bộ", jPanel1);

        jPanel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jlbTitleCauThu.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jlbTitleCauThu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTitleCauThu.setText("THÔNG TIN CẦU THỦ");

        jtfCauThuFind.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtfCauThuFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCauThuFindActionPerformed(evt);
            }
        });

        jlbCauThuFind.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbCauThuFind.setText("Nhập tên cầu thủ cần tìm kiếm:");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("NHẬP THÔNG TIN CẦU THỦ");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("Tên CLB:");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("Tên cầu thủ:");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setText("Ngày/ Tháng/ Năm sinh:");

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setText("Số áo:");

        jtfTenCauThu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtfTenCauThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTenCauThuActionPerformed(evt);
            }
        });

        jtfNgaySinh.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtfNgaySinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNgaySinhActionPerformed(evt);
            }
        });

        jtfSoAo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        btnSaveCauThu.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSaveCauThu.setText("SAVE");
        btnSaveCauThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveCauThuActionPerformed(evt);
            }
        });

        btnEditCauThu.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEditCauThu.setText("EDIT");
        btnEditCauThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditCauThuActionPerformed(evt);
            }
        });

        btnDeleteCauThu.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDeleteCauThu.setText("DELETE");
        btnDeleteCauThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCauThuActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel29.setText("Vị trí");

        jtfViTri.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        cbTenCLB.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbTenCLB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTenCLBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(jlbTitleCauThu, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlbCauThuFind, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(28, 28, 28)
                                .addComponent(jtfCauThuFind, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(btnSaveCauThu)
                                .addGap(74, 74, 74)
                                .addComponent(btnEditCauThu)
                                .addGap(69, 69, 69)
                                .addComponent(btnDeleteCauThu))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtfTenCauThu, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                                        .addComponent(jtfSoAo)
                                        .addComponent(jtfViTri))
                                    .addComponent(cbTenCLB, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(430, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jlbTitleCauThu, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCauThuFind, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbCauThuFind, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbTenCLB)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfTenCauThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfSoAo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfViTri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveCauThu)
                    .addComponent(btnEditCauThu)
                    .addComponent(btnDeleteCauThu))
                .addContainerGap())
        );

        jtbCauThu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtbCauThu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Tên CLB", "Tên cầu thủ", "Ngày sinh", "Số áo", "Vị trí"
            }
        ));
        jtbCauThu.setRowHeight(20);
        jScrollPane2.setViewportView(jtbCauThu);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cầu thủ", jPanel6);

        jPanel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("KẾT QUẢ TRẬN ĐẤU");

        jtfVongFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfVongFindActionPerformed(evt);
            }
        });

        jlbVongFind.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbVongFind.setText("Nhập tên vòng cần tìm kiếm:");

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setText("NHẬP KẾT QUẢ TRẬN ĐẤU");

        jlbCLB1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbCLB1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlbCLB1.setText("Tên CLB 1");

        jlbCLB2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbCLB2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbCLB2.setText("Tên CLB 2");

        btnSaveTranDau.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSaveTranDau.setText("SAVE");
        btnSaveTranDau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveTranDauActionPerformed(evt);
            }
        });

        btnEditTranDau.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnEditTranDau.setText("EDIT");
        btnEditTranDau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditTranDauActionPerformed(evt);
            }
        });

        btnDeleteTranDau.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnDeleteTranDau.setText("DELETE");
        btnDeleteTranDau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteTranDauActionPerformed(evt);
            }
        });

        cbCLB2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        cbCLB1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbCLB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCLB1ActionPerformed(evt);
            }
        });

        jtfSobanthang1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jtfSobanthang2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtfSobanthang2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSobanthang2ActionPerformed(evt);
            }
        });

        jtfSVD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSVDActionPerformed(evt);
            }
        });

        jlbSVD.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbSVD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbSVD.setText("SÂN VẬN ĐỘNG");

        jlbTGThiDau.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbTGThiDau.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTGThiDau.setText("THỜI GIAN THI ĐẤU");

        cbTranDau.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbTranDau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTranDauActionPerformed(evt);
            }
        });

        jlbTGThiDau1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbTGThiDau1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTGThiDau1.setText("TRẬN ĐẤU");

        jLabel3.setText("Cầu thủ ghi bản");

        cbCTCLB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCTCLB1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(244, 244, 244)
                                .addComponent(btnSaveTranDau)
                                .addGap(37, 37, 37)
                                .addComponent(btnEditTranDau)
                                .addGap(38, 38, 38)
                                .addComponent(btnDeleteTranDau))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtfSVD, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlbSVD, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jlbCLB1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cbCLB1, 0, 137, Short.MAX_VALUE)
                                            .addComponent(cbCTCLB1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jtfSobanthang1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(jtfSobanthang2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cbTranDau, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlbTGThiDau1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(cbCLB2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jlbCLB2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jtfThoiGianThiDau, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlbTGThiDau, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 456, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                                .addComponent(jlbVongFind, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtfVongFind, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(414, Short.MAX_VALUE))))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfVongFind, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbVongFind, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbTGThiDau1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbTGThiDau, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jlbSVD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfSVD, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfThoiGianThiDau, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbTranDau, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbCLB1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbCLB1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfSobanthang1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfSobanthang2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbCLB2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbCLB2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbCTCLB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDeleteTranDau, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditTranDau, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSaveTranDau, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))))
        );

        jtbKQTranDau.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtbKQTranDau.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Tên vòng đấu", "Tên trận đấu", "Tên CLB 1", "Tên CLB 2", "Sân vận động", "Thời gian thi đấu", "Số bàn thắng CLB 1", "Số bàn thắng CLB 2"
            }
        ));
        jtbKQTranDau.setRowHeight(20);
        jScrollPane3.setViewportView(jtbKQTranDau);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane3)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Kết quả trận đấu", jPanel8);

        jPanel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jtbBXH.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtbBXH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên vòng", "Vị trí", "Tên CLB", "Số trận", "Số trận thắng", "Số trận thua", "Số trận hòa", "Số bàn thắng", "Số bàn thua", "Hiệu số", "Điểm"
            }
        ));
        jtbBXH.setRowHeight(20);
        jScrollPane4.setViewportView(jtbBXH);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BẢNG XẾP HẠNG");

        jtfBXHFind.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtfBXHFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBXHFindActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nhập tên đội cần tìm kiếm :");

        cbVong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(cbVong, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfBXHFind, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(414, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbVong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfBXHFind, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Bảng xếp hạng", jPanel10);

        jPanel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jlbTitleCLB1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jlbTitleCLB1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTitleCLB1.setText("THÔNG TIN NGƯỜI DÙNG");

        jtfFindUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfFindUserActionPerformed(evt);
            }
        });

        jlbFindUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbFindUser.setText("Nhập tài khoản cần tìm kiếm:");

        jlbTitleInput1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlbTitleInput1.setText("NHẬP THÔNG TIN TÀI KHOẢN");

        jlbTK.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbTK.setText("Tên tài khoản:");

        jlbEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbEmail.setText("Email:");

        jlbMK.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbMK.setText("Mật khẩu");

        jtfTK.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jtfEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEmailActionPerformed(evt);
            }
        });

        btnSaveUser.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSaveUser.setText("SAVE");
        btnSaveUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveUserActionPerformed(evt);
            }
        });

        btnEditUser.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEditUser.setText("EDIT");
        btnEditUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditUserActionPerformed(evt);
            }
        });

        btnDeleteUser.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDeleteUser.setText("DELETE");
        btnDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteUserActionPerformed(evt);
            }
        });

        jlbConfirmMK.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbConfirmMK.setText("Nhập lại mật khẩu:");

        jlbTinhTrang.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbTinhTrang.setText("Tình trang:");

        cbTinhTrang.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbTinhTrang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Chọn TT ---", "0", "1" }));

        jwfConfirmMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jwfConfirmMKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(jlbTitleCLB1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jlbTitleInput1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlbFindUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfFindUser, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel12Layout.createSequentialGroup()
                                                .addComponent(jlbTK, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(61, 61, 61))
                                            .addGroup(jPanel12Layout.createSequentialGroup()
                                                .addComponent(jlbEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(45, 45, 45)))
                                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jtfTK, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                                            .addComponent(jtfEmail)))
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jlbTinhTrang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jlbMK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jlbConfirmMK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(41, 41, 41)
                                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jwfMK)
                                            .addGroup(jPanel12Layout.createSequentialGroup()
                                                .addComponent(cbTinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 425, Short.MAX_VALUE))
                                            .addComponent(jwfConfirmMK)))))))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(btnSaveUser)
                        .addGap(69, 69, 69)
                        .addComponent(btnEditUser)
                        .addGap(75, 75, 75)
                        .addComponent(btnDeleteUser)))
                .addContainerGap(434, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jlbTitleCLB1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfFindUser, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jlbFindUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jlbTitleInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbTK, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbMK, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jwfMK, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlbConfirmMK, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jwfConfirmMK)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbTinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveUser)
                    .addComponent(btnEditUser)
                    .addComponent(btnDeleteUser))
                .addGap(49, 49, 49))
        );

        jtbUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtbUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Tài khoản", "Email", "Mật khẩu", "Tình trạng"
            }
        ));
        jtbUser.setRowHeight(20);
        jScrollPane5.setViewportView(jtbUser);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane5)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Thông tin tài khoản", jPanel11);

        jButton1.setText("Thoát");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteUserActionPerformed
        // TODO add your handling code here:
        int selectedIndex = jtbUser.getSelectedRow();
        if (selectedIndex >= 0) {
            User user = UserList.get(selectedIndex);
          
            int option = JOptionPane.showConfirmDialog(rootPane,
                "Bạn có chắc chắn muốn xóa không?");
            if (option == 0) {
                UserController.delete(user.getId());
                JOptionPane.showMessageDialog(rootPane,
                    "Bạn đã xóa thành công");
                ShowUser();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane,
                "Bạn chưa chọn CLB để xóa");
        }
    }//GEN-LAST:event_btnDeleteUserActionPerformed

    private void btnEditUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditUserActionPerformed
        // TODO add your handling code here:
        int selectedIndex = jtbUser.getSelectedRow();
        UserList = UserController.findAll();
        if (selectedIndex >= 0) {
            User user = UserList.get(selectedIndex);

            editUserFrm = new EditUserFrm(this, rootPaneCheckingEnabled);
            editUserFrm.editCLBData(user);
            editUserFrm.setVisible(true);

           ShowUser();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa chọn tài khoản cần cập nhật");
        }
    }//GEN-LAST:event_btnEditUserActionPerformed

    private void btnSaveUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveUserActionPerformed
        // TODO add your handling code here:
        boolean isOK = true;
        String tk = null, email = null, mk = null, confirmMk = null;
        int tinhtrang = 0;
        UserList = UserController.findAll();

        if (jtfTK.getText().length() > 0 && jtfTK.getText() != null) {
            tk = jtfTK.getText();
            for(User user : UserList) {
                if(user.getTK().equals(tk)) {
                    JOptionPane.showMessageDialog(rootPane,
                    "Tài khoản đã tồn tại trong hệ thống");
                    isOK = false;
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane,
                "Bạn chưa nhập tài khoản");
            isOK = false;
        }

        if (jtfEmail.getText().length() > 0 && jtfEmail.getText() != null) {
            email = jtfEmail.getText();
        } else {
            JOptionPane.showMessageDialog(rootPane,
                "Bạn chưa nhập email");
            isOK = false;
        }

        if (jwfMK.getPassword().length > 0) {
            if(jwfMK.getPassword().length >= 6) {
                mk = String.valueOf(jwfMK.getPassword());
            }
            else {
                JOptionPane.showMessageDialog(rootPane,
                "Mật khẩu phải ít nhất có 6 kí tự");
                isOK = false;
            }
        } else {
            JOptionPane.showMessageDialog(rootPane,
                "Bạn chưa nhập mật khẩu");
            isOK = false;
        }
        
        if (jwfConfirmMK.getPassword().length > 0) {
            if(jwfConfirmMK.getPassword().length >= 6) {
                confirmMk = String.valueOf(jwfConfirmMK.getPassword());
                if(!mk.equals(confirmMk)) {
                    JOptionPane.showMessageDialog(rootPane, "Mật khẩu nhập lại không đúng");
                    isOK = false;
                }
            }
            else {
                JOptionPane.showMessageDialog(rootPane,
                "Mật khảu phải ít nhất có 6 kí tự");
                isOK = false;
            }
        } else {
            JOptionPane.showMessageDialog(rootPane,
                "Bạn chưa nhập lại mật khẩu");
            isOK = false;
        }
        
        if (cbTinhTrang.getSelectedIndex() > 0) {
            tinhtrang = Integer.parseInt(cbTinhTrang.getSelectedItem().toString());
        } else {
            JOptionPane.showMessageDialog(rootPane,
                "Bạn chưa chọn tình trạng tài khoản");
            isOK = false;
        }

        if (isOK) {
            User user = new User(tinhtrang, tk, email, mk);
            JOptionPane.showMessageDialog(rootPane,
                "Bạn đã thêm thành công tài khoản");
            UserController.insert(user);

            cbTranDau.setSelectedIndex(0);
            jtfTK.setText("");
            jtfEmail.setText("");
            jwfMK.setText("");
            jwfConfirmMK.setText("");
        }
        ShowUser();
    }//GEN-LAST:event_btnSaveUserActionPerformed

    private void jtfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEmailActionPerformed

    private void jtfFindUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfFindUserActionPerformed
        // TODO add your handling code here:
        String tk = jtfFindUser.getText();
        if (tk.length() != 0 && tk != null) {
            UserList = UserController.findByTK(tk);
            tableUserModel.setRowCount(0);

            UserList.forEach(user -> {
            tableUserModel.addRow(new Object[]{tableUserModel.getRowCount() + 1, user.getTK(),
                user.getEmail(), user.getMK(), user.getTinhtrang()});
            });
            jtfFindUser.setText("");
        } else {
            ShowUser();
        }
        
    }//GEN-LAST:event_jtfFindUserActionPerformed

    private void jtfBXHFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBXHFindActionPerformed
        // TODO add your handling code here:
        String tendoi = jtfBXHFind.getText();
        if (tendoi.length() > 0 && tendoi != null) {
            BXHList = BXHController.findByNameCLB(tendoi);
            tableBXHModel.setRowCount(0);

            BXHList.forEach(bxh -> {
                tableBXHModel.addRow(new Object[]{bxh.getTenvong(), bxh.getVitri(), bxh.getTendoi(),
                    bxh.getSotran(), bxh.getSotrangthang(), bxh.getSobanthua(),
                    bxh.getSotranhoa(), bxh.getSobanthang(), bxh.getSobanthua(), bxh.getHieuso(), bxh.getDiem()});
            });
            jtfBXHFind.setText("");
        } else {
            ShowBXH();
        }
    }//GEN-LAST:event_jtfBXHFindActionPerformed

    private void jtfSVDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSVDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfSVDActionPerformed

    private void jtfSobanthang2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSobanthang2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfSobanthang2ActionPerformed

    private void btnDeleteTranDauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteTranDauActionPerformed
        // TODO add your handling code here:
        int selectedIndex = jtbKQTranDau.getSelectedRow();
        if (selectedIndex >= 0) {
            KQTD kqtd = KQTDList.get(selectedIndex);
            int option = JOptionPane.showConfirmDialog(rootPane,
                "Bạn có chắc chắn muốn xóa không?");
            if (option == 0) {
                KQTDcontroller.delete(kqtd.getMatran());
                JOptionPane.showMessageDialog(rootPane,
                    "Bạn đã xóa thành công");

                ShowKQTD();
                BXHController.Delete();
                ShowBXH();
                
            }
        } else {
            JOptionPane.showMessageDialog(rootPane,
                "Bạn chưa chọn trận đấu để xóa");
        }
    }//GEN-LAST:event_btnDeleteTranDauActionPerformed

    private void btnEditTranDauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditTranDauActionPerformed
        // TODO add your handling code here:
        int selectedIndex = jtbKQTranDau.getSelectedRow();
        KQTDList = KQTDcontroller.findAll();
        if (selectedIndex >= 0) {
            KQTD kqtd = KQTDList.get(selectedIndex);
            System.out.println("Tên trận:" + kqtd.getTentran());

            editKQTDFrm = new EditKQTDFrm(this, rootPaneCheckingEnabled);
            editKQTDFrm.editKQTDData(kqtd);
            editKQTDFrm.setVisible(true);

            ShowKQTD();
            BXHController.Delete();
            ShowBXH();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa chọn trận đấu cần cập nhật");
        }
    }//GEN-LAST:event_btnEditTranDauActionPerformed

    private void btnSaveTranDauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveTranDauActionPerformed
        // TODO add your handling code here:
        ClbList = ClLBController.findAll();
        KQTDList = KQTDcontroller.findAllTD();
        boolean isOK = true;
        int matran = 0, madoi1 = 0, madoi2 = 0, banthang1 = 0, banthang2 = 0;
        Date thoigian = null;
        String tentran = null, tendoi1 = null, tendoi2 = null, SVD = null;

        if (cbTranDau.getSelectedIndex() >= 0) {
            tentran = cbTranDau.getSelectedItem().toString();
            for (KQTD kqtd : KQTDList) {
                if (kqtd.getTentran().equals(tentran)) {
                    matran = kqtd.getMatran();
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane,
                "Bạn chưa chọn trận đấu");
            isOK = false;
        }

        if (cbCLB1.getSelectedIndex() >= 0) {
            tendoi1 = cbCLB1.getSelectedItem().toString();
            for (CLB clb : ClbList) {
                if (clb.getTendoi().equals(tendoi1)) {
                    madoi1 = clb.getMadoi();
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane,
                "Bạn chưa chọn CLB 1");
            isOK = false;
        }

        if (cbCLB2.getSelectedIndex() >= 0) {
            tendoi2 = cbCLB2.getSelectedItem().toString();
            for (CLB clb : ClbList) {
                if (clb.getTendoi().equals(tendoi2)) {
                    madoi2 = clb.getMadoi();
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane,
                "Bạn chưa chọn CLB");
            isOK = false;
        }

        if (jtfSVD.getText().length() > 0 && jtfSVD.getText() != null) {
            SVD = jtfSVD.getText();
        } else {
            JOptionPane.showMessageDialog(rootPane,
                "Bạn chưa nhập tên sân vận động");
            isOK = false;
        }

        if (jtfThoiGianThiDau.getText().length() > 0 && jtfThoiGianThiDau.getText() != null) {
            try {
                System.out.println(jtfThoiGianThiDau.getText());
                thoigian = new SimpleDateFormat("dd/MM/yyyy").parse(jtfThoiGianThiDau.getText());
            } catch (ParseException ex) {
                Logger.getLogger(HomeFrm.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane,
                "Bạn chưa nhập thời gian thi đấu");
            isOK = false;
        }

        if (jtfSobanthang1.getText().length() > 0 && jtfSobanthang1.getText() != null) {
            banthang1 = Integer.parseInt(jtfSobanthang1.getText());
        } else {
            JOptionPane.showMessageDialog(rootPane,
                "Bạn chưa nhập số bàn thắng của CLB 1");
            isOK = false;
        }

        if (jtfSobanthang2.getText().length() > 0 && jtfSobanthang2.getText() != null) {
            banthang2 = Integer.parseInt(jtfSobanthang2.getText());
        } else {
            JOptionPane.showMessageDialog(rootPane,
                "Bạn chưa nhập số bàn thắng của CLB 2");
            isOK = false;
        }

        if (isOK) {
            KQTD kqtd = new KQTD(matran, madoi1, madoi2, banthang1, banthang2, SVD, thoigian);

            KQTDcontroller.insert(kqtd);

            JOptionPane.showMessageDialog(rootPane,
                "Bạn đã thêm thành công trận đấu");
               System.out.println(cbTranDau.getSelectedIndex());
            //cbTranDau.setSelectedIndex(0);
            cbCLB1.setSelectedIndex(0);
            cbCLB2.setSelectedIndex(0);
            jtfSVD.setText("");
            jtfThoiGianThiDau.setText("");
            jtfSobanthang1.setText("");
            jtfSobanthang2.setText("");
            tableBXHModel.setRowCount(0);
            
            BXHList = BXHController.findAll();

        
            tableBXHModel.setRowCount(0);

            BXHList.forEach(bxh -> {
                if(bxh.getMavong()==cbVong.getSelectedIndex())
                {
            tableBXHModel.addRow(new Object[]{bxh.getTenvong(), bxh.getVitri(), bxh.getTendoi(),
                bxh.getSotran(), bxh.getSotrangthang(), bxh.getSobanthua(), 
                bxh.getSotranhoa(), bxh.getSobanthang(), bxh.getSobanthua(), bxh.getHieuso(), bxh.getDiem()});
                }
        });
            
            
            ShowBXH();
        }

        ShowKQTD();
//        BXHController.Delete();
        
        //ShowBXH();
    }//GEN-LAST:event_btnSaveTranDauActionPerformed

    private void jtfVongFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfVongFindActionPerformed
        // TODO add your handling code here:
        String tenvong = jtfVongFind.getText();
        if (tenvong.length() > 0 && tenvong != null) {
            KQTDList = KQTDcontroller.findByNamevongKQTD(tenvong);
            tableKQTDModel.setRowCount(0);

            KQTDList.forEach(kqtd -> {
                tableKQTDModel.addRow(new Object[]{tableKQTDModel.getRowCount() + 1, kqtd.getTenvong(),
                    kqtd.getTentran(), kqtd.getTendoi1(), kqtd.getTendoi2(), kqtd.getSVD(),
                    kqtd.getThoigianthidau(), kqtd.getSobanthang1(), kqtd.getSobanthang2()});
            });
            jtfVongFind.setText("");
        } else {
            ShowKQTD();
            JOptionPane.showMessageDialog(rootPane,
                    "Bạn chưa nhập !!!");
            
        }
    }//GEN-LAST:event_jtfVongFindActionPerformed

    private void cbTenCLBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTenCLBActionPerformed
        // TODO add your handling code here:
        tableCauThuModel.setRowCount(0);
        CauthuList = CauThuConTroller.findAll();
        String selectedItem = (String) cbTenCLB.getSelectedItem();
        System.out.println(selectedItem);
 
        CauthuList.forEach(cauthu -> {
            
        if(selectedItem.equals(cauthu.getTendoi())) 
        {
            
            tableCauThuModel.addRow(new Object[]{tableCauThuModel.getRowCount() + 1, cauthu.getTendoi(),
                cauthu.getTencauthu(), cauthu.getNgaysinh(), cauthu.getSoao(), cauthu.getVitri()});
        }
            
        });
        
    }//GEN-LAST:event_cbTenCLBActionPerformed

    private void btnDeleteCauThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCauThuActionPerformed
        // TODO add your handling code here:
        int selectedIndex = jtbCauThu.getSelectedRow();
        if (selectedIndex >= 0) {
            CauThu cauThu = CauthuList.get(selectedIndex);
            int option = JOptionPane.showConfirmDialog(rootPane,
                "Bạn có chắc chắn muốn xóa không?");
            if (option == 0) {
                CauThuConTroller.delete(cauThu.getMacauthu());
                JOptionPane.showMessageDialog(rootPane,
                    "Bạn đã xóa thành công");
                ShowCauThu();
                ShowCLB();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane,
                "Bạn chưa chọn cầu thủ để xóa");
        }
    }//GEN-LAST:event_btnDeleteCauThuActionPerformed

    private void btnEditCauThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditCauThuActionPerformed
        // TODO add your handling code here:
        int selectedIndex = jtbCauThu.getSelectedRow();
        CauthuList = CauThuConTroller.findAll();
        if (selectedIndex >= 0) {
            CauThu cauThu = CauthuList.get(selectedIndex);

            editCauThuFrm = new EditCauThuFrm(this, rootPaneCheckingEnabled);
            editCauThuFrm.editCauThuData(cauThu);
            editCauThuFrm.setVisible(true);

            ShowCauThu();
            ShowCLB();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa chọn cầu thủ cần cập nhật");
        }
    }//GEN-LAST:event_btnEditCauThuActionPerformed

    private void btnSaveCauThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveCauThuActionPerformed
        // TODO add your handling code here:
        ClbList = ClLBController.findAll();
        boolean isOK = true;
        
        int soao = 0, madoi = 0;
        Date ngaysinh = null;
        String tendoi = null, tencauthu = null, vitri = null;

        if (cbTenCLB.getSelectedIndex() >= 0) {
            tendoi = cbTenCLB.getSelectedItem().toString();
            for (CLB clb : ClbList) {
                if (clb.getTendoi().equals(tendoi)) {
                    madoi = clb.getMadoi();
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane,
                "Bạn chưa chọn CLB");
            isOK = false;
        }
        
        if (jtfTenCauThu.getText().length() > 0 && jtfTenCauThu.getText() != null) {
            tencauthu = jtfTenCauThu.getText();
        } else {
            JOptionPane.showMessageDialog(rootPane,
                "Bạn chưa nhập tên cầu thủ");
            isOK = false;
        }

        if (jtfNgaySinh.getText().length() > 0 && jtfNgaySinh.getText() != null) {
            try {
                System.out.println(jtfNgaySinh.getText());
                ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(jtfNgaySinh.getText());
            } catch (ParseException ex) {
                Logger.getLogger(HomeFrm.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane,
                "Bạn chưa nhập ngày sinh");
            isOK = false;
        }

        if (jtfSoAo.getText().length() > 0 && jtfSoAo.getText() != null) {
            soao = Integer.parseInt(jtfSoAo.getText());
        } else {
            JOptionPane.showMessageDialog(rootPane,
                "Bạn chưa nhập số áo");
            isOK = false;
        }

        if (jtfViTri.getText().length() > 0 && jtfViTri.getText() != null) {
            vitri = jtfViTri.getText();
        } else {
            JOptionPane.showMessageDialog(rootPane,
                "Bạn chưa nhập vị trí");
            isOK = false;
        }

        if (isOK) {
            CauThu cauThu = new CauThu(madoi, soao, ngaysinh, tencauthu, vitri);
            JOptionPane.showMessageDialog(rootPane,
                "Bạn đã thêm thành công cầu thủ");
            CauThuConTroller.insert(cauThu);

            cbTenCLB.actionPerformed(evt);
            jtfTenCauThu.setText("");
            jtfNgaySinh.setText("");
            jtfSoAo.setText("");
            jtfViTri.setText("");
           
        }
        
        ShowCLB();
    }//GEN-LAST:event_btnSaveCauThuActionPerformed

    private void jtfNgaySinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNgaySinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNgaySinhActionPerformed

    private void jtfTenCauThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTenCauThuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTenCauThuActionPerformed

    private void jtfCauThuFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCauThuFindActionPerformed
        // TODO add your handling code here:
        String tencauthu = jtfCauThuFind.getText();
        if (tencauthu.length() > 0 && tencauthu != null) {
            CauthuList = CauThuConTroller.findByNameCauthu(tencauthu);
            tableCauThuModel.setRowCount(0);

            CauthuList.forEach(cauthu -> {
                tableCauThuModel.addRow(new Object[]{tableCauThuModel.getRowCount() + 1, cauthu.getTendoi(),
                    cauthu.getTencauthu(), cauthu.getNgaysinh(), cauthu.getSoao(), cauthu.getVitri()});
            });
            jtfCauThuFind.setText("");
        } else {
            ShowCauThu();
        }
    }//GEN-LAST:event_jtfCauThuFindActionPerformed

    private void btnDeleteCLBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCLBActionPerformed
        // TODO add your handling code here:
        int selectedIndex = jtbCLB.getSelectedRow();
        if (selectedIndex >= 0) {
            CLB clb = ClbList.get(selectedIndex);
            int option = JOptionPane.showConfirmDialog(rootPane,
                "Bạn có chắc chắn muốn xóa không?");
            if (option == 0) {
                ClLBController.delete(clb.getMadoi());
                JOptionPane.showMessageDialog(rootPane,
                    "Bạn đã xóa thành công");
                ShowCLB();
                showConboCLBData();
                showConboCLB1Data();
                showConboCLB2Data();
//                editCauThuFrm = new EditCauThuFrm(this, rootPaneCheckingEnabled);
//                editCauThuFrm.showConboData();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane,
                "Bạn chưa chọn CLB để xóa");
        }
    }//GEN-LAST:event_btnDeleteCLBActionPerformed

    private void btnEditCLBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditCLBActionPerformed
        // TODO add your handling code here:
        int selectedIndex = jtbCLB.getSelectedRow();
        //ClbList = ClLBController.findAll();
        if (selectedIndex >= 0) {
            CLB clb = ClbList.get(selectedIndex);

            editCLBFrm = new EditCLBFrm(this, rootPaneCheckingEnabled);
            
            editCLBFrm.editCLBData(clb);
            editCLBFrm.setVisible(true);

            ShowCLB();
            showConboCLBData();
            showConboCLB1Data();
            showConboCLB2Data();
//            editCauThuFrm = new EditCauThuFrm(this, rootPaneCheckingEnabled);
//            editCauThuFrm.showConboData();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa chọn CLB cần cập nhật");
        }
    }//GEN-LAST:event_btnEditCLBActionPerformed

    private void btnSaveCLBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveCLBActionPerformed
        // TODO add your handling code here:
        boolean isOK = true;
        String tendoi = null, doitruong = null, HLV = null;
        int socauthu = 0;

        if (jtfCLBInput.getText().length() > 0 && jtfCLBInput.getText() != null) {
            tendoi = jtfCLBInput.getText().trim();
        } else {
            JOptionPane.showMessageDialog(rootPane,
                "Bạn chưa nhập tên đội");
            isOK = false;
        }

        if (jtfDoiTruongInput.getText().length() > 0 && jtfDoiTruongInput.getText() != null) {
            doitruong = jtfDoiTruongInput.getText().trim();
        } else {
            JOptionPane.showMessageDialog(rootPane,
                "Bạn chưa nhập tên đội trưởng");
            isOK = false;
        }

        if (jtfHLVInput.getText().length() > 0 && jtfHLVInput.getText() != null) {
            HLV = jtfHLVInput.getText().trim();
        } else {
            JOptionPane.showMessageDialog(rootPane,
                "Bạn chưa nhập tên huấn luyện viên");
            isOK = false;
        }

        if (isOK) {
            CLB clb = new CLB(socauthu, tendoi, doitruong, HLV);
            JOptionPane.showMessageDialog(rootPane,
                "Bạn đã thêm thành công CLB");
            ClLBController.insert(clb);

            jtfCLBInput.setText("");
            jtfDoiTruongInput.setText("");
            jtfHLVInput.setText("");
        }
        ShowCLB();
        showConboCLBData();
        showConboCLB1Data();
        showConboCLB2Data();
//        editCauThuFrm = new EditCauThuFrm(this, rootPaneCheckingEnabled);
//        editCauThuFrm.showConboData();
    }//GEN-LAST:event_btnSaveCLBActionPerformed

    private void jtfHLVInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfHLVInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfHLVInputActionPerformed

    private void jtfDoiTruongInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDoiTruongInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDoiTruongInputActionPerformed

    private void jtfFindCLBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfFindCLBActionPerformed
        // TODO add your handling code here:
        String tendoi = jtfFindCLB.getText();
        if (tendoi.length() != 0 && tendoi != null) {
            ClbList = ClLBController.findByNameCLB(tendoi);
            tableCLBModel.setRowCount(0); // Xoa du lieu bang
            
            ClbList.forEach(clb -> {
                tableCLBModel.addRow(new Object[]{tableCLBModel.getRowCount() + 1, clb.getTendoi(),
                    clb.getDoitruong(), clb.getHLV(), clb.getSocauthu()});
            });
            
            jtfFindCLB.setText("");
        } else {
            ShowCLB();
        }
    }//GEN-LAST:event_jtfFindCLBActionPerformed

    private void cbCLB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCLB1ActionPerformed
        // TODO add your handling code here:
        ShowCauThuCLB1(cbCLB1.getSelectedItem().toString());
        
    }//GEN-LAST:event_cbCLB1ActionPerformed

    private void cbTranDauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTranDauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTranDauActionPerformed

    private void cbVongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVongActionPerformed
        // TODO add your handling code here:
        BXHList = BXHController.findAll();

        // Đưa số Row của table về 0
        tableBXHModel.setRowCount(0);
           System.out.println(cbVong.getSelectedItem().toString());
        BXHList.forEach(bxh -> {
            System.out.println(bxh.getTenvong());
            if(bxh.getTenvong().equals(cbVong.getSelectedItem().toString()))
                {
         
            tableBXHModel.addRow(new Object[]{bxh.getTenvong(), bxh.getVitri(), bxh.getTendoi(),
                bxh.getSotran(), bxh.getSotrangthang(), bxh.getSobanthua(), 
                bxh.getSotranhoa(), bxh.getSobanthang(), bxh.getSobanthua(), bxh.getHieuso(), bxh.getDiem()});
                }
        });
    }//GEN-LAST:event_cbVongActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //Home home = new Home();
        //home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jwfConfirmMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jwfConfirmMKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jwfConfirmMKActionPerformed

    private void cbCTCLB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCTCLB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCTCLB1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteCLB;
    private javax.swing.JButton btnDeleteCauThu;
    private javax.swing.JButton btnDeleteTranDau;
    private javax.swing.JButton btnDeleteUser;
    private javax.swing.JButton btnEditCLB;
    private javax.swing.JButton btnEditCauThu;
    private javax.swing.JButton btnEditTranDau;
    private javax.swing.JButton btnEditUser;
    private javax.swing.JButton btnSaveCLB;
    private javax.swing.JButton btnSaveCauThu;
    private javax.swing.JButton btnSaveTranDau;
    private javax.swing.JButton btnSaveUser;
    private javax.swing.JComboBox<String> cbCLB1;
    private javax.swing.JComboBox<String> cbCLB2;
    private javax.swing.JComboBox<String> cbCTCLB1;
    private javax.swing.JComboBox<String> cbTenCLB;
    private javax.swing.JComboBox<String> cbTinhTrang;
    private javax.swing.JComboBox<String> cbTranDau;
    private javax.swing.JComboBox<String> cbVong;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel jlbCLB1;
    private javax.swing.JLabel jlbCLB2;
    private javax.swing.JLabel jlbCLBInput;
    private javax.swing.JLabel jlbCauThuFind;
    private javax.swing.JLabel jlbConfirmMK;
    private javax.swing.JLabel jlbDoiTruongInput;
    private javax.swing.JLabel jlbEmail;
    private javax.swing.JLabel jlbFindCLB;
    private javax.swing.JLabel jlbFindUser;
    private javax.swing.JLabel jlbHLVInput;
    private javax.swing.JLabel jlbMK;
    private javax.swing.JLabel jlbSVD;
    private javax.swing.JLabel jlbTGThiDau;
    private javax.swing.JLabel jlbTGThiDau1;
    private javax.swing.JLabel jlbTK;
    private javax.swing.JLabel jlbTinhTrang;
    private javax.swing.JLabel jlbTitleCLB;
    private javax.swing.JLabel jlbTitleCLB1;
    private javax.swing.JLabel jlbTitleCauThu;
    private javax.swing.JLabel jlbTitleInput;
    private javax.swing.JLabel jlbTitleInput1;
    private javax.swing.JLabel jlbVongFind;
    private javax.swing.JTable jtbBXH;
    private javax.swing.JTable jtbCLB;
    private javax.swing.JTable jtbCauThu;
    private javax.swing.JTable jtbKQTranDau;
    private javax.swing.JTable jtbUser;
    private javax.swing.JTextField jtfBXHFind;
    private javax.swing.JTextField jtfCLBInput;
    private javax.swing.JTextField jtfCauThuFind;
    private javax.swing.JTextField jtfDoiTruongInput;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfFindCLB;
    private javax.swing.JTextField jtfFindUser;
    private javax.swing.JTextField jtfHLVInput;
    private javax.swing.JTextField jtfNgaySinh;
    private javax.swing.JTextField jtfSVD;
    private javax.swing.JTextField jtfSoAo;
    private javax.swing.JTextField jtfSobanthang1;
    private javax.swing.JTextField jtfSobanthang2;
    private javax.swing.JTextField jtfTK;
    private javax.swing.JTextField jtfTenCauThu;
    private javax.swing.JTextField jtfThoiGianThiDau;
    private javax.swing.JTextField jtfViTri;
    private javax.swing.JTextField jtfVongFind;
    private javax.swing.JPasswordField jwfConfirmMK;
    private javax.swing.JPasswordField jwfMK;
    // End of variables declaration//GEN-END:variables

    private void showConboCLBData() {
        ClbList = ClLBController.findAll();
        cbTenCLB.removeAllItems();
        ClbList.forEach(clb -> {
            cbTenCLB.addItem(clb.getTendoi());
        });
    }

    private void showConboCLB1Data() {
        ClbList = ClLBController.findAll();
        cbCLB1.removeAllItems();
        ClbList.forEach(clb -> {
            cbCLB1.addItem(clb.getTendoi());
        });
    }

    private void showConboCLB2Data() {
        ClbList = ClLBController.findAll();
        cbCLB2.removeAllItems();
        ClbList.forEach(clb -> {
            cbCLB2.addItem(clb.getTendoi());
        });
    }

    private void ShowComboTDData() {
        KQTDList = KQTDcontroller.findAllTD();
        cbTranDau.removeAllItems();
        KQTDList.forEach(kqtd -> {
            cbTranDau.addItem(kqtd.getTentran());
        });
    }
    
    private void ShowComboVD() {
        VongDauList = VongDaucontroller.findAll();
        cbVong.removeAllItems();
        VongDauList.forEach(vongdau -> {
            cbVong.addItem((vongdau.getTenvong()));
        });
    }
    
    private void ShowCauThuCLB1(String clb1) {
        CauthuList = CauThuConTroller.findAll();
        
        CauthuList.forEach(cauthu -> {
            
            if (cauthu.getTendoi().equals(clb1))
            {
            
            cbCTCLB1.addItem(cauthu.getTencauthu());
            }
        });   
    }

}
