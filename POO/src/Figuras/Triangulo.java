package Figuras;

public class Triangulo extends Figura {

    //Atributos

    private double base, altura; 

    public Triangulo(){
        
    }
    
    public Triangulo(double base, double altura){

        this.base = base; 
        this.altura = altura; 
    }


    public void calcularArea() {

         double area= 0; 
         area = (base * altura) / 2;

         System.out.println("La base del triangulo es: "+base);
         System.out.println("La altura del triangulo es: "+altura);
         System.out.println("El area del triangulo es: "+area);

        }


        // Métodos accesores

    public double getBase() {
        return base;
    }


    public void setBase(double base) {
        this.base = base;
    }


    public double getAltura() {
        return altura;
    }


    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    


}
