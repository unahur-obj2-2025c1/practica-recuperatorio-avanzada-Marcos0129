package ar.com.unahur.obj2.practica;

import java.util.HashSet;
import java.util.Set;

import ar.com.unahur.obj2.practica.Preferencias.Preferencia;

public class Tecnico {

    private String nombre;
    private Set<Preferencia> preferencias = new HashSet<>();

    public Tecnico(String nombre, Set<Preferencia> preferencias) {
        this.nombre = nombre;
        this.preferencias = preferencias;
    }

    public Boolean acepta(Auto auto){  //ARREGLAR
        return null;
    }

    public void agregarPreferencia(Preferencia preferencia){
        preferencias.add(preferencia);
    }

    public void quitarPreferencia(Preferencia preferencia){
        preferencias.remove(preferencia);
    }

    public String getNombre() {
        return nombre;
    }

    public Set<Preferencia> getPreferencias() {
        return preferencias;
    }

    public void quitarTodasLasPreferencias(){
        preferencias.clear();
    }
}
