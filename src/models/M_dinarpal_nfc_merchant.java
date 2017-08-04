/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import main.RMIConnector;

/**
 *
 * @author umarmukhtar
 */
public class M_dinarpal_nfc_merchant {
    
    public boolean addData(Bean_dinarpal_nfc_merchant bnm) {
        boolean status = false;
        try {
            
            ArrayList<String> d = new ArrayList<String>();
            d.add(bnm.getDnm_id());
            d.add(bnm.getMe_id()+"");
            d.add(bnm.getDnm_user());
            d.add(bnm.getDnm_pass());
            d.add(bnm.getDnm_lock());
            
            RMIConnector rmic = new RMIConnector(DBConn.getHost(), DBConn.getPort_rmi());
            status = rmic.addMerchant(d);
            
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
            status = false;
        }
        return status;
    }
}
