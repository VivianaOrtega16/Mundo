
package com.mycompany.mundo.mundo;

/**
 *
 * @author IngSis
 */
public class Computadora {
    //creo los atributos
    private int idcomputadora, contadorcomputadoras;
    private String nombre;
    //declaracion del vector
    Monitor monitor[];
    Teclado teclado[];
    Raton raton[];
    //creo los constructores
    
    public Computadora( String nombre, Monitor[] monitor, Teclado[] teclado, Raton[] raton) {
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
        this.idcomputadora=contadorcomputadoras++;
    }
    //creo los metodos propios de computadora
    public void computadora(String nombre, Monitor[] monitor,Teclado[] teclado, Raton[] raton){
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }
    //creo los get and set 
    

    public int getIdcomputadora() {
        return idcomputadora;
    }

    public String getNombre() {
        return nombre;
    }

    public Monitor[] getMonitor() {
        return monitor;
    }

    public Teclado[] getTeclado() {
        return teclado;
    }

    public Raton[] getRaton() {
        return raton;
    }

    public void setIdcomputadora(int idcomputadora) {
        this.idcomputadora = idcomputadora;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMonitor(Monitor[] monitor) {
        this.monitor = monitor;
    }

    public void setTeclado(Teclado[] teclado) {
        this.teclado = teclado;
    }

    public void setRaton(Raton[] raton) {
        this.raton = raton;
    }
    
    //creo el tostring

    @Override
    public String toString() {
        return "Computadora{" + "idcomputadora=" + idcomputadora + ", nombre=" + nombre + ", monitor=" + monitor.toString() + ", teclado=" + teclado.toString() + ", raton=" + raton.toString() + '}';
    }
    
    

    
}
