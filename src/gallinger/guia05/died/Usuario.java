package gallinger.guia05.died;

import java.util.List;

public class Usuario {

    public Integer nroTarjetaDebito;
    public List<Contratable> itemsContratados;


    public Integer getNroTarjetaDebito() {
        return nroTarjetaDebito;
    }

    public void setNroTarjetaDebito(Integer nroTarjetaDebito) {
        this.nroTarjetaDebito = nroTarjetaDebito;
    }

    public void contratar(){

        int cantAlq=0;
        for(int i=0;i< itemsContratados.size(); i++){
            if(itemsContratados.get(i).finalizado()==false){
                cantAlq++;

            }
        }
        try{
            if(cantAlq=<2){


            }
        }
        catch (/*AlquilerNoEntregadoException*/) {
            //lanzar excepcion
        }

    }


}