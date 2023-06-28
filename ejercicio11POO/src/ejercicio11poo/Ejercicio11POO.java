/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la 
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase 
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al 
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date, 
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que 
se puede conseguir instanciando un objeto Date con constructor vacío. 
Ejemplo fecha: Date fecha = new Date(anio, mes, dia); 
Ejemplo fecha actual: Date fechaActual = new Date(); 

 */
package ejercicio11poo;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio11POO {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Día");
        int dia = leer.nextInt();
        System.out.println("Mes");
        int mes = leer.nextInt();
        System.out.println("Año");
        int anio = leer.nextInt();

        // Usando LocalDate.of
        LocalDate fechaOtraManera = LocalDate.of(anio, mes, dia);
        System.out.println(fechaOtraManera);

        // Usando Date
        mes -= 1;
        anio -= 1900;

        Date fecha = new Date(anio, mes, dia);
        System.out.println(fecha);

        Date fechaActual = new Date();

        int cantidadAnios = fechaActual.getYear() - fecha.getYear();
        System.out.println("Han pasdo " + cantidadAnios + " años");

    }

}
