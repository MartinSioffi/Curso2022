package es.rf.tienda.interfaces;

import java.util.List;

import es.rf.tienda.dominio.Categoria;
import es.rf.tienda.exception.DAOException;

public interface ICategoria {
	public Categoria leerRegistro(Categoria cat) throws DAOException;
	public List<Categoria> leerTodos();
	public List<Categoria> leerRegistros(Categoria cat);
	public int insertar(Categoria Cat);
	public int actualizar(Categoria Cat);
	public int borrar(Categoria Cat);
	
	//public Categoria leerRegistro(int num);
	//public List<Categoria> lista(Categoria c);
	//public boolean guardar(Categoria c);
}
