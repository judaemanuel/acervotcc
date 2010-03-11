package br.com.acervotcc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private static String DRIVER = "org.postgresql.Driver";
	private static String URL = "jdbc:postgresql://localhost:5432/AcervoTCC";
	private static String USER = "acervotcc";
	private static String PASSWD = "acervotcc";

	public static Connection getConnection() throws SQLException {
		try {
			Class.forName(DRIVER);
			System.out.println("conectado");
			return DriverManager.getConnection(URL, USER, PASSWD);
		} catch (ClassNotFoundException e) {
			throw new SQLException(e.getMessage());
		}

	}

}
