package com.mcc;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    Recursion recursion = new Recursion();

    int[] a1 = {1, 2, 3, 4, 5};
    int[] b = new int[0];
    List<Integer> numeros = new ArrayList<>();
    numeros.add(1);
    numeros.add(2);
    numeros.add(3);
    numeros.add(4);

    List<Integer> numerosVacio = new ArrayList<>();
    List<Integer> numerosNulo = null;

    String[] valor1 = {"1", "2", "3", "4"};
    String[] valor2 = {};

    System.out.println("Suma de numeros de un arreglo a1:" + recursion.sumarNumerosArray(a1));
    // System.out.println("Suma de numeros de un arreglo b:" + recursion.sumarNumerosArray(b));

    System.out.println("Suma de numeros de una lista:" + recursion.sumarNumerosLista(numeros));
    // System.out.println("Suma de numeros de una lista vacio:" +
    // recursion.sumarNumerosLista(numerosVacio));
    // System.out.println("Suma de numeros de una lista nulo:" +
    // recursion.sumarNumerosLista(numerosNulo));

    System.out.println("impresion a1:" + recursion.imprimir(valor1));
    // System.out.println("impresion b:" + recursion.imprimir(valor2));

    System.out.println("factorial 5!:" + recursion.factorial(5));
    System.out.println("factorial 0!:" + recursion.factorial(0));
    // System.out.println("factorial -1!:" + recursion.factorial(-1));

    List<Integer> valoresFibonacci = recursion.listaValoresFibonacci(100);

    System.out.println("Fibonacci recursivo:" + recursion.fibonacciRecursivo(10));
    System.out.println("Fibonacci iterativo:" + recursion.fibonacciIterativo(10));
    System.out.println("Fibonacci guardando valores:" + recursion.fibonacciGuardandoValores(10));

    Long empieza = System.nanoTime();
    for (Integer item : valoresFibonacci) {
      recursion.fibonacciRecursivo(item);
    }
    Long termina = System.nanoTime() - empieza;
    System.out.println("Tiempo que dura recursivo en milisegundos:" + (termina / 1e6));

    empieza = System.nanoTime();
    for (Integer item : valoresFibonacci) {
      recursion.fibonacciIterativo(item);
    }
    termina = System.nanoTime() - empieza;
    System.out.println("Tiempo que dura iterativo en milisegundos:" + (termina / 1e6));

    empieza = System.nanoTime();
    for (Integer item : valoresFibonacci) {
      recursion.fibonacciGuardandoValores(item);
    }
    termina = System.nanoTime() - empieza;
    System.out.println("Tiempo que dura guardando valores en milisegundos:" + (termina / 1e6));

    int[] datos = {1, 2, 3, 5, 8};
    System.out.println("busqueda binaria de 3:" + recursion.busquedaBinaria(datos, 3));
    System.out.println("busqueda binaria de 10:" + recursion.busquedaBinaria(datos, 10));
    System.out.println("busqueda binaria de 3:" + recursion.busquedaBinaria(datos, -2));

    System.out.println("decimal a binario 2:" + recursion.decimalAbinario(0));
    // System.out.println("decimal a binario 2:" + recursion.decimalAbinario(-1));

    System.out.println("potencia 2^3:" + recursion.potencia(2, 3));
    System.out.println("potencia -2^3:" + recursion.potencia(-2, 3));
    System.out.println("potencia 2^-3:" + recursion.potencia(2, -3));

    System.out.println("Ackerman 0 Y 0:" + recursion.ackerman(0, 0));
    // System.out.println("Ackerman 4 Y 5:" + recursion.ackerman(4, 5));
    System.out.println("numero catalan 20:" + recursion.numeroCatalan(6));

    System.out.println(
        "Maximo Comun Divisor Euclides de 18 y 27: " + recursion.MCDEuclides(18, 27));
    System.out.println(
        "Maximo Comun Divisor divisores de 27 y 18: " + recursion.MCDDivisores(18, 27));

    System.out.println(
        "Maximo Comun Divisor descomposicion de factores primos de 27 y 18: "
            + recursion.MCDDescomposicion(27, 18));

    System.out.println("Gray code de 4:");
    recursion.codigoGray(4);
  }
}
