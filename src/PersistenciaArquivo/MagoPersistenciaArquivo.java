package PersistenciaArquivo;

import Entidades.Mago;
import Persistencia.persistenciaMago;
import PersistenciaLista.MagoPersistenciaLista;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class MagoPersistenciaArquivo
        extends MagoPersistenciaLista
        implements persistenciaMago {

    private final String arq = "Mago.db";
    public MagoPersistenciaArquivo(){
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
    public void inserir(Mago novoMago) {
        super.inserir(novoMago);
        gravar();
    }
    public void alterar(Mago novoMago) {
        super.alterar(novoMago);
        gravar();
    }
    public void remover(Mago novoMago) {
        super.remover(novoMago);
        gravar();
    }
}

