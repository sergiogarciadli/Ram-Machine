import java.util.ArrayList;

class Prueba
{
  public static void main (String arg[])
  {
    System.out.println("Comienza el main()...");

    ArrayList prueba = new ArrayList();
    prueba.add(1);

    InputUnit in = new InputUnit(prueba);

    System.out.println(prueba.size());
  }
}
