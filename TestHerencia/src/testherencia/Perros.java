/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testherencia;

/**
 *
 * @author jose luis
 */
public class Perros extends Animales {
    private int cantPelos;// ATRIBUTOS

    public Perros(String nombre,int patas,int cantPelos){
        this.nombre =nombre ;
        this.patas= patas ;
        this.cantPelos = cantPelos;
        energia = 100;
    }

    public void Correr() {
       
    }
        public void Jugar() {
       
    }
}
