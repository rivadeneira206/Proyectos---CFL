/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rivadeneira.test.arraylist;

/**
 *
 * @author jose luis
 */
public class Mascotas {
    private  String nombre;// ATRIBUTOS
    private int edad;// ATRIBUTOS
    private int patas;// ATRIBUTOS


    public Mascotas(String nombre, int patas, int edad) {//construcctor
        this.nombre = nombre;
        this.edad = edad;
        this.patas = patas;
    }

    public  String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
}
