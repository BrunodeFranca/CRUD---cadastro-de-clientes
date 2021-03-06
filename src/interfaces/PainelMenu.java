/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author bruno
 */
public class PainelMenu extends javax.swing.JPanel {

    /**
     * Creates new form PainelMenu
     */
    public PainelMenu() {
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

        botaoAdicionar = new javax.swing.JButton();
        botaoRemover = new javax.swing.JButton();
        botaoPesquisar = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 255));
        setForeground(new java.awt.Color(0, 0, 204));
        setMinimumSize(new java.awt.Dimension(1000, 50));
        setPreferredSize(new java.awt.Dimension(1000, 50));
        setLayout(null);

        botaoAdicionar.setForeground(new java.awt.Color(0, 0, 204));
        botaoAdicionar.setText("Adicionar");
        botaoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarActionPerformed(evt);
            }
        });
        add(botaoAdicionar);
        botaoAdicionar.setBounds(60, 10, 120, 40);

        botaoRemover.setForeground(new java.awt.Color(0, 0, 153));
        botaoRemover.setText("Remover");
        botaoRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverActionPerformed(evt);
            }
        });
        add(botaoRemover);
        botaoRemover.setBounds(800, 10, 130, 40);

        botaoPesquisar.setForeground(new java.awt.Color(0, 0, 153));
        botaoPesquisar.setText("Pesquisar");
        botaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarActionPerformed(evt);
            }
        });
        add(botaoPesquisar);
        botaoPesquisar.setBounds(430, 10, 120, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarActionPerformed
                  
        Janelas.getInstance().painelAdicionarPessoa.setVisible(true);
        Janelas.getInstance().painelPesquisarPessoa.setVisible(false);
        Janelas.getInstance().painelRemoverPessoa.setVisible(false);
    }//GEN-LAST:event_botaoAdicionarActionPerformed

    private void botaoRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverActionPerformed
         Janelas.getInstance().painelAdicionarPessoa.setVisible(false);
        Janelas.getInstance().painelPesquisarPessoa.setVisible(false);
        Janelas.getInstance().painelRemoverPessoa.setVisible(true);
    }//GEN-LAST:event_botaoRemoverActionPerformed

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed
       Janelas.getInstance().painelAdicionarPessoa.setVisible(false);
        Janelas.getInstance().painelPesquisarPessoa.setVisible(true);
        Janelas.getInstance().painelRemoverPessoa.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_botaoPesquisarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdicionar;
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.JButton botaoRemover;
    // End of variables declaration//GEN-END:variables
}
