/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package solartrac2modbus;

import control.radiometroFactory;
import java.io.IOException;
import java.net.*;
import jmodbus.*;

/**
 *
 * @author michael
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here


        //int nConex = 3;

        //int puerto = 3400;//502;
        int puerto = Modbus.DEFAULT_PORT;
        ServerSocket ss = null;
        Socket s = null;

        Thread hilo;
        ModbusTCPSlave mod;

        try{
            ss = new ServerSocket(puerto);
        }catch(IOException e ){
            e.printStackTrace();
        }


        while(true){
            try{
                s = ss.accept();
                //mod = new ModbusTCPSlave(IdDev,s);
                mod = new ModbusTCPSlave(new radiometroFactory(),s);
                hilo = new Thread(mod);
                hilo.start();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }

}
