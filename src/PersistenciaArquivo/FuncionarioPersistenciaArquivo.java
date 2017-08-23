import Entidades.Funcionario;
import Persistencia.persistenciaFuncionario;
import PersistenciaLista.FuncionarioPersistenciaLista;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class FuncionarioPersistenciaArquivo
        extends FuncionarioPersistenciaLista
        implements persistenciaFuncionario {

    private final String arq = "Funcionario.db";
    public FuncionarioPersistenciaArquivo(){
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
    public void inserir(Funcionario novoFuncionario) {
        super.inserir(novoFuncionario);
        gravar();
    }
    public void alterar(Funcionario novoFuncionario) {
        super.alterar(novoFuncionario);
        gravar();
    }
    public void remover(Funcionario novoFuncionario) {
        super.remover(novoFuncionario);
        gravar();
    }
}

