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
public class Aves extends Animales {
    private int alas;// ATRIBUTOS
    private int cantPlumas ;

    public Aves(String nombre,int patas,int alas ,int cantPlumas){
        this.nombre = nombre;
        this.patas = patas ;
        this.alas = alas;
        this.cantPlumas = cantPlumas;
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public int getCantPlumas() {
        return cantPlumas;
    }

    public void setCantPlumas(int cantPlumas) {
        this.cantPlumas = cantPlumas;
    }
    
    
        public void Volar() {
       
    }
}
