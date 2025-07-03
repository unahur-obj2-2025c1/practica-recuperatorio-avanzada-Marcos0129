package ar.com.unahur.obj2.practica;

import java.util.HashSet;
import java.util.Set;

import ar.com.unahur.obj2.practica.Servicios.Servicio;

public class Orden {

    private Auto auto;
    private Tecnico tecnicoAsignado;
    private Set<Servicio> serviciosARealizar = new HashSet<>();

    public void agregarServicio(Servicio servicio){
        serviciosARealizar.add(servicio);
    }

    public double calcularCostoDeLosServicios(){
        return null;
        //Recorro con for?
    }
}
