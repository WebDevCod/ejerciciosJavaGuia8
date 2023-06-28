package Servicio;

import Entidad.Persona;
import java.util.Scanner;

public class PersonaServicio {

    Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona(int id) {

        Persona p = new Persona();

        System.out.println("Usuario Id " + id);
        System.out.println("Ingresar nombre:");
        String nombre = leer.nextLine();

        System.out.println("Ingresar edad:");
        int edad = leer.nextInt();

        System.out.println("Ingresar sexo (H,M,O):");
        String sexo = leer.next().toUpperCase();
        while (!sexo.equals("H") && !sexo.equals("M") && !sexo.equals("O")) {
            System.out.println("Debes ingresar H, M u O");
            sexo = leer.next().toUpperCase();
        }

        System.out.println("Ingresar peso:");
        float peso = leer.nextFloat();

        System.out.println("Ingresar altura en metros:");
        float altura = leer.nextFloat();
        System.out.println("--------------------------");

        p.setId(id);
        p.setNombre(nombre);
        p.setEdad(edad);
        p.setSexo(sexo);
        p.setPeso(peso);
        p.setAltura(altura);

        return p;
    }

    public int calcularIMC(Persona p) {
        float altura = p.getAltura();
        float peso = p.getPeso();

        float imc = peso / (float) (Math.pow(altura, 2));

        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean esMayorDeEdad(Persona p) {
        int edad = p.getEdad();
        return edad > 18;
    }
}
