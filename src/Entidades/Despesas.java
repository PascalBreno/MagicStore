/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author breno
 */
public class Despesas {
    private float ValordasDespezas;
    private Date data;
    private String TipoDePagamento;

    public float getValordasDespezas() {
        return ValordasDespezas;
    }

    public void setValordasDespezas(float ValordasDespezas) {
        this.ValordasDespezas = ValordasDespezas;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTipoDePagamento() {
        return TipoDePagamento;
    }

    public void setTipoDePagamento(String TipoDePagamento) {
        this.TipoDePagamento = TipoDePagamento;
    }
}
