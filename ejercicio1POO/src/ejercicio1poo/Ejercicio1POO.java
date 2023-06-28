/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, 
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un 
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y 
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el 
numero de páginas. 

 */
package ejercicio1poo;

import Entidad.Libro;
import java.util.Scanner;

public class Ejercicio1POO {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Libro libro1 = new Libro();

        System.out.println("Ingresa ISBN");
        libro1.setIsbn(leer.nextLine());

        System.out.println("Ingresa Título");
        libro1.setTitulo(leer.nextLine());

        System.out.println("Ingresa Autor");
        libro1.setAutor(leer.nextLine());

        System.out.println("Ingresa número de páginas");
        libro1.setNumPaginas(leer.nextInt());

        System.out.println(libro1);

    }

}
