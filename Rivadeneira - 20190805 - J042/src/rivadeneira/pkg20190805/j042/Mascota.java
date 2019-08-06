/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rivadeneira.pkg20190805.j042;

/**
 *
 * @author jose luis
 */
public class Mascota {
    
    private String nombre;// ATRIBUTOS
    private int edad;// ATRIBUTOS
    private int patas;// ATRIBUTOS
    private String tipo;// ATRIBUTOS

    public Mascota(String nombre, int edad, int patas, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.patas = patas;
        this.tipo = tipo;
    }

    public String getNombre() {
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public  boolean sosMayorA(int edad){
        
    }
}
