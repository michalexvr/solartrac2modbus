/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrador
 */
public class Conexion {
    
    private static String bd;
    private static String login;
    private static String password;
    private static String url;
    private static Connection connT = null;

    private Conexion()
    {
       // bd="EnergiaMilenium";
       // login="root";
       // password="";
       // url="jdbc:mysql://localhost/"+bd;
    }
    private synchronized static void  CreateOpenConection()
    {
           bd="reportSisT"; //yo root//proximaBaseDe datos EnergiaMilenium
           login="root";
           password="ho upe";// yo kuelule// futuro nada
           url="jdbc:mysql://localhost/"+bd;  //yo localhost  //servidor 20.20.20.2
        try
        {
             Class.forName("com.mysql.jdbc.Driver").newInstance();
             connT = DriverManager.getConnection(url,login,password);
            
        }
        catch(Exception ex)
        {
            System.out.println("Problema con la conexion sin parametros:"+ex);
            //return connT=null;
        }
         
    }
 private synchronized static void  CreateOpenConection(String BD,String log,String Password,String Url)
 {
        bd=BD;
        login=log;
        password=Password;
        url=Url;

    try
    {
             Class.forName("com.mysql.jdbc.Driver").newInstance();
             connT = DriverManager.getConnection(url,login,password);

    }
    catch(Exception ex)
    {
        System.out.println("Problema con la conexion con parametro:"+ex);
    }
 }
 public static Connection getConnection()
 {
    if(connT==null) CreateOpenConection();

    return connT;
 }
 public static Connection getConnection(String BD,String log,String Password,String Url)
 {
    if(connT==null) CreateOpenConection(BD,log,Password,Url);

    return connT;
 }
    public static void closeConectio()
    {
        try
        {
            connT.close();
        }
        catch (SQLException ex)
        {
            System.out.println("Problemas con el cierre de conexion: "+ex);
        }
    }
}
