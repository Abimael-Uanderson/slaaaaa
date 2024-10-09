
package modelo;

import java.text.ParseException;
import java.time.LocalTime;
import java.time.LocalDate;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author abima
 */
public class Evento {
   private String nome;
   private String descricao;
   private Date data;
   private LocalTime horario;
   private String cep;
   private String bairro;
   private String rua;
   private String referencia;
   //private Long enderecoId; // Adicione isso na classe Evento
    private int eventoId;
   
    public int getEventoId() {
        return eventoId;
    }

    public void setEventoId(int eventoId) {
        this.eventoId = eventoId;
    }
   
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

   

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
   
   
}