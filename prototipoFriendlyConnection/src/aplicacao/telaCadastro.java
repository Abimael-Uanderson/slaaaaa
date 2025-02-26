/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplicacao;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

import modelo.Pessoa;
import dao.DAOFactory;
import dao.PessoaDAO;
import dao.PessoaDAOJDBC;

public class telaCadastro extends javax.swing.JFrame {
    Pessoa pessoa;
    PessoaDAO pessoaDAO = DAOFactory.criarPessoaDAO();
    
    /**
     * Creates new form telaCadastro
     */
    public telaCadastro(Pessoa pessoa) {
        initComponents();
     redimensionarImgs();
     setLocationRelativeTo(null);  

     this.pessoa = pessoa;
     if(this.pessoa != null) {
         btnCadastrarPessoa.setText("Editar");
         btnListar.setVisible(false);
         txtNome.setText(this.pessoa.getNome());
         txtTelefone.setText(this.pessoa.getTelefone());
         
     }
    }
    public void redimensionarImgs(){
         ImageIcon icon = new ImageIcon("src/imgLogo/imgLogin.png");
         
         
        icon.setImage(icon.getImage().getScaledInstance(img.getWidth(), img.getHeight(),1));
        img.setIcon(icon);
        
    }
    
    public telaCadastro() {
        initComponents();
     redimensionarImgs();
     setLocationRelativeTo(null); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        btnCadastrarPessoa = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnListar = new javax.swing.JButton();
        img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Telefone:");

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnCadastrarPessoa.setText("Cadastrar");
        btnCadastrarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarPessoaActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        jLabel3.setText("Welcome back");

        btnListar.setText("List Pessoas");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCadastrarPessoa)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar)
                                .addGap(18, 18, 18)
                                .addComponent(btnListar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarPessoa)
                    .addComponent(btnCancelar)
                    .addComponent(btnListar))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void inserir() {
     
    Pessoa pessoaInserida = new Pessoa();
    String nome = txtNome.getText().trim();
    if (nome.length() < 3) {
        JOptionPane.showMessageDialog(this, "Erro: O nome deve conter pelo menos 3 letras.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
        return; 
    }
    pessoaInserida.setNome(nome);

    
    String telefone = txtTelefone.getText().trim();
    if (telefone.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Erro: O campo de telefone está vazio.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
        return; 
    }

    pessoaInserida.setTelefone(telefone);
        

      
        int linha = pessoaDAO.inserir(pessoaInserida);
        if (linha > 0) {
            JOptionPane.showMessageDialog(this, "Pessoa inserida com sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao inserir Pessoa.");
        }
        
    }
    
    private void editar() {
        Pessoa pessoaEditada = new Pessoa();
        pessoaEditada.setId(pessoa.getId());
        pessoaEditada.setNome(txtNome.getText());
        pessoaEditada.setTelefone(txtTelefone.getText());
        
        int linha = pessoaDAO.editar(pessoaEditada);
        if (linha > 0) {
            JOptionPane.showMessageDialog(this, "Pessoa editada com sucesso!");
            new exibirParticipantes().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao editar Pessoa.");
        }
    }
    
    
   
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
      this.dispose();
        new telaPrincipal1().setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCadastrarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarPessoaActionPerformed
        if(pessoa != null) {
            editar();
            this.dispose();
        }else {
            inserir();
        } 
        
    }//GEN-LAST:event_btnCadastrarPessoaActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        // TODO add your handling code here:
        new exibirParticipantes().setVisible(true);
    }//GEN-LAST:event_btnListarActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarPessoa;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnListar;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
