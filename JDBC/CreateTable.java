import java.sql.*;
public class CreateTable{
	public static void main(String[] args) throws SQLException{
		//Step 1: Registering the Driver
		Driver d = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		System.out.println("Registration is Completed");
		
		//Step 2: Getting the Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adv_java","root","Varma");
		System.out.println("Connected to DataBase");
		
		//Step 3 : Creating Statement Object
		Statement st = con.createStatement();
		System.out.println("Statement Created");
		
		//Step 4:Executing the Query
		String sql = "create table employee1(eid int,ename varchar(20),esal int)";
		
		//Since it is a Non-Selected Query we use execute()
		st.execute(sql);
		System.out.println("SQL Query Executed Sucessfully");
		System.out.println("Table Created");
		
		//Step 5:Processing Result from ResultSet Since it is creation of a table not required to process anything

		//Step 6:Closing All Connections
		st.close();
		con.close();
		System.out.println("Closed The Connection");
		
		//If you compile the code without giving the classpath of your Driver then your compiler gives ClassNotFoundException 
	}
}
/*Errors:
1)   D:\JDBC>javac CreateTable.java
CreateTable.java:5: error: package com.mysql.cj.jdbc does not exist
                Driver d = new com.mysql.cj.jdbc.Driver();
                                                ^
CreateTable.java:11: error: cannot find symbol
                System.out.Println("Connected to DataBase");
                          ^
  symbol:   method Println(String)
  location: variable out of type PrintStream
CreateTable.java:18: error: cannot find symbol
                sql = "create table employee(eid int,ename varchar(20),esal int)";
                ^
  symbol:   variable sql
  location: class CreateTable
CreateTable.java:21: error: cannot find symbol
                st.execute(sql);
                           ^
  symbol:   variable sql
  location: class CreateTable
4 errors

SOLUTION: Give the classpath of your driver

2)D:\JDBC>javac CreateTable.java
CreateTable.java:5: error: unreported exception SQLException; must be caught or declared to be thrown
                Driver d = new com.mysql.cj.jdbc.Driver();
                           ^
CreateTable.java:6: error: unreported exception SQLException; must be caught or declared to be thrown
                DriverManager.registerDriver(d);
                                            ^
CreateTable.java:10: error: unreported exception SQLException; must be caught or declared to be thrown
                Connection con = DriverManager.getConnection("jdbc:mysql//localhost:3306/adv_java","root","Varma");
                                                            ^
CreateTable.java:14: error: unreported exception SQLException; must be caught or declared to be thrown
                Statement st = con.createStatement();
                                                  ^
CreateTable.java:21: error: unreported exception SQLException; must be caught or declared to be thrown
                st.execute(sql);
                          ^
CreateTable.java:28: error: unreported exception SQLException; must be caught or declared to be thrown
                st.close();
                        ^
CreateTable.java:29: error: unreported exception SQLException; must be caught or declared to be thrown
                con.close();
                         ^
7 errors
SOLUTION : catch the SQLException or throw it

3)D:\JDBC>java CreateTable
Registration is Completed
Exception in thread "main" java.sql.SQLException: No suitable driver found for jdbc:mysql//localhost:3306/adv_java
        at java.sql/java.sql.DriverManager.getConnection(DriverManager.java:702)
        at java.sql/java.sql.DriverManager.getConnection(DriverManager.java:228)
        at CreateTable.main(CreateTable.java:10)

*/

/*Output:
D:\JDBC>javac CreateTable.java

D:\JDBC>java CreateTable
Registration is Completed
Connected to DataBase
Statement Created
SQL Query Executed Sucessfully
Table Created
Closed The Connection
*/
