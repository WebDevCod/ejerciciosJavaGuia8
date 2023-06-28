package ejercicio6poo;

import Entidad.Cafetera;
import Servicio.CafeteraServicio;
import java.util.Scanner;

public class Ejercicio6POO {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        CafeteraServicio cs = new CafeteraServicio();
        Cafetera c = new Cafetera();
        boolean salir = false;

        System.out.println("1) Llenar cafetera");
        System.out.println("2) Servir taza");
        System.out.println("3) Vaciar cafetera");
        System.out.println("4) Agregar café");
        System.out.println("5) Salir");
        do {
            System.out.println("Ingresa opción:");
            int opcionSeleccionada = leer.nextInt();

            switch (opcionSeleccionada) {
                case 1:
                    cs.llenarCafetera(c);

                    break;
                case 2:
                    System.out.println("Ingrese tamaño de taza:");
                    cs.servirTaza(leer.nextInt(), c);

                    break;
                case 3:
                    cs.vaciarCafetera(c);

                    break;
                case 4:
                    System.out.println("Ingrese la cantidad de café:");
                    cs.agregarCafe(leer.nextInt(), c);

                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Error: debes elegir un número del menú");
            }
        } while (!salir);

    }

}
