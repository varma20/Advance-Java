import java.sql.*;
public class Average{
	public static void main(String[] args) throws Exception{
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/adv_java";
		String user = "root";
		String pwd = "Varma";
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,user,pwd);
		Statement st = con.createStatement();
		
		String sql = "select avg(esal) from employee1";
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()){
			System.out.println(rs.getInt(1));
		}
	}
}