
package dao;
import java.sql.*;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import modelo.Evento;
import dao.DAOGenerico;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abima
 */
public class EventoDAOJDBC implements EventoDAO {

    @Override
    public int inserir(Evento evento) {
       StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder
                .append("INSERT INTO evento(nome, descricao, data, horario, cep, bairro, rua, referencia) ")
                 .append("VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
     
        String insert = sqlBuilder.toString();
        int linha = 0;
        try {  
            linha = DAOGenerico.executarComando(insert, evento.getNome(), evento.getDescricao(), evento.getData(), evento.getHorario(), evento.getCep(), evento.getBairro(), evento.getRua(), evento.getReferencia());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return linha; 
    }

    @Override
    public int editar(Evento evento) {
        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder
                .append("UPDATE evento SET ")
                .append("nome = ?, ")
                .append("descricao = ?, ")
                .append("data = ?, ")
                .append("horario = ?, ")
                .append("cep = ?, ")
                .append("bairro = ?, ")
                .append("rua = ?, ")
                .append("referencia = ? ")
                .append("WHERE evento_id = ?");
        String update = sqlBuilder.toString();
        int linha = 0;
        try {
            linha = DAOGenerico.executarComando(update, evento.getNome(),
                                                        evento.getDescricao(),
                                                        evento.getData(),
                                                        evento.getHorario(),
                                                        evento.getCep(),
                                                        evento.getBairro(),
                                                        evento.getRua(),
                                                        evento.getReferencia(),
                                                        evento.getEventoId());       
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return linha; 
    }

    @Override
    public int apagar(int id) throws ClassNotFoundException, SQLException, SQLIntegrityConstraintViolationException {
        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder
                .append("DELETE FROM evento ")
                .append("WHERE evento_id = ?");
        String delete = sqlBuilder.toString();
        int linha = 0;        
        linha = DAOGenerico.executarComando(delete, id);
        return linha;
    }

    /*
    PreparedStatement stmt = DAOGenerico.getConexao().prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
    */
    @Override
    public List<Evento> listar() {
        ResultSet rs;
        String select = "SELECT * FROM evento";
        List<Evento> eventos = new ArrayList<>();
        
        try {        
            rs = DAOGenerico.executarConsulta(select);
            while (rs.next()) {
            Evento evento = new Evento();
            evento.setEventoId(rs.getInt("evento_id"));
            evento.setNome(rs.getString("nome"));
            evento.setDescricao(rs.getString("descricao"));
            evento.setData(rs.getDate("data"));
            evento.setHorario(rs.getTime("horario").toLocalTime());
            evento.setCep(rs.getString("cep"));
            evento.setBairro(rs.getString("bairro"));
            evento.setRua(rs.getString("rua"));
            evento.setReferencia(rs.getString("referencia"));
            eventos.add(evento);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return eventos;
}
        /*
   List<Evento> eventos = new ArrayList<>();
    String sql = "SELECT e.evento_id, e.nome, e.descricao, e.data, e.horario, en.endereco_id, en.cep, en.rua, en.bairro " +
                 "FROM evento e " +
                 "JOIN endereco en ON e.endereco_id = en.endereco_id";
    
    try (Connection conn = DAOGenerico.getConexao();
         PreparedStatement stmt = conn.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {
        
        while (rs.next()) {
            Evento evento = new Evento();
            evento.setEventoId(rs.getInt("evento_id"));
            evento.setNome(rs.getString("nome"));
            evento.setDescricao(rs.getString("descricao"));
            evento.setData(rs.getDate("data"));
            evento.setHorario(rs.getTime("horario").toLocalTime());
            
            Endereco endereco = new Endereco();
            endereco.setEnderecoId(rs.getLong("endereco_id"));
            endereco.setCep(rs.getString("cep"));
            endereco.setRua(rs.getString("rua"));
            endereco.setBairro(rs.getString("bairro"));
            
            evento.setEndereco(endereco);
            eventos.add(evento);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } catch (ClassNotFoundException ex) {
            Logger.getLogger(EventoDAOJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return eventos;
*/
    

    @Override
    public Evento listar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}