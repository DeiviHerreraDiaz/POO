package Salud3;

import java.util.Scanner;

public class Persona {

    Scanner lectura = new Scanner(System.in);
    
    //Atributos (De por si siempre son privados)

    private String tipoDoc;
    private int documento;
    private String nombre;
    private String apellido;
    private int peso; 
    private double estatura;
    private int edad;
    private String sexo;
    
    
    
    //METODO CONSTRUCTOR VACIO

    public  Persona(){

    }

    //METODO CONSTRUCTOR CON PARAMETROS

    public Persona(String tipoDoc, int documento, String nombre, String apellido){
        this.tipoDoc=tipoDoc;
        this.nombre=nombre;
        this.apellido=apellido;
        this.documento=documento;
    }

    public void pedirDatos(){

        System.out.println("Digite el tipo de documento de la persona: ");
        tipoDoc = lectura.next();

        System.out.println("Digite el documento de la persona: ");
        documento = lectura.nextInt();

        System.out.println("Digite el nombre de la persona: ");
        nombre = lectura.next();

        System.out.println("Digite el apellido de la persona: ");
        apellido = lectura.next();
        
        System.out.println("Digite el peso de la persona: ");
        peso = lectura.nextInt();
        
        System.out.println("Digite la estatura de la persona: ");
        estatura = lectura.nextDouble();

        System.out.println("Digite la edad de la persona: ");
        edad = lectura.nextInt();

        System.out.println("Digite el sexo de la persona: ");
        sexo = lectura.next();

        
    }

    //MÉTODOS ACCESORES

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    //MÉTODOS DE LA CLASE

    public void mostrarPersona(){

        System.out.println("El tipo de documento de la persona es "+tipoDoc);
        System.out.println("El documento de la persona es "+documento);
        System.out.println("El nombre de la persona es "+nombre);
        System.out.println("El apellido de la persona es "+apellido);
        System.out.println("El peso de la persona es "+peso);
        System.out.println("La estatura de la persona es "+estatura);
        System.out.println("La edad de la persona es "+edad);
        System.out.println("El sexo de la persona es "+sexo);
        
        
        
    }
    

    public double calcularImc(int peso, double estatura){

    
        Double pesoActual= peso / (estatura * estatura);

        if (pesoActual < 20) {

            System.out.println("El peso esta por debajo de lo ideal");
            
        } else if (pesoActual >= 20 && pesoActual <= 25) {

            System.out.println("El peso es ideal ");

        } else if (pesoActual > 25){
        
            System.out.println("Tiene sobrepeso:c");
        }

        return pesoActual;
    }
    
    

    public void mayorEdad(){

        if (edad >= 18) {

            System.out.println("La persona es mayor de edad");

        } else {

            System.out.println("La persona es menor de edad");
        }
    }

}
