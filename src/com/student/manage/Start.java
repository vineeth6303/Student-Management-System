package com.student.manage;

import java.io.*;

public class Start {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Student Management App");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("Press 1 to ADD Student");
			System.out.println("Press 2 to DELETE Student");
			System.out.println("Press 3 to DISPLAY Student");
			System.out.println("Press 4 to Exit");
			
			int c = Integer.parseInt(br.readLine());
			
			if(c ==1)
			{
				//add student
				System.out.println("Enter user name : ");
				String name = br.readLine();
				
				System.out.println("Enter user phone : ");
				String phone = br.readLine();
				
				System.out.println("Enter user city : ");
				String city = br.readLine();
				
				//create student object to store student
				
				Student st = new Student(name,phone,city);
				boolean answer = StudentDa0.insertStudentToDB(st);
				if(answer)
				{
					System.out.println("Student data is added successfully...");
				}
				else
				{
					System.out.println("Something went wrong!");
				}
				System.out.println(st);
			}
			else if(c==2)
			{
				//delete student
				
				System.out.println("Enter student id to delete: ");
				int userId = Integer.parseInt(br.readLine());
				boolean answer = StudentDa0.deleteStudent(userId);
				if(answer)
				{
					System.out.println("Student data is deleted successfully...");
				}
				else
				{
					System.out.println("Something went wrong!");
				}
			}
			else if(c==3)
			{
				//display students
				
				StudentDa0.showAllStudents();
			}
			else if (c==4)
			{
				break;
			}
			
		}
		System.out.println("Thanks for using the app!");
	}
}
