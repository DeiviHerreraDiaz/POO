package Principal;

import Salud.Persona;

public class Inicio {
    public static void main(String[] args) {
        
        Persona Personita = new Persona();

        //Invocar metodos

        Personita.pedirDatos();
        Personita.mostrarPersona();
        Personita.mayorEdad();
        Personita.calcularImc();
    }
}
