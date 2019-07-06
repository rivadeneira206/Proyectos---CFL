/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rivadeneira.test.arraylist;

import java.util.ArrayList;

/**
 *
 * @author jose luis
 */
public class Persona {

    private String nombre;// ATRIBUTOS
    private int edad;// ATRIBUTOS
    private ArrayList<Mascotas> mascotas;

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

    public Persona(String nombre, int edad) {//construcctor
        this.nombre = nombre;
        this.edad = edad;
        mascotas = new ArrayList();
    }

    public int agregarMascota(Mascotas mascota) {
        mascotas.add(mascota);
        return mascotas.size();
        
    }
    public int cuantasMascotasTenes(){
        return mascotas.size();
    }
}
