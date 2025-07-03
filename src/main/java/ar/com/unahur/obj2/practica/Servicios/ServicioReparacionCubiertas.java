package ar.com.unahur.obj2.practica.Servicios;

import java.util.ArrayList;
import java.util.List;

import ar.com.unahur.obj2.practica.Auto;

public class ServicioReparacionCubiertas implements Servicio{

    private List<String> posiciones = new ArrayList<>();

    @Override
    public void ejecutar(Auto auto) {
        for (String pos : posiciones) {
            auto.getDesgasteCubiertas().put(pos, 0.0);
        }
    }

    public List<String> getPosiciones(){
        return posiciones;
    }

    @Override
    public double costoServicio() {
        return posiciones.size()*200;
    }

}
