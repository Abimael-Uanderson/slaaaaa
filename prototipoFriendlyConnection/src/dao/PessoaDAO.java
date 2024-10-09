
package dao;

import modelo.Pessoa;
import java.sql.*;
import java.util.List;

/**
 *
 * @author abima
 */
public interface PessoaDAO {
    public int inserir(Pessoa pessoa);
    public int editar(Pessoa pessoa);
    public int apagar(int  id) throws ClassNotFoundException, SQLException, SQLIntegrityConstraintViolationException;
    public List<Pessoa> listar();
    public Pessoa listar(int id);
}