/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rivadeneira.proyecto.lunes;

/**
 *
 * @author jose luis
 */
public class PersonaCorta {
   
    private static String nombre;// ATRIBUTOS
    private String apellido;// ATRIBUTOS
    private int edad;// ATRIBUTOS

    public PersonaCorta(String nombre, String apellido, int edad) {//construcctor
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
}
