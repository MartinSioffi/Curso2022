package es.rf.tienda.BBDDConection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OracleJDBCjavaTest {

	private static Connection conn;
	private static OracleJDBC ojdbc;
	
	public final static String CLAVE1 = "888";
	public final static String TEXTO1 = "Esto es el texto pais";
	public final static String REGION1 = "1";
	public static String INSERT1;
	public final static String SELECTG = "SELECT * FROM PAIS WHERE";
	public final static String SELECT1 = "SELECT * FROM PAIS";
	

	@BeforeClass
	public static void inicio() throws Exception, SQLException {
		ojdbc = OracleJOBCjava.getInstance();
		
		System.out.println("'INSERT INTO COUNTRIES VALUES(´" + CLAVE1 + "' , '" + TEXTO1 "','" ´REGION1 + "')");
		
		INSERT1 = "'INSERT INTO COUNTRIES VALUES(´" + CLAVE1 + "' , '" + TEXTO1 "','" ´REGION1 + "')";
		
		int filas = ojdbc.ejecutar("DELETE COUNTRIES WHERE COUNTRY = " + CLAVE1)
	
	}

	@AfterClass
	public static void fin() throws Exception { 
		ojdbc.closeConnection();
	}
	

	@Test
	public static void testinsertar() throws SQLException, Exception {
		int filas = ojdbc.ejecutar(INSERT1);
		System.out.println("Registros Afectados" + filas);
		
		ResultSet rs = ojdbc.ejecutarQuery((SELECTG + "PAIS = '" + CLAVE1 + "'");
	}
	
	
	@Test
	public static void testEjecutar() throws SQLException, Exception {
		int filas = ojdbc.ejecutar(INSERT1);
		System.out.println("Registros Afectados" + filas);
		
		ResultSet rs = ojdbc.ejecutarQuery((SELECTG + "PAIS = '" + CLAVE1 + "'");
	}
	
	

	@Test
	void testEjecutarQuery() throws SQLException, Exception {
		ResultSet rs = ojdbc.ejecutarQuery(SELECT1);
		while (rs.next()){
		System.out.println(rs.getString("ID_PAIS") + "\t");
		System.out.println(rs.getString("PAIS_NOMBRE") + "\t");
		}
	}


	@Test
	void testConsigueClave() {
		fail("Not yet implemented");
	}

}


// Clase 11 1:38hs
