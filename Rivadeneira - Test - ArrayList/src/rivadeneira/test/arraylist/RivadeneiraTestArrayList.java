/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rivadeneira.test.arraylist;

import java.util.ArrayList;
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
        ArrayList elem = new ArrayList();//genera un arrayList llamado elem que puede contener cualquier tipo de datos (int,string,double ,etc)
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> elem2 = new ArrayList();//fuerza a que arrayList (elem2) solo reciba datos del tipo entero
        
        int dato;
        /*
        dato = teclado.nextInt();// pide un numero por consola
        
        while (dato >= 0) {
            elem2.add(dato);
            dato = teclado.nextInt();// pide un dato por consola    
        }
        System.out.println(elem2);// imprime el contenido del arraylist elem2
        */
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
    
        ArrayList Mascotas = new ArrayList();
    }

}
