package ar.com.unahur.obj2.practica.Servicios;

import ar.com.unahur.obj2.practica.Auto;
import ar.com.unahur.obj2.practica.SuspensionNoDisponibleException;

public class ServicioReparacionSuspencion implements Servicio{

    private String tipoDeSuspension;    //Delantera o Trasera

    public Boolean esDelantera(){
        return this.getSuspension() == "Delantera";
    }

    public Boolean esTrasera(){
        return this.getSuspension() == "Trasera";
    }

    public void verSuspension(String suspension) throws SuspensionNoDisponibleException{
        if (this.esDelantera() || this.esTrasera()){
            throw new SuspensionNoDisponibleException("Solo existe Delantera o trasera");
        }
        this.setSuspension(suspension);
    }

    public String getSuspension(){
        return tipoDeSuspension;
    }

    public void setSuspension(String suspension){
        this.tipoDeSuspension = suspension;
    }

    @Override
    public void ejecutar(Auto auto) {
        if (this.esDelantera()){
            auto.setDesgasteSuspensionDelantera(0.0);
        }else{
            auto.setDesgasteSuspensionTrasera(0.0);
        }
    }

    @Override
    public double costoServicio() {
        double costoFinal;
        if (this.esDelantera()){
            costoFinal = 1500.0;      //1500 la delantera
        }else{
            costoFinal = 1200.0;      //1200 la trasera
        }
        return costoFinal;
    }
}
