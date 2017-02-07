import java.util.ArrayList;

class Prueba
{
  public static void main (String arg[])
  {
    System.out.println("Comienza el main()...");

    ArrayList prueba = new ArrayList();
    prueba.add(1);
    prueba.add(2);

    InputUnit in = new InputUnit(prueba);

    System.out.println(in.inputTape.size());

    int aux = in.getValue();

    System.out.println(aux);


    OutputUnit ou = new OutputUnit();
    ou.setValue(aux);

    System.out.println(ou.outputTape.size());

    aux = in.getValue();
    ou.setValue(aux);

    System.out.println(ou.outputTape.size());


  }
}
