package Entidad;

import java.util.Scanner;

public class Rectangulo {

    Scanner leer = new Scanner(System.in);
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void crearRectangulo() {
        System.out.print("Ingresar base: ");
        this.base = leer.nextInt();
        System.out.print("Ingresar altura: ");
        this.altura = leer.nextInt();
    }

    public void calcularSuperficie() {
        int superficie = base * altura;
        System.out.println("La superifice es: " + superficie);
    }

    public void calcularPerimetro() {
        int perimetro = (base + altura) * 2;
        System.out.println("El perimetro es: " + perimetro);
    }

    public void dibujarRectangulo() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
