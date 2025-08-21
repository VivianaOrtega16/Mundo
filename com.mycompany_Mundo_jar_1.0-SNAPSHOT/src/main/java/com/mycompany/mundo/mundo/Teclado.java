
package com.mycompany.mundo.mundo;

/**
 *
 * @author IngSis
 */
public class Teclado extends DispositivoEntrada{
    //creo los atributos
    private int idteclado,contadorteclados;
    //creo los constructores de teclado
    public Teclado() {
    }
   
    //creo el cosntructor super

    public Teclado( String tipoentrada, String marca) {
        super(tipoentrada, marca);
        this.idteclado = contadorteclados++;
    
    }
    //creo los get and set

    public int getIdteclado() {
        return idteclado;
    }

    public int getContadorteclados() {
        return contadorteclados;
    }

    public void setIdteclado(int idteclado) {
        this.idteclado = idteclado;
    }

    //creo el tostring

    @Override
    public String toString() {
        return "Teclado{" + "idteclado=" + idteclado + ", contadorteclados=" + contadorteclados + '}';
    }
    
   
    
}
