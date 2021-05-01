package gallinger.guia05.died;

public class Personalizado extends Servicio {
    public int costoMateriales;
    public int costoTransporte;
    public int presupuesto;

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public int getCostoMateriales() {
        return costoMateriales;
    }

    public void setCostoMateriales(Integer costoMateriales) {
        this.costoMateriales = costoMateriales;
    }

    public int getCostoTransporte() {
        return costoTransporte;
    }

    public void setCostoTransporte(Integer costoTransporte) {
        this.costoTransporte = costoTransporte;
    }
    public int getCostoServicio(){
        int costoServicio =0;
        costoServicio = this.getPresupuesto() + this.getCostoMateriales() + this.getCostoTransporte();
        if(super.isEsUrgente()) {
            double mitadCosto;
            mitadCosto = costoServicio * 0.5;
            costoServicio = costoServicio + (int)mitadCosto;

        }
        return costoServicio;
    }


}

