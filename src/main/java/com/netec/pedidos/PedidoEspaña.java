/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.pedidos;

//SE IMPORTA COMO STATIC y ACCEDIENDO A TODOS LOS ENUMERADORES (*) PARA PODER USARLOS
//DIRECTAMENTE CON EL NOMBRE DEL MISMO ESPAÑA.getIVA()
import static com.netec.pedidos.enums.Paises.*;

/**
 *
 * @author Java
 */
public class PedidoEspaña extends Pedido {

    @Override
    protected void calcularIVA() {
        pais = ESPAÑA.toString();
        importeIVA = importeSinIVA * ESPAÑA.getIva();
    }
    
}
