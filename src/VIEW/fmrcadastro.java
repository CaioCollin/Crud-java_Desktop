/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import DAO.funcionarioDAO;
import DTO.funcionarioDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.TabableView;

/**
 *
 * @author caioc
 */
public class fmrcadastro extends javax.swing.JFrame {

    /**
     * Creates new form fmrcadastro
     */
    public fmrcadastro() {
        initComponents();
        listarValoresfuncionario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnpesquisarfuncionario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        txtendereco = new javax.swing.JTextField();
        btncadastrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaFuncionario = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtIdfuncionario = new javax.swing.JTextField();
        btnCarregarCampos = new javax.swing.JButton();
        btnLimparcampos = new javax.swing.JButton();
        btnAlterarfuncionario = new javax.swing.JButton();
        btnExcluir = new javax.swing.JToggleButton();

        jLabel3.setText("jLabel3");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnpesquisarfuncionario.setText("Pesquisar");
        btnpesquisarfuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesquisarfuncionarioActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ENDEREÇO:");

        jLabel2.setText("NOME:");

        btncadastrar.setText("CADASTRAR");
        btncadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncadastrarActionPerformed(evt);
            }
        });

        tabelaFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id Funcionario", "Nome", "endereço "
            }
        ));
        jScrollPane2.setViewportView(tabelaFuncionario);

        jLabel4.setText("ID");

        txtIdfuncionario.setEnabled(false);

        btnCarregarCampos.setText("CARREGAR CAMPOS");
        btnCarregarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarCamposActionPerformed(evt);
            }
        });

        btnLimparcampos.setText("LIMPAR");
        btnLimparcampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparcamposActionPerformed(evt);
            }
        });

        btnAlterarfuncionario.setText("ALTERAR");
        btnAlterarfuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarfuncionarioActionPerformed(evt);
            }
        });

        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCarregarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdfuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnAlterarfuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btncadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnLimparcampos, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtnome)
                                .addComponent(txtendereco))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 58, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtIdfuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtendereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncadastrar)
                    .addComponent(btnLimparcampos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterarfuncionario)
                    .addComponent(btnExcluir))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCarregarCampos)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncadastrarActionPerformed
        cadastrarFuncionario();
        listarValoresfuncionario();
        limparCampos();
    }//GEN-LAST:event_btncadastrarActionPerformed

    private void btnpesquisarfuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesquisarfuncionarioActionPerformed

    }//GEN-LAST:event_btnpesquisarfuncionarioActionPerformed

    private void btnCarregarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarCamposActionPerformed
        CarregarCampos();
        listarValoresfuncionario();
    }//GEN-LAST:event_btnCarregarCamposActionPerformed

    private void btnLimparcamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparcamposActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparcamposActionPerformed

    private void btnAlterarfuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarfuncionarioActionPerformed
        AlterarFuncionario();
        listarValoresfuncionario();
    }//GEN-LAST:event_btnAlterarfuncionarioActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        ExcluirFuncionario();
        listarValoresfuncionario();
        limparCampos();
    }//GEN-LAST:event_btnExcluirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fmrcadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fmrcadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fmrcadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fmrcadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fmrcadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarfuncionario;
    private javax.swing.JButton btnCarregarCampos;
    private javax.swing.JToggleButton btnExcluir;
    private javax.swing.JButton btnLimparcampos;
    private javax.swing.JButton btncadastrar;
    private javax.swing.JButton btnpesquisarfuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabelaFuncionario;
    private javax.swing.JTextField txtIdfuncionario;
    private javax.swing.JTextField txtendereco;
    private javax.swing.JTextField txtnome;
    // End of variables declaration//GEN-END:variables

    private void listarValoresfuncionario() {
        try {
            funcionarioDAO objfuncionariodao = new funcionarioDAO();

            DefaultTableModel model = (DefaultTableModel) tabelaFuncionario.getModel();
            model.setNumRows(0);

            ArrayList<funcionarioDTO> lista = objfuncionariodao.PesquisarFuncionario();

            for (int i = 0; i < lista.size(); i++) {
                model.addRow(new Object[]{
                    lista.get(i).getId_funcionario(),
                    lista.get(i).getNome_funcionario(),
                    lista.get(i).getEndereco_funcionario()
                });

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "listar valores VIEW: " + e);
        }
    }

    private void CarregarCampos() {
        int setar = tabelaFuncionario.getSelectedRow();
        txtIdfuncionario.setText(tabelaFuncionario.getModel().getValueAt(setar, 0).toString());
        txtnome.setText(tabelaFuncionario.getModel().getValueAt(setar, 1).toString());
        txtendereco.setText(tabelaFuncionario.getModel().getValueAt(setar, 2).toString());
    }

    private void cadastrarFuncionario() {
        String nome, endereco;

        nome = txtnome.getText();
        endereco = txtendereco.getText();

        funcionarioDTO objfuncionarioDTO = new funcionarioDTO();
        objfuncionarioDTO.setNome_funcionario(nome);
        objfuncionarioDTO.setEndereco_funcionario(endereco);

        funcionarioDAO objfuncionariodao = new funcionarioDAO();

        objfuncionariodao.cadastrarFuncionario(objfuncionarioDTO);
    }

    private void limparCampos() {
        txtIdfuncionario.setText("");
        txtnome.setText("");
        txtendereco.setText("");
        txtnome.requestFocus();

    }

    private void AlterarFuncionario() {
        int id_funcionario;
        String nome_funcionario, endereco_funcionario;

        id_funcionario = Integer.parseInt(txtIdfuncionario.getText());
        nome_funcionario = txtnome.getText();
        endereco_funcionario = txtendereco.getText();

        funcionarioDTO objfuncionariodto = new funcionarioDTO();
        objfuncionariodto.setId_funcionario(id_funcionario);
        objfuncionariodto.setNome_funcionario(nome_funcionario);
        objfuncionariodto.setEndereco_funcionario(endereco_funcionario);

        funcionarioDAO objfuncionariodao = new funcionarioDAO();
        objfuncionariodao.alterarFuncionario(objfuncionariodto);
    }

    private void ExcluirFuncionario() {
        int id_funcionario;

        id_funcionario = Integer.parseInt(txtIdfuncionario.getText());

        funcionarioDTO objfuncionariodto = new funcionarioDTO();
        objfuncionariodto.setId_funcionario(id_funcionario);

        funcionarioDAO objfuncionariodao = new funcionarioDAO();
        objfuncionariodao.ExcluirFuncionario(objfuncionariodto);

    }

}
