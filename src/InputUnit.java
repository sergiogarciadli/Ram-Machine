/*
Clase de la unidad de Entrada

Análisis y Diseño de Algoritmos, Itinerario de Computación, ULL

Sergio García de la Iglesia
*/

import java.util.ArrayList;

public class InputUnit
{
  //Variables
  public ArrayList<Integer> inputTape; //Añadimos <Integer> para evitar el warning: ArrayList is a raw type
  public int readingHead;

  //Métodos

  //Contructor al que le pasamos un array con la entrada que copiaremos en nuestra variable miembro de la clase
  public InputUnit(ArrayList<Integer> aux)
  {
    readingHead = 0;
    inputTape = (ArrayList) aux.clone();
  }

  public int getValue ()
  {
    return (int)inputTape.get(readingHead); //Typecast pa convertir el valor a int
  }
}
