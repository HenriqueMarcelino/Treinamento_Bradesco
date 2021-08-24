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
			  
			  //com.mysql.cj.jdbc.Driver classe nova do mysql
			  //com.mysql.jdbc.Driver  classe antiga do mysql
			  
			  Class.forName("com.mysql.cj.jdbc.Driver");
			  con = DriverManager.
		 getConnection("jdbc:mysql://localhost:3306/dbprojeto","root","admin123");
		  }
		  
		  
		  public void close() throws Exception{
			  con.close();
		  }
 }

 