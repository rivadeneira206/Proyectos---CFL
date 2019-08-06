/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rivadeneira.pkg20190805.j042;

import java.util.ArrayList;

/**
 *
 * @author jose luis
 */
public class Persona {
    private  int id;// ATRIBUTOS
    private String nombre;// ATRIBUTOS
    private String apellido;// ATRIBUTOS
    private int edad;// ATRIBUTOS
    private int dni;// ATRIBUTOS
    private ArrayList <Mascota> mascotas;
    
    
    public Persona(int id, String nombre, String apellido, int edad, int dni) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        mascotas = new ArrayList();
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
    public  boolean estaLaMascota(String nombre){
        
    }

    public int cuantasMascotaTenes(){
        
    } 
    
}
