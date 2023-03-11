import java.sql.*;
public class DropTable{
	public static void main(String[] args) throws SQLException{
		
		Driver d = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adv_java","root","Varma");
		
		Statement st = con.createStatement();
		String sql = "drop table student";
		
		st.execute(sql);
		System.out.println("Table Dropped");
		
		st.close();
		con.close();
	}
}
/*
ERRORS  :::

1)D:\JDBC>javac DropTable.java
DropTable.java:5: error: package com.mysql.cj.jdbc does not exist
                Driver d = new com.mysql.cj.jdbc.Driver();
                                                ^
DropTable.java:6: error: cannot find symbol
                DriiverManager.registerDriver(d);
                ^
  symbol:   variable DriiverManager
  location: class DropTable
DropTable.java:8: error: cannot find symbol
                Coonnection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adv_java","root","Varma");
                ^
  symbol:   class Coonnection
  location: class DropTable
DropTable.java:11: error: cannot find symbol
                sql = "drop table student";
                ^
  symbol:   variable sql
  location: class DropTable
DropTable.java:13: error: cannot find symbol
                st.execute(sql);
                           ^
  symbol:   variable sql
  location: class DropTable
5 errors

SOLUTION ::: give driver classpath




*/