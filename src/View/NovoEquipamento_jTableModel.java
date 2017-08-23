/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Entidades.Equipamento;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author pascal
 */
public class NovoEquipamento_jTableModel extends AbstractTableModel{
     private List<Equipamento> lista;
      private static final String[] nomes = 
            new String[]{"Id","Tipo","atk","def",
                "preço"};
    public NovoEquipamento_jTableModel(List<Equipamento> lista) {
           this.lista = lista;
       }      
   public String getColumnName(int column) {
       return nomes[column];
       }
   public int getRowCount() {
           return lista.size();
       }
   public int getColumnCount() {
       return 5;//To change body of generated methods, choose Tools | Templates.
   }
public Object getValueAt(int rowIndex, int columnIndex) {
        Equipamento novoEquipamento = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return novoEquipamento.getId();
            case 1:
                return novoEquipamento.getTipo();
            case 2:
                return novoEquipamento.getAtk();
            case 3:
                return novoEquipamento.getDef();
            case 4:
                return novoEquipamento.getPreco();
        }
        return null;
    }

}
