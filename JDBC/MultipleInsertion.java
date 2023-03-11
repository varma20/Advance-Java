import java.sql.*;
import java.util.*;
public class MultipleInsertion{
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String jdbc_url = "jdbc:mysql://localhost:3306/adv_java";
		String user = "root";
		String pass = "Varma";
		
		Connection con = DriverManager.getConnection(jdbc_url,user,pass);
		
		Statement st = con.createStatement();
		Scanner sin = new Scanner(System.in);
		while(true){
			System.out.print("Enter Employee id::");
			int eid = sin.nextInt();
			System.out.print("Enter Employee Name::");
			String ename = sin.next();
			System.out.print("Enter Employee Salary::");
			int esal = sin.nextInt();
			
			String sql = "insert into employee1 values("+ eid +",'" + ename + "','" + esal + "')";
			int rowCount = st.executeUpdate(sql);
			System.out.println(rowCount+"row inserted");
			
			System.out.println("If you want to insert another row press Yes else No");
			String option = sin.next();
			
			if(option.equals("No")){
				break;
			}
		
			
		}
		con.close();
	}
}