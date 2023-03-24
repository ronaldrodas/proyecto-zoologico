package jumanji.zoologico;

import jumanji.Interface.ComportamientoAnimal;


public class AnimalSalvaje extends Animal implements ComportamientoAnimal{
   protected String nivelPeligrosidad;

    public AnimalSalvaje() { //constructor sin parametros
    }

    public AnimalSalvaje(String nivelPeligrosidad, String codigo, String especie, String nombreCien, String nombre,String sexo, String edad) {//constructor parametrizado AnimalSalvaje que hereda de animal
        super(codigo, especie, nombreCien, nombre, sexo, edad);
        this.nivelPeligrosidad = nivelPeligrosidad;
    }

    public String getNivelPeligrosidad() {      // metodo get y set de la vsriable de clase  AnimalSalvaje
        return nivelPeligrosidad;
    }

    public void setNivelPeligrosidad(String nivelPeligrosidad) {
        this.nivelPeligrosidad = nivelPeligrosidad;
    }

    @Override
    public String toString() {
        return "AnimalSalvaje{" + " nivelPeligrosidad = " + nivelPeligrosidad + ", codigo = " + codigo + ", especie = " + especie + ", nombreCientifico = " + nombreCien + ", nombre = " + nombre+ ", sexo = " + sexo + ", edad = " + edad + '}';
    }

   

    @Override
    public void comer(){
        System.out.println("devorar");
    }

    @Override
    public void domir() {
    }
  
   
}
