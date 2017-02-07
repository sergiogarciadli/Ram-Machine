/*
Clase de la unidad de Salida

Análisis y Diseño de Algoritmos, Itinerario de Computación, ULL

Sergio García de la Iglesia
*/

import java.util.ArrayList;


public class OutputUnit
{

  //Variables
  public ArrayList<Integer> outputTape; //Añadimos <Integer> para evitar el warning: ArrayList is a raw type
  public int writingHead; //Inútil de momento

  public OutputUnit()
  {
    ArrayList<Integer> a = new ArrayList();
    outputTape = a;
    writingHead = 0;
  }

  public void setValue(int value)
  {
    outputTape.add(writingHead, value);
    writingHead++;
  }

}
