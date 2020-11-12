/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pessoas.Pessoa;

/**
 *
 * @author bruno
 */
public class RemoverPessoa extends javax.swing.JPanel {

    /**
     * Creates new form RemoverPessoa
     */
    public RemoverPessoa() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelRemoveNome = new javax.swing.JLabel();
        textPesquisaNome = new javax.swing.JTextField();
        botaoRemoveNome = new javax.swing.JButton();
        labelRemoveCpf = new javax.swing.JLabel();
        textRemoveCpf = new javax.swing.JTextField();
        botaoMostrarContatos = new javax.swing.JButton();
        botaoRemoveCpf1 = new javax.swing.JButton();
        botaoRemoveItem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPesquisaPessoas = new javax.swing.JTable();

        setForeground(new java.awt.Color(153, 153, 255));
        setMinimumSize(new java.awt.Dimension(1000, 750));
        setPreferredSize(new java.awt.Dimension(1000, 750));
        setLayout(null);

        labelRemoveNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelRemoveNome.setText("Remover por nome:");
        add(labelRemoveNome);
        labelRemoveNome.setBounds(20, 20, 124, 26);
        add(textPesquisaNome);
        textPesquisaNome.setBounds(20, 50, 270, 30);

        botaoRemoveNome.setText("Pesquisar");
        botaoRemoveNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoveNomeActionPerformed(evt);
            }
        });
        add(botaoRemoveNome);
        botaoRemoveNome.setBounds(310, 50, 90, 30);

        labelRemoveCpf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelRemoveCpf.setText("Remover por CPF:");
        add(labelRemoveCpf);
        labelRemoveCpf.setBounds(20, 90, 124, 26);
        add(textRemoveCpf);
        textRemoveCpf.setBounds(20, 120, 270, 30);

        botaoMostrarContatos.setText("Mostrar todos Contatos");
        botaoMostrarContatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMostrarContatosActionPerformed(evt);
            }
        });
        add(botaoMostrarContatos);
        botaoMostrarContatos.setBounds(760, 120, 160, 40);

        botaoRemoveCpf1.setText("Pesquisar");
        add(botaoRemoveCpf1);
        botaoRemoveCpf1.setBounds(310, 120, 90, 30);

        botaoRemoveItem.setText("Remover Item");
        botaoRemoveItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoveItemActionPerformed(evt);
            }
        });
        add(botaoRemoveItem);
        botaoRemoveItem.setBounds(30, 540, 130, 40);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tabelaPesquisaPessoas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Sexo", "Data Nascimento", "Profissao", "CPF", "Tipo Sanguineo"
            }
        ));
        tabelaPesquisaPessoas.setToolTipText("");
        jScrollPane1.setViewportView(tabelaPesquisaPessoas);

        add(jScrollPane1);
        jScrollPane1.setBounds(10, 200, 980, 250);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoRemoveNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoveNomeActionPerformed
        int linhas, i, tamanho;

        DefaultTableModel modelo = (DefaultTableModel) tabelaPesquisaPessoas.getModel();
        linhas = tabelaPesquisaPessoas.getRowCount();

        if (linhas >= 1) {
            modelo.setRowCount(0);

        }
        tamanho = Janelas.getInstance().listPessoa.size();

        for (i = 0; i < tamanho; i++) {

            if (Janelas.getInstance().listPessoa.get(i).getNome().equals(textPesquisaNome.getText())) {

                // REPARA NO NIVEL DESSA LINHA.
                Object[] linha = {
                    Janelas.getInstance().listPessoa.get(i).getId(),
                    Janelas.getInstance().listPessoa.get(i).getNome(),
                    Janelas.getInstance().listPessoa.get(i).getSexo(),
                    Janelas.getInstance().listPessoa.get(i).getDataNascimento(),
                    Janelas.getInstance().listPessoa.get(i).getProfissao(),
                    Janelas.getInstance().listPessoa.get(i).getCpf(),
                    Janelas.getInstance().listPessoa.get(i).getTipoSanguineo()
                };

                modelo.addRow(linha);
            }

        }
    }//GEN-LAST:event_botaoRemoveNomeActionPerformed

    private void botaoMostrarContatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMostrarContatosActionPerformed

        int linhas, i, tamanho;

        DefaultTableModel modelo = (DefaultTableModel) tabelaPesquisaPessoas.getModel();
        linhas = tabelaPesquisaPessoas.getRowCount();

        if (linhas >= 1) {
            modelo.setRowCount(0);

        }
        tamanho = Janelas.getInstance().listPessoa.size();

        for (i = 0; i < tamanho; i++) {
            Object[] linha = {
                Janelas.getInstance().listPessoa.get(i).getId(),
                Janelas.getInstance().listPessoa.get(i).getNome(),
                Janelas.getInstance().listPessoa.get(i).getSexo(),
                Janelas.getInstance().listPessoa.get(i).getDataNascimento(),
                Janelas.getInstance().listPessoa.get(i).getProfissao(),
                Janelas.getInstance().listPessoa.get(i).getCpf(),
                Janelas.getInstance().listPessoa.get(i).getTipoSanguineo()
            };

            modelo.addRow(linha);

        }


    }//GEN-LAST:event_botaoMostrarContatosActionPerformed

    private void botaoRemoveItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoveItemActionPerformed
        int opcao, i, id;
        if (tabelaPesquisaPessoas.getSelectedRowCount() != 0) {

            opcao = JOptionPane.showConfirmDialog(this, "voce deseja remover o: \n id" + tabelaPesquisaPessoas.getValueAt(tabelaPesquisaPessoas.getSelectedRow(), 0) + "\n Nome:" + tabelaPesquisaPessoas.getValueAt(tabelaPesquisaPessoas.getSelectedRow(), 1));
            id = Integer.parseInt("" + tabelaPesquisaPessoas.getValueAt(tabelaPesquisaPessoas.getSelectedRow(), 0));
            if (opcao == 0) {

                for (i = 0; i < Janelas.getInstance().listPessoa.size(); i++) {

                    Pessoa pessoasExcluir = Janelas.getInstance().listPessoa.get(id);

                    if (Janelas.getInstance().listPessoa.get(id).getId() == id) {
                        Janelas.getInstance().listPessoa.remove(pessoasExcluir);

                    }

                }

            }
        }

    }//GEN-LAST:event_botaoRemoveItemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoMostrarContatos;
    private javax.swing.JButton botaoRemoveCpf1;
    private javax.swing.JButton botaoRemoveItem;
    private javax.swing.JButton botaoRemoveNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelRemoveCpf;
    private javax.swing.JLabel labelRemoveNome;
    private javax.swing.JTable tabelaPesquisaPessoas;
    private javax.swing.JTextField textPesquisaNome;
    private javax.swing.JTextField textRemoveCpf;
    // End of variables declaration//GEN-END:variables
}