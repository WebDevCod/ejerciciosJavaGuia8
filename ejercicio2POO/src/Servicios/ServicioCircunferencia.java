package Servicios;

import Entidad.Circunferencia;
import java.util.Scanner;

public class ServicioCircunferencia {

    Scanner leer = new Scanner(System.in);

    public Circunferencia crearCircunferencia() {

        Circunferencia c = new Circunferencia();

        System.out.println("Ingresar Radio");
        c.setRadio(leer.nextFloat());

        return c;
    }

    public void area(Circunferencia c) {
        System.out.println("El area es igual a " + Math.PI * Math.pow(c.getRadio(), 2));
    }

    public void perimetro(Circunferencia c) {
        System.out.println("El perimetro es igual a " + 2 * Math.PI * c.getRadio());
    }
}
