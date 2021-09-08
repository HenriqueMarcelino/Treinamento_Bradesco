package br.com.stefanini.twodatabases.database;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class Dao {
	
	public MongoClient client;
	
	public MongoClient getCliente() {
		client = new MongoClient();
		return client;	
	}
	
	public MongoDatabase getBd() throws Exception {
		return getCliente().getDatabase("bddois");
	}
	
	public void close() throws Exception{
		client.close();
	}
}
