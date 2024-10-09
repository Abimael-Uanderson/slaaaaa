
package dao;

/**
 *
 * @author abima
 */
public class DAOFactory {
    public static PessoaDAO criarPessoaDAO() {
        return new PessoaDAOJDBC();
    }
    
    public static EventoDAO criarEventoDAO() {
        return new EventoDAOJDBC();
    }
   
}




