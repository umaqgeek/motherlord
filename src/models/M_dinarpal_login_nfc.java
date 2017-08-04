package models;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import libraries.My_func;
import main.RMIConnector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author umarmukhtar
 */
public class M_dinarpal_login_nfc {
    
    public boolean addData(Bean_dinarpal_login_nfc bean_dinarpal_login_nfc) {
        boolean status = false;
        try {
            
            ArrayList<String> d = new ArrayList<String>();
            d.add(bean_dinarpal_login_nfc.getDln_id());
            d.add(bean_dinarpal_login_nfc.getDln_user());
            d.add(bean_dinarpal_login_nfc.getDln_pass());
            d.add(bean_dinarpal_login_nfc.getDln_lock());
            d.add(bean_dinarpal_login_nfc.getDln_fullname());
            
            RMIConnector rmic = new RMIConnector(DBConn.getHost(), DBConn.getPort_rmi());
            status = rmic.addStaff(d);
            
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
            status = false;
        }
        return status;
    }
}
