package gallinger.guia05.died;

public class Trabajador implements Contratable {

    public String nombre;
    private String correoElectronico;
    private int costoPorHora;
    private int porcentajeComision;
    private  Oficio oficio;
    private Servicio servicio;



    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public int getCostoPorHora() {
        return costoPorHora;
    }

    public void setCostoPorHora(int costoPorHora) {
        this.costoPorHora = costoPorHora;
    }

    public int getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(int porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    public Oficio getOficio() {
        return oficio;
    }

    public void setOficio(Oficio oficio) {
        this.oficio = oficio;
    }



    public void agregarTarea(Servicio serv) {
       try{
           if(this.oficio == serv.getOficio()){
               this.servicio = serv;
           }
       }catch (/* OficioNoCoincideException) {
               //lanzar excepcion

    }
        /*
         try {
             //condicion que el trabajador ese dia no tenga otro trabajo agendado
         }
         catch (AgendaOcupadaException)) {
            //lanzar excepcion
         }
        */
    }


}

