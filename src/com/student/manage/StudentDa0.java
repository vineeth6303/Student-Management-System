package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDa0 {

	 public static boolean insertStudentToDB(Student st)
	 {
		 boolean f = false;
		 try {
			 //jdbc code
			 Connection con = Connection_provider.createC();
			 String q = "insert into students(sname,scity,sphone) values(?,?,?)";
			 //prepared statement
			 PreparedStatement pstmt = con.prepareStatement(q);
			 
			 //set the value of parameter
			 pstmt.setString(1,st.getStudentName());
			 pstmt.setString(2,st.getStudentpN());
			 pstmt.setString(3,st.getStudentCity());
			 
			 //execute
			 pstmt.executeUpdate();
			 f = true;
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		 return f;
	 }

	 public static boolean deleteStudent(int userId) {
		
		 boolean f = false;
		 try
		{
			 //jdbc code
			Connection con = Connection_provider.createC();
			String q = "delete from students where sid = ?";
					
			//prepared statement
			PreparedStatement pst = con.prepareStatement(q);
			
			//set the value of parameter
			pst.setInt(1, userId);
			
			//execute
			pst.execute();
			f= true;
		}
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		return f;
		
	 }

	 public static void showAllStudents() {
		 try
		{
			 //jdbc code
			Connection con = Connection_provider.createC();
			String q = "select * from students";
					
			Statement st = con.createStatement();
			
			ResultSet set = st.executeQuery(q);
			
			while(set.next())
			{
				int id = set.getInt(1);
				String name = set.getString(2);
				String phone = set.getString(4);
				String city = set.getString(3);
				
				System.out.println("ID : "+id);
				System.out.println("Name : "+name);
				System.out.println("City : "+city);
				System.out.println("Phone : "+phone);
				
				System.out.println("++++++++++++++++++++++++++++++");
			}
			
		}
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		
	 }
}
