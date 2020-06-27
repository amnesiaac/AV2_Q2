/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.av2;

/**
 *
 * @author Bruno
 */
public class produtoIndustrializado extends Produto{
    private String Fabricante;
    private String Fornecedor;
    private String Marca;
 

    public produtoIndustrializado(String Nome, int Id, int pesagem, double preco, String cor, String DescComp, String DescRes, double frete, double ICVS, double IPI, double margem, String modelo, String obs, double PrecoVenda, String status, String utilidade) {
        super(Nome, Id, pesagem, preco, cor, DescComp, DescRes, frete, ICVS, IPI, margem, modelo, obs, PrecoVenda, status, utilidade);
    }

    public produtoIndustrializado() {
    }
    
}
