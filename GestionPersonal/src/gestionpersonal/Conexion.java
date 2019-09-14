/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpersonal;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jose luis
 */
public class Conexion {

    private  String ip ;
    private  int puerto;
    private  String baseDeDatos;
    private  String usuario;
    private  String contrasenia;
    private Connection conexion;
    private Statement flujoConexion ;
    private DataInputStream flujoEntrada;
    private DataOutputStream flujosalida;
    

    public Conexion(String ip,int puerto,String baseDeDatos,String usuario,String contrasenia) throws IOException, SQLException {
        this.ip =ip;
        this.puerto=puerto;
        this.baseDeDatos = baseDeDatos;
        this.usuario = usuario;
        this.contrasenia = contrasenia ;
        conexion = DriverManager.getConnection("jdbc:mariadb://"+puerto+ip+":"+puerto+"/"+baseDeDatos+"?user="+usuario+"&password"+contrasenia);
        flujoConexion = conexion.createStatement();
        
        


    }
}
