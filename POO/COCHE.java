import java.io.*;
class coche
{
  //Atributos
  String color;
  String marca;
  int km;
  
  //Metodo
  public static void main (String[] args)
  {
    //crear objetos
    coche coche1 = new coche();
   
    //modificar atrtibutos
    coche1.color = "Rojo";
    coche1.marca = "Mitsubishi";
    coche1.km = 0;

    //mostrar por pantalla de objeto
    System.out.println("El color es :"  +coche1.color);
    System.out.println("La marca es :"  +coche1.marca);
    System.out.println("El km es :"  +coche1.km);
   }
}