
package com.mycompany.mundo.mundo;

/**
 *
 * @author Viviana Ortega
 */
public class Raton extends DispositivoEntrada{
    private int idraton,contadorratones;
    //constructor super
    public Raton( String tipoentrada, String marca) {
        super(tipoentrada, marca);
        this.idraton = contadorratones++;
        
    }
    //constructor vacio
    public Raton() {
    }

   
   
    //creo los get and set
     public int getIdraton() {
        return idraton;
    }

    public int getContadorratones() {
        return contadorratones;
    }

   
    //contador no tiene set
    
    //to string

    @Override
    public String toString() {
        return "Raton{" + "idraton=" + idraton + ", contadorratones=" + contadorratones + '}';
    }
    
}
