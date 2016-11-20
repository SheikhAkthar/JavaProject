package com.bit.SharedPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.testng.annotations.Test;

public class SharedJDBC {
	@SuppressWarnings({ "rawtypes", "unused", "unchecked" })
	@Test
	public void myMethod(){
		Connection connect = null;
		Statement state = null;
		ResultSet result = null;
		String url = null;
		String user = null;
		String pass = null;
		try{
			connect = DriverManager.getConnection(url,user,pass);
			state = connect.createStatement();
			result = state.executeQuery(null);
			HashMap <String,Object> hm = new HashMap();
			hm.put(null, user);
			hm.put(null, pass);
			for(Map.Entry value : hm.entrySet()){
				
						System.out.println(result.getString(0));
			}
			if(result.next()){
				System.out.println(result.getString(0));	
				}	
		}catch (SQLException ex) {
			 
            Logger lgr = Logger.getLogger(SharedJDBC.class.getName());

            lgr.log(Level.SEVERE, ex.getMessage(), ex);

        }finally {

            try {

                if (result != null) 

                	result.close(); 

                if (state != null) 

                    state.close();

                if (connect != null) 

                    connect.close();

                

            } catch (SQLException ex) {

                Logger lgr = Logger.getLogger(SharedJDBC.class.getName());

                lgr.log(Level.WARNING, ex.getMessage(), ex);

            }

        }

    }
	

	

}
