package com.mcc;

import java.util.*;

public class Recursion {

  Conjunto conjunto;

  public Recursion() {
    conjunto = new Conjunto();
  }

  public int sumarNumerosArray(int[] numeros) {
    if (numeros == null || numeros.length == 0) {
      throw new NullPointerException("el arreglo no debe ser nulo o vacio.");
    } else if (numeros.length == 1) {
      return numeros[0];
    }

    return numeros[0] + sumarNumerosArray(Arrays.copyOfRange(numeros, 1, numeros.length));
  }

  public Integer sumarNumerosLista(List<Integer> numeros) {
    if (numeros == null || numeros.size() == 0) {
      throw new NullPointerException("el arreglo no debe ser nulo o vacio.");
    } else if (numeros.size() == 1) {
      return numeros.get(0);
    }

    return numeros.get(0) + sumarNumerosLista(numeros.subList(1, numeros.size()));
  }

  public String imprimir(String[] datos) {
    if (datos == null || datos.length == 0) {
      throw new NullPointerException("el arreglo no debe ser nulo o vacio.");
    } else if (datos.length == 1) {
      return datos[0];
    }

    return datos[0] += imprimir(Arrays.copyOfRange(datos, 1, datos.length));
  }

  public int factorial(int numero) {
    if (numero < 0) {
      throw new RuntimeException("El numero del factorial debe ser positivo.");
    } else if (numero == 0) {
      return 1;
    }

    return numero * factorial(numero - 1);
  }

  public int fibonacciRecursivo(int n) {
    if (n < 0) {
      throw new RuntimeException("El numero para fibonacci debe ser positivo.");
    } else if (n == 0) {
      return 0;
    } else if (n == 1 || n == 2) {
      return 1;
    }
    return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
  }

  public int fibonacciIterativo(int n) {
    if (n < 0) {
      throw new RuntimeException("El numero para fibonacci debe ser positivo.");
    } else if (n == 0) {
      return 0;
    } else if (n == 1 || n == 2) {
      return 1;
    }

    int nUno = 0;
    int nDos = 1;

    for (int i = 1; i < n; i++) {
      int aux;
      aux = nUno + nDos;
      nUno = nDos;
      nDos = aux;
    }

    return nDos;
  }

  private Map<Integer, Integer> valoresFibonacci = new HashMap<>();

  public int fibonacciGuardandoValores(int n) {
    if (n < 0) {
      throw new RuntimeException("El numero para fibonacci debe ser positivo.");
    } else if (n == 0) {
      return 0;
    } else if (n == 1 || n == 2) {
      return 1;
    }

    if (valoresFibonacci.containsKey(n)) {
      return valoresFibonacci.get(n);
    }

    int valorUno = fibonacciGuardandoValores(n - 1);
    valoresFibonacci.putIfAbsent(n - 1, valorUno);

    int valorDos = fibonacciGuardandoValores(n - 2);
    valoresFibonacci.putIfAbsent(n - 2, valorDos);

    return valoresFibonacci.get(n - 1) + valoresFibonacci.get(n - 2);
  }

  public int busquedaBinaria(int[] datos, int valor) {
    return busquedaBinaria(datos, 0, datos.length - 1, valor);
  }

  private int busquedaBinaria(int[] datos, int menor, int mayor, int valor) {
    int media = (mayor + menor) / 2;
    int valorMedio = datos[media];

    if (menor > mayor) return -1;
    else if (valorMedio == valor) return media;
    else if (valorMedio < valor) return busquedaBinaria(datos, media + 1, mayor, valor);
    else return busquedaBinaria(datos, menor, media - 1, valor);
  }

  public String decimalAbinario(int decimal) {
    if (decimal < 0) {
      throw new RuntimeException("El numero decimal a convertir debe ser positivo");
    } else if (decimal == 0) {
      return "0";
    }

    int residuo;
    residuo = decimal % 2;
    return (decimalAbinario(decimal / 2) + "" + residuo);
  }

  public double potencia(int numero, int exponente) {
    if (exponente == 0) {
      return 1;
    }
    if (exponente < 0) {
      return 1 / potencia(numero, -exponente);
    }
    return numero * potencia(numero, exponente - 1);
  }

