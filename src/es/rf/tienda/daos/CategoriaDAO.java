package es.rf.tienda.daos;

import java.sql.ResultSet;

import es.rf.tienda.interfaces.ICategoria;

public class CategoriaDAO implements ICategoria {
	
	private static final String SELECT = "SELECT * FROM CATEGORIA";
	private static final String UPDATE = "UPDATE CATEGORIA SET ";
	private static final String INSERT = "INSERT INTO CATEGORIA VALUES";
	private static final String DELETE = "DELETE FROM CATEGORIA ";
	

	@Override
	public List<Categoria> leerTodos() DAOException, DomainException {
		String sql = SELECT;
		return montaLista(sql);
	}
	
	
	
	

}
