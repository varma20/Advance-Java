import java.sql.*;
import java.util.*;
public class MultipleUpdate{
	public static void main(String[] args) throws Exception{
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/adv_java";
		String user = "root";
		String pwd = "Varma";
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,user,pwd);
		Statement st = con.createStatement();
		Scanner sin = new Scanner(System.in);
		System.out.print("Enter Bonus salary for employees ::");
		int bonus = sin.nextInt();
		System.out.print("Enter Salary Range ::");
		int range = sin.nextInt();
		String sql = "update employee1 set esal = esal + '" + bonus + "'where esal < " + range;
		int countUpdate = st.executeUpdate(sql);
		System.out.println(countUpdate + "rows upddated");
		con.close();
	}
}