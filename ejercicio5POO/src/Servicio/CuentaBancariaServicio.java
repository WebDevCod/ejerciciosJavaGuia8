package Servicio;

import Entidad.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicio {

    Scanner leer = new Scanner(System.in);

    public CuentaBancaria crearCuenta() {

        CuentaBancaria cb = new CuentaBancaria();
        System.out.print("Ingresa tu nro de cuenta: ");
        cb.setNumeroCuenta(leer.nextInt());
        System.out.print("Ingresa tu DNI: ");
        cb.setDniCliente(leer.nextDouble());
        cb.setSaldoActual(3000);
        System.out.println("Saldo actual: " + cb.getSaldoActual());
        System.out.print("--------------------");
        return cb;
    }

    public void ingresar(double ingreso, CuentaBancaria cb) {
        int saldoActual = cb.getSaldoActual();
        int saldoActualizado = saldoActual += ingreso;
        cb.setSaldoActual(saldoActualizado);
        System.out.println("Saldo actualizado");
        System.out.print("--------------------");
    }

    public void retirar(double retiro, CuentaBancaria cb) {
        int saldoActual = cb.getSaldoActual();

        if (saldoActual >= retiro) {
            int saldoActualizado = saldoActual -= retiro;
            cb.setSaldoActual(saldoActualizado);
            System.out.println("Saldo actualizado");
            System.out.print("--------------------");
        } else {
            System.out.println("Saldo insuficiente");
            System.out.print("--------------------");
        }

    }

    public void extraccionRapida(CuentaBancaria cb) {
        int saldoActual = cb.getSaldoActual();
        int extraccion = (20 * saldoActual) / 100;

        if (saldoActual > extraccion && extraccion > 0) {
            System.out.println("Podrás retirar: " + extraccion);
            System.out.println("¿Realizas la extracción? (s/n)");
            String respuesta = leer.next();
            if (respuesta.equalsIgnoreCase("s")) {
                cb.setSaldoActual(saldoActual -= extraccion);
                System.out.println("Saldo actualizado");                
            }
        } else {
            System.out.println("No cuentas con saldo suficiente");
            System.out.print("--------------------");
        }

    }

    public void consultarSaldo(CuentaBancaria cb) {
        System.out.print("--------------------");
        System.out.println("\nSu saldo es:");
        System.out.println(cb.getSaldoActual());
        System.out.println("--------------------");
    }

    public void consultarDatos(CuentaBancaria cb) {
        System.out.println(cb.toString());
    }

}
