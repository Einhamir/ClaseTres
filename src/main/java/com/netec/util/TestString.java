/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.util;

/**
 *
 * @author Java
 */
public class TestString {
    
    String nombre = new String("LALO");
    
    public static void main(String[] args) {
        
    }
    
   public void Tests()
   {
       for (; ;) {
           nombre += nombre;
           System.out.println(nombre);
       }
   }
   
}
