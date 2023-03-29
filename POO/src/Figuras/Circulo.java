package Figuras;

public class Circulo extends Figura {

    //Atributos 

    private double radio, π= 3.14;

   public Circulo(){

   }

    public Circulo(double radio ){

        this.radio = radio;
    }
    
    public void calcularArea() {
     
        double area=0; 

        area = π * (radio * radio);
        System.out.println("El radio es: "+radio);
        System.out.println("π equivale a = 3.14");
        System.out.println("El area de su círculo es: "+area);

    }

    //MÉTODOS ACCESORES

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getΠ() {
        return π;
    }

    public void setΠ(double π) {
        this.π = π;
    }
  
    


}
