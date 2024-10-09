package dao;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import modelo.Pessoa;


public class PessoaDAOJDBC implements PessoaDAO{

    @Override
    public int inserir(Pessoa pessoa) {
        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder
                .append("INSERT INTO pessoa(nome, telefone) ")
                .append("VALUES (?, ?)");
     
        String insert = sqlBuilder.toString();
        int linha = 0;
        try {  
            linha = DAOGenerico.executarComando(insert, pessoa.getNome(), pessoa.getTelefone());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return linha;
    }

    @Override
    public int editar(Pessoa pessoa) {
        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder
                .append("UPDATE pessoa SET ")
                .append("nome = ?, ")
                .append("telefone = ? ")
                .append("WHERE pessoa_id = ?");
        String update = sqlBuilder.toString();
        int linha = 0;
        try {
            linha = DAOGenerico.executarComando(update, pessoa.getNome(), pessoa.getTelefone(), pessoa.getId());
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return linha; 
    }

    @Override
    public int apagar(int id) throws ClassNotFoundException, SQLException, SQLIntegrityConstraintViolationException {
        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder
                .append("DELETE FROM pessoa ")
                .append("WHERE pessoa_id = ?");
        String delete = sqlBuilder.toString();
        int linha = 0;        
        linha = DAOGenerico.executarComando(delete, id);
        return linha;
    }

    @Override
    public List<Pessoa> listar() {
        ResultSet rset;
        String select = "SELECT * FROM pessoa";
        List<Pessoa> pessoas = new ArrayList<>();
        try {        
            rset = DAOGenerico.executarConsulta(select);
            while (rset.next()) {
                Pessoa pessoa = new Pessoa();
                pessoa.setId(rset.getInt("pessoa_id"));
                pessoa.setNome(rset.getString("nome"));
                pessoa.setTelefone(rset.getString("telefone"));
                pessoas.add(pessoa);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return pessoas;
    }
    
    



    @Override
    public Pessoa listar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    
}