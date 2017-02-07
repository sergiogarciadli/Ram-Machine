/*
Clase de la unidad de Entrada

Análisis y Diseño de Algoritmos, Itinerario de Computación, ULL

Sergio García de la Iglesia
*/

import java.util.ArrayList;


public class OutputUnit
{

  //Variables
  public ArrayList<Integer> outputTape; //Añadimos <Integer> para evitar el warning: ArrayList is a raw type
  public int writingHead;

  public OutputUnit()
  {

  }

  public void setValue(int value)
  {
    outputTape.add(value);

  }

}
