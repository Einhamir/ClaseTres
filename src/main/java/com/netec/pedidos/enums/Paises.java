/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.pedidos.enums;

/**
 *
 * @author Java
 */
public enum Paises {
    MEXICO(.16f), //EL IVA COMO PARAMETRO CUANDO SE LLAMA AL ENUM CORRESPONDIENTE, PARA AL CONSTRUCTOR
    ESPAÑA(.21f),
    ARGENTINA(.20f),
    FRANCIA(.30f);
    
    private float iva;

    //EN EL ENUM SE PASA EL IVA COMO PARAMETRO Y SE HACE OBTIENE POR MEDIO DEL GET
    private Paises(float iva)
    {
        this.iva = iva;
    }
    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }
    
    
}
