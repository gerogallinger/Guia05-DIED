package gallinger.guia05.died;

public class Estandar extends Servicio {

    public int costoProfesional;

    public int getCostoProfesional() {
        return costoProfesional;
    }

    public void setCostoProfesional(int costoProfesional) {
        this.costoProfesional = costoProfesional;
    }
    public int getCostoServicio() {
        int costoServicio=0;

        costoServicio = this.getCosto() + costoProfesional;
        if(super.isEsUrgente()) {
            double mitadCosto;
            mitadCosto = costoServicio * 0.5;
            costoServicio = costoServicio + (int)mitadCosto;

        }
        return costoServicio;
}


}


