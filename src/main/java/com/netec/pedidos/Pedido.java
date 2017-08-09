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
public abstract class Pedido {
    
    protected String pais;
    protected double importeSinIVA;
    protected double importeIVA;
    protected double importeConIVA;
    
    protected abstract void calcularIVA();
    
    public void calcularPrecioConIVA(){
        this.calcularIVA();
        importeConIVA = importeSinIVA + importeIVA;
    }
    
    public void setImporteSinIVA(double importeSinIVA){
        this.importeSinIVA = importeSinIVA;
    }
    
    public void visualizar(){
        System.out.println("Pedido:"+ this.pais);
        System.out.println("Importe sin IVA: "+importeSinIVA);
        System.out.println("Importe IVA: "+importeIVA);
        System.out.println("Importe con IVA: "+importeConIVA);
        
    }
}
