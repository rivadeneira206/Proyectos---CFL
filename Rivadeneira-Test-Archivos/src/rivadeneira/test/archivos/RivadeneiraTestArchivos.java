/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rivadeneira.test.archivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author jose luis
 */
public class RivadeneiraTestArchivos {

//private static void escribirArchivoTexto() {
//       // FileWriter file = null;
//      //  PrintWriter escritor = null;
//       // try {
//           // file = new FileWriter("users.txt", true);
//            //el "False" O "True" es para sobrescribir lo anterior o seguir escribiendo en la misma hoja
//           // escritor = new PrintWriter(file);
//           // escritor.println("Muy bien!");
//           // escritor.flush(); 
//           // escritor.close();
//      //  } catch (IOException ex) {
//        //    System.out.println(ex.getMessage());
//        }
//    }
//
//    private static void leerArchivoTexto() {
//        FileReader file = null;
//        BufferedReader lector = null;
//        try {
//            file = new FileReader("users.txt");
//            lector = new BufferedReader(file);
//            String texto = lector.readLine(); //lee la primera linea del archivo de texto
//            while  (texto != null) {
//                System.out.println(texto.split(";;;")[0]);
//                texto = lector.readLine();//actualiza el contenido de la variable string hasta que llegue al final del archivo en el que va a valer =null y sale del while
//            }
//            lector.close();
//        } catch (FileNotFoundException ex) {
//            System.out.println(ex.getMessage());
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
  
   private static VentanaLogin ventanaLogin;
   private static Ventana ventana;
   
    
    public static void main(String[] args) {
        // TODO code application logic here
       //  escribirArchivoTexto();
   // VentanaLogin ventana  = new VentanaLogin();//creamos un objeto ventana del tipo VentanaLogin
    //ventana.setVisible(true);
    //Ventana ventana2 = new Ventana();
    
    mostrarLogin();
    
    }
    public static void mostrarLogin(){
         ventanaLogin = new VentanaLogin();
        ventanaLogin.setVisible(true);
    }
    public static void mostrarVentanaPrincipal(){
        ventanaLogin.setVisible (false);
        ventana=new Ventana();
        ventana.setVisible(true);
    }
}
 