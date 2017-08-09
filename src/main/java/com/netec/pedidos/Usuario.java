/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.pedidos;

/**
 *
 * @author Java
 */
public class Usuario {
    public static void main(String[] args) {
        Pedido pedidoMexico = new  PedidoMexico();
        pedidoMexico.setImporteSinIVA(10000.00);
        pedidoMexico.calcularPrecioConIVA();
        pedidoMexico.visualizar();
        
        Pedido pedidoEspana = new PedidoEspaña();
        pedidoEspana.setImporteSinIVA(5000.00);
        pedidoEspana.calcularPrecioConIVA();
        pedidoEspana.visualizar();
    }
}
