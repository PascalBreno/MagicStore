/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.jTableModel;

import Entidades.Mago;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author pascal
 */
public class Mago_jTableModel extends AbstractTableModel{
    private List<Mago> lista;
      private static final String[] nomes = 
            new String[]{"Id","Nome","Raça","Level","Categoria",
                "Classe","Tipo_de_Cliente"};

    public Mago_jTableModel(List<Mago> lista) {
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
        return 7;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Mago novomago = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return novomago.getId();
            case 1:
                return novomago.getNome();
            case 2:
                return novomago.getRaca();
            case 3:
                return novomago.getLevel();
            case 4:
                return novomago.getCategoria();
            case 5:
                return novomago.getClasse();
            case 6:
                return novomago.getTipodecliente();
        }
        return null;
    }
    }
