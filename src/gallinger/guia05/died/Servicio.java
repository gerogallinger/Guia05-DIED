package gallinger.guia05.died;

import java.util.Date;

public class Servicio implements Contratable {


    public boolean esUrgente;
    private Oficio oficio;
    private int costo;
    private Object Estandar;
    private Date diaInicio;
    private Date diaFin;


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

    public boolean isEsUrgente() {
        return esUrgente;
    }

    public void setEsUrgente(boolean esUrgente) {
        this.esUrgente = esUrgente;
    }

    public Oficio getOficio() {
        return oficio;
    }

    public void setOficio(Oficio oficio) {
        this.oficio = oficio;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(Integer costo) {
        this.costo = costo;
    }

    public boolean finalizado(){
        if(diaFin != null){
            return true;
        }
        else
            return false;
    }

}

