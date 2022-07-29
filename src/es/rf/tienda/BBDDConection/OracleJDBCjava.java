package es.rf.tienda.BBDDConection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleJDBCjava {
	private static OracleJDBCjava instancia = null;
	private static Connection conn;
	
	private static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private final static String URL = "jdbc:oracle:thin@:localhost:1521:xe";
	private final static String DATABASE = "";
	private final static String USUARIO = "hr";
	private final static String PASSWORD = "hr";
	
	private static void main (String[] argv) throws Exception {
		conn = null;
		OracleJDBCjava ojdbc = OracleJDBCjava.getInstance();
		
		try { ojdbc.ejecutarQuery("SELECT * FROM PAIS");
		
		} catch (SQLException e) {
			System.out.println("ha fallado la conexion, compruebe la consola");
			e.printStackTrace();}
		}
	
	private OracleJDBCjava() {
		conexion();
	}
	
	private static OracleJDBCjava getInstance() {
		if (instancia == null) {
			instancia = new OracleJDBCjava();
		}
		return instancia;
	}
	
	private void conexion( ) {
		System.out.println("------------ Prueba de conexion a BBDD ------");
		try {
			Class.forName(JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println("No falta la inclusion del driver de oracle?");
			e.printStackTrace();
		}
		
		System.out.println("Oracle JDBC Driver Registererd!");
		
		try {
			conn = DriverManager.getConnection(URL + DATABASE, USUARIO, PASSWORD);
		}  catch (SQLException e) {
			System.out.println("ha fallado la conexion, compruebe la consola");
			e.printStackTrace();
			return;
		}
		
		if (conn != null) {
			System.out.println("Hecho, ya tiene acceso al gestor de la BBDD");
		} else {
			System.out.println("error al hacer la conexion");
			} 
	}

	public void closeConnection() throws Exception {
		try {
			if (conn != null && !conn.isClosed()) {
				conn.close();
			}
		} catch (Exception e) {
			System.out.println("ha fallado el close de la conexion, compruebe la consola");
			throw new Exception("Error al cerrar la conexión de BD");
			} finally {
				conn = null;
			}
	}
	
	public void commit() throws Exception {
		try {
			if(conn !=null) {
				conn.commit();
			} 
		} catch (SQLException e) {
				e.printStackTrace();
				throw new Exception("Error al realizar commit");
			}
	}

	public void rollback() throws Exception {
		try {
			if(conn !=null) {
				conn.rollback();
			} 
		} catch (SQLException e) {
				e.printStackTrace();
				throw new Exception("Error al realizar rollback");
			}
	}

	public void closeStatement(PreparedStatement ps) throws Exception {
		try {
			if(ps !=null) {
				ps.close();
			} 
		} catch (SQLException e) {
				e.printStackTrace();
				throw new Exception("No se ha podido realizar operación close sobre el elemento Statement");
			}
	}

	public void closeStatement(Statement ps) throws Exception {
		try {
			if(ps !=null) {
				ps.close();
			} 
		} catch (SQLException e) {
				e.printStackTrace();
				throw new Exception("No se ha podido realizar operación close sobre el elemento Statement");
			}
	}
	
	public void closeResult(ResultSet rs) throws Exception {
		try {
			if(rs !=null) {
				rs.close();
			} 
		} catch (SQLException e) {
				e.printStackTrace();
				throw new Exception("No se ha podido realizar operación close sobre el elemento ResultSet");
			}
	}	
	
	public int ejecutar(String sql) throws Exception {
		System.out.println("ejecutar: " + sql);
		Statement stm = null;
		int retorno;
		try {
			stm = conn.createStatement();
			retorno = stm.executeUpdate(sql);
		}	catch (SQLException e) {
			e.printStackTrace();
			throw (new Exception("error en: " + sql));
		} finally {
			closeStatement(stm);
		}
		return retorno;
	}
	
	public ResultSet ejecutarQuery(String sql) throws Exception {
		System.out.println("ejecutar: " + sql);
		Statement stm = null;
		ResultSet retorno;
		try {
			stm = conn.createStatement();
			retorno = stm.executeQuery(sql);
		}	catch (SQLException e) {
			e.printStackTrace();
			throw (new Exception("error en: " + sql));
		} finally {
			//closeStatement(stm);
		}
		return retorno;
	}	
	
	public int consigueClave(String tabla, String campo) throws Exception {
		System.out.println("consigue clave tabl: " + tabla + "campo: " + campo);
		String sql = "SELECT MAX(" + campo + ") FROM " + tabla;
		ResultSet rs = ejecutarQuery(sql);
		try { 
			if /* rs.first() */ (rs.next())
				System.out.println("tiene datos");
			else 
				return 1;
			//rs.next();
			return rs.getInt(0) + 1;
		}	catch (SQLException e) {
			e.printStackTrace();
			throw (new Exception("error en buscando PK: " + sql));
		}
	}
	
	
}


