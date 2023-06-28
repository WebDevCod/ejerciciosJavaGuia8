package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaServicio {

    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {
        Persona p = new Persona();

        System.out.print("Nombre:");
        p.setNombre(leer.nextLine());
        System.out.println("Fecha de nacimiento: ");
        System.out.print("Día:");
        int dia = leer.nextInt();
        System.out.print("Mes:");
        int mes = leer.nextInt();
        System.out.print("Año:");
        int anio = leer.nextInt();
        mes -= 1;
        anio -= 1900;
        Date fechaNac = new Date(anio, mes, dia);
        p.setFecNac(fechaNac);

        return p;
    }

    public int calcularEdad(Persona p) {
        Date fechaActual = new Date();
        Date fechaNac = p.getFecNac();
        int edad = (fechaActual.getYear() - fechaNac.getYear());
        System.out.println("La edad es: " + edad + " años");

        return edad;
    }

    public boolean menorQue(int edadPersona, int edad) {
        return edadPersona < edad;
    }

    public void mostrarPersona(Persona p, int edadPersona) {
        String nombre = p.getNombre();
        Date fecha = p.getFecNac();
        System.out.println("-------------------");
        System.out.println("Nombre:" + nombre);
        System.out.println("Fecha:" + fecha);
        System.out.println("Edad:" + edadPersona);
    }

}
