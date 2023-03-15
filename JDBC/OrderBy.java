import java.sql.*;
public class OrderBy{
	public static void main(String[] args) throws Exception{
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/adv_java";
		String user = "root";
		String pwd = "Varma";
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,user,pwd);
		Statement st = con.createStatement();
		
		String sql = "Select * from employee1 order by eid desc";
		boolean flag = false;
		ResultSet rs = st.executeQuery(sql);
		System.out.println("eid \t ename \t esal\t");
		System.out.println("-----------------------------------------------------");
		while(rs.next()){
			flag = true;
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3) + "\t");
		}
		if(flag == false){
			System.out.println("No Records Found");
		}
	}
}