/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Entidades.Mago;
import java.util.List;

/**
 *
 * @author pascal
 */
public interface persistenciaMago {
    public void inserir(Mago novoMago);
    
    public void alterar(Mago novoMago);
    
    public void remover(Mago novoMago);
    
    public Mago buscar(int id, String raça, String Categoria,
            int idade, String Reino, int level, String nome, 
            String tipodecliente, String classe);
    
            public List<Mago> getAll();

}
