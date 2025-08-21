/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mundo.mundo;

/**
 *
 * @author vivid
 */
public class PruebaMundo {
    public static void main(String[] args) {
        //declaro los vectores instancio e inicializo los vectores  monitor 
        Monitor monitores[];
        monitores=new Monitor[2];
        monitores[0]=new Monitor("apple",11);
        monitores[1]=new Monitor("huwei",11);
        //declaro los vectores instancio e inicializo los vectores  raton
        Raton ratones[];
        ratones=new Raton[2];
        ratones[0]=new Raton("inhalambrico","apple");//use super cosntructor
        ratones[1]=new Raton("cable","apple");
        //declaro los vectores instancio e inicializo los vectores  teclado
        Teclado teclados[];
        teclados=new Teclado[2];
        teclados[0]=new Teclado("cable","claro");//use el super constructor
        teclados[1]=new Teclado("inhalambrco","claro");
        //declaro los vectores instancio e inicializo los vectores  computadora
        Computadora computadores[];
        computadores=new Computadora[2];
        //computadores=new Computadora("",monitores, teclados, ratones);
        Computadora objeto=new Computadora("",monitores, teclados, ratones);
        System.out.println("objeto computadora;"+objeto.toString());
        //creo el objeto orden
        //imprimo el objeto orden
    }

   
}
