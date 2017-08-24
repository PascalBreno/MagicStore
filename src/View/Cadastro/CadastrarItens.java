/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Cadastro;

import View.jTableModel.Novoitem_jTableModel;
import Entidades.Iten;
import PersistenciaLista.ItenPersistenciaLista;
import javax.swing.JOptionPane;
import Persistencia.persistenciaIten;

/**
 *
 * @author pascal
 */
public class CadastrarItens extends javax.swing.JPanel {
    private static persistenciaIten banco = new ItenPersistenciaLista ();

    /**
     * Creates new form CadastrarItens
     */
    public CadastrarItens() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Salvar_jButton = new javax.swing.JButton();
        Cancelar_jButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Descricao_jTextArea = new javax.swing.JTextArea();
        Nome_jTextField = new javax.swing.JTextField();
        Preco_jTextField = new javax.swing.JTextField();
        Quantidade_jTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Item_jTable = new javax.swing.JTable();
        Apagar_jButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(600, 450));
        setLayout(null);

        jLabel1.setText("Nome");
        add(jLabel1);
        jLabel1.setBounds(186, 58, 27, 14);

        jLabel2.setText("Preço");
        add(jLabel2);
        jLabel2.setBounds(186, 106, 27, 14);

        jLabel4.setText("Quantidade");
        add(jLabel4);
        jLabel4.setBounds(163, 143, 56, 14);

        jLabel5.setText("Descrição");
        add(jLabel5);
        jLabel5.setBounds(163, 210, 46, 14);

        Salvar_jButton.setText("Salvar");
        Salvar_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salvar_jButtonActionPerformed(evt);
            }
        });
        add(Salvar_jButton);
        Salvar_jButton.setBounds(353, 312, 63, 23);

        Cancelar_jButton.setText("Cancelar");
        Cancelar_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancelar_jButtonActionPerformed(evt);
            }
        });
        add(Cancelar_jButton);
        Cancelar_jButton.setBounds(131, 312, 75, 23);

        Descricao_jTextArea.setColumns(20);
        Descricao_jTextArea.setRows(5);
        jScrollPane1.setViewportView(Descricao_jTextArea);

        add(jScrollPane1);
        jScrollPane1.setBounds(278, 191, 166, 96);
        add(Nome_jTextField);
        Nome_jTextField.setBounds(278, 56, 222, 20);
        add(Preco_jTextField);
        Preco_jTextField.setBounds(278, 104, 222, 20);
        add(Quantidade_jTextField);
        Quantidade_jTextField.setBounds(278, 141, 222, 20);

        Item_jTable.setModel(new Novoitem_jTableModel(banco.getAll()) );
        jScrollPane2.setViewportView(Item_jTable);

        add(jScrollPane2);
        jScrollPane2.setBounds(320, 350, 452, 402);

        Apagar_jButton.setText("Apagar");
        Apagar_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Apagar_jButtonActionPerformed(evt);
            }
        });
        add(Apagar_jButton);
        Apagar_jButton.setBounds(100, 370, 67, 23);
    }// </editor-fold>//GEN-END:initComponents

    private void Salvar_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salvar_jButtonActionPerformed
        Iten novo_item = new Iten();
        novo_item.setNome(Nome_jTextField.getText());
        float preco = Float.parseFloat(Preco_jTextField.getText());
        novo_item.setPreço(preco);
        int quantidade = Integer.parseInt(Quantidade_jTextField.getText());
        novo_item.setQuantidade(quantidade);
        novo_item.setDescricao(Descricao_jTextArea.getText());
        //Adicionei todos os elementos
         banco.inserir(novo_item);
          JOptionPane.showMessageDialog(
                Salvar_jButton, "Cadastrado com Sucesso!");
            Cancelar_jButtonActionPerformed(null);
            Novoitem_jTableModel modelo = 
                (Novoitem_jTableModel) Item_jTable.getModel();
                       modelo.fireTableRowsInserted(0, 1);
        
    }//GEN-LAST:event_Salvar_jButtonActionPerformed

    private void Cancelar_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancelar_jButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cancelar_jButtonActionPerformed

    private void Apagar_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Apagar_jButtonActionPerformed
            int[] linhas = Item_jTable.getSelectedRows();
        
//        int decremento = 0;
//        for(int i = 0; i < linhas.length;i++){
//            Responsavel removido = banco
//                    .getAll().get(linhas[i]-decremento);
        for(int i = linhas.length - 1; i >= 0;i--){
            Iten removido = banco
                    .getAll().get(linhas[i]);
            banco.remover(removido);
//            decremento++;
            
            Novoitem_jTableModel modelo = 
                (Novoitem_jTableModel) Item_jTable.getModel();
        
            modelo.fireTableRowsDeleted(0, 1);
        }    
    }//GEN-LAST:event_Apagar_jButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Apagar_jButton;
    private javax.swing.JButton Cancelar_jButton;
    private javax.swing.JTextArea Descricao_jTextArea;
    private javax.swing.JTable Item_jTable;
    private javax.swing.JTextField Nome_jTextField;
    private javax.swing.JTextField Preco_jTextField;
    private javax.swing.JTextField Quantidade_jTextField;
    private javax.swing.JButton Salvar_jButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
