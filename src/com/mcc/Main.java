package com.mcc;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    Recursion recursion = new Recursion();

    List<Integer> numeros = new ArrayList<>();
    numeros.add(1);
    numeros.add(2);
    numeros.add(3);
    numeros.add(4);

    System.out.println("Suma de numeros de una lista:" + recursion.sumarNumerosLista(numeros));
    System.out.println(
        "Suma de numeros de un arreglo:" + recursion.sumarNumerosArray(new int[] {1, 2, 3, 4, 5}));
    System.out.println(
        "imprimir datos:" + recursion.imprimir(new String[] {"o", "s", "c", "a", "r"}));
    System.out.println("Factorial de 5:" + recursion.factorial(5));
    Long empieza = System.nanoTime();
    System.out.println("Fibonacci 5 recursivo:" + recursion.fibonacciRecursivo(5));
    Long termina = System.nanoTime() - empieza;
    System.out.println("Tiempo que dura en milisegundos:" + (termina / 1e6));

    empieza = System.nanoTime();
    System.out.println("Fibonacci 6 iterativo:" + recursion.fibonacciIterativo(6));
    termina = System.nanoTime() - empieza;
    System.out.println("Tiempo que dura en milisegundos:" + (termina / 1e6));

    System.out.println("decimal a binario 2:" + recursion.decimalAbinario(11));
    System.out.println("potencia 4^2:" + recursion.potencia(4, 2));
    System.out.println("Ackerman:" + recursion.ackerman(2, 3));
    System.out.println("numero catalan:" + recursion.numeroCatalan(5));

    int[] datos = new int[] {1, 2, 3, 4, 5};
    System.out.println(
        "busqueda binaria:" + recursion.busquedaBinaria(datos, 0, datos.length - 1, 1));

    System.out.println(
        "Maximo Comun Divisor Euclides de 90 y 135: " + recursion.MCDEuclides(90, 135));
    System.out.println(
        "Maximo Comun Divisor divisores de 90 y 135: " + recursion.MCDDivisores(90, 135));

    System.out.println(
        "Maximo Comun Divisor descomposicion de factores primos de 90 y 135: "
            + recursion.MCDDescomposicionFactoresPrimos(90, 135));

    System.out.println("Gray code de 4:");
    recursion.codigoGray("", 4);
  }
}
