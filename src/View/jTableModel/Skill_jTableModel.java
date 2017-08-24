package View.jTableModel;

import Entidades.Skill;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author pascal
 */
public class Skill_jTableModel extends AbstractTableModel{
   
    private List<Skill> lista;
    
    private static final String[] nomes = 
            new String[]{"Id","Nome","Tipo","Preço","Descrição","Level Requerido"};
    
    public Skill_jTableModel(List<Skill> lista) {
        this.lista = lista;
    }
    public String getColumnName(int column) {
        return nomes[column];
    }
    public int getRowCount() {
        return lista.size();
    }
     public int getColumnCount() {
        return 6;
    }
        public Object getValueAt(int rowIndex, int columnIndex) {
        Skill novaSkill = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return novaSkill.getId();
            case 1:
                return novaSkill.getNome();
            case 2:
                return novaSkill.getTipo(); 
            case 3:
                return novaSkill.getPreço();
            case 4:
                return novaSkill.getDescricao();
            case 5:
                return novaSkill.getRestricaoDeLevel();
            }
        return null;
        }
}

