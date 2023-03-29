package Figuras;

public class Rectangulo extends Figura {

    //Atributos

    
    private double largo, ancho; 

    public Rectangulo(){
        
    }
   
    public Rectangulo(double largo, double ancho){
    
        this.largo = largo;
        this.ancho = ancho;

    }

    public void calcularArea() {

        double area=0;

        area = largo * ancho;
        System.out.println("El largo del rectangulo es: "+largo);
        System.out.println("El ancho del rectangulo es: "+ancho);
        System.out.println("El area del rectangulo es: "+area);
        
    }

             //Métodos accesores 

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    
}
