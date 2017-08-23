/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Entidades.Funcionario;

/**
 *
 * @author pascal
 */
public interface persistenciaFuncionario {
    
    public void inserir(Funcionario novoFuncionario);
    
    public void alterar(Funcionario novoFuncionario);
    
    public void remover(Funcionario novoFuncionario);
    
}
