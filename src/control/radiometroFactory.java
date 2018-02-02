/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package control;

import java.util.ArrayList;
/**
 *
 * @author michael
 */
public class radiometroFactory {

    protected ArrayList radiometros;

    public radiometroFactory(){
        radiometros = radiometroControl.getRadiometros();
    }

    public boolean exist(int ID){
        //para el titanium haciamos esto:
        //String realSerie = medidorControl.getRealNSerie(ID);

        for(int i=0; i<radiometros.size(); i++){
            //para el titanium haciamos esto:
            //if(medidores.get(i).toString().equals(realSerie)) return true;
            if(radiometros.get(i).toString().equals(Integer.toString(ID))) return true;
        }

        return false;
    }
    

}
