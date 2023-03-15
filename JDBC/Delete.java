import java.sql.*;
import java.util.*;
public class Delete{
	public static void main(String[] args) throws Exception{
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/adv_java";
		String user = "root";
		String pwd = "Varma";
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,user,pwd);
		Statement st = con.createStatement();
		
		//Scanner sin = new Scanner(System.in);
		//System.out.print("Enter Salary of the employee");
		//int esal = 
		
		String sql = "delete from employee1 where eid = 105";
		
		int delCount = st.executeUpdate(sql);
		System.out.println(delCount+ " rows deleted");
		con.close();
		
	}
}