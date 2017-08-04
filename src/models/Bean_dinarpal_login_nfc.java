/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author umarmukhtar
 */
public class Bean_dinarpal_login_nfc {
    private String dln_id;
    private String dln_user;
    private String dln_pass;
    private String dln_lock;
    private String dln_fullname;

    public String getDln_id() {
        return dln_id;
    }

    public void setDln_id(String dln_id) {
        this.dln_id = dln_id;
    }

    public String getDln_user() {
        return dln_user;
    }

    public void setDln_user(String dln_user) {
        this.dln_user = dln_user;
    }

    public String getDln_pass() {
        return dln_pass;
    }

    public void setDln_pass(String dln_pass) {
        this.dln_pass = dln_pass;
    }

    public String getDln_fullname() {
        return dln_fullname;
    }

    public void setDln_fullname(String dln_fullname) {
        this.dln_fullname = dln_fullname;
    }

    public String getDln_lock() {
        return dln_lock;
    }

    public void setDln_lock(String dln_lock) {
        this.dln_lock = dln_lock;
    }
}
