package ar.com.unahur.obj2.practica.Preferencias;

import ar.com.unahur.obj2.practica.Auto;

public class PreferenciaDeKilometraje implements Preferencia {

    private Integer kilometrajeMaximo;

    @Override
    public Boolean seCumplePara(Auto auto) {
        return auto.getKilometraje() <= this.kilometrajeMaximo;
    }

}
