import java.sql.*;
public class Update{
	public static void main(String[] args) throws Exception{
		
		String driver = "com.mysql.cj.jdbc.Driver";
		Class.forName(driver);
		
		String url = "jdbc:mysql://localhost:3306/adv_java";
		String user = "root";
		String pwd = "Varma";
		
		Connection con = DriverManager.getConnection(url,user,pwd);
		Statement st = con.createStatement();
		String sql = "update employee1 set ename='Umesh' where eid = 105";
		int count = st.executeUpdate(sql);
		System.out.println(count + " row updated");
	}
}