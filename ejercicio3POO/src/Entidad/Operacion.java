package Entidad;

import java.util.Scanner;

public class Operacion {

    Scanner leer = new Scanner(System.in);
    private float numero1;
    private float numero2;

    public Operacion() {
    }

    public Operacion(float numero1, float numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public float getNumero1() {
        return numero1;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {
        System.out.print("Ingresa un número: ");
        this.numero1 = leer.nextFloat();
        System.out.print("Ingresa otro número: ");
        this.numero2 = leer.nextFloat();
    }

    public float sumar() {
        float resultado = numero1 + numero2;
        return resultado;
    }

    public float restar() {
        float resultado = numero1 - numero2;
        return resultado;
    }

    public float multiplicar() {
        if (numero1 == 0 || numero2 == 0) {
            return 0;
        } else {
            float resultado = numero1 * numero2;
            return resultado;
        }
    }

    public float dividir() {
        if (numero2 <= 0) {
            return 0;
        } else {
            float resultado = numero1 / numero2;
            return resultado;
        }
    }

}
