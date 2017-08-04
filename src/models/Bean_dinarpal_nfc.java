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
public class Bean_dinarpal_nfc {
    
    private String dn_id;
    private String dn_datetime;
    private String dn_nfccode;
    private int me_id;
    private String dn_pin;
    private String dn_lock;
    private int dn_status;

    public String getDn_id() {
        return dn_id;
    }

    public void setDn_id(String dn_id) {
        this.dn_id = dn_id;
    }

    public String getDn_datetime() {
        return dn_datetime;
    }

    public void setDn_datetime(String dn_datetime) {
        this.dn_datetime = dn_datetime;
    }

    public int getMe_id() {
        return me_id;
    }

    public void setMe_id(int me_id) {
        this.me_id = me_id;
    }

    public int getDn_status() {
        return dn_status;
    }

    public void setDn_status(int dn_status) {
        this.dn_status = dn_status;
    }

    public String getDn_nfccode() {
        return dn_nfccode;
    }

    public void setDn_nfccode(String dn_nfccode) {
        this.dn_nfccode = dn_nfccode;
    }

    public String getDn_pin() {
        return dn_pin;
    }

    public void setDn_pin(String dn_pin) {
        this.dn_pin = dn_pin;
    }

    public String getDn_lock() {
        return dn_lock;
    }

    public void setDn_lock(String dn_lock) {
        this.dn_lock = dn_lock;
    }
    
    
}
