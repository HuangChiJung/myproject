package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Date;

import com.parking.Car;
import com.parking.ParkingLot;

public class MyTester {

	public static void main(String[] args) {
		try {
			ParkingLot lot = new ParkingLot();
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String url = "jdbc:mysql://j.snpy.org/java1?user=java1&password=jjaa989&characterEncoding=UTF-8&useUnicode=true";//j.snpy.org     java1  jjaa989     java1
			Connection conn = DriverManager.getConnection(url);
			insert(conn,"Man-999",1);
			query(lot, conn);

			
//			Statement stmt = conn.createStatement();
//			String carId = "AABBddd";
//			String sql = "insert into parking2(car_id, ctime, type) values ("
//					+" '"+ carId+"','2016-01-06',0)";
//			boolean rult = stmt.execute(sql);
			
			
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void insert(Connection conn, String id,int flag) throws SQLException {
		 
		PreparedStatement pstmt =
				conn.prepareStatement("insert into parking2(car_id, ctime, type) values (?,?,?)");
		
		pstmt.setString(1, id);
		pstmt.setTimestamp(2, new Timestamp(new Date().getTime()));
		pstmt.setInt(3, flag);
		
		pstmt.execute();
	}

	private static void query(ParkingLot lot, Connection conn) throws SQLException {
		Statement stmt =  conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from parking2");
		
		while(rs.next()){
			String cid = rs.getString("car_id");
			Timestamp ts = rs.getTimestamp("ctime");
			Date date = new Date(ts.getTime());
			//Date date = rs.getDate("ctime");
			int type = rs.getInt("type");
			
			System.out.println(cid+"\t"+date+"\t"+type);
//			Car c = new Car(cid, date);
//			if(type==0){
//				
//				lot.add(c);
//			}else{
// 
//				int fee = lot.remove(c);
//			}
				
		}
	}

}
