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
    private static String nombre;// ATRIBUTOS
    private int edad;// ATRIBUTOS
    private int patas;// ATRIBUTOS


    public Mascotas(String nombre, int edad, int patas) {//construcctor
        this.nombre = nombre;
        this.edad = edad;
        this.patas = patas;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Mascotas.nombre = nombre;
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
