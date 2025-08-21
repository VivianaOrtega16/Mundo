
package com.mycompany.mundo.mundo;

/**
 *
 * @author IngSis
 */
public class DispositivoEntrada {
    //creo atributos
    private String tipoentrada, marca;
    //creo constructores

    public DispositivoEntrada() {
    }

    public DispositivoEntrada(String tipoentrada, String marca) {
        this.tipoentrada = tipoentrada;
        this.marca = marca;
    }
    //creo los metodos 
    
    public String getTipoentrada() {
        return tipoentrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setTipoentrada(String tipoentrada) {
        this.tipoentrada = tipoentrada;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "DispositivoEntrada{" + "tipoentrada=" + tipoentrada + ", marca=" + marca + '}';
    }
    
}
