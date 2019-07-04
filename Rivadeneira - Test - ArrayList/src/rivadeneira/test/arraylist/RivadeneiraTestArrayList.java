/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rivadeneira.test.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author jose luis
 */
public class RivadeneiraTestArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /*  ArrayList elem = new ArrayList();//genera un arrayList llamado elem que puede contener cualquier tipo de datos (int,string,double ,etc)
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> elem2 = new ArrayList();//fuerza a que arrayList (elem2) solo reciba datos del tipo entero
        
        int dato;
       
        dato = teclado.nextInt();// pide un numero por consola
        
        while (dato >= 0) {
            elem2.add(dato);
            dato = teclado.nextInt();// pide un dato por consola    
        }
        System.out.println(elem2);// imprime el contenido del arraylist elem2
        
        try {                       // intenta llenar dato con un int si no puede continua en catch
            dato= teclado.nextInt();
            System.out.println(elem2);
        }catch (Exception e){      //devuelve un error pero no rompe el programa
            System.out.println(e.toString());
    }



        elem.add("Perro");//agrega nuevos datos al arrayList 
        elem.add(4);
        elem.add(7);
        System.out.println(elem);// muestra el contenido totas del arrayList
         */
        ArrayList<Mascotas> mascotas = new ArrayList();
        //Mascotas perro1 = new Mascotas("tory", 4, 22);  //iniciando un nuevo objeto del tipo de dato Mascotas
        //mascotas.add(new Mascotas("tory", 4, 22));//genera un nuevo elemento del tipo Mascotas lo agrega a la lista mascotas y lo presetea sin pasar por una variable como gato1 
        //System.out.println(mascotas);
        // Mascotas gato1 = new Mascotas ("mish",3,10);//crea un elemento gato1 y lo setea con tres datos mish ,3,10
        //Mascotas loro1 = new Mascotas ("poly",2,25);
        //mascotas.add (gato1);//agrega el elemento gato1 a la variable mascotas del tipo Mascotas
        //mascotas.add (loro1);//agrega el elemento loro a la variable mascotas del tipo Mascotas
        //mascotas.add(new Mascotas("tory", 4, 22));
        //mascotas.add(new Mascotas("mish", 3, 10));
        //mascotas.add(new Mascotas("poly", 2, 25));
        //System.out.println(mascotas);

        String elNombre ;
        int canPatas;
        int laEdad;
       
            System.out.println("ingrese el nombre de la mascota o ponga salir ");
            elNombre = teclado.nextLine();// pide un nombre por consola

       // while (!elNombre.equals("salir")) {// si el nombre es distinto a salir que entre
       while (!elNombre.toUpperCase().equals("salir".toUpperCase())) {// si el nombre es distinto a salir que entre
            System.out.println("ingrese las patas de la mascota");
            canPatas = teclado.nextInt();// pide patas por consola
            System.out.println("ingrese la edad de la mascota ");
            laEdad = teclado.nextInt();// pide  edad por consola
            mascotas.add(new Mascotas(elNombre, canPatas, laEdad));
            teclado.nextLine();
            System.out.println("ingrese el nombre de la mascota o ponga salir ");
            elNombre = teclado.nextLine();// pide un nombre por consola

            
        }
            //System.out.println(mascotas);
            
            Iterator it = mascotas.iterator(); //el iterador recorre el arraylist
            //it.hasNext();//pregunta si hay un proximo elemento en la lista y devuelve un true o false
            //it.next();// va a dar el proximo elemento , primero se pregunta con hasNext
            
            while (it.hasNext()) {
              //System.out.println( ((Mascotas)it.next()).getNombre() );
              
              Mascotas mascota = (Mascotas) it.next();
              System.out.println(" nombre " + mascota.getNombre()+ " patas " + mascota.getPatas()+ " edad " + mascota.getEdad());
            }
    }

}
