
package com.mycompany.mundo.mundo;

/**
 *
 * @author Viviana Ortega
 */
public class Orden {
    //creo los atributos
    private int idorden,contadorordenes,contadorcomputadoras,maxcomputadoras;
    Computadora computadoras[];//declaracion del vector
    //creo los cosntructores

    public Orden() {
    }

    public Orden(int idorden, int contadorordenes, int contadorcomputadoras, int maxcomputadoras, Computadora[] computadoras) {
        this.idorden = idorden;
        this.contadorordenes = contadorordenes;
        this.contadorcomputadoras = contadorcomputadoras;
        this.maxcomputadoras = maxcomputadoras;
        this.computadoras = computadoras;
    }
    //creo los metodos propios
    public int orden(){
     this.idorden=this.contadorcomputadoras;
     return contadorcomputadoras;
    }
    public void agregarComputadora(Computadora[] computadoras){
        
    //aqui debo crear una computadora y no se como ? instanciandola?
    }
    public double calculartotal(double precio){
        double total=precio*computadoras.length;
        
       //debo sacar el precio de cada orden y sumarlo 
    return total; 
    
    }
    
    //quedan faltando 3 mas
    //creo los get and set 

    public int getIdorden() {
        return idorden;
    }

    public int getContadorordenes() {
        return contadorordenes;
    }

    public int getContadorcomputadoras() {
        return contadorcomputadoras;
    }

    public int getMaxcomputadoras() {
        return maxcomputadoras;
    }

    public Computadora[] getComputadoras() {
        return computadoras;
    }

    public void setIdorden(int idorden) {
        this.idorden = idorden;
    }

    public void setContadorordenes(int contadorordenes) {
        this.contadorordenes = contadorordenes;
    }

    public void setContadorcomputadoras(int contadorcomputadoras) {
        this.contadorcomputadoras = contadorcomputadoras;
    }

    public void setMaxcomputadoras(int maxcomputadoras) {
        this.maxcomputadoras = maxcomputadoras;
    }

    public void setComputadoras(Computadora[] computadoras) {
        this.computadoras = computadoras;
    }
    //creo el to string

    @Override
    public String toString() {
        return "Orden{" + "idorden=" + idorden + ", contadorordenes=" + contadorordenes + ", contadorcomputadoras=" + contadorcomputadoras + ", maxcomputadoras=" + maxcomputadoras + ", computadoras=" + computadoras.toString() + '}';
    }
    
}
