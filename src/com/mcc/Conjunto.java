package com.mcc;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Conjunto {

  public Conjunto() {}

  public List<Integer> interseccionRepetidos(List<Integer> conjuntoUno, List<Integer> conjuntoDos) {
    List<Integer> interseccionConjuntos = new ArrayList<>();

    for (Integer item : conjuntoUno) {
      if (conjuntoDos.contains(item)) {
        interseccionConjuntos.add(item);
      }
    }

    return interseccionConjuntos;
  }

  public Set<Integer> interseccion(List<Integer> conjuntoUno, List<Integer> conjuntoDos) {
    Set<Integer> interseccionConjuntos = new TreeSet<>();

    for (Integer item : conjuntoUno) {
      if (conjuntoDos.contains(item)) {
        interseccionConjuntos.add(item);
      }
    }

    return interseccionConjuntos;
  }
}
