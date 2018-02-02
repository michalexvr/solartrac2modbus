/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package solartrac2modbus;

import control.*;
//import java.util.Vector;

/**
 *
 * @author michael
 */
public class testMain {
public static void main(String args[]){

    //medidor med = medidorControl.getMedidor(37);
    int id = 1;
    radiometro rad = radiometroControl.getRadiometo(id);
    /*
    System.out.println(Float.intBitsToFloat(med.getCorrienteL1()));
    System.out.println(Float.intBitsToFloat(med.getDemandaMaximaImport()));
    System.out.println(Float.intBitsToFloat(med.getPotenciaMedia()));
    
    System.out.println("E i: "+med.getEnergiaImport()+" Wh");
    System.out.println("E e: "+med.getEnergiaExport()+" Wh");
    System.out.println("corriente: "+med.getCorrienteL1()+" A");
    System.out.println("voltaje: "+med.getVoltajeL1()+" V");
    System.out.println("DM i: "+med.getDemandaMaximaImport()+" W");
    System.out.println("Potencia media: "+med.getPotenciaMedia()+" W");
    medidorFactory medidores = new medidorFactory();
*/
    radiometroFactory radiometros = new radiometroFactory();
    byte b = (byte) (id & 0xFF);

    int value = (int)(rad.getValor()*1000);
    
    if(radiometros.exist(id))System.out.println("radiometro "+b+" existe, value= "+value);
    else System.err.println("radiometro "+id+" no existe");
    
/*
    if(medidores.exist(b)) System.out.println("medidor "+b+" existe");
    else System.err.println("medidor "+id+" no existe");

 */
/*        ArrayList meds= medidorControl.getMedidores();

        System.out.println("Hay "+meds.size()+" medidores");

        for(int i = 0; i<meds.size(); i++){
            System.out.println("medidor: "+meds.get(i).toString()+"");
        }*/

    /*

        //System.out.println(Utils.commonUtils.getPath());
        String sep = commonUtils.getSeparator();
        String MechoShadeSourceData = "Mechoshade"+sep+"AACr3"+sep+"Data"+sep+"STdata"+sep;
        //System.out.println(commonUtils.getPath()+MechoShadeSourceData);
        archivo arch = new archivo(commonUtils.getPath()+MechoShadeSourceData);

        //if(arch.existe()) System.out.println("existe");
        //else System.out.println("no existe");

        String[] dirs = arch.getFile().list();

        String lastFile = dirs[0];

        for(int i=1; i< dirs.length; i++)
            if(dirs[i].indexOf(".sda")>=0 && dirs[i].compareTo(lastFile)>0)
                lastFile = dirs[i];

        //System.out.println(lastFile);
        String archivoSource = commonUtils.getPath()+MechoShadeSourceData+lastFile;

        //System.out.println(archivoSource);

        archivo archSource = new archivo(archivoSource);

        String[] content = archSource.LeerLineas();

        Double rad1=0.0,rad2=0.0,rad3=0.0;

        for(int i=0; i<content.length; i++){
            if(content[i].substring(0,2).equals("4,") && content[i].indexOf("Rad") < 0 ){
                int indiceDato = content[i].lastIndexOf(",");
                if(indiceDato>=0)
                    rad1 = Double.parseDouble(content[i].substring(indiceDato+1));

            }
            if(content[i].substring(0,2).equals("5,") && content[i].indexOf("Rad") < 0 ){
                int indiceDato = content[i].lastIndexOf(",");
                if(indiceDato>=0)
                    rad2 = Double.parseDouble(content[i].substring(indiceDato+1));
            }
            if(content[i].substring(0,2).equals("6,") && content[i].indexOf("Rad") < 0 ){
                int indiceDato = content[i].lastIndexOf(",");
                if(indiceDato>=0)
                    rad3 = Double.parseDouble(content[i].substring(indiceDato+1));
            }
        }

        System.out.println("rad 1: "+rad1+", rad2: "+rad2+", rad3: "+rad3);
        //    System.out.println(content[i]);

     */
    }
}
