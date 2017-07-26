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
public class Clientes {
    private String Raca;
    private String Categoria;
    private int Idade;
    private String Reino;
    private int Level;
    private String Nome;
    private String tipodecliente;
    private String classe;

    /**
     * @return the Idade
     */
    public int getIdade() {
        return Idade;
    }

    /**
     * @param Idade the Idade to set
     */
    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    /**
     * @return the Reino
     */
    public String getReino() {
        return Reino;
    }

    /**
     * @param Reino the Reino to set
     */
    public void setReino(String Reino) {
        this.Reino = Reino;
    }

    /**
     * @return the Level
     */
    public int getLevel() {
        return Level;
    }

    /**
     * @param Level the Level to set
     */
    public void setLevel(int Level) {
        this.Level = Level;
    }

    /**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the tipodecliente
     */
    public String getTipodecliente() {
        return tipodecliente;
    }

    /**
     * @param tipodecliente the tipodecliente to set
     */
    public void setTipodecliente(String tipodecliente) {
        this.tipodecliente = tipodecliente;
    }

    /**
     * @return the classe
     */
    public String getClasse() {
        return classe;
    }

    /**
     * @param classe the classe to set
     */
    public void setClasse(String classe) {
        this.classe = classe;
    }
}
