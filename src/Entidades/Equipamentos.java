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
public class Equipamentos {
    private double preco;
    private String tipo;
    private int id;
    private String descricao;
    private int nivelminimo;
    private int atk;
    private int def;
    private String raridade;
    private int MagiaFire;
    private int MagiaWater;
    private int MagiaRock;
    private int MagiaAir;
    private int MagiaLight;
    private int MagiaDark;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNivelminimo() {
        return nivelminimo;
    }

    public void setNivelminimo(int nivelminimo) {
        this.nivelminimo = nivelminimo;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public String getRaridade() {
        return raridade;
    }

    public void setRaridade(String raridade) {
        this.raridade = raridade;
    }

    public int getMagiaFire() {
        return MagiaFire;
    }

    public void setMagiaFire(int MagiaFire) {
        this.MagiaFire = MagiaFire;
    }

    public int getMagiaWater() {
        return MagiaWater;
    }

    public void setMagiaWater(int MagiaWater) {
        this.MagiaWater = MagiaWater;
    }

    public int getMagiaRock() {
        return MagiaRock;
    }

    public void setMagiaRock(int MagiaRock) {
        this.MagiaRock = MagiaRock;
    }

    public int getMagiaAir() {
        return MagiaAir;
    }

    public void setMagiaAir(int MagiaAir) {
        this.MagiaAir = MagiaAir;
    }

    public int getMagiaLight() {
        return MagiaLight;
    }

    public void setMagiaLight(int MagiaLight) {
        this.MagiaLight = MagiaLight;
    }

    public int getMagiaDark() {
        return MagiaDark;
    }

    public void setMagiaDark(int MagiaDark) {
        this.MagiaDark = MagiaDark;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
}
