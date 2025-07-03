package ar.com.unahur.obj2.practica.Preferencias;

import ar.com.unahur.obj2.practica.Auto;

public class PreferenciaDeMarca implements Preferencia{

    private String marcaDeseada;

    @Override
    public Boolean seCumplePara(Auto auto) {
        return auto.getMarca() == this.marcaDeseada;
    }

}
