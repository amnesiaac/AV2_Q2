/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.av2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Bruno
 */
public class Main{
    public static void main(String[] args){
    Produto produto = new Produto();
    int x=1;
    while(x==1){
    int a = Integer.parseInt(JOptionPane.showInputDialog("Informe o que deseja fazer:\n1-cadastrar\n2-deletar\n3-numero de produtos em estoque\n4-consultar um produto por codigo \n5-listar todos os produtos\n6-listar produtos com mais de 30 kg\n7-listar produtos com menos de 30 kg\n8-consultar produto por descrição\n9-Taxa de depreciação\n10-Lucro"));
                                                 
     switch(a){
         case 1:
            String Nome=JOptionPane.showInputDialog("informe o nome do produto");
             int Id=Integer.parseInt(JOptionPane.showInputDialog("informe o ID"));
             int pesagem=Integer.parseInt(JOptionPane.showInputDialog("inform o peso"));
             double preco= Double.parseDouble(JOptionPane.showInputDialog("Informe o preço"));
             String cor=JOptionPane.showInputDialog("informe a cor do produto");
             String DescComp=JOptionPane.showInputDialog("informe o DescComp");
             String DescRes=JOptionPane.showInputDialog("informe o DescRes");
             double frete=Double.parseDouble(JOptionPane.showInputDialog("Informe o Frete"));
             double ICVS=Double.parseDouble(JOptionPane.showInputDialog("Informe o ICVS"));
             double IPI=Double.parseDouble(JOptionPane.showInputDialog("Informe o IPI"));
             double margem=Double.parseDouble(JOptionPane.showInputDialog("Informe a margem"));
             String modelo=JOptionPane.showInputDialog("informe o modelo");
             String obs=JOptionPane.showInputDialog("informe uma observação");
             double PrecoVenda=Double.parseDouble(JOptionPane.showInputDialog("Informe o preço da venda"));
             String Status = JOptionPane.showInputDialog("informe o status ");
             String utilidade=JOptionPane.showInputDialog("informe a utilidade");
            
            produto.addLista(produto, Nome, Id, pesagem, preco, cor, DescComp, DescRes, frete, ICVS, IPI, margem, modelo, obs, PrecoVenda, Status, utilidade);
            break;
         case 2:
             
             String DescComp1 = JOptionPane.showInputDialog("Informe o DescComp do produto que você deseja remover");
             produto.removeLista(DescComp1);
             break;
         case 3:
             
             int n = produto.numeroProdutos();
             JOptionPane.showMessageDialog(null,"Numero de Produtos em estoque:"+n);
             break;
         case 4:
             Produto p;
             
             int Id1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o Id do produto que deseja consultar"));
             p = produto.consultaProduto(Id1);
             if(p==null){
                 JOptionPane.showMessageDialog(null, "produto não existe");
             }
             JOptionPane.showMessageDialog(null,"Nome:"+p.getNome()+"\nId"+p.getId()+"\nPeso"+p.getPesagem()+"\nPreço:"+p.getPreco()+"\nCor:"+p.getCor()+"\nDescComp:"+p.getDescComp()+"\nModelo:"+p.getModelo()+"\nObs:"+p.getObs()+"\nStatus:"+p.getStatus()+"\nFrete:"+p.getFrete());
             break;
         case 5:
           
             ArrayList<Produto> estoque = produto.getEstoque();
             for(int i=0;i<estoque.size();i++){
                 Produto p1 = estoque.get(i);
                 JOptionPane.showMessageDialog(null,"Nome:"+p1.getNome()+"\nId"+p1.getId()+"\nPeso"+p1.getPesagem()+"\nPreço:"+p1.getPreco()+"\nCor:"+p1.getCor()+"\nDescComp:"+p1.getDescComp()+"\nModelo:"+p1.getModelo()+"\nObs:"+p1.getObs()+"\nStatus:"+p1.getStatus()+"\nFrete:"+p1.getFrete());
       
             }
             break;
         case 6:
            
             int qtd = produto.produtoMais30();
             JOptionPane.showMessageDialog(null, "Número de produtos com mais de 30 kg:"+qtd);
             break;
         case 7:
             
            int qtd1 = produto.produtoMenos30();
            JOptionPane.showMessageDialog(null, "Número de produtos com menos de 30 kg:"+qtd1);
            break;
         case 8:
             
             Produto p2;
             String Desc= JOptionPane.showInputDialog("Informe a descrição do produto que deseja consultar");
             p2 = produto.consultaProdutodesc(Desc);
             if(p2==null){
                 JOptionPane.showMessageDialog(null, "Produto não existe");
             }
             JOptionPane.showMessageDialog(null,"Nome:"+p2.getNome()+"\nId"+p2.getId()+"\nPeso"+p2.getPesagem()+"\nPreço:"+p2.getPreco()+"\nCor:"+p2.getCor()+"\nDescComp:"+p2.getDescComp()+"\nModelo:"+p2.getModelo()+"\nObs:"+p2.getObs()+"\nStatus:"+p2.getStatus()+"\nFrete:"+p2.getFrete());
             break;
         case 9:
             
             double td;
             int id =Integer.parseInt(JOptionPane.showInputDialog("Informe o Id do produto para ser feito o calculo da "));
             td = produto.TaxaDepreciacao(id);
             JOptionPane.showMessageDialog(null, "Taxa de Depreciação"+td);
             break;
         case 10:
             
             double lucro;
             int id1=Integer.parseInt(JOptionPane.showInputDialog("Informe o Id do produto para ser feito o calculo de lucro"));
             lucro = produto.calculoLucroICMS(id1);
             JOptionPane.showMessageDialog(null, "Lucro:"+lucro);
             break;
         default:
             JOptionPane.showMessageDialog(null, "Operação invalida");
     }
     x=Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para continuar o programa, digite qualquer outro numero se deseja sair"));
     }
    }
    }
