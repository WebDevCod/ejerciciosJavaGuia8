package Entidad;

import java.util.Date;

public class Persona {

    private String nombre;
    private Date fecNac;

    public Persona() {
    }

    public Persona(String nombre, Date fecNac) {
        this.nombre = nombre;
        this.fecNac = fecNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecNac() {
        return fecNac;
    }

    public void setFecNac(Date fecNac) {
        this.fecNac = fecNac;
    }

}
