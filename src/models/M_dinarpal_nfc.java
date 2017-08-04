/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import libraries.My_func;
import main.RMIConnector;

/**
 *
 * @author umarmukhtar
 */
public class M_dinarpal_nfc {
    
    public boolean addData(Bean_dinarpal_nfc bean_dinarpal_nfc) {
        boolean status = false;
        try {
            RMIConnector rmic = new RMIConnector(DBConn.getHost(), DBConn.getPort_rmi());
            ArrayList<String> d = new ArrayList<String>();
            d.add(bean_dinarpal_nfc.getDn_id());
            d.add(bean_dinarpal_nfc.getDn_datetime());
            d.add(bean_dinarpal_nfc.getDn_nfccode());
            d.add(bean_dinarpal_nfc.getMe_id() + "");
            d.add(bean_dinarpal_nfc.getDn_pin());
            d.add(bean_dinarpal_nfc.getDn_lock());
            d.add(bean_dinarpal_nfc.getDn_status() + "");
            status = rmic.dn_addData(d);
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
            status = false;
        }
        return status;
    }
    
    public Bean_dinarpal_nfc getData(String dn_id) {
        Bean_dinarpal_nfc bdn = new Bean_dinarpal_nfc();
        try {
            
            RMIConnector rmic = new RMIConnector(DBConn.getHost(), DBConn.getPort_rmi());
            ArrayList<String> d = rmic.dn_getData(dn_id);
            if (d.size() > 0) {
                bdn.setDn_id(d.get(0));
                bdn.setDn_datetime(d.get(1));
                bdn.setDn_nfccode(d.get(2));
                int me_id = 0;
                try {
                    me_id = Integer.parseInt(d.get(3));
                } catch (Exception e) {
                    me_id = 0;
                }
                bdn.setMe_id(me_id);
                bdn.setDn_pin(d.get(4));
                bdn.setDn_lock(d.get(5));
                int dn_status = 1;
                try {
                    dn_status = Integer.parseInt(d.get(6));
                } catch (Exception e) {
                    dn_status = 1;
                }
                bdn.setDn_status(dn_status);
            }
            
        } catch (Exception e) {
            bdn = new Bean_dinarpal_nfc();
        }
        return bdn;
    }
    
    public Bean_dinarpal_nfc getData_basedMeId(int me_id) {
        Bean_dinarpal_nfc bdn = new Bean_dinarpal_nfc();
        try {
            
            RMIConnector rmic = new RMIConnector(DBConn.getHost(), DBConn.getPort_rmi());
            ArrayList<String> d = rmic.dn_getData_basedMeId(me_id);
            if (d.size() > 0) {
                bdn.setDn_id(d.get(0));
                bdn.setDn_datetime(d.get(1));
                bdn.setDn_nfccode(d.get(2));
                bdn.setMe_id(me_id);
                bdn.setDn_pin(d.get(4));
                bdn.setDn_lock(d.get(5));
                int dn_status = 1;
                try {
                    dn_status = Integer.parseInt(d.get(6));
                } catch (Exception e) {
                    dn_status = 1;
                }
                bdn.setDn_status(dn_status);
            }
            
        } catch (Exception e) {
            bdn = new Bean_dinarpal_nfc();
        }
        return bdn;
    }
    
    public ArrayList<String> getData_basedNfcCode(String dn_nfccode) {
        RMIConnector rmic = new RMIConnector(DBConn.getHost(), DBConn.getPort_rmi());
        ArrayList<String> bdn = rmic.dn_getData_basedNfcCode(dn_nfccode);
        return bdn;
    }
    
    public boolean isDelete_nfcCode(String nfccode) {
        boolean status = false;
        try {
            
            RMIConnector rmic = new RMIConnector(DBConn.getHost(), DBConn.getPort_rmi());
            status = rmic.dn_isDelete_nfcCode(nfccode);
            
        } catch (Exception e) {
            status = false;
        }
        return status;
    }
    
    public boolean isDelete_meId(int me_id) {
        boolean status = false;
        try {
            
            RMIConnector rmic = new RMIConnector(DBConn.getHost(), DBConn.getPort_rmi());
            status = rmic.dn_isDelete_meId(me_id);
            
        } catch (Exception e) {
            status = false;
        }
        return status;
    }
}
