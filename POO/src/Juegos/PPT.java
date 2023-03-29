package Juegos;

import java.util.Random;
import java.util.Scanner;

public class PPT implements Juego {

    // Atributos
    
    private String jugador;
    private int eleccion,maquina;

    //

    Scanner lectura = new Scanner(System.in);
    Random aleatorio = new Random();

    



    public void iniciar() {
       System.out.println("Ingrese el nombre del jugador: ");
       jugador = lectura.next();
    }

    
    public void jugar() {
        System.out.println(jugador+" escoja una opción:\n1. Piedra\n2. Papel\n3. Tijera ");
        eleccion = lectura.nextInt();

        maquina = aleatorio.nextInt(3)+1;

        System.out.println("¿Preparado?");

        System.out.println("-----------------");

    }

    public void finalizar() {

        if (eleccion == maquina) {

            System.out.println("Usted y la maquina han elegido la misma eleccion, por ende la eleccion de la maquina es: "+maquina);
            
        } else if ((eleccion == 1 && maquina == 3) || (eleccion == 2 && maquina == 1)||(eleccion == 3 && maquina == 2)){

            System.out.println("Usted ganó, Felicidades");
            System.out.println("Su eleccion fue: "+eleccion);
            System.out.println("La eleccion de la maquina fue: "+maquina);
        } else{

            System.out.println("Perdiste amigo, la eleccion de la maquina fue: "+maquina);
            System.out.println("Más suerte para la proxima:c ");

        }

        
    }
    
}
