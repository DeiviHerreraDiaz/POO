package Principal3;

import java.util.Scanner;

import Salud3.Persona;
import Salud3.Empleado;

public class Inicio {
    public static void main(String[] args) {


        Scanner lectura = new Scanner(System.in);
    


        Persona Personita = new Persona();
        
       
      


       

       
        Personita.pedirDatos();
        Empleado Empleadito2 = new Empleado();
        Empleado Empleadito = new Empleado(Personita.getTipoDoc(),Personita.getDocumento(),Personita.getNombre(),Personita.getApellido(),Empleadito2.getCargo(),Empleadito2.getHorasTrabajadas(),Empleadito2.getValorHora(),Empleadito2.getDepartamento());
        
        
        Empleadito.pedirEmpleado();
        Empleadito.mostrarEmpleado();
        Empleadito.calcularHonorarios(Empleadito.getValorHora(),Empleadito.getHorasTrabajadas());
        
        
        
        lectura.close();
        
    }


}
