package Juegos;

import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        int eleccion; 

       System.out.println("Bienvenido a los mejores juegos, elija el juego que quiere jugar: \n1. Carisellazo\n2. Piedra, papel o tijera\nDigite un numero: ");
        eleccion = lectura.nextInt();

        switch (eleccion) {
            case 1:
            Carisellazo juego1 = new Carisellazo();
            juego1.iniciar();
            juego1.jugar();
            juego1.finalizar();
                break;

            case 2:
            PPT juego2 = new PPT();
            juego2.iniciar();
            juego2.jugar();
            juego2.finalizar();
                break;
        
            default:
                break;
        }
        lectura.close();
    }
}
