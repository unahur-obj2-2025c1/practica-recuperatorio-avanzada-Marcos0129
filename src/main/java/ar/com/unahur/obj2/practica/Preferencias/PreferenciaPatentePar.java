package ar.com.unahur.obj2.practica.Preferencias;

import ar.com.unahur.obj2.practica.Auto;

public class PreferenciaPatentePar implements Preferencia{

    @Override
    public Boolean seCumplePara(Auto auto) {    //Ayuda con GPT
        char ultimaLetra= auto.getPatente().charAt(auto.getPatente().length()-1);
        return Character.isDigit(ultimaLetra) && (ultimaLetra- '0' ) % 2 ==0;
    }
}
