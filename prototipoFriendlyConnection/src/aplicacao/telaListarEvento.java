/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplicacao;
import modelo.Evento;
import dao.EventoDAO;
import dao.DAOFactory;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class telaListarEvento extends javax.swing.JFrame {
     EventoDAO eventoDAO = DAOFactory.criarEventoDAO();
     DefaultTableModel modeloEvento = null;
     
    public telaListarEvento() {
        initComponents();
        modeloEvento = (DefaultTableModel) tblEvento.getModel();
        setLocationRelativeTo(null);
        preencherTabelaEvento();
    }
    private void preencherTabelaEvento() {
    modeloEvento.setRowCount(0); 

    try {
        List<Evento> eventos = eventoDAO.listar(); 


     
        for (Evento evento : eventos) {
            modeloEvento.addRow(new Object[]{
                evento.getEventoId(),
                evento.getNome(),
                evento.getDescricao(),
                evento.getData(),
                evento.getHorario(),
                evento.getCep(),
                evento.getBairro(),
                evento.getRua(),
                evento.getReferencia(),
                
            });
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
}

    
    
    
    private void apagarEvento() {
        try {
            Integer id = (Integer) modeloEvento.getValueAt(tblEvento.getSelectedRow(), 0);

            int linha = eventoDAO.apagar(id);
            if (linha > 0) {
                modeloEvento.removeRow(tblEvento.getSelectedRow());
                JOptionPane.showMessageDialog(this, "Pessoa excluida com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao excluir EVENTO.");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Por favor, selecionar um evento");
        }
    }
    
    private void editarEvento() {
        try {
            int id = (int) modeloEvento.getValueAt(tblEvento.getSelectedRow(), 0);
            String nome = (String) modeloEvento.getValueAt(tblEvento.getSelectedRow(), 1);
            String descricao = (String) modeloEvento.getValueAt(tblEvento.getSelectedRow(), 2);
            Date data = (Date) modeloEvento.getValueAt(tblEvento.getSelectedRow(), 3);
            LocalTime horario = (LocalTime) modeloEvento.getValueAt(tblEvento.getSelectedRow(), 4);
            String cep = (String) modeloEvento.getValueAt(tblEvento.getSelectedRow(), 5);
            String bairro = (String) modeloEvento.getValueAt(tblEvento.getSelectedRow(), 6);
            String rua = (String) modeloEvento.getValueAt(tblEvento.getSelectedRow(), 7);
            String referencia = (String) modeloEvento.getValueAt(tblEvento.getSelectedRow(), 8);
            
            
            
            
            
            

            Evento evento = new Evento();
            evento.setEventoId(id);
            evento.setNome(nome);       
            evento.setDescricao(descricao);
            evento.setData(data);
            evento.setHorario(horario);
            evento.setCep(cep);
            evento.setBairro(bairro);
            evento.setRua(rua);
            evento.setReferencia(referencia);
            
            
            
            
            new telaEvento(evento).setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Por favor, selecionar uma pessoa da tabela");
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEvento = new javax.swing.JTable();
        btnInserirEvento = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        tblEvento.setBackground(new java.awt.Color(204, 204, 204));
        tblEvento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Descricao", "Data", "Horário", "cep", "Bairro", "Rua", "Referência"
            }
        ));
        tblEvento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblEventoFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(tblEvento);

        btnInserirEvento.setText("Inserir");
        btnInserirEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirEventoActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnInserir.setText("Excluir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(btnInserirEvento)
                .addGap(18, 18, 18)
                .addComponent(btnEditar)
                .addGap(18, 18, 18)
                .addComponent(btnInserir)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addContainerGap(12, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserirEvento)
                    .addComponent(btnEditar)
                    .addComponent(btnInserir)
                    .addComponent(btnCancelar))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserirEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirEventoActionPerformed
       this.dispose();
       new telaEvento().setVisible(true);
    }//GEN-LAST:event_btnInserirEventoActionPerformed

    private void tblEventoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblEventoFocusGained
        preencherTabelaEvento();
    }//GEN-LAST:event_tblEventoFocusGained

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        // TODO add your handling code here:
        apagarEvento();
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        editarEvento();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnInserirEvento;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEvento;
    // End of variables declaration//GEN-END:variables
}
