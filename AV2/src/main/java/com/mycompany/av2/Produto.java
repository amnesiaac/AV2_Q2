/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.av2;

import java.util.ArrayList;

/**
 *
 * @author Bruno
 */
public class Produto {
    private String Nome;
    private int id;
    private int pesagem;
    private double preco;
    private String DescComp;
    private String DescRes;
    private String modelo;
    private double margem;
    private String cor;
    private String obs;
    private String utilidade;
    private double IPI;
    private double ICVS;
    private double frete;
    private double precoVenda;
    private String status;
    private Produto s;
 private ArrayList<Produto>estoque = new ArrayList<Produto>();;
    public String getDescComp() {
        return DescComp;
    }

    public void setEstoque(ArrayList<Produto> estoque) {
        this.estoque = estoque;
    }

    public void setDescComp(String DescComp) {
        this.DescComp = DescComp;
    }

    public String getDescRes() {
        return DescRes;
    }

    public void setDescRes(String DescRes) {
        this.DescRes = DescRes;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getMargem() {
        return margem;
    }

    public void setMargem(double margem) {
        this.margem = margem;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }



    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getUtilidade() {
        return utilidade;
    }

    public void setUtilidade(String utilidade) {
        this.utilidade = utilidade;
    }

    public double getIPI() {
        return IPI;
    }

    public void setIPI(double IPI) {
        this.IPI = IPI;
    }

    public double getICVS() {
        return ICVS;
    }

    public void setICVS(double ICVS) {
        this.ICVS = ICVS;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
   
  
    
 public Produto(String Nome,int Id,int pesagem,double preco,String cor,String DescComp,String DescRes,double frete,double ICVS,double IPI,double margem,String modelo,String obs,double PrecoVenda,String status,String utilidade){
    
  
}

    public ArrayList<Produto> getEstoque() {
        return estoque;
    }


    Produto() {
        
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPesagem() {
        return pesagem;
    }

    public void setPesagem(int pesagem) {
        this.pesagem = pesagem;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void addLista(Produto j,String Nome,int Id,int pesagem,double preco,String cor,String DescComp,String DescRes,double frete,double ICVS,double IPI,double margem,String modelo,String obs,double PrecoVenda,String status,String utilidade){
        this.s = j;
	this.s = new Produto();
   	s.setModelo(modelo);
        s.setNome(Nome);
        s.setCor(cor);
        s.setDescComp(DescComp);
        s.setDescRes(DescRes);
        s.setFrete(frete);
        s.setICVS(ICVS);
        s.setId(Id);
        s.setUtilidade(utilidade);
        s.setStatus(status);
        s.setPrecoVenda(PrecoVenda);
        s.setPreco(preco);
        s.setPesagem(pesagem);
        s.setObs(obs);
        s.setIPI(IPI);
        estoque.add(s);
    }
    public void removeLista(String DescComp){
        for(int i=0;i<estoque.size();i++){
            Produto p = estoque.get(i);
            if(p.getDescComp().equals(DescComp)){
                estoque.remove(p);
                break;
            }
        }
    }
    public int numeroProdutos(){
        int n = estoque.size();
        return n;
    }
    public Produto consultaProduto(int Id){
        for(int i=0;i<estoque.size();i++){
            Produto p = estoque.get(i);
         if(p.id==Id){
             return p;
         }
    }
     return null;
}
    public Produto consultaProdutodesc(String DescComp){
        for(int i=0;i<estoque.size();i++){
            Produto p = estoque.get(i);
         if(p.getDescComp().equals(DescComp)){
             return p;
         }
    }
     return null;
}
    public int produtoMais30(){
       int maistrin=0;
        for(int i=0;i<estoque.size();i++){
             Produto p = estoque.get(i);
        if(p.pesagem>30){
            maistrin++;
        }
    }
        return maistrin;
}
     public int produtoMenos30(){
       int menostrin=0;
        for(int i=0;i<estoque.size();i++){
             Produto p = estoque.get(i);
        if(p.pesagem<30){
            menostrin++;
        }
    }
        return menostrin;
}
     public double TaxaDepreciacao(int Id){
         double td;
         Produto p=new Produto();
         for(int i=0;i<estoque.size();i++){
         
           if(estoque.get(i).id==Id){
               p=estoque.get(i);
           }
         }
           
        td=p.precoVenda*0.02;
         return td;
}
     public double calculoLucroICMS(int Id){
         double lucro;
         double taxaICMS;
         Produto p = new Produto();
         for(int i=0;i<estoque.size();i++){
         
           if(estoque.get(i).id==Id){
               p=estoque.get(i);
           }
         }
         taxaICMS = p.precoVenda*0.18;
         lucro = p.precoVenda - taxaICMS;
         return lucro;
     }
}