/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author breno
 */
public class Pocao extends Iten{
    private String TipoDePocao;
    private String descricao;
    private String classe;

    public String getTipoDePocao() {
        return TipoDePocao;
    }

    public void setTipoDePocao(String TipoDePocao) {
        this.TipoDePocao = TipoDePocao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
    
}
