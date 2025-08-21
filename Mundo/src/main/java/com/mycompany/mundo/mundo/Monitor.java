
package com.mycompany.mundo.mundo;

/**
 *
 * @author Viviana Ortega
 */
public class Monitor extends DispositivoEntrada {
    //creo atributos
    private int idmonitos,contadormonitores;
    private String marcas;
    private double tamano;
    //creo constructores

    private Monitor() {
    }
    public Monitor(  String marca, double tamano) {
        this.idmonitos=contadormonitores++;
        this.marcas = marca;
        this.tamano = tamano;
    }//en el ejercicio pide un string y un double
    
    //constructor super
    public Monitor( String marca, double tamano, String tipoentrada, String marcas) {
        super(tipoentrada, marca);
        this.idmonitos = contadormonitores++;
        
        this.marcas = marcas;
        this.tamano = tamano;
    }
      //creo metodos propios de monitor
     public void monitor(String marca, double tamano){
     this.marcas=marca;
     this.tamano=tamano;

     }
    //creo get and set 
     
    public int getIdmonitos() {
        return idmonitos;
    }

    public int getContadormonitores() {
        return contadormonitores;
    }

    public String getMarcas() {
        return marcas;
    }

    public double getTamano() {
        return tamano;
    }

  
    
    public void setMarcas(String marca) {
        this.marcas = marca;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }
    //contador de monitores no tiene set
        //creo tostring

    @Override
    public String toString() {
        return "Monitor{" + "idmonitos=" + idmonitos + ", marcas=" + marcas + ", tamano=" + tamano + '}';
    }
    

   
}
