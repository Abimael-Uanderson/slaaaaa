/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplicacao;
import dao.DAOFactory;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import modelo.Evento;
import javax.swing.JOptionPane;
import java.util.Date;
import dao.EventoDAO;
import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.time.format.DateTimeFormatter;

public class telaEvento extends javax.swing.JFrame {
Evento evento;
EventoDAO eventoDAO = DAOFactory.criarEventoDAO();

    /**
     * Creates new form cadastrarEvento
     */
    public telaEvento(Evento evento) {
        initComponents();
        setLocationRelativeTo(null); 
        this.evento = evento;
        if (this.evento != null) {
   
    btnCadastrar.setText("Editar");
    
  
    btnListar.setVisible(false);
    
    
    txtNomeEvento.setText(this.evento.getNome());
    txtDescricaoEvento.setText(this.evento.getDescricao());
    
   
    SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
    txtDataEvento.setText(formataData.format(this.evento.getData()));
    
    
    DateTimeFormatter formatoHorario = DateTimeFormatter.ofPattern("HH:mm");
    txtHorarioEvento.setText(this.evento.getHorario().format(formatoHorario));
    
   
    txtCep.setText(this.evento.getCep());
    txtRua.setText(this.evento.getRua());
    txtBairro.setText(this.evento.getBairro());
    
   
    if (this.evento.getReferencia() != null) {
        txtReferencia.setText(this.evento.getReferencia());
    }else {
        
    }
}

        
        
    }
    
    public telaEvento() {
        initComponents();
        setLocationRelativeTo(null); 
    } 
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNomeEvento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricaoEvento = new javax.swing.JTextPane();
        txtDataEvento = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        txtHorarioEvento = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtCep = new javax.swing.JFormattedTextField();
        txtRua = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        txtReferencia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nome do evento:");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Descrição do evento:");

        jScrollPane1.setViewportView(txtDescricaoEvento);

        try {
            txtDataEvento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Data do evento:");

        try {
            txtHorarioEvento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Horário do evento:");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("CEP:");

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Rua:");

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Bairro:");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Referência:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 59, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRua)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtBairro))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtDataEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtHorarioEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDataEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtHorarioEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar ");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnCadastrar)
                        .addGap(47, 47, 47)
                        .addComponent(btnListar)
                        .addGap(58, 58, 58)
                        .addComponent(btnCancelar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
  

private void inserir() throws ParseException {
    Evento inserirEvento = new Evento();

 
 
    String nomeEvento = txtNomeEvento.getText().trim();
    if (nomeEvento.length() < 4) {
        JOptionPane.showMessageDialog(this, "Erro: O nome do evento deve conter pelo menos 4 letras.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
        return;
    }
    inserirEvento.setNome(nomeEvento);

    String descricaoEvento = txtDescricaoEvento.getText().trim();
    if (descricaoEvento.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Erro: A descrição do evento deve conter pelo menos 10 letras.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
        return;
    }
    inserirEvento.setDescricao(descricaoEvento);

    String dataEvento = txtDataEvento.getText().trim();
    if (dataEvento.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Erro: Informe uma data válida.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
        return;
    }
    SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
    Date data = formataData.parse(dataEvento);
    inserirEvento.setData(data);

    String horarioEvento = txtHorarioEvento.getText().trim();
    if (horarioEvento.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Erro: Informe o horário do evento.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
        return;
    }
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
    LocalTime horario = LocalTime.parse(horarioEvento, formato);
    inserirEvento.setHorario(horario);
    
    String cep = txtCep.getText().trim();
    if (cep.length() == 8) {
        inserirEvento.setCep(cep);
    } else {
        JOptionPane.showMessageDialog(this, "Erro: O CEP deve conter 8 dígitos.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String rua = txtRua.getText().trim();
    if (rua.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Erro: Informe o nome da rua.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
        return;
    }
    inserirEvento.setRua(rua);

    String bairro = txtBairro.getText().trim();
    if (bairro.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Erro: Informe o nome do bairro.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
        return;
    }
    inserirEvento.setBairro(bairro);

    String referencia = txtReferencia.getText().trim();
    if (!referencia.isEmpty()) {
        inserirEvento.setReferencia(referencia);
    }

   

  
    int linha = eventoDAO.inserir(inserirEvento);
    if (linha > 0) {
        JOptionPane.showMessageDialog(this, "Evento inserido com sucesso!");
    } else {
        JOptionPane.showMessageDialog(this, "Erro ao inserir evento.");
    }
}

private void editar() {

    Evento eventoEditado = new Evento();
    

    eventoEditado.setEventoId(evento.getEventoId());
    
    eventoEditado.setNome(txtNomeEvento.getText().trim());
    eventoEditado.setDescricao(txtDescricaoEvento.getText().trim());
    
    try {
        SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formataData.parse(txtDataEvento.getText().trim());
        eventoEditado.setData(data);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao converter a data do evento.", "Erro de Conversão", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    try {
        
        DateTimeFormatter formatoHorario = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime horario = LocalTime.parse(txtHorarioEvento.getText().trim(), formatoHorario);
        eventoEditado.setHorario(horario);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao converter o horário do evento.", "Erro de Conversão", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    
    eventoEditado.setCep(txtCep.getText().trim());
    eventoEditado.setRua(txtRua.getText().trim());
    eventoEditado.setBairro(txtBairro.getText().trim());
    eventoEditado.setReferencia(txtReferencia.getText().trim());
    
   
    int linha = eventoDAO.editar(eventoEditado);
    if (linha > 0) {
        JOptionPane.showMessageDialog(this, "Evento editado com sucesso!");
        new telaListarEvento().setVisible(true);
    } else {
        JOptionPane.showMessageDialog(this, "Erro ao editar o Evento.");
    }
}


    
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
    try {
        if(evento != null) {
            editar();
            this.dispose();
        }else {
            inserir();
        }
    } catch (ParseException ex) {
        Logger.getLogger(telaEvento.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
       new telaListarEvento().setVisible(true);
       
        
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnListar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JFormattedTextField txtDataEvento;
    private javax.swing.JTextPane txtDescricaoEvento;
    private javax.swing.JFormattedTextField txtHorarioEvento;
    private javax.swing.JTextField txtNomeEvento;
    private javax.swing.JTextField txtReferencia;
    private javax.swing.JTextField txtRua;
    // End of variables declaration//GEN-END:variables
}
