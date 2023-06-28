package Servicio;

import Entidad.Cafetera;

public class CafeteraServicio {

    public void llenarCafetera(Cafetera c) {
        c.setCapacidadMaxima(800);
        c.setCantidadActual(c.getCapacidadMaxima());
    }

    public void servirTaza(int tamanoTazaVacia, Cafetera c) {
        int cantidadActual = c.getCantidadActual();
        int cantidadEnTaza;

        if (tamanoTazaVacia > cantidadActual) {
            cantidadEnTaza = cantidadActual;
            System.out.println("La taza no se pudo llenar.");
            System.out.println("Es de " + tamanoTazaVacia + " y se sirivió hasta " + cantidadEnTaza);
            c.setCantidadActual(0);
        } else {
            int cantidadCafeActualiza = cantidadActual - tamanoTazaVacia;
            cantidadEnTaza = tamanoTazaVacia;
            c.setCantidadActual(cantidadCafeActualiza);
            System.out.println("La taza se pudo llenar en su totalidad " + cantidadEnTaza);
            System.out.println("La cantidad de café que resta en la cafetera es de " + c.getCantidadActual());
        }
    }

    public void vaciarCafetera(Cafetera c) {
        c.setCantidadActual(0);
    }

    public void agregarCafe(int cantidadCafe, Cafetera c) {
        int cantidadActualCafe = c.getCantidadActual();
        int capacidadMaxima = c.getCapacidadMaxima();
        int cafeTotal = cantidadActualCafe + cantidadCafe;

        if (cafeTotal > capacidadMaxima) {
            System.out.println("Tienes que agregar menos café");
            cafeTotal = capacidadMaxima - cantidadActualCafe;
            System.out.println("Puedes agregar un máximo de " + cafeTotal);
        } else {
            c.setCantidadActual(cafeTotal);
        }
    }
}
