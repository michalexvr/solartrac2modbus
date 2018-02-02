/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package control;

/**
 *
 * @author michael
 */
public class radiometro {

    protected int id;
    protected double valor;

    public radiometro(int id, double valor){
        this.id = id;
        this.valor = valor;
    }

    public radiometro(){
        this.id = 0;
        this.valor = 0;
    }

    public int getId(){
        return id;
    }

    public double getValor(){
        return valor;
    }
}
