import Entidades.Pocao;
import Persistencia.persistenciaPocao;
import PersistenciaLista.PocaoPersistenciaLista;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class PocaoPersistenciaArquivo
        extends PocaoPersistenciaLista
        implements persistenciaPocao {

    private final String arq = "Pocao.db";
    public PocaoPersistenciaArquivo(){
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
    public void inserir(Pocao novoPocao) {
        super.inserir(novoPocao);
        gravar();
    }
    public void alterar(Pocao novoPocao) {
        super.alterar(novoPocao);
        gravar();
    }
    public void remover(Pocao novoPocao) {
        super.remover(novoPocao);
        gravar();
    }
}

