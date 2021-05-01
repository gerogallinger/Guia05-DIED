package gallinger.guia05.died;

import java.util.Date;
import java.util.List;

public class Alquier implements Contratable {


    private Date diaInicio;
    private Date diaFin;
    public Date diaDevolucion;
    public int costoAlquiler;
    public int cantDias;
    public List<Herramienta> herramientas;

    public Date getDiaInicio() {
        return diaInicio;
    }

    public void setDiaInicio(Date diaInicio) {
        this.diaInicio = diaInicio;
    }
    public Date getDiaFin() {
        return diaFin;
    }

    public void setDiaFin(Date diaFin) {
        this.diaFin = diaFin;
    }

    public Date getDiaDevolucion() {
        return diaDevolucion;
    }

    public void setDiaDevolucion(Date diaDevolucion) {
        this.diaDevolucion = diaDevolucion;
    }

    public int getCostoAlquiler() {
        return costoAlquiler;
    }

    public void setCostoAlquiler(int costoAlquiler) {
        this.costoAlquiler = costoAlquiler;
    }

    public int getCantDias() {
        return cantDias;
    }

    public void setCantDias(Integer cantDias) {
        this.cantDias = cantDias;
    }

    public List<Herramienta> getHerramientas() {

        return herramientas;
    }

    public void setHerramientas(List<Herramienta> herramientas) {
        this.herramientas = herramientas;
    }

    public int CostoAlquiler( ) {

        long difDias=0;
        difDias = diaFin.getTime() - diaInicio.getTime();
        int precioFinal = 0;
        for (Herramienta herramienta : herramientas) {
            precioFinal += difDias * herramienta.getCostoPorDia();
        }
        return precioFinal;
    }

    public boolean enMora(){
        if(diaFin.before(diaDevolucion)){
            return false;
        }
        else
            return true;
    }

    public boolean finalizado (){
        if(diaDevolucion !=null ){
            return true;
        }
        else
            return false;
    }


}

