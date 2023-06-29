package Servicio;

import Entidad.Movil;
import java.util.Arrays;
import java.util.Scanner;

public class MovilServicio {

    Scanner leer = new Scanner(System.in);

    private Movil m;

    public void cargarCelular() {

        m = new Movil();

        System.out.print("Marca:");
        m.setMarca(leer.next());
        System.out.print("Precio:");
        m.setPrecio(leer.nextDouble());
        System.out.print("Modelo:");
        m.setModelo(leer.next());
        System.out.print("Memoria RAM:");
        m.setMemoriaRam(leer.nextInt());
        System.out.print("Almacenamiento:");
        m.setAlmacenamiento(leer.nextInt());
        ingresarCodigo();
    }

    public void ingresarCodigo() {

        m.setCodigo(new int[7]);

        int[] codigo = m.getCodigo();

        System.out.println("Ingresa el código de 7 números:");
        for (int i = 0; i < codigo.length; i++) {
            codigo[i] = leer.nextInt();
        }

        System.out.println(Arrays.toString(m.getCodigo()));
    }

}
