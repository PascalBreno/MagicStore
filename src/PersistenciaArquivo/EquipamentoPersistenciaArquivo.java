import Entidades.Equipamento;
import Persistencia.persistenciaEquipamento;
import PersistenciaLista.EquipamentoPersistenciaLista;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class EquipamentoPersistenciaArquivo
        extends EquipamentoPersistenciaLista
        implements persistenciaEquipamento {

    private final String arq = "Equipamento.db";
    public EquipamentoPersistenciaArquivo(){
        ler();
    }
    private void ler() {
        try {
            ObjectInputStream ois;
            FileInputStream fis;
            fis = new FileInputStream(arq);
            ois = new ObjectInputStream(fis);
            lista = (List) ois.readObject();
            ois.close();
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }
    private void gravar(){
        try{
            ObjectOutputStream oos;
            FileOutputStream fos;
            fos = new FileOutputStream(arq);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(lista);
            oos.close();
        }catch(Exception erro){
            erro.printStackTrace();
        }
    }
    public void inserir(Equipamento novoEquipamento) {
        super.inserir(novoEquipamento);
        gravar();
    }
    public void alterar(Equipamento novoEquipamento) {
        super.alterar(novoEquipamento);
        gravar();
    }
    public void remover(Equipamento novoEquipamento) {
        super.remover(novoEquipamento);
        gravar();
    }
}

