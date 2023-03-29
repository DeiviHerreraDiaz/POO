package Figuras;

import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {
    
    Scanner lectura = new Scanner(System.in);
    
    //Variables

     
    String respuesta;
    do {

    System.out.println("¿De cual figura quiere sacar su area?: \n1. Triangulo\n2. Rectángulo\n3. Círculo\nDigite el numero de la cual desea ");      
    int eleccion = lectura.nextInt();

    switch (eleccion) {
        case 1://Tringulo
            
            double base, altura;

            System.out.println("Digite la base del triangulo: ");
            base = lectura.nextDouble();

            System.out.println("Digite la altura del circulo: ");
            altura = lectura.nextDouble();

            Triangulo triangulo1 = new Triangulo(base, altura);
            triangulo1.calcularArea();

            break;
        case 2://Rectángulo
            
            double largo, ancho;

            System.out.println("Digite el largo del rectangulo: ");
            largo = lectura.nextDouble();

            System.out.println("Digite el ancho del rectangulo: ");
            ancho = lectura.nextDouble();

            Rectangulo rectangulo = new Rectangulo(largo, ancho);
            rectangulo.calcularArea();

            break;
        case 3://Círculo
            
            double radio, π= 3.14;

            System.out.println("Digite el radio del circulo: ");
            radio = lectura.nextDouble();

            Circulo circulo = new Circulo(radio);
            circulo.calcularArea();

            break;
    
        default: 
        System.out.println("Digito un numero mal");
            break;
    }

    System.out.println("¿Quiere saber el area de otra figura?: s/n");
    respuesta = lectura.next();
        
    } while (respuesta.equals("s"));

    System.out.println("Hasta luego");

    lectura.close();
}
}