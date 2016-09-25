package mylife;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class befree71 {
//SQL Server
	public static void main(String[] args) {
	//  1.Load Driver(?)    載入驅動程式
			try {
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("Load OK");
			} catch (ClassNotFoundException e) {
				//Not Found Driver  驅動程式例外拋出
			
				System.out.println("Driver Not Found");
			}
	//  2.Create Connection  建立聯結
			try {
				Connection conn = DriverManager.getConnection(
						"jdbc:mysql://localhost/iii?" + //"jdbc:mysql://localhost/(庫名)?" + //"user=(root)&password=(root)"
                        "user=root&password=root");
				System.out.println("connection success");
			
			
	//	3.SQL => Statement Object  敘述元件
			Statement stmt = conn.createStatement();
			System.out.println("1");
	//  4.extect Statement 提取說明
			//新增
			stmt.executeUpdate("INSERT INTO cust(cname,tel,birthday)"+
					"VALUES('Brad','123','1991-01-02')");
			stmt.executeUpdate("INSERT INTO cust(cname,tel,birthday)"+
					"VALUES('jack','123','1999-02-01')");
			//查詢Query
			ResultSet rs = stmt.executeQuery("SELECT * FROM cust");
			while(rs.next()){
				String id = rs.getString("id");
				String cname = rs.getString("cname");
				String tel = rs.getString("tel");
				String birthday = rs.getString("birthday");
				
				System.out.println(id+":"+cname+":"+tel+":"+birthday);
			}
			conn.close();
			System.out.println("ok");
	} catch(SQLException e){
		System.out.println("SQL ERROR");
	}
	}
}
