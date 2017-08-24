/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.jTableModel;

import Entidades.Fornecedor;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author pascal
 */
public class Fornecedor_jTableModel extends AbstractTableModel{
       private List<Fornecedor> lista;
      private static final String[] nomes = 
            new String[]{"Id","Nome","Reino"};

    public Fornecedor_jTableModel(List<Fornecedor> lista) {
        this.lista = lista;
    }
    @Override
public String getColumnName(int column) {
        return nomes[column];
    }
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 3;//To change body of generated methods, choose Tools | Templates.
    }
      public Object getValueAt(int rowIndex, int columnIndex) {
        Fornecedor novofornecedor = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return novofornecedor.getId();
            case 1:
                return novofornecedor.getNome();
            case 2:
                return novofornecedor.getReino();
       
        }
        return null;
    }
 
}
