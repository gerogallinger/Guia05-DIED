package gallinger.guia05.died;

import java.util.Date;

public class Herramienta {
    public String nombre;
    private int costoPorDia;
    public Date diaDevolucion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCostoPorDia() {
        return costoPorDia;
    }

    public void setCostoPorDia(int costoPorDia) {
        this.costoPorDia = costoPorDia;
    }

    public Date getDiaDevolucion() {
        return diaDevolucion;
    }

    public void setDiaDevolucion(Date diaDevolucion) {
        this.diaDevolucion = diaDevolucion;
    }



}