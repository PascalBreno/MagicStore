/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.jTableModel;

import Entidades.Pocao;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author pascal
 */
public class Pocao_jTableModel extends AbstractTableModel{
   
    private List<Pocao> lista;
    
    private static final String[] nomes = 
            new String[]{"Id","Nome","Preço","Quantidade","Descrição"};
    
    public Pocao_jTableModel(List<Pocao> lista) {
        this.lista = lista;
    }
    public String getColumnName(int column) {
        return nomes[column];
    }
    public int getRowCount() {
        return lista.size();
    }
     public int getColumnCount() {
        return 5;
    }
        public Object getValueAt(int rowIndex, int columnIndex) {
        Pocao novoItem = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return novoItem.getId();
            case 1:
                return novoItem.getNome();
            case 2:
                return novoItem.getPreço();
            case 3:
                return novoItem.getQuantidade();
            case 4:
                return novoItem.getTipoDePocao();
             }
        return null;
        }
}

