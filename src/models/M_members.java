/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import main.RMIConnector;

/**
 *
 * @author umarmukhtar
 */
public class M_members {
    
    public ArrayList<String> getData(String me_username) {
        ArrayList<String> data = new ArrayList<String>();
        try {
            
            RMIConnector rmic = new RMIConnector(DBConn.getHost(), DBConn.getPort_rmi());
            data = rmic.me_getData(me_username);
            
        } catch (Exception e) {
            data = new ArrayList<String>();
            data.removeAll(data);
        }
        return data;
    }
}
