

import java.io.Serializable;

public class Bok implements Serializable{
	
	private int bokId;
	private String bokTitle;
	private float bokPrice;
	private String bokGrade;
	


	public int getBokId() {
		return bokId;
	}
	public void setBokId(int bokId) {
		this.bokId = bokId;
	}
	public String getBokTitle() {
		return bokTitle;
	}
	public void setBokTitle(String bokTitle) {
		this.bokTitle = bokTitle;
	}
	public float getBokPrice() {
		return bokPrice;
	}
	public void setBokPrice(float bokPrice) {
		this.bokPrice = bokPrice;
	}
	public String getBokGrade() {
		return bokGrade;
	}
	public void setBokGrade(String bokGrade2) {
		this.bokGrade = bokGrade2;
	}
}






import com.ac.bean.Bok;
import com.ac.dao.BokDAO;

public class BokService {
	
	public int addBokService(int bokId,String bokTitle,float bokPrice) {
		
		String bokGrade="";
		if(bokPrice <= 100)
			bokGrade = "C";
		else if(bokPrice <= 350)
			bokGrade = "B";
		else
			bokGrade = "A";
		
		BokDAO bdao = new BokDAO();
		Bok b = new Bok();
		//wrapping all the four field values into bean
		b.setBokId(bokId);
		b.setBokTitle(bokTitle);
		b.setBokPrice(bokPrice);
		b.setBokGrade(bokGrade);
		
		int updateResult = 0;
		try {
			updateResult = bdao.addBok(b);
			return updateResult;
		} catch (Exception e) {
			System.out.println(e.toString());
			return 0;
		}
		
		
		
	}

}





import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.ac.bean.Bok;

public class BokDAO {
	
	public int addBok(Bok b) {
		Connection conn = null;
		PreparedStatement pst = null;
		try {
			conn=BokDB.getConnection();
			String i_str = "insert into bok value ";
			
			pst = conn.prepareStatement(i_str);
			pst.setInt(1, b.getBokId());
			pst.setString(2, b.getBokTitle());
			pst.setFloat(3, b.getBokPrice());
			pst.setString(4, b.getBokGrade());
			
			int updateCount = pst.executeUpdate();
			conn.close();
			return updateCount;
		}
		catch(Exception e) {
			
			System.out.println(e.toString());
			return 0;
		}
		
	}
	public ArrayList getBokDetailsById(int bokId) throws Exception{
		
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs =null;
		
		conn = BokDB.getConnection();
		
		String s_str = "Select bokTitle,bokPrice from bok where bokId=?";
		
		pst =conn.prepareStatement(s_str);
		pst.setInt(1, bokId);
		rs = pst.executeQuery();
		
		ArrayList r = new ArrayList();
		if(rs.next()) {
			r.add(rs.getString(1));
			r.add(rs.getString(2));
		}
		else
			r.add("Invalid id");
		return r;
		
		
	}
	
	

}




package com.ac.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class BokDB {

	public static Connection getConnection() throws Exception {
		
		String driverName = "org.postgresql.Driver";
		Class.forName(driverName);
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","test");
		return conn;
		
	}
	
}



import java.util.Scanner;

import com.ac.service.BokService;

public class BokUI {
	
	public static void main(String[] args) {
		
		int bokId=0;
		String bokTitle="";
		float bokPrice=0;
		//String bokGrade ="";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter bok Id: ");
		bokId = sc.nextInt();
		
		System.out.println("Enter bok name: ");
		bokTitle = sc.next();
		
		System.out.println("Enter bok Price: ");
		bokPrice = sc.nextFloat();
		
		BokService bs = new BokService();
		
		int updateCount = bs.addBokService(bokId, bokTitle, bokPrice);
		System.out.println("Inserted " + updateCount + " record sucessfully ");
		
	}

}


