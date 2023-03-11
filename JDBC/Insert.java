import java.sql.*;
public class Insert{
	public static void main(String[] args) throws Exception{
		String driver = "com.mysql.cj.jdbc.Driver";
		String jdbc_url = "jdbc:mysql://localhost:3306/adv_java";
		String username = "root";
		String password = "Varma";
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(jdbc_url,username,password);
		Statement st = con.createStatement();
		
		String sql = "insert into employee1 values(101,'Guna',10000)";
		
		//Use executeUpdate() because it is a Non-Select Query
		int rowCount = st.executeUpdate(sql);
		System.out.println(rowCount + "rows inserted");
		
		st.close();
		con.close();
	}
}
/*
ERRORS:

1)D:\JDBC>javac Insert.java
Insert.java:9: error: unreported exception ClassNotFoundException; must be caught or declared to be thrown
                Class.forName(driver);
                             ^
Insert.java:10: error: unreported exception SQLException; must be caught or declared to be thrown
                Connection con = DriverManager.getConnection(jdbc_url,username,password);
                                                            ^
Insert.java:11: error: unreported exception SQLException; must be caught or declared to be thrown
                Statement st = con.createStatement();
                                                  ^
Insert.java:16: error: unreported exception SQLException; must be caught or declared to be thrown
                int rowCount = st.executeUpdate(sql);
                                               ^
Insert.java:19: error: unreported exception SQLException; must be caught or declared to be thrown
                st.close();
                        ^
Insert.java:20: error: unreported exception SQLException; must be caught or declared to be thrown
                con.close();
                         ^
6 errors


SoLUTION :::1)throw or catch ClassNotFoundException
2)throw or catch SQLException*/