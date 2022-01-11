/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.VongDau;

/**
 *
 * @author DinhC
 */
public class VongDaucontroller {
    
    public static List<VongDau> findAll() {
        List<VongDau> vongDauList = new ArrayList<>();

        Connection connection = null;
        Statement statement = null;
        PreparedStatement prestatement = null;

        try {
            //Lấy tất cả dah sách sinh viên
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newschema", "root", "123456");

           
            // Lấy danh sách đội bóng
            String sql = "SELECT * FROM vongdau";
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                VongDau vongDau;
                vongDau = new VongDau(resultSet.getInt("mavongdau"),
                                      resultSet.getString("tenvongdau"));

                vongDauList.add(vongDau);
            }

        } catch (SQLException ex) {
            Logger.getLogger(VongDaucontroller.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(VongDaucontroller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (prestatement != null) {
                try {
                    prestatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(VongDaucontroller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(VongDaucontroller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        // Kết thúc
        return vongDauList;
    }
    
}
