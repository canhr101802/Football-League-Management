/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
import model.User;

/**
 *
 * @author Dell
 */
public class UserController {
    public static List<User> findAll() {
        List<User> UserList = new ArrayList<>();

        Connection connection = null;
        Statement statement = null;
        PreparedStatement prestatement = null;

        try {
            //Lấy tất cả dah sách sinh viên
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newschema", "root", "123456");

            //query
            String sql = "SELECT * FROM taikhoan";
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);
          
            while (resultSet.next()) {
                User user;
                user = new User(resultSet.getInt("id"),
                        resultSet.getInt("tinhtrang"),
                        resultSet.getString("tk"),
                        resultSet.getString("email"),
                        resultSet.getString("mk"));

                UserList.add(user);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        // Kết thúc
        return UserList;
    }

    public static void insert(User user) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //Lấy tất cả dah sách sinh viên
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newschema", "root", "123456");

            //query
            String sql = "INSERT INTO taikhoan(tk, email, mk, tinhtrang) VALUES(?, ?, ?, ?)";
            statement = connection.prepareCall(sql);

            statement.setString(1, user.getTK());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getMK());
            statement.setInt(4, user.getTinhtrang());

            statement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        // Kết thúc
    }

    public static void update(User user) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //Lấy tất cả dah sách sinh viên
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newschema", "root", "123456");

            //query
            String sql = "UPDATE taikhoan SET tk = ?, email = ?, mk = ?, tinhtrang = ? WHERE id = ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, user.getTK());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getMK());
            statement.setInt(4, user.getTinhtrang());
            statement.setInt(5, user.getId());
            statement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        // Kết thúc
    }

    public static void delete(int id) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //Lấy tất cả dah sách sinh viên
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newschema", "root", "123456");

            //query
            String sql = "DELETE FROM taikhoan WHERE id = ?";
            statement = connection.prepareCall(sql);

            statement.setInt(1, id);

            statement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        // Kết thúc
    }

    public static List<User> findByTK(String tk) {
        List<User> UserList = new ArrayList<>();

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //Lấy tất cả dah sách sinh viên
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newschema", "root", "1234567");

            //query
            String sql = "SELECT * FROM taikhoan WHERE tk LIKE ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, tk + "%");

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                User user;
                user = new User(resultSet.getInt("id"),
                        resultSet.getInt("tinhtrang"),
                        resultSet.getString("tk"),
                        resultSet.getString("email"),
                        resultSet.getString("mk"));
                UserList.add(user);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        // Kết thúc
        return UserList;
    }
}
