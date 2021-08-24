package br.com.stefanini.mock.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao  implements IDao{
	
	Connection con;
	PreparedStatement stmt;
	PreparedStatement stmt1;
	ResultSet rs;

	public void open() throws Exception {
		Class.forName("com.msql.jdbc.Drive");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdMock", "root", "admin123");
	}

	public void close() throws Exception {
		con.close();
	}

}
