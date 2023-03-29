package Principal2;

import java.util.Scanner;

import Salud2.Persona;

public class Inicio {
    public static void main(String[] args) {
        
        Persona Personita = new Persona();
        Scanner lectura = new Scanner(System.in);
        int peso;
        Double estatura;
       

        //Invocar metodos
        Personita.pedirDatos();
        Personita.mostrarPersona();
        Personita.mayorEdad();


        System.out.println("Digite el peso de la persona:");
        peso = lectura.nextInt();
        System.out.println("Digite la estatura de la persona: ");
        estatura = lectura.nextDouble();
        Personita.calcularImc(peso,estatura);
        lectura.close();
        
    }


}
