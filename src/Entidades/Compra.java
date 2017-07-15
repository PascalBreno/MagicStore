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
public class Compra {
    private String FormadePagamento;
    private float PrecoTotal;
    private Date DataCompra;
    private int Quantidade;

    public String getFormadePagamento() {
        return FormadePagamento;
    }

    public void setFormadePagamento(String FormadePagamento) {
        this.FormadePagamento = FormadePagamento;
    }

    public float getPrecoTotal() {
        return PrecoTotal;
    }

    public void setPrecoTotal(float PrecoTotal) {
        this.PrecoTotal = PrecoTotal;
    }

    public Date getDataCompra() {
        return DataCompra;
    }

    public void setDataCompra(Date DataCompra) {
        this.DataCompra = DataCompra;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }
}
