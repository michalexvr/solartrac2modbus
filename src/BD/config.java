/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package BD;

import Utils.archivo;
import Utils.commonUtils;

/**
 *
 * @author xion
 */
public class config {

    protected static String link;
    protected static String usuario;
    protected static String password;
    protected static String bd;


    public static void getInstance(){

        archivo arch = new archivo(commonUtils.getPath()+"config.cfg");
        String configuraciones[] = getConfigs(arch);

        

    }

    private static String[] getConfigs(archivo arch){
        return new String[4];
    }
}
