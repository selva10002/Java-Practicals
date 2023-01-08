package project;

import java.io.*;
import java.util.*;
import java.sql.*;
public class Faculty
{
	
	Scanner sc=new Scanner(System.in);
	
	// login page method
	public void logInDemo() throws ClassNotFoundException, SQLException, IOException
	{
		
		InputStreamReader is=new InputStreamReader(System.in);
		
		BufferedReader br= new BufferedReader(is);
		
		int i=1;
		while(i>0)
		{
			System.out.println();
			
			System.out.println("************LOGIN PAGE***********");
		String uname="admin";
		String pword="12345";
		
		System.out.println("Enter UserName");
		String un=br.readLine();
		
		
		if(uname.equals(un))
		{
			while(true)
			{
				System.out.println("Enter PassWord");
				String pd=br.readLine();
			
				if(pword.equals(pd))
				{
					System.out.println("logIn sucessfully");
					options();
					
				}
				else
				{
					System.out.println("Invalide Password");
					System.out.println();
					System.out.println("****Enter Again****");
					System.out.println();
				}
			}
			
		}
		
		else
		{
			System.out.println("Invalide UserName");
			System.out.println();
			System.out.println("****Enter Again****");
			System.out.println();
		}
	 }
		
}
		
	//menu method
	public void options() throws ClassNotFoundException, SQLException, IOException
	{
		int d=0;
		while(d==0)
		{
			System.out.println();
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql:///project", "root", "12345");
		
		System.out.println("*******************  MENUS   *******************");
		System.out.println();
		System.out.println(" 1. View Staff Profile");
		System.out.println(" 2. Display Stafe List");
		System.out.println(" 3. Edit");
		System.out.println(" 4. Exit");
		System.out.println();
		System.out.println("***ENTER YOUR CHOISE***");
		int i=sc.nextInt();
		switch(i)
		{
		case 1:
			System.out.println("Enter Stafe ID");
			int id=sc.nextInt();
			
			String query="select*from teacher where id = ?";
			
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, id);
			
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
				{
				System.out.println("********Stafe_Profile*********");
				System.out.println();
				 System.out.println("Stafe ID 	: "+rs.getInt("id"));
				 System.out.println("FirstName 	: "+rs.getString("fname"));
				 System.out.println("LastName 	: "+rs.getString("lname"));
				 System.out.println("Date Of Birth 	: "+rs.getString("dob"));
				 System.out.println("Gender 		: "+rs.getString("gender"));
				 System.out.println("Education 	: "+rs.getString("edu"));
				 System.out.println("Location 	: "+rs.getString("location"));
				}
			
			break;
			
		case 2:
			String query1="select*from teacher";
			Statement st1=con.createStatement();
			ResultSet rs1=st1.executeQuery(query1);
			
			System.out.println("********All Stafe List*******");
			System.out.println();
			while(rs1.next())
			{
				 System.out.println("Stafe ID 	: "+rs1.getInt("id"));
				 System.out.println("FirstName 	: "+rs1.getString("fname"));
				 System.out.println("LastName 	: "+rs1.getString("lname"));
				 System.out.println("Date Of Birth 	: "+rs1.getString("dob"));
				 System.out.println("Gender 		: "+rs1.getString("gender"));
				 System.out.println("Education 	: "+rs1.getString("edu"));
				 System.out.println("Location 	: "+rs1.getString("location"));
				 System.out.println();
			}
			
			break;
			
		case 3:
			
			editStudentData();

				break;
						
		case 4:
			System.out.println("----*****_-----*****------*******---__-******---");
			System.out.println("____THANKS FOR VISITING OUR APPLICATION___");
			System.out.println("----*****_-----*****------*******---__-******---");
		
			
			logInDemo();
			
			break;
			
			
		}
	
	}
		
}
	
	//edit method
	public void editStudentData() throws ClassNotFoundException, SQLException, IOException
	{
		
		
		while(true)
		{
			System.out.println();
			System.out.println("******** EDIT_OPTION ********");	
			System.out.println("1. Add ");
			System.out.println("2. Update");
			System.out.println("3. Delete");
			System.out.println("4. Back");
			System.out.println();
			System.out.println("***ENTER YOUR CHOISE***");
		
			int z=sc.nextInt();
			
			switch(z)
			{
			case 1:
				insertSudentData();
				break;
			case 2:
				updateStudentData();
				break;
			case 3:
				deleteStudentData();
				break;
			
			case 4:
				options();
				break;
				
			}
		}
		
		
	}
	
	//add information method
	public void insertSudentData() throws ClassNotFoundException, SQLException
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql:///project", "root", "12345");
		
		String query="insert into teacher values(?,?,?,?,?,?,?) ";
		String query1="select * from teacher where id=?";
		
		PreparedStatement ps=con.prepareStatement(query);
		PreparedStatement ps1=con.prepareStatement(query1);
		
		System.out.println("**************ADD STAFE DETAILS***************");
		System.out.println("Enter ID ");
		int id=sc.nextInt();
		ps.setInt(1, id);
		sc.nextLine();
		ps1.setInt(1, id);
		System.out.println("Enter FRIST_NAME");
		String fname=sc.nextLine();
		ps.setString(2, fname);
		
		System.out.println("Enter LAST_NAME");
		String lname=sc.nextLine();
		ps.setString(3, lname);
		
		System.out.println("Enter DATE_OF_BIRTH");
		String dob=sc.nextLine();
		ps.setString(4,dob);
		
		System.out.println("Enter GENDER");
		String gender=sc.nextLine();
		ps.setString(5, gender);
		
		System.out.println("Enter EDUCATION");
		String edu=sc.nextLine();
		ps.setString(6, edu);
		
		System.out.println("Enter LOCATION");
		String loca=sc.nextLine();
		ps.setString(7, loca);
		
		ps.executeUpdate();
		
		ResultSet rs=ps1.executeQuery();
		while(rs.next())
		{
			System.out.println();
			 System.out.println("ID 		: "+rs.getInt("id"));
			 System.out.println("FirstName 	: "+rs.getString("fname"));
			 System.out.println("LastName 	: "+rs.getString("lname"));
			 System.out.println("Date Of Birth 	: "+rs.getString("dob"));
			 System.out.println("Gender 		: "+rs.getString("gender"));
			 System.out.println("Education 	: "+rs.getString("edu"));
			 System.out.println("Location 	: "+rs.getString("location"));
			 
			 System.out.println();
			 System.out.println("DATA ADDED SUCCESSFULY..");
			
		}
		
		
	}
	
	//update method
	public void updateStudentData() throws ClassNotFoundException, SQLException, IOException
	{
		
		while(true)
		{
			System.out.println();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql:///project","root","12345");
		
		System.out.println("***************UPDATE STAFE INFORMATIONS*************");
		System.out.println(" 1. FirstName");
		System.out.println(" 2. LastName");
		System.out.println(" 3. DOB");
		System.out.println(" 4. Gender");
		System.out.println(" 5. Education");
		System.out.println(" 6. Location");
		System.out.println(" 7. Back");
		System.out.println();
		
		System.out.println("********ENTER YOUR CHOISE********");
		int i=sc.nextInt();
		switch(i)
		{
		case 1:
			String query="update teacher set fname=? where id=?";
			String q="select * from teacher where id=?";
			PreparedStatement ps=con.prepareStatement(query);
			PreparedStatement p=con.prepareStatement(q);
		
			System.out.println("Enter new FirstName\n");
			sc.nextLine();
			String fname=sc.nextLine();
			
//			System.out.println();
			System.out.println("Enter your ID");
			
			int id=sc.nextInt();
		
			ps.setString(1, fname);
			ps.setInt(2, id);
			
			ps.executeUpdate();
			
			p.setInt(1, id);
			
			

			ResultSet rs=p.executeQuery();
			
			while(rs.next())
				{
				 System.out.println();
				 System.out.println("ID		: "+rs.getInt("id"));
				 System.out.println("FirstName  	: "+rs.getString("fname"));
				 System.out.println("LastName 	: "+rs.getString("lname"));
				 System.out.println("Date Of Birth 	: "+rs.getString("dob"));
				 System.out.println("Gender 		: "+rs.getString("gender"));
				 System.out.println("Education 	: "+rs.getString("edu"));
				 System.out.println("Location 	: "+rs.getString("location"));
				 System.out.println();
				 System.out.println("*************Successfully Updated**************");
				}
			break;
			
		case 2:
			String query1="update teacher set lname=? where id=?";
			String q1="select * from teacher where id=?";
			PreparedStatement ps1=con.prepareStatement(query1);
			PreparedStatement p1=con.prepareStatement(q1);
			System.out.println("Enter new LastName");
			sc.nextLine();
			String lname=sc.nextLine();
			
			System.out.println("Enter your ID");
			int id1=sc.nextInt();
			
			ps1.setString(1, lname);
			ps1.setInt(2, id1);
			p1.setInt(1, id1);
			ps1.executeUpdate();
			

			ResultSet rs1=p1.executeQuery();
			
			while(rs1.next())
				{
				System.out.println();
				 System.out.println("ID 		: "+rs1.getInt("id"));
				 System.out.println("FirstName	: "+rs1.getString("fname"));
				 System.out.println("LastName 	: "+rs1.getString("lname"));
				 System.out.println("Date Of Birth   : "+rs1.getString("dob"));
				 System.out.println("Gender 		: "+rs1.getString("gender"));
				 System.out.println("Education 	: "+rs1.getString("edu"));
				 System.out.println("Location	: "+rs1.getString("location"));
				 System.out.println();
				 System.out.println("*************Successfully Updated**************");
				}
			
			break;
			
		case 3:
			String query2="update teacher set dob=? where id=?";
			String q2="select * from teacher where id=?";
			PreparedStatement ps2=con.prepareStatement(query2);
			PreparedStatement p2=con.prepareStatement(q2);
			System.out.println("Enter new DOB");
			sc.nextLine();
			String dob =sc.nextLine();
			System.out.println("Enter your ID");
			int id2=sc.nextInt();
			
			ps2.setString(1, dob);
			ps2.setInt(2, id2);
			p2.setInt(1, id2);
			
			ps2.executeUpdate();
			

			ResultSet rs2=p2.executeQuery();
			
			while(rs2.next())
				{
				System.out.println();
				 System.out.println("ID   		: "+rs2.getInt("id"));
				 System.out.println("FirstName 	: "+rs2.getString("fname"));
				 System.out.println("LastName	: "+rs2.getString("lname"));
				 System.out.println("Date Of Birth 	: "+rs2.getString("dob"));
				 System.out.println("Gender 		: "+rs2.getString("gender"));
				 System.out.println("Education	: "+rs2.getString("edu"));
				 System.out.println("Location 	: "+rs2.getString("location"));
				 System.out.println();
				 System.out.println("*************Successfully Updated**************");
				}
			
			break;
		case 4:
			String query3="update teacher set gender=? where id=?";
			String q3="select * from teacher where id=?";
			PreparedStatement ps3=con.prepareStatement(query3);
			PreparedStatement p3=con.prepareStatement(q3);
			System.out.println("Enter gender");
			sc.nextLine();
			String gender=sc.nextLine();
			
			System.out.println("Enter your ID");
			int id3=sc.nextInt();
			
			ps3.setString(1, gender);
			ps3.setInt(2, id3);
			p3.setInt(1, id3);
			
			ps3.executeUpdate();
			

			ResultSet rs3=p3.executeQuery();
			
			while(rs3.next())
				{
				System.out.println();
				 System.out.println("ID 		: "+rs3.getInt("id"));
				 System.out.println("FirstName 	: "+rs3.getString("fname"));
				 System.out.println("LastName 	: "+rs3.getString("lname"));
				 System.out.println("Date Of Birth 	: "+rs3.getString("dob"));
				 System.out.println("Gender 		: "+rs3.getString("gender"));
				 System.out.println("Education 	: "+rs3.getString("edu"));
				 System.out.println("Location 	: "+rs3.getString("location"));
				 System.out.println();
				 System.out.println("*************Successfully Updated**************");
				}
			
			break;
			
		case 5:
			String query4="update teacher set edu=? where id=?";
			String q4="select * from teacher where id=?";
			PreparedStatement ps4=con.prepareStatement(query4);
			PreparedStatement p4=con.prepareStatement(q4);
			System.out.println("Enter new Education");
			sc.nextLine();
			String edu=sc.nextLine();
			
			System.out.println("Enter your ID");
			int id4=sc.nextInt();
			ps4.setString(1, edu);
			ps4.setInt(2, id4);
			p4.setInt(1, id4);
			ps4.executeUpdate();
			

			ResultSet rs4=p4.executeQuery();
			
			while(rs4.next())
				{
				System.out.println();
				 System.out.println("ID 		: "+rs4.getInt("id"));
				 System.out.println("FirstName	: "+rs4.getString("fname"));
				 System.out.println("LastName 	: "+rs4.getString("lname"));
				 System.out.println("Date Of Birth 	: "+rs4.getString("dob"));
				 System.out.println("Gender 		: "+rs4.getString("gender"));
				 System.out.println("Education 	: "+rs4.getString("edu"));
				 System.out.println("Location 	: "+rs4.getString("location"));
				 System.out.println();
				 System.out.println("*************Successfully Updated**************");
				}
			
			break;
			
		case 6:
			String query6="update teacher set location=? where id=?";
			String q6="select * from teacher where id=?";
			PreparedStatement ps6=con.prepareStatement(query6);
			PreparedStatement p6=con.prepareStatement(q6);
			System.out.println("Enter new location");
			sc.nextLine();
			String loc=sc.nextLine();
					
			System.out.println("Enter your ID");
			int id6=sc.nextInt();
			
			ps6.setString(1, loc);
			ps6.setInt(2, id6);
			p6.setInt(1, id6);
			
			ps6.executeUpdate();
			

			ResultSet rs6=p6.executeQuery();
			
			while(rs6.next())
				{
				
				 System.out.println("ID 		: "+rs6.getInt("id"));
				 System.out.println("FirstName 	: "+rs6.getString("fname"));
				 System.out.println("LastName 	: "+rs6.getString("lname"));
				 System.out.println("Date Of Birth 	: "+rs6.getString("dob"));
				 System.out.println("Gender 		: "+rs6.getString("gender"));
				 System.out.println("Education 	: "+rs6.getString("edu"));
				 System.out.println("Location 	: "+rs6.getString("location"));
				 System.out.println();
				 System.out.println("*************Successfully Updated**************");
				}
			
			break;
			
		case 7:
			 
			editStudentData();
			
			break;
			
		
		}
	}
		
}
		
	
	public void deleteStudentData() throws ClassNotFoundException, SQLException
	{
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql:///project","root","12345");
		    
		    System.out.println();
		    System.out.println("**************DELETE STAFE INFORMATION************");
			String query="delete from teacher  where id=?";
			String q1="select*from teacher where id=?";
			PreparedStatement ps=con.prepareStatement(query);
			PreparedStatement p1=con.prepareStatement(q1);
			System.out.println("Enter your ID");
			int id=sc.nextInt();
			
			ps.setInt(1, id);
			p1.setInt(1, id);
			
			ResultSet rs=p1.executeQuery();
			
			while(rs.next())
				{
				 System.out.println();
				 System.out.println("ID 		: "+rs.getInt("id"));
				 System.out.println("FirstName 	: "+rs.getString("fname"));
				 System.out.println("LastName 	: "+rs.getString("lname"));
				 System.out.println("Date Of Birth 	: "+rs.getString("dob"));
				 System.out.println("Gender 		: "+rs.getString("gender"));
				 System.out.println("Education 	: "+rs.getString("edu"));
				 System.out.println("Location 	: "+rs.getString("location"));
				}
			ps.executeUpdate();
			System.out.println();
			System.out.println("****Before Stafe Information Deleted Successfully****");
		
			System.out.println();
		
	}

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException
	
	{
		
		Faculty obj=new Faculty();
		obj. logInDemo();
		
	}

}
