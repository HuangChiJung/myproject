package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class MyTester {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String url = "jdbc:mysql://j.snpy.org/java1?user=java1&password=jjaa989&characterEncoding=UTF-8&useUnicode=true";//j.snpy.org     java1  jjaa989     java1
			Connection conn = DriverManager.getConnection(url);
			Statement stmt =  conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from parking");
			
			while(rs.next()){
				String cid = rs.getString("car_id");
				Date date = rs.getDate("ctime");
				int type = rs.getInt("type");
				
				System.out.println(cid+"\t"+date+"\t"+type);
			}
			
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
