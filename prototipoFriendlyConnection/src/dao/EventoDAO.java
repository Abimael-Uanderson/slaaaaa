
package dao;

import java.util.List;
import java.sql.*;
import modelo.Evento;

/**
 *
 * @author abima
 */
public interface EventoDAO {
    public int inserir(Evento evento);
    public int editar(Evento evento);
    public int apagar(int  id) throws ClassNotFoundException, SQLException, SQLIntegrityConstraintViolationException;
    public List<Evento> listar();
    public Evento listar(int id);
}