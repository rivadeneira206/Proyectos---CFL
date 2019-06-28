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
public class Lunes {
public static VentanaLogin ventanaLogin = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        ventanaLogin = new VentanaLogin();

        System.out.println ("Hola mundo");
        System.out.println ("Como estas");
        
       iniciar();
      
       
    }
     public static void iniciar(){
          ventanaLogin.setVisible(true);   
        }
}
