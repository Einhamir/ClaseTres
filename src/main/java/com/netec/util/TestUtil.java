/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.util;
import com.netec.util.Herramientas;
/**
 *
 * @author Java
 */
public class TestUtil {
    
    
    private static final boolean[] switches = new boolean[5];
    
    //BLOQUE STATIC DE EJECUCION PREVIA AL MAIN USADO COMUNMENTE PARA LA PRECARGA DE VALORES 
    //QUE SERAN USADOS EN EL PROYECTO
    //SOLO SE EJECUTAN UNA VEZ EN EL CICLO DE VIDA DEL PROGRAMA AL INICIO
    static{
        System.out.println("Iniciando..........");
        for (int i = 0; i < 5; i++) {
            switches[i] = true;
        }
    }
    
    //METODO STATIC
    public static void main(String[] args) {
        
        switches[1] = false;
        switches[2] = false;
        //FOR EACH
        for (boolean swit : switches) {
            System.out.println(swit);
        }
        
       System.out.println(Herramientas.getFecha("08/08/2017"));
    }
}
