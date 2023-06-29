package Servicio;

import Entidad.Curso;
import java.util.Scanner;

public class CursoServicio {

    Scanner leer = new Scanner(System.in);

    private Curso c;

    public CursoServicio() {
        this.c = new Curso();
    }

    public void cargarAlumnos() {

        System.out.print("Ingresa la cantidad de alumnos:");
        int cantidadDeAlumnos = leer.nextInt();
        leer.nextLine();
        c.setAlumnos(new String[cantidadDeAlumnos]);

        String[] arregloAlumnos = c.getAlumnos();
        System.out.println("-------------------------------");

        System.out.println("Ingresa el nombre de los alumnos");
        int nroAlumno = 1;

        for (int i = 0; i < arregloAlumnos.length; i++) {
            System.out.print("Alumno " + nroAlumno + ": ");
            arregloAlumnos[i] = leer.nextLine();

            nroAlumno++;
        }
    }

    public void crearCurso() {

        System.out.println("Nombre del curso:");
        c.setNombreCurso(leer.nextLine());
        System.out.println("Cantidad de días por semana:");
        c.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("Cantidad de horas por día:");
        c.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Turnos - Mañana(M) o Tarde(T):");
        c.setTurno(leer.next());
        System.out.println("Precio por hora:");
        c.setPrecioPorHora(leer.nextFloat());
        System.out.println("-------------------------------");
        cargarAlumnos();
    }

    public void calcularGananciaSemanal() {
        int horasPorDia = c.getCantidadHorasPorDia();
        float precioPorHora = c.getPrecioPorHora();
        String[] alumnos = c.getAlumnos();
        int cantidadAlumnos = alumnos.length;
        int diasSemanales = c.getCantidadDiasPorSemana();

        float gananciaSemanal = precioPorHora * horasPorDia * cantidadAlumnos * diasSemanales;
        System.out.println("-------------------------------");

        System.out.println("La ganancia semanal es de $" + gananciaSemanal);
    }
}
