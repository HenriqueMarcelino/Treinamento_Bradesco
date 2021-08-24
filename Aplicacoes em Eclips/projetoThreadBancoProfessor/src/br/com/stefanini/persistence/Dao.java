package br.com.stefanini.persistence;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao {
		 Connection con;
		 PreparedStatement stmt;
		 ResultSet rs;
		 CallableStatement call;
		 
		  public void open() throws Exception{
			  Class.forName("com.mysql.jdbc.Driver");
			  con = DriverManager.
		 getConnection("jdbc:mysql://localhost:3306/bdprojeto","root","arq2020");
		  }
		  
		  
		  public void close() throws Exception{
			  con.close();
		  }
 }

 