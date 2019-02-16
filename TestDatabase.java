
import java.sql.*;
import java.util.*;  

public class TestDatabase{  
	public static void main(String args[]){  
		try{  
			
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Capgemini123");  
	        Statement stmt=con.createStatement();  
	        ResultSet rs=stmt.executeQuery("select * from employee1");  
	        System.out.println("BEFORE UPDATE");
	        System.out.println("_______________________________________________________________________");
	        while(rs.next())  
	        	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getDate(3)+ " "+rs.getInt(4)+ " "+rs.getString(5));  
	        System.out.println("_______________________________________________________________________");
	        
	        
	        
	        Scanner sc = new Scanner(System.in);
	        System.out.println("enter new name");
	        String s = sc.next();
	        System.out.println("enter id where you want to update");
	        int id = sc.nextInt();
	        System.out.println("AFTER UPDATE");
	        int i = stmt.executeUpdate("update employee1 set employee_name = '"+ s +"' where employee_code = '"+id+"'");
	        ResultSet rs1=stmt.executeQuery("select * from employee1");  
	        while(rs1.next())  
	        	System.out.println(rs1.getInt(1)+"  "+rs1.getString(2)+"  "+rs1.getDate(3)+ " "+rs1.getInt(4)+ " "+rs1.getString(5));  
	        System.out.println("_______________________________________________________________________");
	        System.out.println("updated rows are : " + i);
	        
	        
	        System.out.println("enter id");
	        int id1 = sc.nextInt();
	        System.out.println("enter name");
	        String name = sc.next();
	        System.out.println("enter date");
	        String date = sc.next();
	        System.out.println("enter salary");
	        int salary = sc.nextInt();
	        System.out.println("enter gender in ms or mr");
	        String gender = sc.next();
	        System.out.println(java.sql.Date.valueOf(date));
	        PreparedStatement stmt1 = con.prepareStatement("insert into employee1(employee_code,employee_name,employee_date,employee_salary,gender) values(?,?,?,?,?)");  
	        stmt1.setInt(1,id1);  
	        stmt1.setString(2,name);
	        stmt1.setDate(3,java.sql.Date.valueOf(date));
	        stmt1.setInt(4,salary);
	        stmt1.setString(5,gender);
	        stmt1.executeUpdate();
	        System.out.println("after inserting new row");
	        System.out.println("_______________________________________________________________________");
	        ResultSet rs2=stmt.executeQuery("select * from employee1"); 
	        while(rs2.next())  
	        	System.out.println(rs2.getInt(1)+"  "+rs2.getString(2)+"  "+rs2.getDate(3)+ " "+rs2.getInt(4)+ " "+rs2.getString(5));  
	        System.out.println("_______________________________________________________________________");
	        con.close();  
	        sc.close();
	  
		}
		catch(Exception e)
		{
			System.out.println(e);
		}  
  
	}  
}  