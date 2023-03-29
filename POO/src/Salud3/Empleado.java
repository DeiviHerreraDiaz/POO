package Salud3;


public class Empleado extends Persona{
 
    //Atributos

    private String cargo;
    private int valorHora;
    private int horasTrabajadas;
    private String departamento;

public Empleado(){
    
}


    public Empleado(String tipoDoc, int documento, String nombre, String apellido,String cargo, int valorHora, int horasTrabajadas, String departamento){
super(tipoDoc, documento, nombre, apellido);


this.cargo = cargo; 
this.departamento = departamento;
this.horasTrabajadas = horasTrabajadas;
this.valorHora = valorHora;


}



    //Métodos


    public String getCargo() {
    return cargo;
}



public void setCargo(String cargo) {
    this.cargo = cargo;
}



public int getValorHora() {
    return valorHora;
}



public void setValorHora(int valorHora) {
    this.valorHora = valorHora;
}



public int getHorasTrabajadas() {
    return horasTrabajadas;
}



public void setHorasTrabajadas(int horasTrabajadas) {
    this.horasTrabajadas = horasTrabajadas;
}



public String getDepartamento() {
    return departamento;
}



public void setDepartamento(String departamento) {
    this.departamento = departamento;
}



    public void pedirEmpleado(){

        System.out.println("Digite el departamento del empleado: ");
        departamento = lectura.next();
        
        System.out.println("Digite el cargo: ");
        cargo = lectura.next();

        System.out.println("Digite las horas trabjadas: ");
        horasTrabajadas = lectura.nextInt();

        System.out.println("Digite el valor de cada hora: ");
        valorHora = lectura.nextInt();




    }
    
    public void mostrarEmpleado(){

        System.out.println("El tipo de documento es:"+getTipoDoc());
        System.out.println("El numero de documento es: "+getDocumento());
        System.out.println("El nombre del empleado es: "+getNombre() );
        System.out.println("El apellido del empleado es: "+getApellido());
        System.out.println("El cargo es: "+cargo);
        System.out.println("Las horas trabajadas fueron: "+horasTrabajadas);
        System.out.println("El valor de c/u de las horas fue de: "+valorHora);

        
        
        
    }
    
    
    public double calcularHonorarios(int valorHora, int horasTrabajadas){

            double honorarios1 = (valorHora * horasTrabajadas);
            double honorarios2 = honorarios1 - (honorarios1*0.966/100);
            System.out.println("El valor a pagar: "+honorarios2);
            
            return honorarios2;
        }
        
    


}