  public long ackerman(long valorUno, long valorDos) {
    if (valorUno < 0 || valorDos < 0) {
      throw new RuntimeException("los valores en la funcion de ackerman no deben ser negativos");
    }
    if (valorUno == 0) {
      return (valorDos + 1);
    } else if (valorUno > 0 && valorDos == 0) {
      return ackerman(valorUno - 1, 1);
    }
    return ackerman(valorUno - 1, ackerman(valorUno, valorDos - 1));
  }

  public int numeroCatalan(int numero) {
    int resultado = 0;
    if (numero == 0) {
      return 1;
    }
    return resultado + numeroCatalan(numero - 1) * (2 * ((2 * numero) - 1)) / (numero + 1);
  }

  public int MCDEuclides(int valorUno, int valorDos) {

    if (valorUno < 0 || valorDos < 0) {
      throw new RuntimeException("Los valores para MCD deben ser positivos");
    } else if (valorDos == 0) {
      return valorUno;
    }
    return MCDEuclides(valorDos, valorUno % valorDos);
  }

  public int MCDDescomposicion(int valorUno, int valorDos) {
    int valor;

    if (valorUno > valorDos) {
      valor = MCDDescomposicionFactoresPrimos(valorUno, valorDos);
    } else {
      valor = MCDDescomposicionFactoresPrimos(valorDos, valorUno);
    }

    return valor;
  }

  private int MCDDescomposicionFactoresPrimos(int valorUno, int valorDos) {
    int mcd = -1;

    if (valorUno < 0 || valorDos < 0) {
      throw new RuntimeException("Los valores para MCD deben ser positivos");
    } else if (valorUno == valorDos) {
      mcd = valorUno;
    } else {

      List<Integer> factoresPrimosUno = factoresPrimos(valorUno);
      List<Integer> factoresPrimosDos = factoresPrimos(valorDos);

      List<Integer> interseccion;

      if (factoresPrimosUno.size() < factoresPrimosDos.size()) {
        interseccion = conjunto.interseccionRepetidos(factoresPrimosUno, factoresPrimosDos);
      } else {
        interseccion = conjunto.interseccionRepetidos(factoresPrimosDos, factoresPrimosUno);
      }

      if (!interseccion.isEmpty()) {
        mcd = multiplicarNumerosArray(interseccion);
      }
    }

    return mcd;
  }

  public int MCDDivisores(int valorUno, int valorDos) {
    Integer valor = -1;

    if (valorUno < 0 || valorDos < 0) {
      throw new RuntimeException("Los valores para MCD deben ser positivos");
    } else if (valorUno == valorDos) {
      valor = valorUno;
    } else {
      List<Integer> divisoresUno = divisores(valorUno);
      List<Integer> divisoresDos = divisores(valorDos);

      Set<Integer> interseccion = conjunto.interseccion(divisoresUno, divisoresDos);

      if (interseccion != null) {
        for (Integer item : interseccion) {
          if (item > valor) {
            valor = item;
          }
        }
      }
    }
    return valor;
  }

  public int multiplicarNumerosArray(List<Integer> numeros) {
    if (numeros.size() == 1) {
      return numeros.get(0);
    }

    return numeros.get(0) * multiplicarNumerosArray(numeros.subList(1, numeros.size()));
  }

  public List<Integer> factoresPrimos(int numero) {
    List<Integer> factors = new ArrayList<>();

    for (int i = 2; i <= numero; i++) {
      while (numero % i == 0) {
        factors.add(i);
        numero /= i;
      }
    }
    return factors;
  }

  public List<Integer> divisores(int numero) {
    List<Integer> numDivisores = new ArrayList<>();
    for (int i = 1; i < (numero + 1); i++) {
      if (numero % i == 0) {
        numDivisores.add(i);
      }
    }
    return numDivisores;
  }

  public void codigoGray(int n) {
    codigoGray("", n);
  }

  private void codigoGray(String prefix, int n) {
    if (n == 0) System.out.println(prefix);
    else {
      codigoGray(prefix + "0", n - 1);
      gray(prefix + "1", n - 1);
    }
  }

  public void gray(String prefix, int n) {
    if (n == 0) System.out.println(prefix);
    else {
      codigoGray(prefix + "1", n - 1);
      gray(prefix + "0", n - 1);
    }
  }

  public List<Integer> listaValoresFibonacci(int longitud) {
    List<Integer> valores = new ArrayList<>();
    for (int i = 0; i < longitud; i++) {
      valores.add((int) (Math.random() * (25 + 1)));
    }

    return valores;
  }
}
