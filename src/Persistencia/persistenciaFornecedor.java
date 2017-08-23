
package Persistencia;

import Entidades.Fornecedor;
import java.util.List;


public interface persistenciaFornecedor {
    public void inserir(Fornecedor novoFornecedor);
    
    public void alterar(Fornecedor novoFornecedor);
    
    public void remover(Fornecedor novoFornecedor);
    
    public List<Fornecedor> getAll();
}