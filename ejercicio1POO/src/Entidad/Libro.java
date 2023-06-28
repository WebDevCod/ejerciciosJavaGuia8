/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, 
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un 
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y 
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el 
numero de páginas. 

 */
package Entidad;

public class Libro {

    public String isbn;
    public String titulo;
    public String autor;
    public int numPaginas;

    public Libro() {
    } // Constructor

    public Libro(String isbn, String titulo, String autor, int numPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    } // Constructor con parámetros

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }// Método set

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }// Método set

    public void setAutor(String autor) {
        this.autor = autor;
    }// Método set

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }// Método set

    public String getIsbn() {
        return isbn;
    }// Método get

    public String getTitulo() {
        return titulo;
    }// Método get

    public String getAutor() {
        return autor;
    }// Método get

    public int getNumPaginas() {
        return numPaginas;
    }// Método get

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", numPaginas=" + numPaginas + '}';
    }// Método toString

}
