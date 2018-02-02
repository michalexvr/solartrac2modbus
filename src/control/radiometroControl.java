/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package control;

import Utils.archivo;
import Utils.commonUtils;
import java.util.ArrayList;

/**
 *
 * @author michael
 */
public class radiometroControl {

    public static ArrayList getRadiometros(){

        ArrayList radiometros = new ArrayList();

        for(int i = 0; i<3; i++){
            radiometros.add(i+1);
        }

        return radiometros;
    }

    public static radiometro getRadiometo(int ID){
                double  valor = 0;


                String sep = commonUtils.getSeparator();
                String MechoShadeSourceData = "Mechoshade"+sep+"AACr3"+sep+"Data"+sep+"STdata"+sep;
                archivo arch = new archivo(commonUtils.getPath()+MechoShadeSourceData);

                String[] dirs = arch.getFile().list();

                String lastFile = dirs[0];

                for(int i=1; i< dirs.length; i++)
                    if(dirs[i].indexOf(".sda")>=0 && dirs[i].compareTo(lastFile)>0)
                    lastFile = dirs[i];

                String archivoSource = commonUtils.getPath()+MechoShadeSourceData+lastFile;

                archivo archSource = new archivo(archivoSource);

                String[] content = archSource.LeerLineas();

                //Double rad1=0.0,rad2=0.0,rad3=0.0;
                String idSearch = (ID+3)+",";

                for(int i=0; i<content.length; i++){
                if(content[i].substring(0,2).equals(idSearch) && content[i].indexOf("Rad") < 0 ){
                    int indiceDato = content[i].lastIndexOf(",");
                    if(indiceDato>=0)
                        //return new radiometro(ID,Double.parseDouble(content[i].substring(indiceDato+1)));
                        valor = Double.parseDouble(content[i].substring(indiceDato+1));
                }

        }



                radiometro r = new radiometro(ID,valor);

                return r;

    }
}
