/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpersonal;

import java.io.IOException;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author jose luis
 */
public class GestionPersonal {
private static MenuPrincipal menuPrincipal;
private static CargaUsuarios cargaUsuarios;
private static GenerarTablas generarTablas;
    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws SQLException, IOException {
        Conexion conexionDb = new Conexion("127.0.0.1",3306,"cfl401","programador","cfl401");
        
        menuPrincipal = new MenuPrincipal ();
        cargaUsuarios = new CargaUsuarios ();
        generarTablas = new GenerarTablas () ;
        
        if (primerUsuario ()){
           cargaUsuarios.setVisible(true);
           menuPrincipal.setVisible(false);
        }else{
           menuPrincipal.setVisible(true); 
        }
        
        //Conexion cliente = new Conexion("cliente");
       // menuPrincipal.setVisible(true);
    }
public static void cambiarVentana(String x){
    ocultarVentanas ();
    
    switch (x){
    case "menuPrincipal": menuPrincipal.setVisible(true);
        break;
    case "cargaUsuarios": cargaUsuarios.setVisible(true);
        break;
    case "GenerarTablas": generarTablas.setVisible(true);
        break;
        default : JOptionPane.showMessageDialog(null, "opcion no se se encontro");
}
    
    
   
    
}     
public static void ocultarVentanas (){
    menuPrincipal.setVisible(false);
    cargaUsuarios.setVisible(false);
    generarTablas.setVisible(false);  
}
private static boolean primerUsuario (){
    return false ;
}
}
