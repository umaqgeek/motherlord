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
public class Bean_dinarpal_nfc_merchant {
    
    private String dnm_id;
    private int me_id;
    private String dnm_user;
    private String dnm_pass;
    private String dnm_lock;

    public String getDnm_id() {
        return dnm_id;
    }

    public void setDnm_id(String dnm_id) {
        this.dnm_id = dnm_id;
    }

    public int getMe_id() {
        return me_id;
    }

    public void setMe_id(int me_id) {
        this.me_id = me_id;
    }

    public String getDnm_user() {
        return dnm_user;
    }

    public void setDnm_user(String dnm_user) {
        this.dnm_user = dnm_user;
    }

    public String getDnm_pass() {
        return dnm_pass;
    }

    public void setDnm_pass(String dnm_pass) {
        this.dnm_pass = dnm_pass;
    }

    public String getDnm_lock() {
        return dnm_lock;
    }

    public void setDnm_lock(String dnm_lock) {
        this.dnm_lock = dnm_lock;
    }
}
