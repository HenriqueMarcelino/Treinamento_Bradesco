package br.com.stefanini.projetobd.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao {

	Connection con;
	PreparedStatement stmt;
	PreparedStatement stmt1;
	ResultSet rs;

	// Abrindo o banco de dados

	public void open() throws Exception {
		Class.forName("com.msql.jdbc.Driver");

		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdUm", "root", "admin123");

	}

	// Fechando o banco de dados

	public void close() throws Exception {
		con.close();
	}
}
