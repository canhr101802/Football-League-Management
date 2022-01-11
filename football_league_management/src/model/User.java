/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Dell
 */
public class User {

    int id, tinhtrang;
    String TK, email, MK;

    public User() {
    }

    public User(int id, int tinhtrang, String TK, String email, String MK) {
        this.id = id;
        this.tinhtrang = tinhtrang;
        this.TK = TK;
        this.email = email;
        this.MK = MK;
    }

    public User(int tinhtrang, String TK, String email, String MK) {
        this.tinhtrang = tinhtrang;
        this.TK = TK;
        this.email = email;
        this.MK = MK;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(int tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    public String getTK() {
        return TK;
    }

    public void setTK(String TK) {
        this.TK = TK;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMK() {
        return MK;
    }

    public void setMK(String MK) {
        this.MK = MK;
    }

}
