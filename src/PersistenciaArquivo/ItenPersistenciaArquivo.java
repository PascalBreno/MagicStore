import Entidades.Iten;
import Persistencia.persistenciaIten;
import PersistenciaLista.ItenPersistenciaLista;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class ItenPersistenciaArquivo
        extends ItenPersistenciaLista
        implements persistenciaIten {

    private final String arq = "Iten.db";
    public ItenPersistenciaArquivo(){
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
    public void inserir(Iten novoIten) {
        super.inserir(novoIten);
        gravar();
    }
    public void alterar(Iten novoIten) {
        super.alterar(novoIten);
        gravar();
    }
    public void remover(Iten novoIten) {
        super.remover(novoIten);
        gravar();
    }
}

