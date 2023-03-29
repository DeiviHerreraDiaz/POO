package Juegos;

import java.util.Random;
import java.util.Scanner;

public class Carisellazo implements Juego {

    // Atributos

    private int moneda;
    private String jugador;
    private int eleccion;

    Scanner lectura = new Scanner(System.in);
    Random aleatorio = new Random();
    

    
    public void iniciar() {
    
        System.out.println("Ingrese el nombre del jugador: ");
        jugador = lectura.next();



    }
    
    public void jugar() {

        System.out.println(jugador+" escoja una opción:\n1. Cara\n2. Sello ");
        eleccion = lectura.nextInt();

        moneda = aleatorio.nextInt(2)+1;
        System.out.println("Ha lanzado la moneda");

        System.out.println("--------------------");


    }
    
    public void finalizar() {
        
        if (eleccion == 1 && moneda == 1) {

            System.out.println("Usted ha ganado, cayo cara");
            
        } else if (eleccion == 2 && moneda == 2){

            System.out.println("Usted ha ganado, cayo sello");

        } else if (eleccion == 1 && moneda == 2){

            System.out.println("Usted ha perdido, cayo sello");

        }  else if (eleccion == 2 && moneda == 1){

            System.out.println("Usted ha perdido, cayo cara");

        } 

    }
    
}
